/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;



/**
 *
 * @author Ratix
 */
public class Menu extends javax.swing.JFrame {
    
    
    

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        birthdayEvaluator1 = new com.toedter.calendar.demo.BirthdayEvaluator();
        jLabel1 = new javax.swing.JLabel();
        regisclim = new javax.swing.JButton();
        listapedm = new javax.swing.JButton();
        regispedm = new javax.swing.JButton();
        listaclim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iGlam S.A.C");
        setBounds(new java.awt.Rectangle(600, 200, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(701, 648));

        jLabel1.setFont(new java.awt.Font("Goudy Stout", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("iGLAM");

        regisclim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        regisclim.setText("REGISTRAR CLIENTE");
        regisclim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisclimActionPerformed(evt);
            }
        });

        listapedm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        listapedm.setText("LISTA PEDIDOS");
        listapedm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listapedmActionPerformed(evt);
            }
        });

        regispedm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        regispedm.setText("REGISTRAR PEDIDO");
        regispedm.setMinimumSize(new java.awt.Dimension(157, 23));
        regispedm.setPreferredSize(new java.awt.Dimension(157, 23));
        regispedm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regispedmActionPerformed(evt);
            }
        });

        listaclim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        listaclim.setText("LISTA CLIENTES");
        listaclim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaclimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(regispedm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regisclim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaclim, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listapedm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaclim, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regisclim, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listapedm, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regispedm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regisclimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisclimActionPerformed
        RegistroCliente rc = new RegistroCliente();
        rc.setVisible(true);
        this.dispose();
            
        
    }//GEN-LAST:event_regisclimActionPerformed

    private void regispedmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regispedmActionPerformed
        
        
        RegistrarPedido rp = new RegistrarPedido();
        rp.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_regispedmActionPerformed

    private void listaclimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaclimActionPerformed
        ListaClientes lc = new ListaClientes();
        lc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listaclimActionPerformed

    private void listapedmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listapedmActionPerformed
        ListaPedidos lp = new ListaPedidos();
        
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listapedmActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.demo.BirthdayEvaluator birthdayEvaluator1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listaclim;
    private javax.swing.JButton listapedm;
    private javax.swing.JButton regisclim;
    private javax.swing.JButton regispedm;
    // End of variables declaration//GEN-END:variables
}
