package com.amr_rent_car.Classes;

public class Client extends Person {

    private int idClient;
    private String direction, email;

    public Client(String name, String lastName, String phoneNumber, int idClient, String direction,
                  String email) {
        super(name, lastName, phoneNumber);
        this.idClient = idClient;
        this.direction = direction;
        this.email = email;
    }

    public void setIdClient(int client) {
        this.idClient = client;
    }

    public int getIdClient() {
        return this.idClient;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {return this.direction;}

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "Client [idClient=" + idClient + ", direction=" + direction + ", email=" + email + "]";
    }

}
