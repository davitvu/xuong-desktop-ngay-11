/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vit
 */

public class repositories {
    public static void main(String[] args) {
        try {
            // Get the database connection
            Connection conn = db.getConnection();
            System.out.println("Connection established successfully!");

            // Create a query and a PreparedStatement
            String query = "SELECT maSV, hoTen FROM sinhVien";
            PreparedStatement pstmt = conn.prepareStatement(query);

            // Execute the query
            ResultSet rs = pstmt.executeQuery();

            // Process the result set
            while (rs.next()) {
                // Retrieve data by column name
                String name = rs.getString("maSV");
                String email = rs.getString("hoTen");

                // Print the data
                System.out.println("Name: " + name + ", Email: " + email);
            }

            // Close the result set, statement, and connection
            rs.close();
            pstmt.close();
            conn.close();
            System.out.println("Connection closed successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

