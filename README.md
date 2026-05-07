# oops-final-practical
to write in mysql
CREATE DATABASE company;

USE company;

CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary DOUBLE
);

import java.sql.*;
import java.util.Scanner;

public class EmployeeJDBC {
    public static void main(String[] args) {

        // Database details
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String password = "root"; // change if needed

        Scanner sc = new Scanner(System.in);

        try {
            // Load driver (optional in new versions but safe for exams)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // Insert data
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            String insertQuery = "INSERT INTO employee VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, salary);

            ps.executeUpdate();
            System.out.println("Record inserted successfully!");

            // Display data
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            System.out.println("\nEmployee Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getDouble("salary"));
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


