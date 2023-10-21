package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author minhius23
 */
public class JDBCUtil {
    public static Connection getConnection(){
         Connection c = null;
    try{   
      
        String url = "jdbc:sqlserver://PC-minhius\\HAMINHHIEU:1433;databaseName=quanlisinhvien;encrypt=true;trustServerCertificate=true";
        String user = "sa";
        String password = "123456";
        c = DriverManager.getConnection(url, user, password);
        if(c != null){
            
        }
        
    }catch(SQLException e){
        e.printStackTrace();
    }
        return c;
    }
    public static void closeConnection(Connection c){
        try {
            if(c != null){
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
