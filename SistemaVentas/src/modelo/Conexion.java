
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Connection conectar(){
        Connection con = null;
        try{
            con = DriverManager.getConnection ("jdbc:mysql://localhost/bd_ventas", "root", "");
        }catch(Exception e){
            
        }
        return con;
    }
}
