package com.amr_rent_car.Classes;

public class Location {
    private int idLocation, postalCode;
    private String address, city, state;

    public Location(int idLocation, String address, String city, String state, int postalCode) {
        this.idLocation = idLocation;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Location [idLocation=" + idLocation + ", address=" + address + ", city=" + city + ", state=" + state
                + ", postalCode=" + postalCode + "]";
    }
}
