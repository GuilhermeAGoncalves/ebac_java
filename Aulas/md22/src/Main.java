import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new Person().fillPerson();
        Stream<Integer> streamAge = list.stream().filter(person -> person.getAge() > 200).map(Person::getAge);
        streamAge.forEach(person -> System.out.println(person));

        Map<String, Integer> map = list.stream().collect(Collectors.groupingBy(Person::getName, Collectors.summingInt(Person::getAge)));

        System.out.println(map);

    }
}
