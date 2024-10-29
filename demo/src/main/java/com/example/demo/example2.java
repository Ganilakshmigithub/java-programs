package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Example2 {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Assignment;trustServerCertificate=true;";
        String user = "sa";
        String password = "Ganilakshmi123";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(url, user, password);

            // Alter the table
            // Prepare the insert statement
            String insertSQL = "INSERT INTO books (author_id, name, books_wrote) VALUES (?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertSQL);

            // Adding first set of values
            insertStatement.setInt(1, 101);
            insertStatement.setString(2, "Aasha");
            insertStatement.setInt(3, 2);
            insertStatement.addBatch();

            insertStatement.setInt(1, 103);
            insertStatement.setString(2, "Sri");
            insertStatement.setInt(3, 1);
            insertStatement.addBatch();

            insertStatement.setInt(1, 103);
            insertStatement.setString(2, "Sri");
            insertStatement.setInt(3, 3);
            insertStatement.addBatch();

            // Adding second set of values
            // Execute batch insert
            insertStatement.executeBatch();
            System.out.println("Values inserted successfully.");

            // Close resources
            insertStatement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
