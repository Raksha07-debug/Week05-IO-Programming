package com.practice.databasetocsv;

import java.io.*;
import java.sql.*;

public class DatabaseToCSV {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/company_db?useSSL=false";
        String user = "Abhi";
        String password = "Abhi@123";
        String filePath="src\\main\\resources\\output.csv";
        exportDatabaseToCSV(dbUrl,user,password,filePath);
    }
    public static void exportDatabaseToCSV(String dbUrl, String user, String password, String filePath) {
        String query = "SELECT emp_id, name, department, salary FROM employees";

        try (Connection conn = DriverManager.getConnection(dbUrl, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            writer.write("Employee ID, Name, Department, Salary\n");

            while (rs.next()) {
                writer.write(rs.getInt("emp_id") + ", " + rs.getString("name") + ", " +
                        rs.getString("department") + ", " + rs.getDouble("salary") + "\n");
            }

            System.out.println("CSV Report generated successfully: " + filePath);

        } catch (SQLException | IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
