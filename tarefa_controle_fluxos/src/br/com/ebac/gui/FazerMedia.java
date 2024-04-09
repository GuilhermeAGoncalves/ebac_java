package br.com.ebac.gui;

import java.util.Scanner;

public class FazerMedia {
    private double result;


    public void setResult (double sumNotas) {this.result = sumNotas / 4;}

    public void getResult() {
        System.out.printf("Media final: %.2f %n",this.result);
        if (this.result >= 7) {
            System.out.println("Aluno aprovado");
        } else if (this.result < 7 && this.result >= 5) {
            System.out.println("Aluno em recuperação");
        } else if (this.result < 5) {
            System.out.println("Aluno reprovado");
        }
    }


}
