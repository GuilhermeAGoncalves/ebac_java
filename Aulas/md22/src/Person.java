import java.util.List;

public class Person {

    private String id;
    private String name;
    private int age;

    public Person() {}

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Person> fillPerson() {
        Person person1 = new Person("p1", "Guilherme Araújo", 21);
        Person person2 = new Person("p2", "Laryssa Araújo", 210);
        Person person3 = new Person("p3", "Nicolly Araújo", 211);
        Person person4 = new Person("p4", "Ginaldo Araújo", 212);
        Person person5 = new Person("p5", "Guilherme Araújo", 22);

        return List.of(person1, person2, person3, person4, person5);
    }
}
