import br.com.ebac.gui.FazerMedia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("OI");

        FazerMedia media = new FazerMedia();
        System.out.println(media.getResult());
        Scanner scan = new Scanner(System.in);

        System.out.println("****** Faça a media do aluno x ******");
        System.out.println("Primeira nota: ");
        double n1 = scan.nextDouble();
        System.out.println("Segunda nota: ");
        double n2 = scan.nextDouble();
        System.out.println("Terceira nota: ");
        double n3 = scan.nextDouble();
        System.out.println("Quarta nota: ");
        double n4 = scan.nextDouble();


        media.setResult(n1, n2, n3, n4);
        System.out.println(media.getResult());
    }
}
