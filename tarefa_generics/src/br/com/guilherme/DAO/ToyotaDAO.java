package br.com.guilherme.DAO;

import br.com.guilherme.DAO.Generic.CarDAO;
import br.com.guilherme.domain.Toyota;

import java.util.HashMap;
import java.util.Map;

public class ToyotaDAO extends CarDAO<Toyota> implements IToyotaDAO {


    public ToyotaDAO() {
        super();
        Map<String, Toyota> map = this.listCar.get(getClassType());
        if(map == null) {
            map = new HashMap<>();
            this.listCar.put(getClassType(), map);
        }

    }
    @Override
    public Class<Toyota> getClassType() {
        return Toyota.class;
    }

}
