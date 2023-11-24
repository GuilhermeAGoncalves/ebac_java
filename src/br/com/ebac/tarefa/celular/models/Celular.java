package br.com.ebac.tarefa.celular.models;

/**
 * @author GuilhermeAGoncalves
 * @since v1.0
 */
public class Celular {

    private int id;
    private int bateria;
    private String modelo;
    private String cor;

    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return bateria do celular
     */
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Método que faz o print das infos do celular
     *
     *
     */
    public void getInfos(){
        System.out.println("-------");
        System.out.println("id: " +id);
        System.out.println("Modelo: " +modelo);
        System.out.println("cor: " +cor);
        System.out.println("Bateria: " + bateria);
        System.out.println("-------");
    }
}