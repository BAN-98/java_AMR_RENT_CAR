package com.amr_rent_car.Classes;

public class Cliente {
    int idCliente;
    String nombre;
    String direccion;
    String telefono;
    String email;


    public void setIdCliente(int cliente){
        this.idCliente = cliente;
    }
    public int getIdCliente(){
        return this.idCliente;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
}
