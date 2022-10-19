
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VendedorDAO {
    EntidadVendedor ev = new EntidadVendedor();
    Conexion con = new Conexion();
    Connection acceso;
    public EntidadVendedor validarVendedor(String dni, String user){
        try{
            acceso = con.conectar();
            PreparedStatement ps = acceso.prepareStatement("select * from vendedor where Dni = ? and User = ?");
            ps.setString(1, dni);
            ps.setString(2, user);
            ResultSet rs = ps.executeQuery(); 
            while(rs.next()){
                ev.setId(rs.getInt(1));
                ev.setDni(rs.getString(2));
                ev.setNom(rs.getString(3));
                ev.setTel(rs.getString(4));
                ev.setEstado(rs.getString(5));
                ev.setUser(rs.getString(6));
            }
        }catch(Exception e){
            
        }
        return ev;
    }
}
