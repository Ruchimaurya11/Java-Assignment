//  Display database name, version, list of tables, and supported SQL features.

package Assignment;

import java.sql.*;

public class R07_2SqlFeature {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rdbms_assignment"; 
        String user = "root"; 
        String password = ""; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);

            DatabaseMetaData dbMetaData = conn.getMetaData();

            System.out.println("Database Name: " + dbMetaData.getDatabaseProductName());
            System.out.println("Database Version: " + dbMetaData.getDatabaseProductVersion());

            System.out.println("\nList of Tables in the Database:");
            ResultSet tables = dbMetaData.getTables(null, null, "%", new String[]{"TABLE"});
            while (tables.next()) {
                System.out.println(" - " + tables.getString("TABLE_NAME"));
            }

            
            System.out.println("\nSupported SQL Features:");
            System.out.println("Supports Stored Procedures: " + dbMetaData.supportsStoredProcedures());
            System.out.println("Supports Transactions: " + dbMetaData.supportsTransactions());
            System.out.println("Supports Subqueries: " + dbMetaData.supportsCorrelatedSubqueries());
            System.out.println("Supports Batch Updates: " + dbMetaData.supportsBatchUpdates());
            System.out.println("Supports Outer Joins: " + dbMetaData.supportsOuterJoins());
            System.out.println("Supports Union: " + dbMetaData.supportsUnion());

            tables.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
