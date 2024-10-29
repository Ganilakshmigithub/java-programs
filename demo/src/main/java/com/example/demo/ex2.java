package com.example.demo;
import java.sql.*;
public class ex2 {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        java.sql.Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Assignment;trustServerCertificate=true","sa","Ganilakshmi123");
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select cat_desc,avg(price) from products  group by cat_desc");
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getDouble(2));
        }  

}
}
