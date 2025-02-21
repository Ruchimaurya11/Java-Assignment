//. o WriteaJavaprogramthatusesCallableStatement tocall this stored procedure.

package Assignment;
import java.sql.*;

public class R11_1CallableStatment {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment"; 
        String user = "root";  
        String password = "";  

        Connection conn = null;
        CallableStatement stmt = null;

        try {
            
            conn = DriverManager.getConnection(url, user, password);

            
            String sql = "{call user(?, ?)}";  

            
            stmt = conn.prepareCall(sql);

            
            stmt.setInt(1, 10); 
            stmt.setString(2, "data");  

            
            stmt.execute();

            
            
            int result = stmt.getInt(1); 

            System.out.println("Stored  successfully. Result: " + result);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
