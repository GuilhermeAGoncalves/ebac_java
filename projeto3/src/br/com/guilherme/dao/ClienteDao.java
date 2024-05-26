package br.com.guilherme.dao;

import br.com.guilherme.domain.Cliente;
import br.com.guilherme.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao implements IClienteDao{
    @Override
    public Integer cadastrar(Cliente cliente) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            stm = connection.prepareStatement("INSERT INTO CLIENTE (nome, codigo) VALUES (?, ?)");
            stm.setString(1, cliente.getNome());
            stm.setString(2, cliente.getCodigo());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if(stm != null) {
                stm.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public Cliente consultar(String codigo) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Cliente cliente = null;
        try {
            connection = ConnectionFactory.getConnection();
            stm = connection.prepareStatement("SELECT * FROM CLIENTE WHERE codigo = ?");
            stm.setString(1, codigo);
            rs = stm.executeQuery();
            if(rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getLong("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCodigo(rs.getString("codigo"));
            }
            return cliente;
        } catch (Exception e) {
            throw e;
        } finally {
            if(stm != null) {
                stm.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public Integer deletar(String codigo) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            stm = connection.prepareStatement("DELETE FROM CLIENTE WHERE codigo = ?");
            stm.setString(1, codigo);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if(stm != null) {
                stm.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public List<Cliente> listarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            stm = connection.prepareStatement("SELECT * FROM CLIENTE");
            ResultSet rs = stm.executeQuery();
            List<Cliente> clientes = new ArrayList<>();
            while(rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getLong("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCodigo(rs.getString("codigo"));
                clientes.add(cliente);
            }
            return clientes;
        } catch (Exception e) {
            throw e;
        } finally {
            if(stm != null) {
                stm.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public Integer atualizar(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            stm = connection.prepareStatement("UPDATE CLIENTE SET nome = ? WHERE codigo = ?");
            stm.setString(1, cliente.getNome());
            stm.setString(2, cliente.getCodigo());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if(stm != null) {
                stm.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
    }
}
