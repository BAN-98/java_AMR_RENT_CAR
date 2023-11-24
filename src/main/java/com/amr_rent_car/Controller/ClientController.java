package com.amr_rent_car.Controller;

import com.amr_rent_car.Classes.Client;
import com.amr_rent_car.Model.ClientModel;

public class ClientController {
    private ClientModel clientModel;

    public boolean createClient(Client client){
        return clientModel.createClient(client);
    }

}
