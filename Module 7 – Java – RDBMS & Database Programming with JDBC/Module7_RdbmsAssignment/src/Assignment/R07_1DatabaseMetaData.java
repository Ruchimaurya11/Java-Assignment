// o Writeaprogramthat retrieves and displays metadata information about your
// database using DatabaseMetaData.

package Assignment;
import java.sql.*;

public class R07_1DatabaseMetaData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment"; 
        String user = "root"; 
        String password = ""; 
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection conn = DriverManager.getConnection(url, user, password);

            
            DatabaseMetaData dbMetaData = conn.getMetaData();

            System.out.println("Database Product Name: " + dbMetaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbMetaData.getDatabaseProductVersion());
            System.out.println("Database Driver Name: " + dbMetaData.getDriverName());
            System.out.println("Database Driver Version: " + dbMetaData.getDriverVersion());
            System.out.println("Database URL: " + dbMetaData.getURL());
        
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
