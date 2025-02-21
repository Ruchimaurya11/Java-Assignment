// o Write a program that executes a SELECTquery and processes the ResultSet to
 //display records from the database.

package Assignment;
import java.sql.*;

public class R06_1ResultsetInDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment";         String user = "root"; // Change to your database username
        String User = "root"; 
        String password=""; 
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection conn = DriverManager.getConnection(url, user, password);

            String selectSQL = "SELECT id, name, email FROM user";
            PreparedStatement pstmt = conn.prepareStatement(selectSQL);
            ResultSet rs = pstmt.executeQuery();

//            
//            System.out.println("User Records:");
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
//            }
//
//            
          rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
