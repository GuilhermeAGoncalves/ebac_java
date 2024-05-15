package br.com.guilherme.Service;

import br.com.guilherme.DAO.IContratoDAO;

public class ContratoService implements IContrato{

    private IContratoDAO contratoDao;

    public ContratoService (IContratoDAO contratoDAO) {
        this.contratoDao = contratoDAO;
    }
    @Override
    public String save() {
        contratoDao.save();
        return "salvo com sucesso";
    }

    @Override
    public String update() {
        contratoDao.update();
        return "atualizado com sucesso";
    }
    @Override
    public String remove() {
        contratoDao.remove();
        return "removido com sucesso";
    }

    @Override
    public String search() {
        contratoDao.search();
        return "pesquisado com sucesso";
    }

}
