import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    @Test
    public void test() {
        Person person = new Person();
        person.addName("Guilherme");

        Assert.assertEquals("Guilherme", person.getName());

    }
}
