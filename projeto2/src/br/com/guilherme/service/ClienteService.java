package br.com.guilherme.service;

import br.com.guilherme.dao.ClienteDAO;
import br.com.guilherme.dao.IClienteDAO;
import br.com.guilherme.domain.Cliente;

import java.util.Collection;
import java.util.Map;

public class ClienteService implements IClienteService{

    private IClienteDAO clienteDAO;

public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(long l) {
        return clienteDAO.buscarPorCPF(l);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public Collection<Cliente> getClientes() {
        return clienteDAO.getClientes();
    }
}
