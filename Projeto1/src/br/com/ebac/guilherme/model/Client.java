package br.com.ebac.guilherme.model;

import java.util.Objects;

public class Client {
    private String name;
    private String cpf;
    private int number;
    private String end;
    private String city;
    private String state;

    public Client(String name, String cpf, String number, String end, String city, String state) {
        this.name = name;
        this.cpf = cpf;
        this.number = Integer.valueOf(number.trim());
        this.end = end;
        this.city = city;
        this.state = state;
    }

    public Client(Client client){
        this.name = client.getName();
        this.cpf = client.getCpf();
        this.number = client.getNumber();
        this.end = client.getEnd();
        this.city = client.getCity();
        this.state = client.getState();
    }

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                ", cpf:'" + cpf + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return Objects.equals(cpf, client.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
