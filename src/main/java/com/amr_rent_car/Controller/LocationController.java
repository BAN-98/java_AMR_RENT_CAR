package com.amr_rent_car.Controller;

import com.amr_rent_car.Classes.Location;
import com.amr_rent_car.Model.LocationModel;

import java.util.List;

public class LocationController
{
    private final LocationModel locationModel;
     
    public LocationController(){
        this.locationModel = new LocationModel();
    }

    public boolean createLocation(Location location){
        return this.locationModel.createLocation(location);
    }

    public boolean updateLocation(Location location){
        return this.locationModel.updateLocation(location);
    }

    public boolean deleteLocation(int id_location){
        return this.locationModel.deleteLocation(id_location);
    }

    public List<Location> getAllLocations(){
        return this.locationModel.getAllLocations();
    }

    public Location getLocation(int id_location){
        return this.locationModel.getLocation(id_location);
    }

}
