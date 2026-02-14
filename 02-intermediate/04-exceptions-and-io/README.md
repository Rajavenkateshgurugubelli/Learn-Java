# Module 04: Exceptions and File I/O

This module covers how to handle runtime errors gracefully and how to read/write data to files.

## 🎯 Objectives
- Handle exceptions using `try-catch-finally`.
- Differentiate between Checked and Unchecked exceptions.
- Create custom exceptions.
- Read and write files using Classic I/O (`java.io`) and Modern I/O (`java.nio`).

## 📂 Content Overview

| File | Description |
|---|---|
| `ExceptionHandling.java` | Basic error handling flow. |
| `CheckedVsUnchecked.java` | Understanding inheritance hierarchy of exceptions. |
| `CustomExceptions.java` | Defining domain-specific errors. |
| `FileIO_Classic.java` | Using `BufferedReader` and `FileWriter`. |
| `FileIO_NIO.java` | Using `Files` and `Path` (New I/O). |

## 🚀 Key Concepts
- **Exception**: An event that disrupts the normal flow of the program.
- **Checked Exception**: Compiler forces you to handle it (e.g., `IOException`).
- **Unchecked Exception**: Runtime exceptions, usually programming errors (e.g., `NullPointerException`).
- **NIO (New I/O)**: Non-blocking, more efficient file operations introduced in Java 7.
