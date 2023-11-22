package com.amr_rent_car.Classes;

public class Car {
    private int idCar, age;
    private String modelCar, brand, colorCar, typeCar, status, carReg;
    private double priceCar;

    public Car(int idCar, int age, String modelCar, String brand, String colorCar, String typeCar, String status,
            String carReg, double priceCar) {
        this.idCar = idCar;
        this.age = age;
        this.modelCar = modelCar;
        this.brand = brand;
        this.colorCar = colorCar;
        this.typeCar = typeCar;
        this.status = status;
        this.carReg = carReg;
        this.priceCar = priceCar;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCarReg() {
        return carReg;
    }

    public void setCarReg(String carReg) {
        this.carReg = carReg;
    }

    public double getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(double priceCar) {
        this.priceCar = priceCar;
    }

    @Override
    public String toString() {
        return "Car [idCar=" + idCar + ", age=" + age + ", modelCar=" + modelCar + ", brand=" + brand + ", colorCar="
                + colorCar + ", typeCar=" + typeCar + ", status=" + status + ", carReg=" + carReg + ", priceCar="
                + priceCar + "]";
    }

    
}
