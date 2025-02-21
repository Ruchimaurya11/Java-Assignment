// o Demonstratehowtonavigate through the ResultSet using methods like next(),
 //previous(), etc.

package Assignment;

import java.sql.*;

public class R06_2ResultsetUsingMethod {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment"; // Change 'testdb' to your database name
        String user = "root"; // Change to your database username
        String password = ""; // Change to your database password

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Execute SELECT Query with a Scrollable ResultSet
            String selectSQL = "SELECT id, name, email FROM user";
            PreparedStatement pstmt = conn.prepareStatement(selectSQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pstmt.executeQuery();

            

            // Move to Previous Record
            if (rs.previous()) {
                System.out.println("Previous Record: ID=" + rs.getInt("id") + ", Name=" + rs.getString("name") + ", Email=" + rs.getString("email"));
            }

            // Move Forward Using next()
            System.out.println("\nAll Records:");
            rs.beforeFirst(); // Move cursor before the first row
            while (rs.next()) {
                System.out.println("ID=" + rs.getInt("id") + ", Name=" + rs.getString("name") + ", Email=" + rs.getString("email"));
            }

            // Close Resources
            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

