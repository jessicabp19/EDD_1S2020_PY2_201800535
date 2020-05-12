/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author JESSICA
 */
public class FrmReporte extends javax.swing.JFrame {

    /**
     * Creates new form FrmReporte
     */
    public FrmReporte() {
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

        backPanel = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        lbEspacioPB4 = new javax.swing.JLabel();
        lbEspacioPB3 = new javax.swing.JLabel();
        lbEspacioPB2 = new javax.swing.JLabel();
        lbEspacioPB1 = new javax.swing.JLabel();
        panelBotonesGrid = new javax.swing.JPanel();
        btnArbolAVL = new javax.swing.JButton();
        btnArbolB = new javax.swing.JButton();
        btnArbolB1 = new javax.swing.JButton();
        btnArbolB2 = new javax.swing.JButton();
        btnArbolB3 = new javax.swing.JButton();
        btnArbolB4 = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        lbFotoReporte = new javax.swing.JLabel();
        panelInferior = new javax.swing.JPanel();
        btnRegresarAOfertas = new javax.swing.JButton();
        panelCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backPanel.setLayout(new java.awt.BorderLayout());

        panelSuperior.setBackground(new java.awt.Color(0, 102, 102));
        panelSuperior.setLayout(new java.awt.BorderLayout());

        panelBotones.setBackground(new java.awt.Color(0, 102, 102));
        panelBotones.setPreferredSize(new java.awt.Dimension(200, 100));
        panelBotones.setLayout(new java.awt.BorderLayout());

        lbEspacioPB4.setText("     ");
        panelBotones.add(lbEspacioPB4, java.awt.BorderLayout.LINE_END);

        lbEspacioPB3.setText("     ");
        panelBotones.add(lbEspacioPB3, java.awt.BorderLayout.LINE_START);

        lbEspacioPB2.setText("   ");
        panelBotones.add(lbEspacioPB2, java.awt.BorderLayout.PAGE_START);

        lbEspacioPB1.setText("   ");
        panelBotones.add(lbEspacioPB1, java.awt.BorderLayout.PAGE_END);

        panelBotonesGrid.setBackground(new java.awt.Color(0, 102, 102));
        panelBotonesGrid.setLayout(new java.awt.GridLayout(2, 4, 10, 10));

        btnArbolAVL.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnArbolAVL.setText("ÁRBOL AVL");
        btnArbolAVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolAVLActionPerformed(evt);
            }
        });
        panelBotonesGrid.add(btnArbolAVL);

        btnArbolB.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnArbolB.setText("ÁRBOL B");
        btnArbolB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolBActionPerformed(evt);
            }
        });
        panelBotonesGrid.add(btnArbolB);

        btnArbolB1.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnArbolB1.setText("ÁRBOL B");
        btnArbolB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolB1ActionPerformed(evt);
            }
        });
        panelBotonesGrid.add(btnArbolB1);

        btnArbolB2.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnArbolB2.setText("ÁRBOL B");
        btnArbolB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolB2ActionPerformed(evt);
            }
        });
        panelBotonesGrid.add(btnArbolB2);

        btnArbolB3.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnArbolB3.setText("ÁRBOL B");
        btnArbolB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolB3ActionPerformed(evt);
            }
        });
        panelBotonesGrid.add(btnArbolB3);

        btnArbolB4.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnArbolB4.setText("ÁRBOL B");
        btnArbolB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolB4ActionPerformed(evt);
            }
        });
        panelBotonesGrid.add(btnArbolB4);

        panelBotones.add(panelBotonesGrid, java.awt.BorderLayout.CENTER);

        panelSuperior.add(panelBotones, java.awt.BorderLayout.EAST);

        lbTitulo.setBackground(new java.awt.Color(0, 102, 102));
        lbTitulo.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("   REPORTES");
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelSuperior.add(lbTitulo, java.awt.BorderLayout.CENTER);

        lbFotoReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.png"))); // NOI18N
        panelSuperior.add(lbFotoReporte, java.awt.BorderLayout.LINE_START);

        backPanel.add(panelSuperior, java.awt.BorderLayout.PAGE_START);

        panelInferior.setBackground(new java.awt.Color(0, 153, 102));

        btnRegresarAOfertas.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnRegresarAOfertas.setText("VOLVER");
        btnRegresarAOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarAOfertasActionPerformed(evt);
            }
        });
        panelInferior.add(btnRegresarAOfertas);

        backPanel.add(panelInferior, java.awt.BorderLayout.PAGE_END);

        panelCentral.setBackground(new java.awt.Color(255, 255, 204));
        backPanel.add(panelCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(backPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarAOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarAOfertasActionPerformed
        this.dispose();
        //        AMenuOfertas miPantalla = new AMenuOfertas();
        //        miPantalla.setTitle("OFERTAS");
        //        miPantalla.setLocationRelativeTo(null);
        //        miPantalla.setVisible(true);
    }//GEN-LAST:event_btnRegresarAOfertasActionPerformed

    private void btnArbolAVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolAVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArbolAVLActionPerformed

    private void btnArbolBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArbolBActionPerformed

    private void btnArbolB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArbolB1ActionPerformed

    private void btnArbolB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArbolB2ActionPerformed

    private void btnArbolB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArbolB3ActionPerformed

    private void btnArbolB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArbolB4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnArbolAVL;
    private javax.swing.JButton btnArbolB;
    private javax.swing.JButton btnArbolB1;
    private javax.swing.JButton btnArbolB2;
    private javax.swing.JButton btnArbolB3;
    private javax.swing.JButton btnArbolB4;
    private javax.swing.JButton btnRegresarAOfertas;
    private javax.swing.JLabel lbEspacioPB1;
    private javax.swing.JLabel lbEspacioPB2;
    private javax.swing.JLabel lbEspacioPB3;
    private javax.swing.JLabel lbEspacioPB4;
    private javax.swing.JLabel lbFotoReporte;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBotonesGrid;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
    /*
     * El backPanel va a estar sobre la parte central del form que tiene un border layout primero*/

}
