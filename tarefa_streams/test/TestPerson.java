import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestPerson {

    @Test
    public void test() {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Guilherme", "F"));
        listPerson.add(new Person("Maria", "F"));

        boolean isOnlyFemalePerson = listPerson.stream().allMatch(person -> person.getGender().equals("F"));
        Assert.assertTrue(isOnlyFemalePerson);
    }
}
