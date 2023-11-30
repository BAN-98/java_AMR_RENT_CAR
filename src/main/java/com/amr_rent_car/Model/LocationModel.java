package com.amr_rent_car.Model;

import com.amr_rent_car.Classes.Location;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LocationModel {
    public boolean createLocation(Location location){
        String query = "INSERT INTO amr_location(address, city, state, postal_code) VALUES(?,?,?,?)";
        try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
            preparedStatement.setString(1,location.getAddress());
            preparedStatement.setString(2,location.getCity());
            preparedStatement.setString(3,location.getState());
            preparedStatement.setInt(4,location.getPostalCode());
            return preparedStatement.execute();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean updateLocation(Location location){
        String query = "UPDATE amr_locations SET address=?, city=?,state=?,postal_code=? WHERE id_location=?";
        try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
            preparedStatement.setString(1,location.getAddress());
            preparedStatement.setString(2,location.getCity());
            preparedStatement.setString(3,location.getState());
            preparedStatement.setInt(4,location.getPostalCode());
            return preparedStatement.execute();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean deleteLocation(int id_location){
        String query = "DELETE FROM amr_locations WHERE id_location=?";
        try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
            preparedStatement.setInt(1,id_location);
            return preparedStatement.execute();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Location getLocation(int id_location){

        String query = "SELECT * FROM amr_locations WHERE id_locations=?";
        try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
            preparedStatement.setInt(1,id_location);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return new Location(
                        resultSet.getInt("id_location"),
                        resultSet.getString("address"),
                        resultSet.getString("city"),
                        resultSet.getString("state"),
                        resultSet.getInt("postal_code")
                );
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }

    public List<Location> getAllLocations(){
        List<Location> locationList = new ArrayList<>();
        String query = "SELECT * FROM amr_locations";
        try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Location location = new Location(
                  resultSet.getInt("id_location"),
                  resultSet.getString("address"),
                  resultSet.getString("city"),
                  resultSet.getString("state"),
                  resultSet.getInt("postal_code")
                );
                locationList.add(location);
            }
            return locationList;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
