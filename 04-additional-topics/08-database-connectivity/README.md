# Module 08: Database Connectivity (JDBC)

Learn how to connect Java applications to relational databases using JDBC (Java Database Connectivity).

## 🎯 Objectives
- Connect to a database using `DriverManager`.
- Execute SQL queries using `Statement` and `PreparedStatement`.
- Process results with `ResultSet`.
- Manage `Transactions` (Commit/Rollback).

## 📂 Content Overview

| File | Description |
|---|---|
| `JDBCBasics.java` | Connecting and running a simple query. |
| `PreparedStatements.java` | Securely inserting data (Preventing SQL Injection). |
| `Transactions.java` | Handling multiple operations as a single unit. |

## 🛠 Setup (H2 Database)
We will use H2, an in-memory database, so you don't need to install anything. The dependency is usually managed by Maven/Gradle, but for this raw Java example, you might need to download the h2.jar and add it to your classpath if running manually.

**For this educational repo, code assumes the H2 driver is available.**
