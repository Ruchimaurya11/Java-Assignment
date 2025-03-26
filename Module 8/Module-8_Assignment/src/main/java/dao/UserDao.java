package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db_connection.DBConnection;
import model.User;


public class UserDao {

  
    public static boolean validate(User user) {
        boolean status = false;
        String query = "SELECT * FROM users WHERE username=? AND password=?";
        
        try (Connection conn = db_connection.DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
             
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            status = rs.next(); // If user exists, return true
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    
    public static boolean addUser(User user) {
        String query = "INSERT INTO users (username, password) VALUES (?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
             
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
