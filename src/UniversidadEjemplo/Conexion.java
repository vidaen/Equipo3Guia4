/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversidadEjemplo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLDataException;



public class Conexion {

    // atributos y constructores de la conexion 
    private static String url = "jdbc:mariadb://localhost:3306/universidad";
    private static String usuario = "root";
    private static String password = "";
    private static Conexion conexion = null;// Se invoca el metodo privado pero en la misma clase

    
    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver" + ex.getMessage());
        }
    }

    public static Connection getConexion() {
        Connection conec = null;

        if (conexion == null) {
            conexion = new Conexion();
        }
        try {
            //conec=DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidad"+ "root" + "");
           //conec = DriverManager.getConnection(url + "?userLegacyDatetimeCode=false&serverTimezone=UTC" + "&user= " + usuario + "password" + password );
        //Connection conecBD = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidad", "root", "");
        
        
          conec=DriverManager.getConnection(url, usuario , password);
          
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error coneccion con Base de Datos" + ex);

        }

        return conec;
    }
}
    
    

