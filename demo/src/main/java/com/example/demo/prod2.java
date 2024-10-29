package com.example.demo;
import java.sql.*;
public class prod2 {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        java.sql.Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Assignment;trustServerCertificate=true","sa","Ganilakshmi123");
        PreparedStatement p=con.prepareStatement("delete from products  where prod_id IN(?,?,?)");
        p.setInt(1, 101);
        p.setInt(2, 102);
        p.setInt(3, 103);
        p.executeUpdate();
        System.out.println("executed");
}
}
