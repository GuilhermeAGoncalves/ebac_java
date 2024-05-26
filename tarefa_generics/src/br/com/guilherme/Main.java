package br.com.guilherme;

import br.com.guilherme.DAO.HondaDAO;
import br.com.guilherme.DAO.IHondaDAO;
import br.com.guilherme.DAO.IToyotaDAO;
import br.com.guilherme.DAO.ToyotaDAO;
import br.com.guilherme.domain.Honda;
import br.com.guilherme.domain.Toyota;

public class Main {

    public static IHondaDAO ihondaDAO;
    public static IToyotaDAO iToyotaDAO;

    public static void main(String[] args) {
        initDAO();

        Honda civic = new Honda("Civic", "2018/2019", "CVC900");
        ihondaDAO.Cadastrar(civic);
        ihondaDAO.Consultar("CVC900");

        Toyota corola = new Toyota("Corola", "2020/2021", "TVT800");
        iToyotaDAO.Cadastrar(corola);
        iToyotaDAO.Consultar("TVT800");
    }

    public static void initDAO() {
        ihondaDAO = new HondaDAO();
        iToyotaDAO = new ToyotaDAO();
    }

}
