package br.com.guilherme.dao;

import br.com.guilherme.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteDAO implements IClienteDAO {
    Map<Long, Cliente> clientes;

    public ClienteDAO() {
        this.clientes = new HashMap<>();
    }

    @Override
    public boolean salvar(Cliente cliente) {
        if (clientes.containsKey(cliente.getCpf())) {
            return false;
        }
        clientes.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public Cliente buscarPorCPF(long l) {
        Cliente cliente = clientes.get(l);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public Collection<Cliente> getClientes() {
        return this.clientes.values();
    }
}


