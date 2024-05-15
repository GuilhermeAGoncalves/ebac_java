import org.junit.Assert;
import org.junit.Test;

public class FirstTestTest {

    @Test
    public void test() {
        String nome = "Guilherme";
        Assert.assertEquals("Guilherme", nome);
    }

    @Test
    public void test1() {
        String nome = "Guilherme";
        Assert.assertNotEquals("Guilherm1e", nome);
    }
}
