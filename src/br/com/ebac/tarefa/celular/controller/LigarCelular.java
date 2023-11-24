package br.com.ebac.tarefa.celular.controller;


import br.com.ebac.tarefa.celular.models.Celular;

public class LigarCelular {
    public void carregarCelular(Celular c){
        if(c.getEstado().equals("Bom") && c.getBateria() < 100){
            c.setBateria(c.getBateria() + 1);
        } else {
            System.out.println("Impossivel Carregar celular");
        }
    }
}