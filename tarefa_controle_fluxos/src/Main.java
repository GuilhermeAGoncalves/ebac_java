import br.com.ebac.gui.FazerMedia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sumNota = 0;
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (count <= 4) {
            System.out.println("Digite a Nota " + count + " :");
            double nota = scanner.nextDouble();
            if (nota <= 10 && nota >= 0) {
                System.out.println("Nota salva com sucesso!");
                sumNota += nota;
                count++;
            } else {
                System.out.println("Nota invalida");
            }
        }

        FazerMedia fazerMedia = new FazerMedia();
        fazerMedia.setResult(sumNota);
        fazerMedia.getResult();

    }
}
