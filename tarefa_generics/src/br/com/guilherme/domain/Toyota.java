package br.com.guilherme.domain;

public class Toyota implements Persistence{
    String nameCar;
    String model;
    String license;

    public Toyota(String name, String model, String license){
        this.nameCar = name;
        this.model = model;
        this.license = license;
    }
    @Override
    public String getLicence() {
        return this.license;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "nameCar='" + nameCar + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
