package br.com.ebac.guilherme.dao;

import br.com.ebac.guilherme.model.Client;

import java.util.Collection;

public interface IClientDAO {
    public boolean createClient(Client client);

    public void deleteClient(String cpf);

    public boolean updateClient(Client client);

    public Client getClient(String cpf);

    public Collection<Client> getAllClients();


}
