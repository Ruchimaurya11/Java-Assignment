// o WriteSQLqueriesfor:
// 1 Inserting a record into a table.
// 2 Updating specific fields of a record.
// 3 Selecting records based on certain conditions.
//4 Deleting specific records.

package Assignment;
import java.sql.*;

public class R09_1SqlQuery {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment";
        String username = "root";
        String password = "";

        try {
            
            Connection conn = DriverManager.getConnection(url, username, password);
            
            
            String insertQuery = "INSERT INTO user (id, name, email) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
            insertStmt.setInt(1, 2);           
            insertStmt.setString(2, "ruchi"); 
            insertStmt.setString(3, "rm123@gmail.com"); 
            int rowsInserted = insertStmt.executeUpdate();
            System.out.println(rowsInserted + " inserted.");

            
//            String updateQuery = "UPDATE user SET name = ?, email = ? WHERE id = ?";
//            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
//            updateStmt.setString(1, "ruchi"); 
//            updateStmt.setString(2, "ruchi12@gmail.com");
//            updateStmt.setInt(3, 1);    
//            int rowsUpdated = updateStmt.executeUpdate();
//            System.out.println(rowsUpdated + " updated.");

            
//            String selectQuery = "SELECT * FROM user WHERE id = ?";
//            PreparedStatement selectStmt = conn.prepareStatement(selectQuery);
//            selectStmt.setInt(1, 1); 
//            ResultSet rs = selectStmt.executeQuery();
//            System.out.println("Record with id = 1:");
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
//            }

//            
//            String deleteQuery = "DELETE FROM user WHERE id = ?";
//            PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery);
//            deleteStmt.setInt(1, 1);  
//            int rowsDeleted = deleteStmt.executeUpdate();
//            System.out.println(rowsDeleted + " record(s) deleted.");
//            
            
//            rs.close();
            insertStmt.close();
//            updateStmt.close();
//            selectStmt.close();
//            deleteStmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
