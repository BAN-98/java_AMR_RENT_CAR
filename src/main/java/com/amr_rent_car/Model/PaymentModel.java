package com.amr_rent_car.Model;

import com.amr_rent_car.Classes.Invoices;
import com.amr_rent_car.Classes.Payment;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentModel {
    public boolean createPayment(Payment payment) {
        String query = "INSERT INTO amr_payments(amount, idInvoice, paid) VALUES(?,?,?)";
        try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
            preparedStatement.setDouble(1, payment.getAmount());
            preparedStatement.setInt(2, payment.getIdInvoice());
            preparedStatement.setBoolean(3, payment.isPaid());
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updatePayment(Payment payment, Invoices invoices) {
        String query = "UPDATE amr_payments SET amount=?, idInvoice=?, paid=? WHERE id_payment=?";
        try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
            preparedStatement.setDouble(1, payment.getAmount());
            preparedStatement.setInt(2, invoices.getIdInvoice());
            preparedStatement.setBoolean(3, payment.isPaid());
            preparedStatement.setInt(4, payment.getIdPayment());
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean deletePayment(Payment payment) {
        String query = "DELETE FROM amr_payments WHERE id_payment=?";
        try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
            preparedStatement.setInt(1, payment.getIdPayment());
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Payment> getAllPayments() {
        List<Payment> paymentList = new ArrayList<>();
        String query = "SELECT * amr_payments";
        try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Payment payment = new Payment(
                        resultSet.getInt("id"),
                        resultSet.getString("date_payment"),
                        resultSet.getDouble("amount"),
                        resultSet.getInt("idInvoice"),
                        resultSet.getBoolean("paid")
                );
                paymentList.add(payment);
            }
            return paymentList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Payment getPayment(int id_payment){
        String query = "SELECT * FROM amr_payments WHERE id_payments=?";
        try(PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)){
            preparedStatement.setInt(1,id_payment);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return new Payment(
                        resultSet.getInt("id_payment"),
                        resultSet.getString("date_payment"),
                        resultSet.getDouble("amount"),
                        resultSet.getInt("id_invoice"),
                        resultSet.getBoolean("paid")
                );
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }
}
