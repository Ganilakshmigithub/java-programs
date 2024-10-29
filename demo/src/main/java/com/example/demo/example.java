package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class example {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection c = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=school;trustServerCertificate=true", "sa",
                "Ganilakshmi123");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("select*from teachers");
        while (rs.next()) {
            System.out.println(rs.getString("names") + " " + rs.getInt("age"));
        }

    }
}