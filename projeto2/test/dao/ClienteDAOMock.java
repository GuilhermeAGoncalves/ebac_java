package dao;

import br.com.guilherme.dao.IClienteDAO;
import br.com.guilherme.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteDAOMock implements IClienteDAO {
    Map<Long, Cliente> clientes;

    public ClienteDAOMock() {
        this.clientes = new HashMap<>();
    }

    @Override
    public boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCPF(long l) {
        Cliente cliente = new Cliente();
        cliente.setCpf(l);
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
