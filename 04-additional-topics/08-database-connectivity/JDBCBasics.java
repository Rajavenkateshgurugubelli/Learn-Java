package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Module 08: JDBC
 * Topic: Basics
 * 
 * Objectives:
 * 1. Load Driver.
 * 2. Establish Connection.
 * 3. Create Statement.
 * 4. Execute Query.
 * 5. Process ResultSet.
 */
public class JDBCBasics {

    // H2 In-Memory Database URL
    static final String DB_URL = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {

        // Try-with-resources auto-closes Connection, Statement, and ResultSet
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {

            System.out.println("Connected via JDBC!");

            // 1. Create Table
            String sql = "CREATE TABLE STUDENTS " +
                    "(id INTEGER not NULL, " +
                    " first_name VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Table created.");

            // 2. Insert Data
            stmt.executeUpdate("INSERT INTO STUDENTS VALUES (101, 'Alice', 20)");
            stmt.executeUpdate("INSERT INTO STUDENTS VALUES (102, 'Bob', 22)");

            // 3. Query Data
            ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS");

            System.out.println("\n--- Results ---");
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");
                String name = rs.getString("first_name");
                int age = rs.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
