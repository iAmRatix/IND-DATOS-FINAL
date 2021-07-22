/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;


import Clases.Pedido;
import Clases.ListaPedidos;
import java.sql.*;
import java.util.*;
import conectionsql.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class PedidoBO {
    private String mensaje = "";
    private PedidoCRUD pcrud = new PedidoCRUD();
    
    
    public String agregarPedido(Pedido ped){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pcrud.agregarPedido(conn, ped);
            
            
        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
            
        }finally{
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + "" + e.getMessage();
                
            }
        }
        return mensaje;
    }
    public String modificarPedido(Pedido ped){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pcrud.modificarPedido(conn, ped);
            
        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
            
        }finally{
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + "" + e.getMessage();
                
            }
        }
        return mensaje;
    }
    public String eliminarPedido(Pedido ped){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pcrud.eliminarPedido(conn, ped);
            
        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
            
        }finally{
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + "" + e.getMessage();
                
            }
        }
        return mensaje;
    }
    public void listarPedido(JTable tabla){
        Connection conn = Conexion.getConnection();
        pcrud.listarPedido(conn, tabla);
        
        
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }
    }
    
    
}
