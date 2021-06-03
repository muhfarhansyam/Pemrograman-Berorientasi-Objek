/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author MFS
 */
public class KoneksiSql {
    
    private static Connection MySQLConnection;
    
    public static Connection configDB()throws SQLException{
        try{
            String url ="jdbc:mysql://localhost:3306/13020190005";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConnection = DriverManager.getConnection(url,user,pass);
            System.out.println("Koneksi Menuju Database Berhasil");
        }catch (SQLException e){
            System.out.println("Koneksi Menuju Database Gagal");
        }
        return MySQLConnection;
    }
    
}
