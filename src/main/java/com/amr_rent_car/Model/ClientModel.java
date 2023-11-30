package com.amr_rent_car.Model;

import com.amr_rent_car.Classes.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientModel {


    public boolean createClient(Client client) {
        String query = "INSERT INTO amr_client (name, lastName, phoneNumber, address, email) VALUES(?,?,?,?,?)";
        try {
            try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
                preparedStatement.setString(1, client.getName());
                preparedStatement.setString(2, client.getLastName());
                preparedStatement.setString(3, client.getPhoneNumber());
                preparedStatement.setString(4, client.getDirection());
                preparedStatement.setString(5, client.getEmail());
                return preparedStatement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBConnect.closeConnection();
        }

    }

    public boolean updateClient(Client client) {
        try {
            String query = "UPDATE amr_client SET name=?, lastName=?, phoneNumber=?, address=?, email=?";
            try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
                preparedStatement.setString(1, client.getName());
                preparedStatement.setString(2, client.getLastName());
                preparedStatement.setString(3, client.getPhoneNumber());
                preparedStatement.setString(4, client.getDirection());
                preparedStatement.setString(5, client.getEmail());
                return preparedStatement.execute();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            DBConnect.closeConnection();
        }
    }

    public Client getClient(int id) {
        String query = "SELECT * FROM amr_client WHERE id_user=?";
        try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
            preparedStatement.setInt(1,id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                if (resultSet.next()) {
                    return new Client(
                            resultSet.getString("name"),
                            resultSet.getString("lastName"),
                            resultSet.getString("phoneNumber"),
                            resultSet.getInt("id_user"),
                            resultSet.getString("direction"),
                            resultSet.getString("email")
                    );
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public List<Client> getAllClients() {
        List<Client> listClients = new ArrayList<>();
        String query = "Select * FROM amr_clients";
        try (
                PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()
        ) {
            while (resultSet.next()) {
                Client client = new Client(
                        resultSet.getString("name"),
                        resultSet.getString("lastName"),
                        resultSet.getString("phoneNumber"),
                        resultSet.getInt("id_client"),
                        resultSet.getString("address"),
                        resultSet.getString("email")
                );
                listClients.add(client);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listClients;
    }

    public boolean deleteClient(Client client) {
        String query = "DELETE FROM amr_clients WHERE id_client = ?";
        try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
            preparedStatement.setInt(1,client.getIdClient());
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
