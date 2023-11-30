package com.amr_rent_car.Controller;

import com.amr_rent_car.Classes.Invoices;
import com.amr_rent_car.Classes.Payment;
import com.amr_rent_car.Model.PaymentModel;

import java.util.List;

public class PaymentController {
    private final PaymentModel paymentModel;

    public PaymentController() {
        this.paymentModel = new PaymentModel();
    }

    public boolean createPayment(Payment payment){
        return this.paymentModel.createPayment(payment);
    }

    public boolean deletePayment(Payment payment){
        return this.paymentModel.deletePayment(payment);
    }

    public boolean updatePayment(Payment payment, Invoices invoices){
        return this.paymentModel.updatePayment(payment,invoices);
    }

    public List<Payment> getAllPayments(){
        return this.paymentModel.getAllPayments();
    }

    public Payment getPayment(int id_payment){
        return this.paymentModel.getPayment(id_payment);
    }
}
