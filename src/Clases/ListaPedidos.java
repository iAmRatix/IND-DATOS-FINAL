/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;
import CRUD.PedidoBO;
import CRUD.PedidoCRUD;
import javax.swing.JOptionPane;

import conectionsql.Conexion;

import java.sql.Connection;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ratix
 */
public class ListaPedidos extends javax.swing.JFrame {
    
    
    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
    
    DefaultTableModel modelo = new DefaultTableModel();
    private Pedido ped = new Pedido();
    private RegistrarPedido rp = new RegistrarPedido();
    private PedidoBO pbo = new PedidoBO();
    
    public ListaPedidos() {
        initComponents();
        
        cargarlista();
        
        
        
    }
    
    
    
    public void cargarlista(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("DNI_CLIENTE");
        modelo.addColumn("ESTADO");
        modelo.addColumn("FVISITA");
        modelo.addColumn("FENTREGA");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("ALTO");
        modelo.addColumn("LARGO");
        modelo.addColumn("ANCHO");
        tablapedidos.setModel(modelo);
        
        String []datos = new String[11];
                
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM PEDIDOS ORDER BY ESTADO");
            while (resultado.next()) {          
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getInt(7)+"";
                datos[7] = resultado.getInt(8)+"";
                datos[8] = resultado.getString(9);
                datos[9] = resultado.getString(10);
                datos[10] = resultado.getString(11);
                modelo.addRow(datos);        
                
            }
            tablapedidos.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "nel");
        }
    }
    
    //public void listarPedido(){
     // pbo.listarPedido(tablapedidos);
    //}
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapedidos = new javax.swing.JTable();
        registrarped = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        modificarpedido = new javax.swing.JButton();
        eliminarpedido = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dniabuscar = new javax.swing.JTextField();
        buscarped = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iGlam S.A.C");
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));
        setMinimumSize(new java.awt.Dimension(701, 648));
        setResizable(false);
        setSize(new java.awt.Dimension(701, 648));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA PEDIDOS");

        tablapedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablapedidos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tablapedidos.setAutoscrolls(false);
        tablapedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablapedidos.setMaximumSize(new java.awt.Dimension(200, 16));
        tablapedidos.setMinimumSize(new java.awt.Dimension(40, 40));
        tablapedidos.setName(""); // NOI18N
        tablapedidos.getTableHeader().setReorderingAllowed(false);
        tablapedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablapedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablapedidos);

        registrarped.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        registrarped.setText("NUEVO PEDIDO");
        registrarped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarpedActionPerformed(evt);
            }
        });

        menu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        menu.setText("MENU");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        modificarpedido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        modificarpedido.setText("MODIFICAR");
        modificarpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarpedidoActionPerformed(evt);
            }
        });

        eliminarpedido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        eliminarpedido.setText("ELIMINAR");
        eliminarpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarpedidoActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI  :");

        dniabuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniabuscarActionPerformed(evt);
            }
        });

        buscarped.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscarped.setText("BUSCAR");
        buscarped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarpedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(registrarped)
                .addGap(100, 100, 100)
                .addComponent(modificarpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(eliminarpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dniabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarped, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dniabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarped))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarped, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarpedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarpedActionPerformed
        RegistrarPedido rp = new RegistrarPedido();
        rp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrarpedActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
        this.dispose();        
        
        
        
        
    }//GEN-LAST:event_menuActionPerformed

    private void modificarpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarpedidoActionPerformed
        rp.cargarDatos(ped);
        String mensaje = "";
        mensaje = pbo.eliminarPedido(ped);
        rp.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_modificarpedidoActionPerformed

    private void tablapedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapedidosMouseClicked
        int seleccion = tablapedidos.rowAtPoint(evt.getPoint());
        
        
        ped.setDnicli(tablapedidos.getValueAt(seleccion, 0)+"");
        ped.setEstado(tablapedidos.getValueAt(seleccion, 1)+"");
        
        ped.setFvisita(tablapedidos.getValueAt(seleccion, 2)+"");
        ped.setFentrega(tablapedidos.getValueAt(seleccion, 3)+"");
        ped.setDireccion(tablapedidos.getValueAt(seleccion, 4)+"");
        ped.setDescri(tablapedidos.getValueAt(seleccion, 5)+"");
        int a = 0;
        a = Integer.parseInt(tablapedidos.getValueAt(seleccion, 6)+"");
        ped.setPrecio(a);
        int b = 0;
        b = Integer.parseInt(tablapedidos.getValueAt(seleccion, 7)+"");
        ped.setCantidad(b);
        
        ped.setAlto(tablapedidos.getValueAt(seleccion, 8)+"");
        ped.setLargo(tablapedidos.getValueAt(seleccion, 9)+"");
        ped.setAncho(tablapedidos.getValueAt(seleccion, 10)+"");
        
         
        
        
    }//GEN-LAST:event_tablapedidosMouseClicked

    private void eliminarpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarpedidoActionPerformed
        String mensaje = "";
        mensaje = pbo.eliminarPedido(ped);
         
        ListaPedidos lp = new ListaPedidos();
        
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eliminarpedidoActionPerformed

    private void dniabuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniabuscarActionPerformed
        
    }//GEN-LAST:event_dniabuscarActionPerformed

    private void buscarpedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarpedActionPerformed
        if (dniabuscar.getText().isEmpty()==false) {
            String nombre = this.dniabuscar.getText().toString();
        Conexion cn = new Conexion();
        ResultSet rs = cn.SeleccionarUsuario(nombre);
        DefaultTableModel peds = new DefaultTableModel();
        this.tablapedidos.setModel(peds);
        peds.setColumnIdentifiers(new Object[]{"DNI_CLIENTE","ESTADO","FVISITA","FENTREGA","DIRECCION","DESCRIPCION","PRECIO","CANTIDAD","ALTO","LARGO","ANCHO"});
        try {
            while (rs.next()) {                
                peds.addRow(new Object[]{rs.getString("DNI_CLIENTE"),rs.getString("ESTADO"),rs.getString("FVISITA"),rs.getString("FENTREGA"),rs.getString("DIRECCION"),rs.getString("DESCRIPCION"),rs.getInt("PRECIO"),rs.getInt("CANTIDAD"),rs.getString("ALTO"),rs.getString("LARGO"),rs.getString("ANCHO")});
            }
        } catch (Exception e) {
        }
            
        } else {
            ListaPedidos lp = new ListaPedidos();
            lp.setVisible(true);
            this.dispose();
        }
        
       
        
    }//GEN-LAST:event_buscarpedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPedidos().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarped;
    private javax.swing.JTextField dniabuscar;
    private javax.swing.JButton eliminarpedido;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu;
    private javax.swing.JButton modificarpedido;
    private javax.swing.JButton registrarped;
    private javax.swing.JTable tablapedidos;
    // End of variables declaration//GEN-END:variables
}
