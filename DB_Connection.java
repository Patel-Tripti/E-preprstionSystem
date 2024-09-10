package E_preprationSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    static Connection con; 

    public static Connection getConnection() {
        try {

            String mysqlJDBCDriver = "com.mysql.cj.jdbc.Driver"; 
            String url = "jdbc:mysql://localhost:3306/E_preprationSystem";
            String user = "root"; 
            String pass = "root"; 
            Class.forName(mysqlJDBCDriver);
            con = DriverManager.getConnection(url, user, pass);
        } 
        catch (Exception e) {
            System.out.println("Connection Failed!");
        }

        return con;
    }
}
