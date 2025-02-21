//ModifytheprogramtousePreparedStatement forparameterized queries.

package Assignment;

import java.sql.*;

public class R04_2PrameterizedQuery {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment"; // Change 'testdb' to your database name
        String user = "root"; 
        String password = ""; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);

            String insertSQL = "INSERT INTO user (name, email) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, "ayan");
            pstmt.setString(2, "ayan12@gmail.com");
            pstmt.executeUpdate();
            System.out.println("Data inserted!");

            String updateSQL = "UPDATE user SET email = ? WHERE name = ?";
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.setString(1, "ayan123@example.com");
            pstmt.setString(2, "ayan");
            pstmt.executeUpdate();
            System.out.println("Data updated!");

//            String selectSQL = "SELECT * FROM user WHERE name = ?";
//            pstmt = conn.prepareStatement(selectSQL);
//            pstmt.setString(1, "ayan");
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
//            }
//
//            String deleteSQL = "DELETE FROM user WHERE name = ?";
//            pstmt = conn.prepareStatement(deleteSQL);
//            pstmt.setString(1, "John");
//            pstmt.executeUpdate();
//            System.out.println("Data deleted!");

           // rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
