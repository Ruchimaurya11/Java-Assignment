//Demonstrate the process of loading a JDBC driver and establishing a connection.

package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class R01_2DemonstrateJdbcDriver {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment"; // Change 'your_database' to actual DB name
        String user = "root"; 
        String password = ""; 

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ JDBC Driver Loaded Successfully!");

            
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to MySQL Database Successfully!");

            
            conn.close();
            System.out.println("✅ Connection Closed Successfully!");

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: JDBC Driver Not Found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Error: Failed to Connect! Check Database Credentials & URL.");
            e.printStackTrace();
        }
    }
}

