package br.com.ebac.gui;

public class FazerMedia {
    private double result;


    public void setResult(double n1, double n2, double n3, double n4) {
        this.result = (n1 + n2 + n3 +n4) / 4;
    }

    public double getResult() {
        return result;
    }
}


