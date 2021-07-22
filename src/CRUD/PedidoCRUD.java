/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import Clases.Pedido;

import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class PedidoCRUD {
    
    private String mensaje = "";
    
    PreparedStatement pst;
    ResultSet rs;
    
    public String agregarPedido(Connection con , Pedido ped){
        PreparedStatement pst = null;
        String sql = "INSERT INTO PEDIDOS VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            
            pst.setString(1, ped.getDnicli());
            pst.setString(2, ped.getEstado());
            pst.setString(3, ped.getFvisita());
            pst.setString(4, ped.getFentrega());
            pst.setString(5, ped.getDireccion());
            pst.setString(6, ped.getDescri());
            pst.setInt(7, ped.getPrecio());
            pst.setInt(8, ped.getCantidad());
            pst.setString(9, ped.getAlto());
            pst.setString(10, ped.getLargo());
            pst.setString(11, ped.getAncho());
            System.out.println(pst.toString());
            mensaje = "GUARDADO CORRECTO";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR \n" + e.getMessage();    
        }
        
        return mensaje;
    }
    public String modificarPedido(Connection con , Pedido ped){
        PreparedStatement pst = null;
        String sql = "UPDATE PEDIDOS SET ESTADO=?, FVISITA=?, FENTREGA=?, DIRECCION=?, DESCRIPCION=?, PRECIO=?, CANTIDAD=?, ALTO=?, LARGO=?, ANCHO=? WHERE DNI_CLIENTE=?";
        
        try {
            pst = con.prepareStatement(sql);
            
            
            pst.setString(1, ped.getEstado());
            pst.setString(2, ped.getFvisita());
            pst.setString(3, ped.getFentrega());
            pst.setString(4, ped.getDireccion());
            pst.setString(5, ped.getDescri());
            pst.setInt(6, ped.getPrecio());
            pst.setInt(7, ped.getCantidad());
            pst.setString(8, ped.getAlto());
            pst.setString(9, ped.getLargo());
            pst.setString(10, ped.getAncho());
            pst.setString(11, ped.getDnicli());
            mensaje = "MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO MODIFICADAR \n" + e.getMessage();    
        }
        
        return mensaje;
    }
    public String eliminarPedido(Connection con , Pedido ped){
        PreparedStatement pst = null;
        String sql = "DELETE FROM PEDIDOS WHERE DNI_CLIENTE=? AND ESTADO=? AND FVISITA=? AND FENTREGA=? AND DIRECCION=? AND DESCRIPCION=? AND PRECIO=? AND CANTIDAD=? AND ALTO=? AND LARGO=? AND ANCHO=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, ped.getDnicli());
            pst.setString(2, ped.getEstado());
            pst.setString(3, ped.getFvisita());
            pst.setString(4, ped.getFentrega());
            pst.setString(5, ped.getDireccion());
            pst.setString(6, ped.getDescri());
            pst.setInt(7, ped.getPrecio());
            pst.setInt(8, ped.getCantidad());
            pst.setString(9, ped.getAlto());
            pst.setString(10, ped.getLargo());
            pst.setString(11, ped.getAncho());
            
            mensaje = "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO ELIMINAR \n" + e.getMessage();    
        }
        
        return mensaje;
    }
    public void listarPedido(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"DNI_CLIENTE", "ESTADO", "FVISITA", "FENTREGA", "DIRECCION", "DESCRIPCION", "PRECIO", "CANTIDAD", "ALTO", "LARGO", "ANCHO"};               
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM PEDIDOS ORDER BY ESTADO";
        
        String [] filas = new String[11];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                for (int i = 0; i < 11; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
        
    }
    
    
    
}
