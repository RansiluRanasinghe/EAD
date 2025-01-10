/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author dinis
 */
public class MyConn {

    static Connection c;

    public static void getMyConn() throws Exception {
        // creating sql drivers with database
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Link of the mysql database 
        // Running in locally - localhost portnumber - 3306
        // databse name greentechuniversity
        String url = "jdbc:mysql://localhost:3306/studentpaymentsystem";

        c = DriverManager.getConnection(url, "root", "Ransilu@123");

    }

    // This will handle insert, update, delete queries
    public static void save(String sql) throws Exception {
        if (c == null) {
            getMyConn();
        }
        c.createStatement().executeUpdate(sql);
    }

    // This will handle search query
    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            getMyConn();
        }
        ResultSet rs = c.createStatement().executeQuery(sql);
        return rs;

    }
}
