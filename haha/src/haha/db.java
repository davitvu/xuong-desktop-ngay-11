/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author vit
 */
public class db {
    private static final String URL = "jdbc:mysql://localhost:3306/abc";
    private static final String USER = "root";
    private static final String PASSWORD = "xtruong19";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Return the connection
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}