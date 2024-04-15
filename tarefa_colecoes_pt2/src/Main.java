import java.util.*;

public class Main {

    public static void main(String[] args) {
        getPessoas();
    }

    public static void getPessoas() {
        System.out.println("--==+Listar Pessoas Por Sexo+==--");
        Map<String, List<String>> listarPessoa = new HashMap<>();
        listarPessoa.put("M", new ArrayList<>());
        listarPessoa.put("F", new ArrayList<>());
        System.out.println("Digite nome-sexo separado por [,]");
        Scanner scanner = new Scanner(System.in);
        String pessoa = scanner.nextLine();
        String[] pessoas = pessoa.split(",");
        for (String p : pessoas) {
            String[] s = p.split("-");
            if(s[1].equals("M")) {
                listarPessoa.get("M").add(s[0]);
            } else if (s[1].equals("F")) {
                listarPessoa.get("F").add(s[0]);
            }
        }
        System.out.println(listarPessoa);
    }
}
