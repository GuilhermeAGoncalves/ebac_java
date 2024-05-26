package br.com.guilherme.DAO.Generic;

import br.com.guilherme.domain.Persistence;

import java.util.HashMap;
import java.util.Map;

public abstract class CarDAO <T extends Persistence> implements ICarDAO<T> {

    protected Map<Class, Map<String, T>> listCar;

    public CarDAO() {
        if (this.listCar == null) {
            this.listCar = new HashMap<>();
        }

    }

    public abstract Class<T> getClassType();

    @Override
    public Boolean Cadastrar(T car)    {
        Map<String, T> map = this.listCar.get(getClassType());
        if(map.containsKey(car.getLicence())){
            return false;
        }
        map.put(car.getLicence(), car);
        return true;
    }

    @Override
    public void Consultar(String license) {
        Map<String, T> map = this.listCar.get(getClassType());
        System.out.println(map.get(license));
    }
}
