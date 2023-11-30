package com.amr_rent_car.Controller;

import java.util.List;
import com.amr_rent_car.Classes.Car;
import com.amr_rent_car.Model.CarModel;

public class CarController {

    private final CarModel carModel;

    public CarController(){
        this.carModel = new CarModel();
    }

    public boolean createCar(Car car) {
        return carModel.create(car);
    }

    public List<Car> getCars() {
        return carModel.getCars();
    }

    public Car getCar(Car car) {
        return carModel.getCar(car);
    }

    public boolean updateCar(Car car){
        return carModel.updateCar(car);
    }

    public boolean deleteCar(int Car){
        return carModel.deleteCar(Car);
    }

}
