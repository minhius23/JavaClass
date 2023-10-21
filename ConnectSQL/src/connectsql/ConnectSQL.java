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
import java.util.Vector;

/**
 *
 * @author minhius23
 */
public class ConnectSQL {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       
       
        try {
                String connectionUrl
                = "jdbc:sqlserver://PC-minhius\\HAMINHHIEU:1433;"
                + "database=quanlisinhvien;"
                + "user=sa;"
                + "password=123456;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";
               
                Connection c = null;
                c = DriverManager.getConnection(connectionUrl);
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
            
    }
}
