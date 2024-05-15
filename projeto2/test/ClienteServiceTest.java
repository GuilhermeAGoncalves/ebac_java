import br.com.guilherme.dao.ClienteDAO;
import br.com.guilherme.dao.IClienteDAO;
import br.com.guilherme.service.ClienteService;
import br.com.guilherme.service.IClienteService;
import dao.ClienteDAOMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.com.guilherme.domain.Cliente;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDAOMock();
        IClienteDAO map = new ClienteDAO();
        clienteService = new ClienteService(map);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(1234567890L);
        cliente.setNome("Guilherme");
        cliente.setEnd("Rua 1");
        cliente.setCidade("Joinville");
        cliente.setEnd("SC");
        cliente.setNumero("123");
        cliente.setTell(83999999999L);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
      boolean salvo = clienteService.salvar(cliente);
      boolean salvo2 = clienteService.salvar(cliente);
      System.out.println(clienteService.getClientes());
      Assert.assertTrue(salvo);
      Assert.assertFalse(salvo2);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }
}
