package com.amr_rent_car.Classes;

public class Rent {
    private int idRent, idCar, idClient, locationPickUp, locationReturn;
    private String pickUpDate, returnDate;

    public Rent(int idRent, int idCar, int idClient, String pickUpDate, String returnDate, int locationPickUp,
            int locationReturn) {
        this.idRent = idRent;
        this.idCar = idCar;
        this.idClient = idClient;
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
        this.locationPickUp = locationPickUp;
        this.locationReturn = locationReturn;
    }

    public int getIdRent() {
        return idRent;
    }

    public void setIdRent(int idRent) {
        this.idRent = idRent;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(String pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getLocationPickUp() {
        return locationPickUp;
    }

    public void setLocationPickUp(int locationPickUp) {
        this.locationPickUp = locationPickUp;
    }

    public int getLocationReturn() {
        return locationReturn;
    }

    public void setLocationReturn(int locationReturn) {
        this.locationReturn = locationReturn;
    }

    @Override
    public String toString() {
        return "Rents [idRent=" + idRent + ", idCar=" + idCar + ", idClient=" + idClient + ", pickUpDate=" + pickUpDate
                + ", returnDate=" + returnDate + ", locationPickUp=" + locationPickUp + ", locationReturn="
                + locationReturn + "]";
    }

}
