import java.util.*;

public class Main {

    public static void main(String[] args) {
    taskPart1();
    taskPart2();
    }

    public static void taskPart1() {
        System.out.println("--==+Part 1+==--");
        System.out.println("Digite nomes separdo por [,]");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        List<String> lista = new ArrayList<String>();
        String[] nomes = nome.split(",");
        lista.addAll(Arrays.asList(nomes));
        Collections.sort(lista);
        System.out.println(lista);
    }
    public static void taskPart2() {
        System.out.println("--==+Part 2+==--");
        System.out.println("Digite nome-sexo separado por [,]");
        Scanner scanner = new Scanner(System.in);
        String pessoa = scanner.nextLine();
        List<Pessoa> lista = new ArrayList<Pessoa>();
        String[] pessoas = pessoa.split(",");
        for (String p : pessoas) {
            String[] s = p.split("-");
            Pessoa a = new Pessoa(s[0], s[1]);
            lista.add(a);
        }
        Collections.sort(lista);
        System.out.println(lista);
    }
}