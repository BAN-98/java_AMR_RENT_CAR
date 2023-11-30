package com.amr_rent_car.Controller;

import com.amr_rent_car.Classes.Rent;
import com.amr_rent_car.Model.RentModel;

import java.util.List;

public class RentController {
    private final RentModel rentModel;

    public RentController(){
        this.rentModel = new RentModel();
    }
    public boolean createRent(Rent rent){
        return this.rentModel.createRent(rent);
    }

    public boolean deleteRent(Rent rent){
        return this.rentModel.deleteRent(rent);
    }

    public boolean updateRent(Rent rent){
        return this.rentModel.updateRent(rent);
    }

    public List<Rent> getAllRents(){
        return this.rentModel.getAllRents();
    }

    public Rent getRent(int id_rent){
        return this.rentModel.getRent(id_rent);
    }
}
