package com.amr_rent_car.Classes;

public class Invoices {
    private int idInvoice;
    private double fulPayment;
    private String dateInvoice, paymentMethod;

    public Invoices(int idInvoice, String dateInvoice, double fulPayment, String paymentMethod) {
        this.idInvoice = idInvoice;
        this.dateInvoice = dateInvoice;
        this.fulPayment = fulPayment;
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
        return fulPayment;
    }

    public void setFulPayment(double fulPayment) {
        this.fulPayment = fulPayment;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Invoices [idInvoice=" + idInvoice + ", dateInvoice=" + dateInvoice + ", fulPayment=" + fulPayment
                + ", paymentMethod=" + paymentMethod + "]";
    }

}
