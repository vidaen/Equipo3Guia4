/*
 *     DATOS
DELETE, INSERT, UPDATE
Cada modificacion de la base de datos se usa la variables creada de tipo PreparedStatemet
que es un objeto con metodos String, Int, Long, Null, Blob, TimeStamp
leer desde la base de datos

SELECT es un leer de base de datos y no modificar la base de datos.
solo saca de la base de datos
 */
package UniversidadEjemplo;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Universidad_Ejemplo {

   
    public static void main(String[] args) {
       
        // VARIABLES INICIALIZADAS PARA MODIFICAR DESDE JAVA A BASE DE DATOS
        
            Connection conec= null;
            conec= Conexion.getConexion();            // traemos de la clase conexion el metodo static Connection getConexion
            PreparedStatement ps= null;                //  es un objeto con metodos string, null, blob,int, long, timeStamp
            Alumnos alu=null;
            
        // SELECT TRAER DESDE BASE DE DATOS SOLO MUESTRA 
            ResultSet rs= null;
        try {
            
       // PARA INSERTAR, MODIFICAR O ELIMINAR DESDE JAVA A BASE DE DATOS
    
           // String sql = "INSERT INTO alumno( dni, apellido, nombre, fechaNac, estado) VALUES ('31432888','cortez','gisel','1998-08-28',1)";
           // ps = conec.prepareStatement(sql);
            //ps.executeUpdate(); 
            
      //PARA SELECCIONAR DESDE BASE DE DATOS Y TRAERLO A JAVA
      
           String sql="SELECT * FROM alumno WHERE 2";
            ps=conec.prepareStatement(sql);
           rs= ps.executeQuery(sql);
    
        } catch (SQLException ex) {
            System.out.println("error" + ex.getMessage());
        }

    }
    
    
    
     /* try {
            Class.forName("org.mariadb.jdbc.Driver");
            // conectar con base de datos CON objeto creado de tipo Connection
            Connection conecBD = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidad", "root", "");
            
            } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar driver"+ ex.getMessage());
            } catch (SQLException ex)  {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos " + ex.getMessage());
            }
            
            */
}


    
