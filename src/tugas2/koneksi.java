/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class koneksi {
    public static void main(String[] args) {
        String DBurl = "mysql:jdbc://localhost:3306/Restoran";
        String username = "root";
        String password = "";
        
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet res = null;
        
        try{
            dbCon = DriverManager.getConnection(DBurl,username,password);
            JOptionPane.showMessageDialog(null,"koneksi berhasil");
            
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "koneksi gagal");
            
        }
        
    }
}
