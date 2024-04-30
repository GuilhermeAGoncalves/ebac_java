package br.com.guilherme.Domain;

public class Honda implements Persistence{

    String nameCar;
    String model;
    String license;

    public Honda(String nameCar, String model, String license) {
        this.nameCar = nameCar;
        this.model = model;
        this.license = license;
    }

    @Override
    public String toString() {
        return "Honda{" +
                "nameCar='" + nameCar + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public String getLicence() {
        return this.license;
    }
}
