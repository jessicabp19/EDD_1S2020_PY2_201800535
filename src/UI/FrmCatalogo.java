package UI;

public class FrmCatalogo extends javax.swing.JFrame {

    public static FrmCatalogo INSTANCE = null;
    
    public FrmCatalogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        lbFotoReporte = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelInferior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        panelIzq = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelIzq1 = new javax.swing.JPanel();
        IzqSup = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        IzqInf = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnArbolB = new javax.swing.JButton();
        IzqCentro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelDer = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelDer1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new java.awt.BorderLayout());

        panelSuperior.setBackground(new java.awt.Color(0, 204, 204));

        lbFotoReporte.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lbFotoReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.png"))); // NOI18N
        lbFotoReporte.setText("CATÁLOGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lbFotoReporte)
                .addGap(132, 132, 132)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3074, Short.MAX_VALUE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbFotoReporte))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        panelIzq.setBackground(new java.awt.Color(255, 255, 255));
        panelIzq.setLayout(new java.awt.BorderLayout());

        panelIzq1.setBackground(new java.awt.Color(255, 255, 255));
        panelIzq1.setLayout(new java.awt.BorderLayout());

        IzqSup.setBackground(new java.awt.Color(255, 255, 255));
        IzqSup.setLayout(new java.awt.BorderLayout());

        jLabel5.setText("jLabel5");
        IzqSup.add(jLabel5, java.awt.BorderLayout.WEST);

        jLabel6.setText("jLabel6");
        IzqSup.add(jLabel6, java.awt.BorderLayout.EAST);

        jLabel7.setText("jLabel7");
        IzqSup.add(jLabel7, java.awt.BorderLayout.SOUTH);

        jLabel8.setText("jLabel8");
        IzqSup.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jLabel13.setText("jLabel13");
        IzqSup.add(jLabel13, java.awt.BorderLayout.CENTER);

        panelIzq1.add(IzqSup, java.awt.BorderLayout.PAGE_START);

        IzqInf.setBackground(new java.awt.Color(255, 255, 255));
        IzqInf.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("jLabel1");
        IzqInf.add(jLabel1, java.awt.BorderLayout.WEST);

        jLabel2.setText("jLabel2");
        IzqInf.add(jLabel2, java.awt.BorderLayout.NORTH);

        jLabel3.setText("jLabel3");
        IzqInf.add(jLabel3, java.awt.BorderLayout.SOUTH);

        jLabel4.setText("jLabel4");
        IzqInf.add(jLabel4, java.awt.BorderLayout.EAST);

        btnArbolB.setBackground(new java.awt.Color(204, 204, 204));
        btnArbolB.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnArbolB.setText("Ver Libros");
        btnArbolB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolBActionPerformed(evt);
            }
        });
        IzqInf.add(btnArbolB, java.awt.BorderLayout.CENTER);

        panelIzq1.add(IzqInf, java.awt.BorderLayout.PAGE_END);

        IzqCentro.setBackground(new java.awt.Color(255, 255, 255));
        IzqCentro.setLayout(new java.awt.BorderLayout());

        jLabel9.setText("jLabel9");
        IzqCentro.add(jLabel9, java.awt.BorderLayout.WEST);

        jLabel10.setText("jLabel10");
        IzqCentro.add(jLabel10, java.awt.BorderLayout.PAGE_START);

        jLabel11.setText("jLabel11");
        IzqCentro.add(jLabel11, java.awt.BorderLayout.PAGE_END);

        jLabel12.setText("jLabel12");
        IzqCentro.add(jLabel12, java.awt.BorderLayout.EAST);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        IzqCentro.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        panelIzq1.add(IzqCentro, java.awt.BorderLayout.CENTER);

        jScrollPane2.setViewportView(panelIzq1);

        panelIzq.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        panelPrincipal.add(panelIzq, java.awt.BorderLayout.LINE_START);

        panelDer.setBackground(new java.awt.Color(204, 255, 204));
        panelDer.setLayout(new java.awt.BorderLayout());

        panelDer1.setBackground(new java.awt.Color(255, 255, 255));
        panelDer1.setLayout(new java.awt.BorderLayout());

        jLabel14.setText("jLabel14");
        panelDer1.add(jLabel14, java.awt.BorderLayout.CENTER);

        jLabel15.setText("jLabel15");
        panelDer1.add(jLabel15, java.awt.BorderLayout.PAGE_START);

        jLabel16.setText("jLabel16");
        panelDer1.add(jLabel16, java.awt.BorderLayout.PAGE_END);

        jLabel17.setText("jLabel17");
        panelDer1.add(jLabel17, java.awt.BorderLayout.LINE_END);

        jTextField1.setText("jTextField1");
        panelDer1.add(jTextField1, java.awt.BorderLayout.CENTER);

        jScrollPane3.setViewportView(panelDer1);

        panelDer.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        panelPrincipal.add(panelDer, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(panelPrincipal);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnArbolBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArbolBActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCatalogo().setVisible(true);
            }
        });
    }
    
    public static FrmCatalogo getSingletonInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FrmCatalogo();
        }
        return INSTANCE;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IzqCentro;
    private javax.swing.JPanel IzqInf;
    private javax.swing.JPanel IzqSup;
    private javax.swing.JButton btnArbolB;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbFotoReporte;
    private javax.swing.JPanel panelDer;
    private javax.swing.JPanel panelDer1;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelIzq;
    private javax.swing.JPanel panelIzq1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
}
