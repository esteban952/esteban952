/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import vistas.ReportesForm;

public class ReportesDAO implements CRUD{
    Connection con; 
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public Ventas listarVenta(int id){
        Ventas v = new Ventas();
        String sql = "select * from ventas where IdVentas = ?";
        try{
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(0, id);
            rs = ps.executeQuery();
            while(rs.next()){
                v.setId(rs.getInt(1));
                v.setIdCliente(rs.getInt(2));
                v.setIdVendedor(rs.getInt(3));
                v.setSerie(rs.getString(4));
                v.setFecha(rs.getString(5));
                v.setMonto(rs.getDouble(6));
                //v.setEstado(rs.getString(7));                
                        
            }
        }catch(Exception e){
        }
        return v;
    }
    
    public String idVentas(){
        String idv = "";
        String sql = "select max(IdVentas) from ventas";
        try{
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                idv = rs.getString(1);
            }
        } catch(Exception e){
            
        }
        return idv;
    }
    
    @Override
    public List listar() {
        List<Ventas> lista = new ArrayList<>();
        String sql = "select * from ventas";
        try{
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Ventas v = new Ventas();
                v.setId(rs.getInt(1));
                v.setIdCliente(rs.getInt(2));
                v.setIdVendedor(rs.getInt(3));
                v.setSerie(rs.getString(4));
                v.setFecha(rs.getString(5));
                v.setMonto(rs.getDouble(6));
                //v.setEstado(rs.getString(7));
                lista.add(v);
                
            }
        }catch(Exception e){
            
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    //metodo de Buscar
    public int actualizar(Object[] o) {
        int r = 0;
        
        String sql = "select Id=?,IdCliente=?, IdVendedor=?, Serie=?, Fecha=?, Monto=? where FechaVenta between '2022-10-05' and '2022-10-15'"; 
                //+ desde + " and " +hasta +"";
        try{
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[6]);
            r = ps.executeUpdate();
        }catch(Exception e){
            
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
