package com.amr_rent_car.Model;

import com.amr_rent_car.Classes.Invoices;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InvoiceModel {

    public boolean createInvoice(Invoices invoices) {
        String query = "INSERT INTO amr_invoices(full_payment, payment_method) VALUES(?,?)";
        try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
            preparedStatement.setDouble(1, invoices.getFulPayment());
            preparedStatement.setString(2, invoices.getPaymentMethod());
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateInvoice(Invoices invoices) {
        String query = "UPDATE FROM amr_invoice SET full_payment=?, payment_method";
        try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
            preparedStatement.setDouble(1, invoices.getFulPayment());
            preparedStatement.setString(2, invoices.getPaymentMethod());
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteInvoice(int id) {
        String query = "DELETE FROM amr_invoices WHERE id_invoice=?";
        try (PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Invoices> getAllInvoices() {
        List<Invoices> invoicesList = new ArrayList<>();
        String query = "SELECT * FROM amr_invoices";
        try (
                PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                Invoices invoices = new Invoices(
                        resultSet.getInt("id_invoice"),
                        resultSet.getString("date_invoice"),
                        resultSet.getDouble("full_payment"),
                        resultSet.getString("payment_method")
                );
                invoicesList.add(invoices);
            }
            return invoicesList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Invoices getInvoice(int id_invoice) {
        String query = "SELECT * FROM amr_invoice WHERE id_invoice=?";
        try (
                PreparedStatement preparedStatement = DBConnect.connect().prepareStatement(query)
        ) {
            preparedStatement.setInt(1, id_invoice);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new Invoices(
                        resultSet.getInt("id_invoice"),
                        resultSet.getString("date_invoice"),
                        resultSet.getDouble("full_payment"),
                        resultSet.getString("payment_method")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
