package br.com.guilherme.service;

import br.com.guilherme.domain.Cliente;

import java.util.Collection;
import java.util.Map;

public interface IClienteService {

    boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(long l);

    void excluir(Long cpf);

    Collection<Cliente> getClientes();
}
