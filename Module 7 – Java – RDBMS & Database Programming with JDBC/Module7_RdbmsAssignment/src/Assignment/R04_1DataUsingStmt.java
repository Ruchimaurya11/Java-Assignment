//Create a program that inserts, updates, selects, and deletes data using Statement.

package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class R04_1DataUsingStmt { 
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment"; 
        String user = "root";  
        String password = ""; 
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            String insertSQL = "INSERT INTO user (name, email) VALUES ('rudra', 'rudra12@gmail.com')";
            int insertCount = stmt.executeUpdate(insertSQL);
            System.out.println(insertCount + " row(s) inserted.");

//            String updateSQL = "UPDATE user SET email = 'rudra123@gmail.com' WHERE name = 'Rudransh'";
//            int updateCount = stmt.executeUpdate(updateSQL);
//            System.out.println(updateCount + " row(s) updated.");
//
//            String selectSQL = "SELECT * FROM user";
//            ResultSet rs = stmt.executeQuery(selectSQL);
//            System.out.println("User Data:");
//            while (rs.next()) {
//                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
//            }
//
            String deleteSQL = "DELETE FROM user WHERE name = 'alice'";
            int deleteCount = stmt.executeUpdate(deleteSQL);
            System.out.println(deleteCount + " row(s) deleted.");

//            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        }
    }
}
