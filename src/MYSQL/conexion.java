/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MYSQL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author aoswa
 */
public class conexion {
    Connection con=null;
    public conexion(){
        
    }
    public Connection getconexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_escuela","root","admin");
            JOptionPane.showMessageDialog(null, "Exitosa");
            
        }catch(ClassNotFoundException |SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conextar con la base de datos");
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    public static void main(String[] args){
        conexion con = new conexion();
        con.getconexion();
    }
}
