package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Module 08: JDBC
 * Topic: Prepared Statements
 * 
 * Objectives:
 * 1. Use placeholders (?) for parameters.
 * 2. Prevent SQL Injection.
 * 3. Performance benefits (pre-compiled).
 */
public class PreparedStatements {

    static final String DB_URL = "jdbc:h2:mem:testdb2;DB_CLOSE_DELAY=-1";
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            // Setup table
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE USERS (id INT PRIMARY KEY, username VARCHAR(50))");

            // --- The WRONG Way (Vulnerable to Injection) ---
            String inputUser = "admin' OR '1'='1";
            // String query = "SELECT * FROM USERS WHERE username = '" + inputUser + "'";
            // Danger! Executes: SELECT * FROM USERS WHERE username = 'admin' OR '1'='1'

            // --- The RIGHT Way (PreparedStatement) ---
            String insertSQL = "INSERT INTO USERS (id, username) VALUES (?, ?)";

            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

                // Bind values to parameters (1-indexed)
                pstmt.setInt(1, 1);
                pstmt.setString(2, "Alice");
                pstmt.executeUpdate(); // Insert Alice

                pstmt.setInt(1, 2);
                pstmt.setString(2, "Bob");
                pstmt.executeUpdate(); // Insert Bob

                System.out.println("Users inserted using PreparedStatement.");
            }

            // Select
            String selectSQL = "SELECT * FROM USERS WHERE username = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(selectSQL)) {
                pstmt.setString(1, "Alice");
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    System.out.println("Found: " + rs.getString("username"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
