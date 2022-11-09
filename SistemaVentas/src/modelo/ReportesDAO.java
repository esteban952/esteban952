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
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
