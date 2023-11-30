package com.amr_rent_car.Controller;

import com.amr_rent_car.Classes.Client;
import com.amr_rent_car.Model.ClientModel;

import java.util.List;

public class ClientController {
    private final ClientModel clientModel;

    public ClientController() {
        this.clientModel = new ClientModel();
    }

    public boolean createClient(Client client) {
        return clientModel.createClient(client);
    }

    public boolean updateClient(Client client) {
        return clientModel.updateClient(client);
    }

    public boolean deleteClient(Client client) {
        return clientModel.deleteClient(client);
    }

    public List<Client> getAllClients() {
        return clientModel.getAllClients();
    }
    public Client getClient(int id) {
        return clientModel.getClient(id);
    }

}
