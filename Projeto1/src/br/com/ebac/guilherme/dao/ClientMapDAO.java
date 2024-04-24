package br.com.ebac.guilherme.dao;

import br.com.ebac.guilherme.model.Client;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientMapDAO implements IClientDAO {

    private Map<String, Client> map;

    public ClientMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public boolean createClient(Client client) {
        if(!this.map.containsKey(client.getCpf())){
            this.map.put(client.getCpf(), client);
            return true;
        }
        return false;
    }

    @Override
    public void deleteClient(String cpf) {
        Client client = this.map.get(cpf);

        if(client != null) {
            this.map.remove(cpf, client);
        }
    }

    @Override
    public boolean updateClient(Client client) {
        Client clientInMap = this.map.get(client.getCpf());
        System.out.println(clientInMap);
        if(clientInMap != null) {
            clientInMap.setName(client.getName());
            clientInMap.setNumber(client.getNumber());
            clientInMap.setEnd(client.getEnd());
            clientInMap.setCity(client.getCity());
            clientInMap.setState(client.getState());

            return true;
        }
        return false;
    }

    @Override
    public Client getClient(String cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Client> getAllClients() {
        return this.map.values();
    }
}
