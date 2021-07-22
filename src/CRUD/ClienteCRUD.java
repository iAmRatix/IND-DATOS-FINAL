/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import Clases.Cliente;

import java.sql.Connection;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ratix
 */
public class ClienteCRUD {
    
    private String mensaje = "";
    PreparedStatement pst;
    ResultSet rs;
    
    public String agregarCliente(Connection con , Cliente cli){
        PreparedStatement pst = null;
        String sql = "INSERT INTO CLIENTES VALUES(?,?,?,?,?)";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cli.getDni());
            pst.setString(2, cli.getNombre());
            pst.setString(3, cli.getCelular());
            pst.setString(4, cli.getDireccion());
            pst.setString(5, cli.getCorreo());
            System.out.println(pst.toString());
            mensaje = "GUARDADO CORRECTO";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR \n" + e.getMessage();    
        }
        
        return mensaje;
    }
    public String modificarCliente(Connection con , Cliente cli){
        PreparedStatement pst = null;
        String sql = "UPDATE CLIENTES SET NOMBRE = ?, CELULAR=?, DIRECCION=?, CORREO=? WHERE DNI=?";
        
        try {
            pst = con.prepareStatement(sql);
            
            pst.setString(1, cli.getNombre());
            pst.setString(2, cli.getCelular());
            pst.setString(3, cli.getDireccion());
            pst.setString(4, cli.getCorreo());
            pst.setString(5, cli.getDni());
            mensaje = "MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO MODIFICADAR \n" + e.getMessage();    
        }
        
        return mensaje;
    }
    
    public String eliminarCliente(Connection con , Cliente cli){
        PreparedStatement pst = null;
        String sql = "DELETE FROM CLIENTES WHERE DNI=? AND NOMBRE=? AND CELULAR=? AND DIRECCION=? AND CORREO=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cli.getDni());
            pst.setString(2, cli.getNombre());
            pst.setString(3, cli.getCelular());
            pst.setString(4, cli.getDireccion());
            pst.setString(5, cli.getCorreo());
            
            
            mensaje = "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO ELIMINAR \n" + e.getMessage();    
        }
        
        return mensaje;
    }
    
    public void listarCliente(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"DNI","NOMBRE","CELULAR","DIRECCION","CORREO"};               
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM CLIENTES ORDER BY NOMBRE";
        
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
             
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                for (int i = 0; i < 5; i++) {
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
