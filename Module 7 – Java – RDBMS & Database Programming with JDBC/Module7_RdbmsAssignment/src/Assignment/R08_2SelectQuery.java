//o Use a SELECT query to display this metadata for a specific table.

package Assignment;

import java.sql.*;

public class R08_2SelectQuery {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment";
        String username = "root";
        String password = "";
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user LIMIT 1"); 

            ResultSetMetaData columnDetails = rs.getMetaData();
            
            int columnCount = columnDetails.getColumnCount();
            
            System.out.println("Column Count: " + columnCount);
            for (int i = 1; i <= columnCount; i++) {
                String columnName = columnDetails.getColumnName(i);
                String columnType = columnDetails.getColumnTypeName(i);
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

