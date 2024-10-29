package com.example.demo;

import java.sql.*;

public class jdbcConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection c = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=school;trustServerCertificate=true;", "sa",
                "Ganilakshmi123");
        PreparedStatement p = c.prepareStatement("insert into teachers values(?,?)");
        p.setString(1, "veeramani");
        p.setInt(2, 45);
        p.executeUpdate();
        System.out.println("another record added successfully");

    }

}