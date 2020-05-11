package UI;
public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconoClientes.png"))); // NOI18N
        btnUsuarios.setToolTipText("USUARIOS");
        btnUsuarios.setBorder(null);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconoReporte.png"))); // NOI18N
        btnReportes.setToolTipText("REPORTES");
        btnReportes.setBorder(null);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconoRepues.png"))); // NOI18N
        btnConfiguracion.setToolTipText("CONFIGURACION");
        btnConfiguracion.setBorder(null);
        btnConfiguracion.setContentAreaFilled(false);
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });

        btnLibros.setToolTipText("LIBROS");
        btnLibros.setBorder(null);
        btnLibros.setContentAreaFilled(false);
        btnLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });

        btnCatalogo.setToolTipText("CATALOGO");
        btnCatalogo.setBorder(null);
        btnCatalogo.setContentAreaFilled(false);
        btnCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCerrarSesion)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        FrmUsuarios miPantalla = FrmUsuarios.getSingletonInstance();
        miPantalla.setTitle("USUARIOS");
        miPantalla.setResizable(false);
        miPantalla.setLocationRelativeTo(null);
        miPantalla.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        FrmReportes miPantalla = FrmReportes.getSingletonInstance();
        miPantalla.setTitle("REPORTES");
        miPantalla.setResizable(false);
        miPantalla.setLocationRelativeTo(null);
        miPantalla.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        FrmConfiguraciones miPantalla = FrmConfiguraciones.getSingletonInstance();
        miPantalla.setTitle("CONFIGURACIONES");
        miPantalla.setResizable(false);
        miPantalla.setLocationRelativeTo(null);
        miPantalla.setVisible(true);
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        /*Principal miPantalla = Principal.getSingletonInstance();
        miPantalla.setTitle("REPORTES");
        miPantalla.setResizable(false);
        miPantalla.setLocationRelativeTo(null);
        miPantalla.setVisible(true);*/
        /*Añadir masivamente, individualmete, eliminar y buscar*/
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        /*FrmOfertas miPantalla = FrmOfertas.getSingletonInstance();
        miPantalla.setTitle("OFERTAS");
        miPantalla.setResizable(false);
        miPantalla.setLocationRelativeTo(null);
        miPantalla.setVisible(true);*/
        /*Crear categoria, eliminar categoria y ver libros por categoria*/
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed
    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
