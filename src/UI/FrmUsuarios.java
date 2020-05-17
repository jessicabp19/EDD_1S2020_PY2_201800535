package UI;

import Estructuras.TablaHash;
import Objetos.Usuario;
import static Objetos.AAVariables.*;
import javax.swing.JOptionPane;

public class FrmUsuarios extends javax.swing.JFrame {

    public static FrmUsuarios INSTANCE = null;

    public FrmUsuarios() {
        initComponents();
        infoUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCarrera = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCarnet1 = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtCarrera1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtContrasenia1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("BankGothic Md BT", 3, 28)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png"))); // NOI18N
        jLabel1.setText(" U S U A R I O S");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("(En este apartado puede editar su información, eliminar su cuenta, agregar usuarios manualmente y por carga masiva)");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel3.setText(" Ingrese la informacion que se requiere para agregar un usuario o modificar su propia información ");

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel4.setText("Nombre: ");

        txtCarnet.setEnabled(false);

        txtCarrera.setToolTipText("Ingresar ID");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Carnet:");

        jLabel5.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel5.setText("Apellido:");

        jLabel6.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel6.setText("Carrera:");

        jLabel7.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña:");

        btnModificar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setToolTipText("Recuerda Buscar Primero");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtCarnet)
                                .addComponent(txtCarrera))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVolver.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnCargar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCargar.setText("CARGA MASIVA");
        btnCargar.setEnabled(false);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel9.setText("Nombre: ");

        txtCarrera1.setToolTipText("Ingresar ID");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Carnet:");

        jLabel11.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel11.setText("Apellido:");

        jLabel12.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel12.setText("Carrera:");

        jLabel13.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel13.setText("Contraseña:");

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
                                    .addGap(25, 25, 25))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtCarnet1)
                                    .addComponent(txtCarrera1))))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtContrasenia1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarnet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarrera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasenia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR MI CUENTA");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargar))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /*try {
            if (tablaProductos.getSelectedRow() != -1) {
                int fila = tablaProductos.getSelectedRow();//getModel().getRowCount();
                Object dato = tablaProductos.getValueAt(fila, 0);
                int id = Integer.parseInt(dato.toString());
                miListaProductos.eliminar(id);//PENDIENTE ELIMINAR EN LAS OFERTAS Y EN EL CARRITO DEL CLIENTE
                miListaProductos.mostrarTabla(tablaProductos);
            }
        } catch (Exception ed) {
            JOptionPane.showMessageDialog(null, "Dato no Válido " + ed.getMessage());
        }*/
        int n = JOptionPane.showConfirmDialog(null, "Esta acción eliminará su cuenta ¿Desea Continuar?", "ATENCIÓN", 0);
        if (n == JOptionPane.YES_OPTION) {
            miTablaUsuarios.eliminar(miUsuarioLogueado.getCarnet());
            this.dispose();
            Principal miPantalla = Principal.getSingletonInstance();
            miPantalla.setTitle("MENÚ");
            miPantalla.setResizable(false);
            miPantalla.setLocationRelativeTo(null);
            miPantalla.setVisible(true);
            miPantalla.dispose();
            JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtBoxAddVacias()) {
        } else {
            try {
                long carnet = Long.parseLong(txtCarnet1.getText());
                if (carnet < 0) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un número positivo en 'Carnet'", "ATENCIÓN", 1);
                } else if (miTablaUsuarios.carnetRegistrado(carnet)) {
                    JOptionPane.showMessageDialog(null, "Ese número de carnet ya esta registrado", "ATENCIÓN", 1);
                } else {
                    Usuario user = new Usuario(carnet, txtNombre1.getText(), txtApellido1.getText(), txtCarrera1.getText(), txtContrasenia1.getText());
                    //Usuario user = new Usuario(carnet, txtNombre.getText(),txtApellido.getText(),txtCarrera.getText(), txtContrasenia.getText());
                    miTablaUsuarios.insertar(user);
                    JOptionPane.showMessageDialog(null, "Registro Exitoso!", "Completado", 1);
                    //miListaProductos.mostrarTabla(tablaProductos);
                    limpiar();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un número en 'Carnet'");
            } catch (Exception ed) {
                JOptionPane.showMessageDialog(null, " - ERROR, intenta mas tarde - ", "ERROR", 1);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        /*JFileChooser buscador = new JFileChooser();
        buscador.showOpenDialog(buscador);
        try {
            String patch = buscador.getSelectedFile().getAbsolutePath();
            FileInputStream archivo = new FileInputStream(patch);
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            if (patch.endsWith(".proadd")) {
                int var = 0;
                String lineas;
                while ((lineas = buffer.readLine()) != null) {
                    String cadena2[] = lineas.split(",");
                    try {
                        if (miListaProductos.yaExiste(cadena2[0], cadena2[1], Double.parseDouble(cadena2[2]),
                            Integer.parseInt(cadena2[3]), cadena2[4])) {
                        var = var + 1;
                    } else {
                        miListaProductos.addProducto(cadena2[0], cadena2[1], Double.parseDouble(cadena2[2]),
                            Integer.parseInt(cadena2[3]), cadena2[4]);
                    }
                } catch (Exception e) {
                    var = var + 1;
                }
            }
            entrada.close();
            if (var > 0) {
                JOptionPane.showMessageDialog(null, "Algun producto no se cargo correctamente o ya existia en el sistema", "ATENCIÓN", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El archivo no tiene la extencion adecuada (.proadd)", "ATENCIÓN", 1);
        }
        } catch (Exception ed) {
            System.out.println(ed);
            JOptionPane.showMessageDialog(null, "ERROR, intenta nuevamente", "ERROR", 1);
        }
        miListaProductos.mostrarTabla(tablaProductos);*/
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        /*if (miListaProductos.estaVacia()) {
            JOptionPane.showMessageDialog(null, " - Lista Vacia - ");
        } else if (txtNumPrincipal.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un Identificador");
        } else if (!miListaProductos.existe(Integer.parseInt(txtNumPrincipal.getText()))) {
            JOptionPane.showMessageDialog(null, " - No existe un producto con ese ID - ");
        } else if (txtBoxEditVacias()) {
        } else if (Double.parseDouble(txtPrecio.getText()) <= 0 && Integer.parseInt(txtExistencia.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar números positivos en 'Precio' y 'Existencias' ");
        } else {
            try {
                miListaProductos.modificar(Integer.parseInt(txtNumPrincipal.getText()), txtNombre.getText(), txtDescripcion.getText(),
                    Double.parseDouble(txtPrecio.getText()), Integer.parseInt(txtExistencia.getText()), txtDireccion.getText());
                limpiar();
                miListaProductos.mostrarTabla(tablaProductos);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR, Datos no validos: " + e.getMessage());
            }
        }*/
        if (txtBoxEditVacias()) {
        } else {
            try {
                /*long carnet = Long.parseLong(txtCarnet1.getText());
                if (carnet < 0) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un número positivo en 'Carnet'", "ATENCIÓN", 1);
                } else if (miTablaUsuarios.carnetRegistrado(carnet)) {
                    JOptionPane.showMessageDialog(null, "Ese número de carnet ya esta registrado", "ATENCIÓN", 1);
                } else {*/
                //Usuario user = new Usuario(carnet, txtNombre1.getText(),txtApellido1.getText(),txtCarrera1.getText(), txtContrasenia1.getText());
                //Usuario user = new Usuario(carnet, txtNombre.getText(),txtApellido.getText(),txtCarrera.getText(), txtContrasenia.getText());
                //miTablaUsuarios.insertar(user);
                miUsuarioLogueado.setNombre(txtNombre.getText());
                miUsuarioLogueado.setApellido(txtApellido.getText());
                miUsuarioLogueado.setCarrera(txtCarrera.getText());
                miUsuarioLogueado.setPassword(txtContrasenia.getText());
                JOptionPane.showMessageDialog(null, "Modificación Exitosa!", "Completado", 1);
                //miListaProductos.mostrarTabla(tablaProductos);
                //}
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un número en 'Carnet'");
            } catch (Exception ed) {
                JOptionPane.showMessageDialog(null, " - ERROR, intenta mas tarde - ", "ERROR", 1);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuarios().setVisible(true);
            }
        });
    }

    public static FrmUsuarios getSingletonInstance() {

        if (INSTANCE == null) {
            INSTANCE = new FrmUsuarios();
        }

        return INSTANCE;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtCarnet1;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtCarrera1;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtContrasenia1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables

    public boolean txtBoxEditVacias() {
        if (txtCarnet.getText().equals("") || txtNombre.getText().equals("") || txtApellido.getText().equals("")
                || txtCarrera.getText().equals("") || txtContrasenia.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Completar la Información Correpondiente", "ATENCIÓN", 1);
            return true;
        }
        return false;
    }

    public boolean txtBoxAddVacias() {
        if (txtCarnet1.getText().equals("") || txtNombre1.getText().equals("") || txtApellido1.getText().equals("")
                || txtCarrera1.getText().equals("") || txtContrasenia1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Completar la Información Correpondiente", "ATENCIÓN", 1);
            return true;
        }
        return false;
    }

    public void limpiar() {
        txtCarnet1.setText("");
        txtNombre1.setText("");
        txtApellido1.setText("");
        txtCarrera1.setText("");
        txtContrasenia1.setText("");
    }

    public void infoUsuario() {
        txtCarnet.setText("" + miUsuarioLogueado.getCarnet());
        txtNombre.setText(miUsuarioLogueado.getNombre());
        txtApellido.setText(miUsuarioLogueado.getApellido());
        txtCarrera.setText(miUsuarioLogueado.getCarrera());
        txtContrasenia.setText(miUsuarioLogueado.getPassword());
    }
}
