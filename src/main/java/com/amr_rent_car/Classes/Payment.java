package com.amr_rent_car.Classes;

public class Payment {
    private int idPayment, idInvoice;
    private String datePayment;
    private double amount;
    private boolean paid;

    public Payment(int idPayment, String datePayment, double amount, int idInvoice, boolean paid) {
        this.idPayment = idPayment;
        this.datePayment = datePayment;
        this.amount = amount;
        this.idInvoice = idInvoice;
        this.paid = paid;
    }

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public String getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(String datePayment) {
        this.datePayment = datePayment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Payment [idPayment=" + idPayment + ", datePayment=" + datePayment + ", amount=" + amount
                + ", idInvoice=" + idInvoice + ", paid=" + paid + "]";
    }

}
