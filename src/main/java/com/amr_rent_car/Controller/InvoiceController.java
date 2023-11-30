package com.amr_rent_car.Controller;

import com.amr_rent_car.Classes.Invoices;
import com.amr_rent_car.Model.InvoiceModel;

import java.util.List;

public class InvoiceController
{
    private InvoiceModel invoiceModel;

    public InvoiceModel invoiceController(){
         return this.invoiceModel = new InvoiceModel();
    }

    public boolean createInvoice(Invoices invoices){
        return this.invoiceModel.createInvoice(invoices);
    }

    public boolean updateInvoice(Invoices invoices){
        return this.invoiceModel.updateInvoice(invoices);
    }

    public boolean deleteInvoice(int id_invoice){
        return this.invoiceModel.deleteInvoice(id_invoice);
    }

    public List<Invoices> getAllInvoices(){
        return this.invoiceModel.getAllInvoices();
    }

    public Invoices getInvoice(int id_invoice){
        return this.invoiceModel.getInvoice(id_invoice);
    }
}
