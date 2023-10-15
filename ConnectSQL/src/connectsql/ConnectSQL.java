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
       
       
        String connectionUrl
                = "jdbc:sqlserver://PC-minhius\\HAMINHHIEU:1433;"
                + "database=quanlisinhvien;"
                + "user=sa;"
                + "password=123456;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";
               
         Connection conn = DriverManager.getConnection(connectionUrl);
    }
   public Vector<Vector<String>> getAll() throws SQLException {
	Vector<Vector<String>> data = new Vector<>();

	// Kết nối database
	connection = getConnect();

	// Tạo câu lệnh SQL (Cách 1: dùng Statement)
	Statement stmt = connection.createStatement();
	ResultSet rs = stmt.executeQuery("Select * from Students");
	while (rs.next()) {

	    // Lấy dữ liệu từ ResultSet
	    String Sno = rs.getString(1);
	    String Sname = rs.getString(2);
	    String Sgender = rs.getString(3);
	    String Sclass = rs.getString(4);
	    String Saddress = rs.getString(5);
	    String Semail = rs.getString(6);

	    // Ghi vào vector
	    Vector<String> temp = new Vector<>();
	    temp.add(Sno);
	    temp.add(Sname);
	    temp.add(Sgender);
	    temp.add(Sclass);
	    temp.add(Saddress);
	    temp.add(Semail);

	    // Thêm dữ liệu vào data vector chính
	    data.add(temp);
	}
	return data;
    }
}
