 //Write a program that retrieves and displays column names, types, and count of a
 //ResultSet using ResultSetMetaData.

package Assignment;
import java.sql.*;

public class R08_1ResultsetRetrive {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment";
        String username = "root";
        String password = "";
        
        
        String query = "SELECT * FROM user"; 

        try {
            
            Connection conn = DriverManager.getConnection(url, username, password);
            
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            
            ResultSetMetaData rsMetaData = rs.getMetaData();
            
            
            int columnCount = rsMetaData.getColumnCount();
            
            
            System.out.println("Column Count: " + columnCount);
            for (int i = 1; i <= columnCount; i++) {
                String columnName = rsMetaData.getColumnName(i);
                String columnType = rsMetaData.getColumnTypeName(i);
                System.out.println("Column " + i + ": " + columnName + " | Type: " + columnType);
            }

            
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
