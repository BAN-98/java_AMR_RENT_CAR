package com.amr_rent_car.Classes;

public class Person {
    private int idPerson;
    private String name, lastName, phoneNumber;

    public Person(String name, String lastName, String phoneNumber) {
        this.idPerson = idPerson;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person [idPerson=" + idPerson + ", name=" + name + ", lastName=" + lastName + ", phoneNumber="
                + phoneNumber + "]";
    }
}
