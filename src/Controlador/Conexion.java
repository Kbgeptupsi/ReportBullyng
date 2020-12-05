package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {    
    
    
    public static Connection getConexion(){
        String url = "jdbc:sqlserver://localhost;"+"database=Proyecto;"+
                "user=sa;"+"password=abcd;";
         try{
             Connection con = DriverManager.getConnection(url);
             return con;
         }catch(SQLException e ){
             System.out.println(e.toString());
              JOptionPane.showMessageDialog(null,e.toString());
             return null;
         }
    }
}
