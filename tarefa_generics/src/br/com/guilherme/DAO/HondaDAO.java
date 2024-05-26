package br.com.guilherme.DAO;

import br.com.guilherme.DAO.Generic.CarDAO;
import br.com.guilherme.domain.Honda;

import java.util.HashMap;
import java.util.Map;

public class HondaDAO extends CarDAO<Honda> implements IHondaDAO {

    public HondaDAO() {
        super();
        Map<String, Honda> map = this.listCar.get(getClassType());
        if(map == null) {
            map = new HashMap<>();
            this.listCar.put(getClassType(), map);
        }
    }

    @Override
    public Class<Honda> getClassType() {
        return Honda.class;
    }
}
