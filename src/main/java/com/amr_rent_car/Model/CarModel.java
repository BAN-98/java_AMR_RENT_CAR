package com.amr_rent_car.Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.amr_rent_car.Classes.Car;

public class CarModel {

    public boolean create(Car car) {
        try {
            String query = "INSERT INTO amr_cars (id_car, brand, model_car, car_reg, age, status, corlorCar, typeCar, priceCar) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = DBConect.connect().prepareStatement(query);
            preparedStatement.setInt(1, car.getIdCar());
            preparedStatement.setString(2, car.getBrand());
            preparedStatement.setString(3, car.getModelCar());
            preparedStatement.setString(4, car.getCarReg());
            preparedStatement.setInt(5, car.getAge());
            preparedStatement.setString(6, car.getStatus());
            preparedStatement.setString(7, car.getColorCar());
            preparedStatement.setString(8, car.getTypeCar());
            preparedStatement.setDouble(9, car.getPriceCar());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            DBConect.closeConnection();
        }
    }

    public boolean updateCar(Car car) {
        try {
            String query = "UPDATE amr_cars SET brand=?, model_car=?, car_reg=?, age=?, status=?, colorCar=?, typeCar=?, priceCar=? WHERE idCar=?";

            try (PreparedStatement preparedStatement = DBConect.connect().prepareStatement(query)) {
                preparedStatement.setString(1, car.getBrand());
                preparedStatement.setString(2, car.getModelCar());
                preparedStatement.setString(3, car.getCarReg());
                preparedStatement.setInt(4, car.getAge());
                preparedStatement.setString(5, car.getStatus());
                preparedStatement.setString(6, car.getColorCar());
                preparedStatement.setString(7, car.getTypeCar());
                preparedStatement.setDouble(8, car.getPriceCar());
                preparedStatement.setInt(9, car.getIdCar());

                int rowsUpdated = preparedStatement.executeUpdate();

                return rowsUpdated > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            DBConect.closeConnection();
        }
    }

    public List<Car> getCars() {
        List<Car> listCars = new ArrayList<>();
        try {
            String query = "SELECT * FORM amr_cars";
            PreparedStatement preparedStatement = DBConect.connect().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Car car = new Car(
                        resultSet.getInt("id_car"),
                        resultSet.getInt("age"),
                        resultSet.getString("brand"),
                        resultSet.getString("model_car"),
                        resultSet.getString("car_reg"),
                        resultSet.getString("status"),
                        resultSet.getString("corlorCar"),
                        resultSet.getString("typeCar"),
                        resultSet.getDouble("priceCar"));
                listCars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConect.closeConnection();
        }
        return listCars;
    }

    public Car getCar(int idCar) {
        Car car = null;
        try {
            String query = "SELECT * FROM amr_cars WHERE id_car=?";
            PreparedStatement preparedStatement = DBConect.connect().prepareStatement(query);
            preparedStatement.setInt(1, idCar);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                car = new Car(
                        resultSet.getInt("id_car"),
                        resultSet.getInt("age"),
                        resultSet.getString("brand"),
                        resultSet.getString("model_car"),
                        resultSet.getString("car_reg"),
                        resultSet.getString("status"),
                        resultSet.getString("corlorCar"),
                        resultSet.getString("typeCar"),
                        resultSet.getDouble("priceCar"));
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }finally{
            DBConect.closeConnection();
        }
        return car;
    }

    public boolean deleteCar(int idCar){
        try {
            String query = "DELETE FROM amr_cars WHERE id_car=?";
            PreparedStatement preparedStatement = DBConect.connect().prepareStatement(query);
            preparedStatement.setInt(1, idCar);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }finally{
            DBConect.closeConnection();
        }

    }

}
