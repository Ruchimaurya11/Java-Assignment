// o Research and explain the best JDBC driver for your database and Java environment.

package Assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class R02_2JdbcDriver { 
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment"; 
        String user = "root";  
        String password = ""; 

        
        String sql = "INSERT INTO user (name, email) VALUES (?, ?)";

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection conn = DriverManager.getConnection(url, user, password);

            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "ruchi");
            pstmt.setString(2, "ruchi12@gmail.com");

            
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            }

            
            pstmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection error!");
            e.printStackTrace();
        }
    }
}
