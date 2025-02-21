//Implement CRUD operations (Insert, Update, Select, Delete) using JDBC and MySQL.

package Assignment;

import java.sql.*;

public class R10_2CRUD_Operation {

    private static final String URL = "jdbc:mysql://localhost:3306/rdbms_assignment";
    private static final String USER = "root"; // replace with your MySQL username
    private static final String PASSWORD = ""; // replace with your MySQL password

    // Establish a connection
    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // INSERT Operation
    public static void insertUser(String name, String email) {
        String query = "INSERT INTO user (name, email) VALUES (?, ?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE Operation
    public static void updateUser(int id, String name, String email) {
        String query = "UPDATE user SET name = ?, email = ? WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, id);
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // SELECT Operation
    public static void selectUsers() {
        String query = "SELECT * FROM user";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE Operation
    public static void deleteUser(int id) {
        String query = "DELETE FROM user WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Example Usage

        // Insert Users
        insertUser("rudra", "rudra@gmail.com");
        insertUser("Shreya", "shreya12@gmail.com");

        // Select Users
        System.out.println("Displaying all users:");
        selectUsers();

        // Update User
       // updateUser(1, "Johnathan Doe", "johnathan@example.com");

        // Delete User
      //  deleteUser(2);

        // Select Users again to check changes
        System.out.println("Displaying all users after update and delete:");
        selectUsers();
    }
}

