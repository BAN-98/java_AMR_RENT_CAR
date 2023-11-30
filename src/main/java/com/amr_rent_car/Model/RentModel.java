package com.amr_rent_car.Model;

import com.amr_rent_car.Classes.Rent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentModel
{
    public boolean createRent(Rent rent){
        String query = "INSERT INTO amr_rents(id_car,id_client,pickUpDate,returnDate,locationPickUp,locationReturn) VALUES(?,?,?,?,?,?)";
        try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
            preparedStatement.setInt(1,rent.getIdCar());
            preparedStatement.setInt(2,rent.getIdClient());
            preparedStatement.setString(3,rent.getPickUpDate());
            preparedStatement.setString(4,rent.getReturnDate());
            preparedStatement.setInt(5,rent.getLocationPickUp());
            preparedStatement.setInt(6,rent.getLocationReturn());
            return preparedStatement.execute();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean deleteRent(Rent rent){
        String query = "DELETE FROM amr_rents WHERE id_rent=?";
        try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
            preparedStatement.setInt(1,rent.getIdRent());
            return preparedStatement.execute();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean updateRent(Rent rent){
        String query = "UPDATE amr_rent SET pickUpDate=?,returnDate=?,locationPickUp=?,locationReturn=? WHERE id_rent=?";
        try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
            preparedStatement.setString(1,rent.getPickUpDate());
            preparedStatement.setString(2,rent.getReturnDate());
            preparedStatement.setInt(3,rent.getLocationPickUp());
            preparedStatement.setInt(4,rent.getLocationReturn());
            return preparedStatement.execute();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<Rent> getAllRents(){
        List<Rent> rentList = new ArrayList<>();
        String query = "SELECT * FROM amr_rents";
        try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Rent rent = new Rent(
                  resultSet.getInt("id_rent"),
                  resultSet.getInt("id_car"),
                  resultSet.getInt("id_client"),
                  resultSet.getString("pickUpDate"),
                  resultSet.getString("returnDate"),
                  resultSet.getInt("locationPickUp"),
                  resultSet.getInt("locationReturn")
                );
                rentList.add(rent);
            }
            return rentList;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Rent getRent(int id_rent){
        String query = "SELECT * FROM WHERE id_rent=?";
        try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
            preparedStatement.setInt(1,id_rent);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return new Rent(
                        resultSet.getInt("idRent"),
                        resultSet.getInt("idCar"),
                        resultSet.getInt("idClient"),
                        resultSet.getString("pickUpDate"),
                        resultSet.getString("returnDate"),
                        resultSet.getInt("locationPickUp"),
                        resultSet.getInt("locationReturn")
                );
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }
}
