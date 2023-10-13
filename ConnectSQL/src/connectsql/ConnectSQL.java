/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author minhius23
 */
public class ConnectSQL {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String connectionUrl
                = "jdbc:sqlserver://PC-minhius\\HAMINHHIEU:1433;"
                + "database=quanlisinhvien;"
                + "user=sa;"
                + "password=123456;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";
        try (Connection conn = DriverManager.getConnection(connectionUrl);) {
            Statement stm = conn.createStatement();
            String sql = "select * from Sinhvien";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                System.out.println("MSV " + rs.getString(1));
                System.out.println("Ten " + rs.getString(2));
                System.out.println("Ngaysinh " + rs.getString(3));
                System.out.println("Gioi tinh " + rs.getString(4));
                System.out.println("Malop " + rs.getString(5));
                System.out.println("Tenlop " + rs.getString(6));
                System.out.println("==========================================");

            }
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            System.out.print("ERROR");
        }
    }

}
