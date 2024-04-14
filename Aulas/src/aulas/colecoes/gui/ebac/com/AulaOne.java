package aulas.colecoes.gui.ebac.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AulaOne {

    public static void main(String[] args) {
        exampleListSimple();

        exampleListAscd();
    }

    private static void exampleListSimple () {
        System.out.println("---== +Lista Simples+ ==---");
        List<String> lista = new ArrayList<String>();
        lista.add("José Roberto");
        lista.add("Guilherme");
        lista.add("Ginaldo");
        System.out.println(lista);

    }

    private static void exampleListAscd() {
        System.out.println("---== +Lista Ascendente+ ==---");
        List<String> lista = new ArrayList<String>();
        lista.add("José Roberto");
        lista.add("Guilherme");
        lista.add("Ginaldo");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

    }
}
