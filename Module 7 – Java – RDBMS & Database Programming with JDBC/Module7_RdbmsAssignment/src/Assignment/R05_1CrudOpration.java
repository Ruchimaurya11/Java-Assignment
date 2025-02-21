package Assignment;

import java.sql.*;

public class R05_1CrudOpration {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment"; 
        String user = "root"; 
        String password = ""; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);

            String insertSQL = "INSERT INTO user (name, email) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, "Ram");
            pstmt.setString(2, "ram12@gmail.com");
            pstmt.executeUpdate();
            System.out.println("Record Inserted!");

  
//            String updateSQL = "UPDATE user SET email = ? WHERE name = ?";
//            pstmt = conn.prepareStatement(updateSQL);
//            pstmt.setString(1, "ram123@gmail.com");
//            pstmt.setString(2, "rama");
//            pstmt.executeUpdate();
//            System.out.println("Record Updated!");
//
//            // Select and display records
//            String selectSQL = "SELECT * FROM user";
//            pstmt = conn.prepareStatement(selectSQL);
//            ResultSet rs = pstmt.executeQuery();
//            System.out.println("User Records:");
//            while (rs.next()) {
//                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
//            }
//
//            // Delete a record
//            String deleteSQL = "DELETE FROM user WHERE name = ?";
//            pstmt = conn.prepareStatement(deleteSQL);
//            pstmt.setString(1, "ram");
//            pstmt.executeUpdate();
//            System.out.println("Record Deleted!");
//
//    
//            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

