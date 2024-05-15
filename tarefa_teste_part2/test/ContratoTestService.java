import br.com.guilherme.DAO.ContradoDAO;
import br.com.guilherme.DAO.IContratoDAO;
import br.com.guilherme.DAO.Mock.ContratoDAOMock;
import br.com.guilherme.Service.ContratoService;
import br.com.guilherme.Service.IContrato;
import org.junit.Assert;
import org.junit.Test;

public class ContratoTestService {

    @Test(expected = UnsupportedOperationException.class)
    public void saveTestException() {
        IContratoDAO contratoDAO = new ContradoDAO();
        IContrato contratoService = new ContratoService(contratoDAO);
        String retorno = contratoService.save();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void updateTestException() {
        IContratoDAO contratoDAO = new ContradoDAO();
        IContrato contratoService = new ContratoService(contratoDAO);
        String retorno = contratoService.update();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void removeTestException() {
        IContratoDAO contratoDAO = new ContradoDAO();
        IContrato contratoService = new ContratoService(contratoDAO);
        String retorno = contratoService.remove();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void searchTestException() {
        IContratoDAO contratoDAO = new ContradoDAO();
        IContrato contratoService = new ContratoService(contratoDAO);
        String retorno = contratoService.search();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test
    public void updateTest() {
        IContratoDAO mock = new ContratoDAOMock();
        IContrato contratoService = new ContratoService(mock);
        String retorno = contratoService.update();
        Assert.assertEquals("atualizado com sucesso", retorno);
    }

    @Test
    public void saveTeste() {
        IContratoDAO mock = new ContratoDAOMock();
        IContrato contratoService = new ContratoService(mock);
        String retorno = contratoService.save();
        Assert.assertEquals("salvo com sucesso", retorno);
    }

    @Test
    public void removeTeste() {
        IContratoDAO mock = new ContratoDAOMock();
        IContrato contratoService = new ContratoService(mock);
        String retorno = contratoService.remove();
        Assert.assertEquals("removido com sucesso", retorno);
    }

    @Test
    public void searchTeste() {
        IContratoDAO mock = new ContratoDAOMock();
        IContrato contratoService = new ContratoService(mock);
        String retorno = contratoService.search();
        Assert.assertEquals("pesquisado com sucesso", retorno);
    }
}
