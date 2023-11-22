package com.amr_rent_car.Classes;

public class Client extends Person {

    private int idCliente;
    private String direccion, email;

    public Client(int idPerson, String name, String lastName, String phoneNumber, int idCliente, String direccion,
            String email) {
        super(idPerson, name, lastName, phoneNumber);
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.email = email;
    }

    public void setIdCliente(int cliente) {
        this.idCliente = cliente;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + ", direccion=" + direccion + ", email=" + email + "]";
    }

}
