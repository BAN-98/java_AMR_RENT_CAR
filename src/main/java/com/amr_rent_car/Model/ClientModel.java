package com.amr_rent_car.Model;

import com.amr_rent_car.Classes.Client;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientModel {
    public boolean createClient(Client client) {
        try {
            String query = "INSERT INTO amr_client (name, lastName, phoneNumber, address, email) VALUES(?,?,?,?,?)";
            try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
                preparedStatement.setString(1, client.getName());
                preparedStatement.setString(2, client.getLastName());
                preparedStatement.setString(3, client.getPhoneNumber());
                preparedStatement.setString(4, client.getDirection());
                preparedStatement.setString(5, client.getEmail());
                return preparedStatement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            DBConnect.closeConnection();
        }

    }

    public boolean updateClient(Client client) {
        try {
            String query = "UPDATE amr_client SET name=?, lastName=?, phoneNumber=?, address=?, email=?";
            try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
                preparedStatement.setString(1, client.getName());
                preparedStatement.setString(2, client.getLastName());
                preparedStatement.setString(3, client.getPhoneNumber());
                preparedStatement.setString(4, client.getDirection());
                preparedStatement.setString(5, client.getEmail());
                return preparedStatement.execute();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            DBConnect.closeConnection();
        }
    }

    public Client client(int id){
        try {
            String query = "SELECT * FROM amr_client WHERE ";
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
