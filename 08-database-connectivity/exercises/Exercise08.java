package jdbc.exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Module 08: Exercise
 * 
 * Challenge: Employee Database
 * 
 * 1. Connect to an H2 database (mem:employeedb).
 * 2. Create an EMPLOYEES table (id, name, department).
 * 3. Write a method `addEmployee(int id, String name, String dept)`.
 * 4. Write a method `getEmployeesByDept(String dept)` that prints matches.
 * 5. Use PreparedStatement for queries.
 */
public class Exercise08 {

    static final String DB_URL = "jdbc:h2:mem:employeedb;DB_CLOSE_DELAY=-1";
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {
        // TODO: Implement Employee Database logic
    }
}
