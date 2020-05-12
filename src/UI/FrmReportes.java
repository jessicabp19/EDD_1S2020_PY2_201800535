package UI;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import Estructuras.*;
import static Objetos.AAVariables.miTablaUsuarios;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class FrmReportes extends javax.swing.JFrame {
    public static FrmReportes INSTANCE = null;
    private String direccionProyecto=System.getProperty("user.dir") + "\\DocsReportes\\";

    public FrmReportes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        lbFotoReporte = new javax.swing.JLabel();
        panelBtnsPrincipal = new javax.swing.JPanel();
        lbEsp1 = new javax.swing.JLabel();
        lbEsp2 = new javax.swing.JLabel();
        lbEsp3 = new javax.swing.JLabel();
        lbEsp4 = new javax.swing.JLabel();
        panelBtnsSecundario = new javax.swing.JPanel();
        btnArbolAVL = new javax.swing.JButton();
        btnPreOrden = new javax.swing.JButton();
        btnInOrden = new javax.swing.JButton();
        btnPostOrden = new javax.swing.JButton();
        btnArbolB = new javax.swing.JButton();
        btnTablaDispersion = new javax.swing.JButton();
        btnListaNodos = new javax.swing.JButton();
        btnBlockChain = new javax.swing.JButton();
        panelInferior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jScrollPanePanelCentral = new javax.swing.JScrollPane();
        panelCentral = new javax.swing.JPanel();
        lbImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new java.awt.BorderLayout());

        panelSuperior.setBackground(new java.awt.Color(0, 204, 204));
        panelSuperior.setLayout(new java.awt.BorderLayout());

        lbFotoReporte.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lbFotoReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.png"))); // NOI18N
        lbFotoReporte.setText("Reportes");
        panelSuperior.add(lbFotoReporte, java.awt.BorderLayout.LINE_START);

        panelBtnsPrincipal.setBackground(new java.awt.Color(0, 204, 204));
        panelBtnsPrincipal.setLayout(new java.awt.BorderLayout());

        lbEsp1.setText("     ");
        panelBtnsPrincipal.add(lbEsp1, java.awt.BorderLayout.PAGE_START);

        lbEsp2.setText("          ");
        panelBtnsPrincipal.add(lbEsp2, java.awt.BorderLayout.LINE_START);

        lbEsp3.setText("     ");
        panelBtnsPrincipal.add(lbEsp3, java.awt.BorderLayout.PAGE_END);

        lbEsp4.setText("          ");
        panelBtnsPrincipal.add(lbEsp4, java.awt.BorderLayout.LINE_END);

        panelBtnsSecundario.setBackground(new java.awt.Color(0, 204, 204));
        panelBtnsSecundario.setLayout(new java.awt.GridLayout(2, 4, 15, 15));

        btnArbolAVL.setBackground(new java.awt.Color(204, 204, 204));
        btnArbolAVL.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnArbolAVL.setText("ÁRBOL AVL");
        btnArbolAVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolAVLActionPerformed(evt);
            }
        });
        panelBtnsSecundario.add(btnArbolAVL);

        btnPreOrden.setBackground(new java.awt.Color(204, 204, 204));
        btnPreOrden.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnPreOrden.setText("PRE ORDEN");
        btnPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrdenActionPerformed(evt);
            }
        });
        panelBtnsSecundario.add(btnPreOrden);

        btnInOrden.setBackground(new java.awt.Color(204, 204, 204));
        btnInOrden.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnInOrden.setText("IN ORDEN");
        btnInOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrdenActionPerformed(evt);
            }
        });
        panelBtnsSecundario.add(btnInOrden);

        btnPostOrden.setBackground(new java.awt.Color(204, 204, 204));
        btnPostOrden.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnPostOrden.setText("POST ORDEN");
        btnPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostOrdenActionPerformed(evt);
            }
        });
        panelBtnsSecundario.add(btnPostOrden);

        btnArbolB.setBackground(new java.awt.Color(204, 204, 204));
        btnArbolB.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnArbolB.setText("ÁRBOL B");
        btnArbolB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolBActionPerformed(evt);
            }
        });
        panelBtnsSecundario.add(btnArbolB);

        btnTablaDispersion.setBackground(new java.awt.Color(204, 204, 204));
        btnTablaDispersion.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnTablaDispersion.setText("TABLA DISPERSIÓN");
        btnTablaDispersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaDispersionActionPerformed(evt);
            }
        });
        panelBtnsSecundario.add(btnTablaDispersion);

        btnListaNodos.setBackground(new java.awt.Color(204, 204, 204));
        btnListaNodos.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnListaNodos.setText("LISTA NODOS");
        btnListaNodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaNodosActionPerformed(evt);
            }
        });
        panelBtnsSecundario.add(btnListaNodos);

        btnBlockChain.setBackground(new java.awt.Color(204, 204, 204));
        btnBlockChain.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnBlockChain.setText("BLOCKCHAIN");
        btnBlockChain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlockChainActionPerformed(evt);
            }
        });
        panelBtnsSecundario.add(btnBlockChain);

        panelBtnsPrincipal.add(panelBtnsSecundario, java.awt.BorderLayout.CENTER);

        panelSuperior.add(panelBtnsPrincipal, java.awt.BorderLayout.CENTER);

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

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setLayout(new java.awt.BorderLayout());
        panelCentral.add(lbImg, java.awt.BorderLayout.CENTER);

        jScrollPanePanelCentral.setViewportView(panelCentral);

        panelPrincipal.add(jScrollPanePanelCentral, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(panelPrincipal);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnArbolAVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolAVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArbolAVLActionPerformed

    private void btnPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPreOrdenActionPerformed

    private void btnInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInOrdenActionPerformed

    private void btnPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPostOrdenActionPerformed

    private void btnArbolBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArbolBActionPerformed

    private void btnTablaDispersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaDispersionActionPerformed
        try {
            espera();
            imagen("TablaDispersion");
            ver("TablaDispersion");
        } catch (IOException e) {
            System.out.println("EXCEPTION");
        }
    }//GEN-LAST:event_btnTablaDispersionActionPerformed

    private void btnListaNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaNodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListaNodosActionPerformed

    private void btnBlockChainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlockChainActionPerformed
        // TODO add your handling code here:gifCargando.gif
    }//GEN-LAST:event_btnBlockChainActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReportes().setVisible(true);
            }
        });
    }

    public static FrmReportes getSingletonInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FrmReportes();
        }
        return INSTANCE;
    }

    public void ver(String nombreImg) throws IOException {
        String urlImagen=direccionProyecto+nombreImg+".png";
        ImageIcon icon = new ImageIcon(ImageIO.read(new File(urlImagen)));
        icon.getImage().flush();
        lbImg.setIcon(icon);
    }
    public void espera() throws IOException {
        String urlImagen=direccionProyecto+"gifCargando.gif";
        ImageIcon icon = new ImageIcon(ImageIO.read(new File(urlImagen)));
        icon.getImage().flush();
        lbImg.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArbolAVL;
    private javax.swing.JButton btnArbolB;
    private javax.swing.JButton btnBlockChain;
    private javax.swing.JButton btnInOrden;
    private javax.swing.JButton btnListaNodos;
    private javax.swing.JButton btnPostOrden;
    private javax.swing.JButton btnPreOrden;
    private javax.swing.JButton btnTablaDispersion;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPanePanelCentral;
    private javax.swing.JLabel lbEsp1;
    private javax.swing.JLabel lbEsp2;
    private javax.swing.JLabel lbEsp3;
    private javax.swing.JLabel lbEsp4;
    private javax.swing.JLabel lbFotoReporte;
    private javax.swing.JLabel lbImg;
    private javax.swing.JPanel panelBtnsPrincipal;
    private javax.swing.JPanel panelBtnsSecundario;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables

    public void imagen(String nombreReporte) {
        try {
            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
            String fileInputPath = direccionProyecto+nombreReporte+".dot";
            String fileOutputPath = direccionProyecto+nombreReporte+".png";
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileInputPath.toString()));
                bw.write("");bw.close();
                PrintWriter writer = new PrintWriter(new FileWriter(fileInputPath.toString(), true));
                
                writer.append("digraph D {\nrankdir=LR\nnode [fontname=\"Arial\"];\n");

                int tamanio = miTablaUsuarios.getM(), group=1;
                for (int i = 0; i < tamanio; i++) {
                    ListaUsuarios listaAux = miTablaUsuarios.getUsuarios(i);int j = 0;
                    if (i == 0) {writer.append("start-> nodo" + i + ";\n");
                    }else {writer.append("nodo" + (i - 1) + "->nodo" + i + ";\n");}
                    writer.append("nodo" + i + "[shape = record, style = rounded, label = \"INDICE " + i + "\", group = "+ group +", fillcolor = lavenderblush];\n");

                    NodoUsuarioLS nodoAux = listaAux.getCabeza();
                    while (nodoAux != null) {
                        if (j == 0) {
                            writer.append("nodo" + i + "-> n" + i+j + ";\n");
                        } else {
                            writer.append("n" + i+(j - 1) + "->n" + i + ";\n");
                        }
                        writer.append("n" + i+j + "[shape = record style = rounded label = \"" + nodoAux.getUsuario().getNombre() + "\", group = "+ group +", fillcolor = lavenderblush];\n");
                        j++;nodoAux = nodoAux.getSiguiente();
                    }
                    group++;
                }
                writer.append("{rank = same; start;");
                for (int i = 0; i < tamanio; i++) {
                    writer.append("nodo"+i+";");
                }
                writer.append("}\n}\n");writer.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }

            String tParam = "-Tjpg";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            Runtime rt = Runtime.getRuntime();
            rt.exec(cmd);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
