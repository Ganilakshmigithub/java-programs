package com.example.demo;

import java.sql.*;

public class ProdUpdate {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement p = null;

        try {
            // Establish a connection
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Assignment;trustServerCertificate=true", "sa", "Ganilakshmi123");
            con.setAutoCommit(false); // Set auto-commit to false
            
            // Prepare the SQL statement
            p = con.prepareStatement("INSERT INTO products (price, cat_desc) VALUES (?, ?)");

            // Insert first product
            p.setInt(1, 1000);
            p.setString(2, "bag price");
            p.executeUpdate();

            // Insert second product
            p.setInt(1, 20);
            p.setString(2, "chocolate price");
            p.executeUpdate();

            // Commit the transaction
            con.commit();
            System.out.println("Transaction committed successfully.");

        } catch (SQLException e) {
            // Rollback in case of an error
            if (con != null) {
                try {
                    con.rollback();
                    System.out.println("Transaction rolled back due to error: " + e.getMessage());
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
        } finally {
            // Clean up resources
            try {
                if (p != null) p.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
