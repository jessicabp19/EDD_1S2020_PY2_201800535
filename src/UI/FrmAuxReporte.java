package UI;
public class FrmAuxReporte extends javax.swing.JFrame {
    public FrmAuxReporte() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        panelInferior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        panelIzq = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelDer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new java.awt.BorderLayout());

        panelSuperior.setBackground(new java.awt.Color(0, 204, 204));
        panelPrincipal.add(panelSuperior, java.awt.BorderLayout.PAGE_START);

        panelInferior.setBackground(new java.awt.Color(255, 51, 51));

        btnVolver.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelInferior.add(btnVolver);

        panelPrincipal.add(panelInferior, java.awt.BorderLayout.PAGE_END);

        panelIzq.add(jScrollPane3);

        panelPrincipal.add(panelIzq, java.awt.BorderLayout.CENTER);

        panelDer.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.add(panelDer, java.awt.BorderLayout.LINE_END);

        jScrollPane1.setViewportView(panelPrincipal);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAuxReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAuxReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAuxReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAuxReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAuxReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelDer;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelIzq;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
    /*
     * El backPanel va a estar sobre la parte central del form que tiene un border layout primero*/

}
