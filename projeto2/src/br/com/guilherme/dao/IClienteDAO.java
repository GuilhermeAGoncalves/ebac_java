package br.com.guilherme.dao;

import br.com.guilherme.domain.Cliente;

import java.util.Collection;
import java.util.Map;

public interface IClienteDAO {

    boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(long l);

    void excluir(Long cpf);

    Collection<Cliente> getClientes();
}
