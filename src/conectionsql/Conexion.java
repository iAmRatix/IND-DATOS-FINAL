/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectionsql;
import Clases.Menu;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author Ratix
 */
public class Conexion {
    Connection enlazar = null;
    private static final String USERNAME="system";
    private static final String PASSWORD="123456";
    private static final String CONN_STRING="jdbc:oracle:thin:@localhost:1521:XE";
    
    public Connection conectar(){
        try {
            enlazar = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            
        }catch(SQLException e){
            System.err.println(e);
        }
        return enlazar;
        
    }
    
    
    
    
    public static Connection getConnection(){
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected");
        }catch(SQLException e){
            System.err.println(e);
        }
        return conn;
        
    }
    public static ResultSet Consulta(String consulta){
        Connection con = getConnection();
        Statement declara;
        try {
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
        return null;
    }
    
    public ResultSet SeleccionarUsuario(String nombre){
        Connection cn = getConnection();
        PreparedStatement pst;
        ResultSet rs = null;
        try {
            pst = cn.prepareCall("SELECT * FROM PEDIDOS WHERE DNI_CLIENTE=?");
            pst.setString(1, nombre);
            rs = pst.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }
    public ResultSet SeleccionarDatos(String nombre){
        Connection cn = getConnection();
        PreparedStatement pst;
        ResultSet rs = null;
        try {
            pst = cn.prepareCall("SELECT * FROM CLIENTES WHERE DNI=?");
            pst.setString(1, nombre);
            rs = pst.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }
  
    
    
    
    
    
    
    
    
    
}
