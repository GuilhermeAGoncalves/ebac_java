
import java.util.*;

public class Main {

    public static void main(String[] args) {


        String nomes = "Guilherme,Joao,Vanessa,Ana";
        System.out.println("******** PARTE 1 ********");
        List<String> nomesArray = Arrays.asList(nomes.split(","));
        System.out.println(nomesArray);
        Collections.sort(nomesArray);
        System.out.println(nomesArray);

        System.out.println("******** PARTE 2 ********");


        System.out.println(Arrays.toString(getTaskPart2()));
    }

    public static String[] getTaskPart2()  {
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        StringBuilder nomes = new StringBuilder();
        while(contador < 3){
            System.out.println("Digite o nome e o sexo de uma pessoa nesse formato (nome - [M, F])");
            String nome = scanner.nextLine();
            nomes.append(nome).append(",");
            contador++;
        }
        return nomes.toString().split(",");
    };
}
