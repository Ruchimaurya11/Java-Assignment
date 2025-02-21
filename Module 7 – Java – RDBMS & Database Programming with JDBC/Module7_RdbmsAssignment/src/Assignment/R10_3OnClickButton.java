// On button clicks, the program should interact with the database and perform the
// appropriate operation (insert, update, display records, or delete records).

package Assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class R10_3OnClickButton extends JFrame {

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/rdbms_assignment";
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    // Declare components
    private JTextField nameField, emailField, idField;
    private JTextArea outputArea;

    // Constructor to set up the GUI
    public R10_3OnClickButton() {
        // JFrame setup
        setTitle("CRUD Operations");
        setLayout(new FlowLayout());

        // Create input fields
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        idField = new JTextField(20);

        // Create buttons for CRUD operations
        JButton insertButton = new JButton("Insert");
        JButton updateButton = new JButton("Update");
        JButton displayButton = new JButton("Display Records");
        JButton deleteButton = new JButton("Delete");

        // Text area to display operation results
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add components to the frame
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("User ID (for update/delete):"));
        add(idField);
        add(insertButton);
        add(updateButton);
        add(displayButton);
        add(deleteButton);
        add(scrollPane);

        // Set up button actions
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                insertUser(name, email);
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                String email = emailField.getText();
                updateUser(id, name, email);
            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectUsers();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                deleteUser(id);
            }
        });

        // JFrame settings
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Establish a connection to the database
    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // INSERT Operation: Insert a new user into the database
    private void insertUser(String name, String email) {
        String query = "INSERT INTO user (name, email) VALUES (?, ?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            int rowsAffected = stmt.executeUpdate();
            outputArea.setText(rowsAffected + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
            outputArea.setText("Error: " + e.getMessage());
        }
    }

    // UPDATE Operation: Update an existing user's details
    private void updateUser(int id, String name, String email) {
        String query = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, id);
            int rowsAffected = stmt.executeUpdate();
            outputArea.setText(rowsAffected + " row(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
            outputArea.setText("Error: " + e.getMessage());
        }
    }

    // SELECT Operation: Display all users from the database
    private void selectUsers() {
        String query = "SELECT * FROM users";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                sb.append("ID: ").append(id).append(", Name: ").append(name).append(", Email: ").append(email).append("\n");
            }
            outputArea.setText(sb.toString());
        } catch (SQLException e) {
            e.printStackTrace();
            outputArea.setText("Error: " + e.getMessage());
        }
    }

    // DELETE Operation: Delete a user based on the ID
    private void deleteUser(int id) {
        String query = "DELETE FROM users WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            outputArea.setText(rowsAffected + " row(s) deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
            outputArea.setText("Error: " + e.getMessage());
        }
    }

    // Main method to run the GUI application
    public static void main(String[] args) {
        new R10_3OnClickButton();
    }
}
