 // WriteaJavaprogramtoestablish a connection to a database and print a
 // confirmation message upon successful connection.

package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class R03_1SuccessfulConnection {  // Class name changed as per your request
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment"; // Change 'testdb' to your database name
        String user = "root";  
        String password = "";

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);

            System.out.println("Database connection successful!");

            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
