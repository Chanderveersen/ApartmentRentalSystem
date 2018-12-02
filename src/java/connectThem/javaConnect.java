/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectThem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Chanderveer Sen
 */
public class javaConnect {
    private javaConnect() {
        
    }
    static Connection conn;
    public static Connection connectDb() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/apartment?user=root&password=Shinjo0786&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true");
}
    catch (Exception e){
    System.out.println(e);
}
    return conn;
}
}
