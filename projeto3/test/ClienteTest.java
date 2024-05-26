import br.com.guilherme.dao.ClienteDao;
import br.com.guilherme.dao.IClienteDao;
import br.com.guilherme.domain.Cliente;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void cadastrarTeste() throws Exception {
        IClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();
        cliente.setNome("Guilherme");
        cliente.setCodigo("123");
        clienteDao.cadastrar(cliente);
        int qtd = clienteDao.cadastrar(cliente);
        assertEquals(qtd, 1);

        Cliente clienteDB = clienteDao.consultar(cliente.getCodigo());
        assertNotNull(clienteDB);
        assertEquals(cliente.getNome(), clienteDB.getNome());
        assertEquals(cliente.getCodigo(), clienteDB.getCodigo());

        Integer qtdDel = clienteDao.deletar(cliente.getCodigo());
        assertNotNull(qtdDel);
    }

    @Test
    public void consultarCliente() throws Exception {
        IClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();
        cliente.setNome("Guilherme");
        cliente.setCodigo("123");
        clienteDao.cadastrar(cliente);
        Cliente clienteDB = clienteDao.consultar(cliente.getCodigo());
        assertNotNull(clienteDB);
        assertEquals(cliente.getNome(), clienteDB.getNome());
        assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        Integer qtdDel = clienteDao.deletar(cliente.getCodigo());
        assertNotNull(qtdDel);
    }

    @Test
    public void listarTodosOsClientes() throws Exception {
        IClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();
        cliente.setNome("Guilherme");
        cliente.setCodigo("123");
        clienteDao.cadastrar(cliente);
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Guilherme2");
        cliente2.setCodigo("1234");
        clienteDao.cadastrar(cliente2);
        Cliente cliente3 = new Cliente();
        cliente3.setNome("Guilherme3");
        cliente3.setCodigo("12345");
        clienteDao.cadastrar(cliente3);
        List<Cliente> clientes = clienteDao.listarTodos();
        assertNotNull(clientes);
        assertTrue(!clientes.isEmpty());
        for (Cliente c : clientes) {
            assertNotNull(c);
            Integer qtdDel = clienteDao.deletar(c.getCodigo());
            assertNotNull(qtdDel);
        }
    }

    @Test
    public void atualizarCliente() throws Exception {
        IClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();
        cliente.setNome("Guilherme");
        cliente.setCodigo("123");
        clienteDao.cadastrar(cliente);
        Cliente clienteDB = clienteDao.consultar(cliente.getCodigo());
        assertNotNull(clienteDB);
        assertEquals(cliente.getNome(), clienteDB.getNome());
        assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        cliente.setNome("Guilherme2");
        clienteDao.atualizar(cliente);
        Cliente clienteDB2 = clienteDao.consultar(cliente.getCodigo());
        assertNotNull(clienteDB2);
        assertEquals(cliente.getNome(), clienteDB2.getNome());
        assertEquals(cliente.getCodigo(), clienteDB2.getCodigo());
        Integer qtdDel = clienteDao.deletar(cliente.getCodigo());
        assertNotNull(qtdDel);
    }

}
