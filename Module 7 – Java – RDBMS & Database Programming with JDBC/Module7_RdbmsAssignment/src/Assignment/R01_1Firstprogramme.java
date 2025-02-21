//Writeasimple Javaprogramto connect to a MySQL database using JDBC.

package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class R01_1Firstprogramme {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment";
        String user = "root"; 
        String password = ""; 

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database successfully!");

            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check your database credentials and URL.");
            e.printStackTrace();
        }
    }
}
