package com.amr_rent_car.Classes;

public class Reservation {
    private int idReserva;
    private String vehiculo, cliente, fechaInicio, fechaFin;

    public Reservation(int idReserva, String vehiculo, String cliente, String fechaInicio, String fechaFin) {
        this.idReserva = idReserva;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getIdReserva() {
        return this.idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getVehiculo() {
        return this.vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaFin() {
        return this.fechaFin;
    }

    @Override
    public String toString() {
        return "Reserva [idReserva=" + idReserva + ", vehiculo=" + vehiculo + ", cliente=" + cliente + ", fechaInicio="
                + fechaInicio + ", fechaFin=" + fechaFin + "]";
    }

}
