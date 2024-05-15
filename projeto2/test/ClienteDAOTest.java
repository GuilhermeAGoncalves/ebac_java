import br.com.guilherme.dao.IClienteDAO;
import br.com.guilherme.domain.Cliente;
import dao.ClienteDAOMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDAO;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDAO = new ClienteDAOMock();
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
        Cliente clienteConsultado = clienteDAO.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
        Boolean salvo = clienteDAO.salvar(cliente);

        Assert.assertTrue(salvo);
    }

    @Test
    public void excluirCliente() {
        clienteDAO.excluir(cliente.getCpf());
    }
}
