/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacionproyecto;
 
import java.sql.SQLException;

/**
 *
 * @author mishe
 */
public class SimulacionProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       Conexion con = new Conexion(); 
       con.conectar();
       con.desconectar();
    }
    
}
