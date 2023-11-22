package com.amr_rent_car.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConect {
    private static Connection connection = null;
    private static final String URL = "jdbc:mysql://localhost:3306/amr_rent_car";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public DBConect() {}

    public static Connection connect() throws SQLException {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (ClassNotFoundException | SQLException e) {
            // Lanzar una excepción para manejarla en el código que utiliza esta clase
            throw new SQLException("Error al conectar a la base de datos", e);
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Manejar de manera adecuada en un entorno de producción
            } finally {
                connection = null; // Asegurarse de que la conexión se restablezca a null incluso si hay un error al cerrarla
            }
        }
    }
}
