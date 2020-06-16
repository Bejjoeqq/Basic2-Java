/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aldhiyaconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER VX 15 PREDATOR
 */
public class Koneksi {
    Connection conn;
    public Connection getConnection()
    {
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/koneksidb","root","");
            JOptionPane.showMessageDialog(null,"Sukses");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Sukses");
        }
        return conn;
        
    }
}
