
package Control_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionConBaseDatos {
     
    
    
    public static Connection conexion = null;
    
    //Este metodo realiza la conexión con la base de datos H2
    public static Connection getConexion() {
       
        try {
           conexion = null;
           //cargar nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           conexion =DriverManager.getConnection("jdbc:mysql://localhost/Ventas","root","");
           System.out.println("conexion establecida");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("error de conexion");
           JOptionPane.showMessageDialog(null, "error de conexion "+e);
       }
       

        return conexion;
    }//cierra metodo obtenerConexion
    
}//fin class
