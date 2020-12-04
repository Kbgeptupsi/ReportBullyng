package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {    
    
    
    public static Connection getConexion(){
        String url="jbdc:sqlserver://localhost:1433;"+"database=Proyecto;"+
                "user=KRISTIAN---PC;"+"password=;";
         try{
             Connection con = DriverManager.getConnection(url);
             return con;
         }catch(SQLException e ){
             System.out.println(e.toString());
             return null;
         }
    }
}
