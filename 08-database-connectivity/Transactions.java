package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Module 08: JDBC
 * Topic: Transactions
 * 
 * Objectives:
 * 1. Disable Auto-Commit.
 * 2. Commit a batch of operations.
 * 3. Rollback if an error occurs.
 */
public class Transactions {

    static final String DB_URL = "jdbc:h2:mem:testdb3;DB_CLOSE_DELAY=-1";
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE ACCOUNTS (name VARCHAR(50), balance DOUBLE)");
            stmt.executeUpdate("INSERT INTO ACCOUNTS VALUES ('Alice', 1000)");
            stmt.executeUpdate("INSERT INTO ACCOUNTS VALUES ('Bob', 500)");

            // --- Start Transaction ---
            conn.setAutoCommit(false); // Default is true

            System.out.println("Starting funds transfer...");

            String withdrawObj = "UPDATE ACCOUNTS SET balance = balance - ? WHERE name = ?";
            String depositObj = "UPDATE ACCOUNTS SET balance = balance + ? WHERE name = ?";

            try (PreparedStatement withdraw = conn.prepareStatement(withdrawObj);
                    PreparedStatement deposit = conn.prepareStatement(depositObj)) {

                // 1. Withdraw 100 from Alice
                withdraw.setDouble(1, 100);
                withdraw.setString(2, "Alice");
                withdraw.executeUpdate();
                System.out.println("Withdrew 100 from Alice.");

                // Simulate various failure scenarios
                // if (true) throw new SQLException("Network Error during transfer!");

                // 2. Deposit 100 to Bob
                deposit.setDouble(1, 100);
                deposit.setString(2, "Bob");
                deposit.executeUpdate();
                System.out.println("Deposited 100 to Bob.");

                // 3. Commit
                conn.commit();
                System.out.println("Transaction Committed successfully.");

            } catch (SQLException e) {
                // 4. Rollback on Failure
                System.out.println("Error! Rolling back transaction: " + e.getMessage());
                conn.rollback();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Clean up
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
