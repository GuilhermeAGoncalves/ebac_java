package br.com.guilherme.DAO.Generic;

public interface ICarDAO <T>{

    public Boolean Cadastrar(T car);

    public void Consultar(String license);

}
