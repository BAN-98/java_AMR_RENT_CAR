package com.amr_rent_car.Classes;

/**
 * Hello world!
 *
 */
public class Cars {
    String marca;
    String age;
    String estado;
    int idVehiculo;
    int capacidad;
    int tarifa;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return this.age;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public int getIdVehiculo() {
        return this.idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getCapacidad(){
        return this.capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public void setTarifa(int tarifa){
        this.tarifa = tarifa;
    }

    public int getTarifa(){
        return this.tarifa;
    }

    
}
