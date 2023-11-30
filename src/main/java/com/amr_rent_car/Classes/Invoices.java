package com.amr_rent_car.Classes;

public class Invoices {
    private int idInvoice;
    private double fullPayment;
    private String dateInvoice, paymentMethod;

    public Invoices(int idInvoice, String dateInvoice, double fullPayment, String paymentMethod) {
        this.idInvoice = idInvoice;
        this.dateInvoice = dateInvoice;
        this.fullPayment = fullPayment;
        this.paymentMethod = paymentMethod;
    }

    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public String getDateInvoice() {
        return dateInvoice;
    }

    public void setDateInvoice(String dateInvoice) {
        this.dateInvoice = dateInvoice;
    }

    public double getFulPayment() {
        return fullPayment;
    }

    public void setFulPayment(double fulPayment) {
        this.fullPayment = fulPayment;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Invoices [idInvoice=" + idInvoice + ", dateInvoice=" + dateInvoice + ", fulPayment=" + fullPayment
                + ", paymentMethod=" + paymentMethod + "]";
    }

}
