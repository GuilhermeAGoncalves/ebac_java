package br.com.guilherme.dao;

import br.com.guilherme.domain.Cliente;

import java.util.List;

public interface IClienteDao {

    Integer cadastrar(Cliente cliente) throws Exception;

    Cliente consultar(String codigo) throws Exception;

    Integer deletar(String codigo) throws Exception;

    List<Cliente> listarTodos() throws Exception;

    Integer atualizar(Cliente cliente) throws Exception;
}
