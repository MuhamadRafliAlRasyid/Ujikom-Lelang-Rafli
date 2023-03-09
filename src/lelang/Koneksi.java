/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lelang;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Muhamad Rafl Al Rasyid
 */
public class Koneksi {
    public Connection con;
    public Statement stat;
    private static final String DATABASE_NAME = "db_ujikomlelangrafli";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public Koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+DATABASE_NAME,USERNAME,PASSWORD);
            stat = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }
}
