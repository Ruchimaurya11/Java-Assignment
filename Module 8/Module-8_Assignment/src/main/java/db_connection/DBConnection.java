package db_connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/webassign";
    private static final String USER = "root"; // Change if needed
    private static final String PASSWORD = ""; // Change if needed
    private static Connection conn = null;

    // Static method to get a connection
    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    // Method to close the connection
    public static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
