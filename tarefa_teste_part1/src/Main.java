import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Digite o (Nome-Sexo) separado por (,)");
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();

        List<Person> persons = new ArrayList<>();
        String[] list = names.split(",");
        for (String p : list) {
            String[] s = p.split("-");
            Person person = new Person(s[0], s[1]);
            persons.add(person);
        }

        persons.stream().filter(person -> person.getGender().equals("F")).forEach(person -> System.out.println(person.getName()));
    }
}
