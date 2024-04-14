package aulas.colecoes.gui.ebac.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AulaTwo {
    public static void main(String[] args) {
        listAluno();
    }

    public static void listAluno() {
        System.out.println("---== +Lista Aluno+ ==---");
        Aluno a = new Aluno("Guilherme Araújo", "A1", "Java");
        Aluno b = new Aluno("AKalliny Araújo", "A2", "Enfermage");
        Aluno c = new Aluno("Nicolly Araújo", "A3", "Amor da minha vida");
        List<Aluno> lista = new ArrayList<Aluno>();
        lista.add(a);
        lista.add(b);
        lista.add(c);
        Collections.sort(lista);
        System.out.println(lista);
    }


}
