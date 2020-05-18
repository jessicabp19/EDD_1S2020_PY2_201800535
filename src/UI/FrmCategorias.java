package UI;

import Estructuras.ArbolB;
import Estructuras.NodoArbolAVL;
import Estructuras.NodoArbolB;
import static Objetos.AAVariables.*;
import Objetos.Categoria;
import Objetos.Libro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JESSICA
 */
public class FrmCategorias extends javax.swing.JFrame {

    public static FrmCategorias INSTANCE = null;
    ArrayList<String> listaCat;
    ArbolB temp;
    
    public FrmCategorias() {
        initComponents();
        verCategorias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMisLibros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCrearArbolB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEdicion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtIdioma = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTitulo = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAutor = new javax.swing.JTextArea();
        txtCategoriaB = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNBusqueda = new javax.swing.JTextField();
        btnBuscarISBN = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnDetalles = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        tablaMisLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ISBN", "Titulo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaMisLibros);

        jLabel1.setFont(new java.awt.Font("BankGothic Md BT", 3, 28)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        jLabel1.setText(" C A T Á L O G O");

        jLabel2.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese una Categoria");
        jLabel2.setToolTipText("");

        btnCrearArbolB.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCrearArbolB.setText("CREAR REPORTE");
        btnCrearArbolB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArbolBActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel3.setText("INFORMACIÓN DEL LIBRO SELECCIONADO");

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel4.setText("ISBN:");

        txtISBN.setEditable(false);
        txtISBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtISBN.setBorder(null);
        txtISBN.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel5.setText("Autor:");

        jLabel6.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel6.setText("Editorial:");

        txtEditorial.setEditable(false);
        txtEditorial.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel7.setText("Año:");

        txtAnio.setEditable(false);
        txtAnio.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel8.setText("Título:");

        jLabel10.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel10.setText("Edición:");

        jLabel11.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel11.setText("Categoría:");

        jLabel12.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel12.setText("Idioma:");

        txtEdicion.setEditable(false);
        txtEdicion.setOpaque(false);

        txtCategoria.setEditable(false);
        txtCategoria.setOpaque(false);

        txtIdioma.setEditable(false);
        txtIdioma.setOpaque(false);

        txtTitulo.setEditable(false);
        txtTitulo.setBackground(new java.awt.Color(255, 255, 153));
        txtTitulo.setColumns(20);
        txtTitulo.setRows(5);
        jScrollPane1.setViewportView(txtTitulo);

        txtAutor.setEditable(false);
        txtAutor.setBackground(new java.awt.Color(255, 255, 153));
        txtAutor.setColumns(20);
        txtAutor.setRows(5);
        jScrollPane3.setViewportView(txtAutor);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(txtEditorial)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtISBN)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAnio, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txtEdicion))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtCategoria)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel5))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        txtCategoriaB.setToolTipText("ISBN");

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR CATEGORIA");
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel9.setText("Ingrese el Nombre de la Categoria a Crear");
        jLabel9.setToolTipText("");

        txtNBusqueda.setToolTipText("ISBN");

        btnBuscarISBN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnBuscarISBN.setText("VER LIBROS");
        btnBuscarISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarISBNActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnDetalles.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDetalles.setText("VER DETALLES");
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtCategoriaB)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscarISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCrearArbolB))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnDetalles)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCategoriaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarISBN)
                    .addComponent(btnEliminar)
                    .addComponent(btnCrearArbolB))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addGap(7, 7, 7)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearArbolBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArbolBActionPerformed
        if(txtCategoriaB.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa el nombre de la categoria para generar su reporte", "ATENCIÓN", 1);
        }else{
            try{
                NodoArbolAVL nodo = miArbolAVLCategorias.buscar1(
                        txtCategoriaB.getText(), miArbolAVLCategorias.obtenerRaiz());
                if (nodo != null) {
                    miArbolBActual=nodo.getCategoria().getArbolb();
                    nodo.getCategoria().getArbolb().mostrarTabla(tablaMisLibros);
                } else {
                    JOptionPane.showMessageDialog(null, "Categoria inexistente!", "ATENCIÓN", 1);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "ATENCIÓN", 1);
            }
        }
    }//GEN-LAST:event_btnCrearArbolBActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /*try {
            if (tablaProductos.getSelectedRow() != -1) {
                int fila = tablaProductos.getSelectedRow();
                Object dato = tablaProductos.getValueAt(fila, 0);
                int id = Integer.parseInt(dato.toString());
                String[] cadena = miListaProductos.buscar(id);
                txtNombre.setText(cadena[0]);
                txtDescripcion.setText(cadena[1]);
                txtPrecio.setText(cadena[2]);
                txtExistencia.setText(cadena[3]);
                txtDireccion.setText(cadena[4]);
                lblImagen.setSize(100, 100);
                lblImagen.setIcon(colocarImagen(cadena[4], lblImagen));
                //lblImagen.setIcon(new ImageIcon(cadena[4]));
            } else {
                JOptionPane.showMessageDialog(null, " - Debes seleccionar un producto en la tabla - ");
            }
        } catch (Exception ed) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ed.getMessage());

        }*/
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarISBNActionPerformed
        if(txtCategoriaB.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa el nombre de la categoria para visualizar sus libros", "ATENCIÓN", 1);
        }else{
            try{
                NodoArbolAVL nodo = miArbolAVLCategorias.buscar1(
                        txtCategoriaB.getText(), miArbolAVLCategorias.obtenerRaiz());
                if (nodo != null) {
                    temp=nodo.getCategoria().getArbolb();
                    nodo.getCategoria().getArbolb().mostrarTabla(tablaMisLibros);
                } else {
                    JOptionPane.showMessageDialog(null, "Categoria inexistente!", "ATENCIÓN", 1);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "ATENCIÓN", 1);
            }
        }
    }//GEN-LAST:event_btnBuscarISBNActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNBusqueda.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Ingrese un nombre ", "ATENCIÓN", 1);
        } else {
            try {
                ArbolB nuevoArbolB = new ArbolB(5);
                Categoria nuevaCategoria = new Categoria(txtNBusqueda.getText(), nuevoArbolB, miUsuarioLogueado.getCarnet());
                
                if(!miArbolAVLCategorias.insertar(nuevaCategoria)){
                JOptionPane.showMessageDialog(null, " CREACIÓN EXITOSA ", "FIN DEL PROCESO", 1);
                }
                verCategorias();
            } catch (Exception ed) {
            JOptionPane.showMessageDialog(null, " - ERROR, intenta mas tarde - ", "ERROR", 1);
        }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        try {
            if (tablaMisLibros.getSelectedRow() != -1) {
                int fila = tablaMisLibros.getSelectedRow();
                System.out.println("INT FILA " + fila);
                Object dato = tablaMisLibros.getValueAt(fila, 0);
                Integer id = Integer.parseInt(dato.toString());
                NodoArbolB nodo = temp.getNodo(id);
                for(int i=0; i<nodo.cantLibros;i++){
                    if((nodo.getKey(i)!=null) && (nodo.getKey(i).getISBN().compareTo(id)==0)){
                        mostrarDetalles(nodo.getKey(i));
                    }
                }    
            } else {
                JOptionPane.showMessageDialog(null, " - Debes seleccionar un producto de la tabla - ");
            }
        } catch (Exception ed) {
            JOptionPane.showMessageDialog(null, " Error, revisa tu selección ");

        }
    }//GEN-LAST:event_btnDetallesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCategorias().setVisible(true);
            }
        });
        
    }
    
    public static FrmCategorias getSingletonInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FrmCategorias();
        }
        return INSTANCE;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarISBN;
    private javax.swing.JButton btnCrearArbolB;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaMisLibros;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextArea txtAutor;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCategoriaB;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtNBusqueda;
    private javax.swing.JTextArea txtTitulo;
    // End of variables declaration//GEN-END:variables

    public void verCategorias(){
        listaCat = new ArrayList<>();
        inOrden(miArbolAVLCategorias.obtenerRaiz());
        for(String cat: listaCat){
            jComboBox1.addItem(cat);
        }
    }
    
    public void inOrden(NodoArbolAVL r){
        if(r!=null){
            listaCat.add(r.getCategoria().getNomCategoria());
            inOrden(r.getHijoIzquierdo());
            inOrden(r.getHijoDerecho());
        }
    }

    public void mostrarDetalles(Libro libro){
        txtISBN.setText(libro.getISBN()+"");
        txtAnio.setText(libro.getAnio()+"");
        txtEdicion.setText(libro.getEdicion()+"");
        txtAutor.setText(libro.getAutor());
        txtEditorial.setText(libro.getEditorial());
        txtCategoria.setText(libro.getCategoria());
        txtIdioma.setText(libro.getIdioma());
        txtTitulo.setText(libro.getTitulo());
    }
}
