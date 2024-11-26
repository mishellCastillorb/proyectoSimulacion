
package simulacionproyecto;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mish
 */
public class Conexion {
    
    private static final String  url="jdbc:oracle:thin:@localhost:1521:orcl";
    private final String usuario="mishellcast55";
    private final String password="mishell5"; 
    private  Connection conexion;


    public void conectar() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado: " + e.getMessage());
        }
    }
    
    
    
    public void desconectar() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    
    
      public Connection getConexion() {
        return conexion;
    }
    
    
    
    
    




}
