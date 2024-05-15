package br.com.guilherme.DAO;

public class ContradoDAO implements IContratoDAO{
    @Override
    public void save() {
        throw new UnsupportedOperationException("Não é possivel fazer conexão com o banco de dados");
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Não é possivel fazer conexão com o banco de dados");
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Não é possivel fazer conexão com o banco de dados");
    }

    @Override
    public void search() {
        throw new UnsupportedOperationException("Não é possivel fazer conexão com o banco de dados");
    }
}
