package UI;

import Estructuras.ArbolB;
import Estructuras.NodoArbolAVL;
import Estructuras.NodoArbolB;
import javax.swing.*;
import static Objetos.AAVariables.*;
import Objetos.Categoria;
import Objetos.Libro;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FrmMisLibros extends javax.swing.JFrame {

    public static FrmMisLibros INSTANCE = null;
    public NodoArbolB nodo;
    private ArbolB arbolTemp;
    public boolean existe, existe1=false, existe2=false;
    public int isbnBuscado;
    
    
    public FrmMisLibros() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMisLibros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEdicion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtIdioma = new javax.swing.JTextField();
        txtISBNBusqueda = new javax.swing.JTextField();
        btnBuscarN = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNBusqueda = new javax.swing.JTextField();
        btnBuscarISBN = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        tablaMisLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Titulo", "Autor", "Edición", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaMisLibros);

        jLabel1.setFont(new java.awt.Font("BankGothic Md BT", 3, 28)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        jLabel1.setText("  M I S    L I B R O S");

        jLabel2.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese el ISBN\n\n");
        jLabel2.setToolTipText("");

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel3.setText("Si desea eliminar un libro, seleccione uno de la tabla y de click al botón \"ELIMINAR\"\n");

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel4.setText("ISBN:");

        jLabel5.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel5.setText("Autor:");

        jLabel6.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel6.setText("Editorial:");

        jLabel7.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel7.setText("Año:");

        jLabel8.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel8.setText("Título:");

        jLabel10.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel10.setText("Edición:");

        jLabel11.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel11.setText("Categoría:");

        jLabel12.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel12.setText("Idioma:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtAutor)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        txtISBNBusqueda.setToolTipText("ISBN");

        btnBuscarN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnBuscarN.setText("BUSCAR POR NOMBRE");
        btnBuscarN.setToolTipText("");
        btnBuscarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("BankGothic Lt BT", 0, 14)); // NOI18N
        jLabel9.setText("Ingrese el Nombre");
        jLabel9.setToolTipText("");

        txtNBusqueda.setToolTipText("ISBN");

        btnBuscarISBN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnBuscarISBN.setText("BUSCAR POR ISBN");
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

        btnCargar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCargar.setText("CARGAR");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtISBNBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarN, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNBusqueda)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(605, 605, 605)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(275, 275, 275))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtISBNBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarN)
                    .addComponent(btnBuscarISBN))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if (tablaMisLibros.getSelectedRow() != -1) {
                int fila = tablaMisLibros.getSelectedRow();//getModel().getRowCount();
                Object dato = tablaMisLibros.getValueAt(fila, 0);
                Integer id = Integer.parseInt(dato.toString());
                existe2(miArbolAVLCategorias.obtenerRaiz(), id);
                arbolTemp.eliminar(id);
                JOptionPane.showMessageDialog(null, "ELIMINADO EXITOSAMENTE", "FIN DEL PROCESO", 1);
                limpiarTabla();
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un libro de la tabla", "ATENCIÓN", 1);
            }
        } catch (Exception ed) {
            JOptionPane.showMessageDialog(null, "Dato no Válido " + ed.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNActionPerformed
        if(txtNBusqueda.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa el titulo a buscar", "ATENCIÓN", 1);
        }else{
            //existe1=false;
            try{
                //isbnBuscado=Integer.parseInt(txtISBNBusqueda.getText());
                //existe1(miArbolAVLCategorias.obtenerRaiz());
                //if(existe1){//existe(miArbolAVLCategorias.obtenerRaiz())
//                    for (int i = 0; i < nodo.cantLibros; i++) {
//                        if ((nodo.getKey(i) != null) && (nodo.getKey(i).getISBN().compareTo(isbnBuscado) == 0)) {
//                            if(nodo.getKey(i).getCarneUsuario()==miUsuarioLogueado.getCarnet()){
//                                mostrarEnTabla(tablaMisLibros, nodo.getKey(i));
//                            }else{
//                                JOptionPane.showMessageDialog(null, "No te pertenece ningún libro con ese "
//                                        + "número de ISBN", "ATENCIÓN", 1);
//                                limpiarTabla();
//                            }
//                        }
//                    }
//                }else{
//                    JOptionPane.showMessageDialog(null, "Libro Inexistente", "ATENCIÓN", 1);
//                    limpiarTabla();
//                }

            busquedaTitulo(miArbolAVLCategorias.obtenerRaiz(), txtNBusqueda.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingresa un número en el ISBN a buscar", "ATENCIÓN", 1);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "ATENCIÓN", 1);
            }
        }
    }//GEN-LAST:event_btnBuscarNActionPerformed

    private void btnBuscarISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarISBNActionPerformed
        if(txtISBNBusqueda.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa el ISBN a buscar", "ATENCIÓN", 1);
        }else{
            existe1=false;
            try{
                isbnBuscado=Integer.parseInt(txtISBNBusqueda.getText());
                existe1(miArbolAVLCategorias.obtenerRaiz());
                if(existe1){//existe(miArbolAVLCategorias.obtenerRaiz())
                    for (int i = 0; i < nodo.cantLibros; i++) {
                        if ((nodo.getKey(i) != null) && (nodo.getKey(i).getISBN().compareTo(isbnBuscado) == 0)) {
                            if(nodo.getKey(i).getCarneUsuario()==miUsuarioLogueado.getCarnet()){
                                mostrarEnTabla(tablaMisLibros, nodo.getKey(i));
                            }else{
                                JOptionPane.showMessageDialog(null, "No te pertenece ningún libro con ese "
                                        + "número de ISBN", "ATENCIÓN", 1);
                                limpiarTabla();
                            }
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Libro Inexistente", "ATENCIÓN", 1);
                    limpiarTabla();
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingresa un número en el ISBN a buscar", "ATENCIÓN", 1);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "ATENCIÓN", 1);
            }
        }
    }//GEN-LAST:event_btnBuscarISBNActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        JFileChooser ventana = new JFileChooser();
        ventana.showOpenDialog(ventana);

        try {
            String path = ventana.getSelectedFile().getAbsolutePath();
            if (path.endsWith(".json")) {
                JSONParser parser = new JSONParser();
                try {
                    //Object obj = parser.parse(new FileReader(path));
                    Object obj = parser.parse(new InputStreamReader(
                        new FileInputStream(path), StandardCharsets.UTF_8));
                    JSONObject jsonObj = (JSONObject) obj;

                    JSONArray libros = (JSONArray) jsonObj.get("libros");
                    Iterator<JSONObject> iterador = libros.iterator();
                    while (iterador.hasNext()) {
                        existe2=false;
                        JSONObject libro = (JSONObject) iterador.next();
                        long isbn = (long) libro.get("ISBN");
                        System.out.println(isbn);
                        long anio = (long) libro.get("Año");
                        String idioma = (String) libro.get("Idioma");
                        String titulo = (String) libro.get("Titulo");
                        String editorial = (String) libro.get("Editorial");
                        String autor = (String) libro.get("Autor");
                        long edicion = (long) libro.get("Edicion");
                        String categoria = (String) libro.get("Categoria");
                        System.out.println(categoria);
                        int a = (int)isbn;int b = (int)anio;int c = (int)edicion;
                        
                        Libro nuevo = new Libro((Integer)a, b, idioma, titulo, 
                        editorial, autor,c, categoria, miUsuarioLogueado.getCarnet());
                        
                        existe2(miArbolAVLCategorias.obtenerRaiz(), a);//VALIDACION ISBN REPETIDO
                        if(!existe2){
                            NodoArbolAVL nodo = miArbolAVLCategorias.buscar1(categoria, miArbolAVLCategorias.obtenerRaiz());
                            if (nodo != null) {
                                nodo.getCategoria().getArbolb().add(nuevo);
                                System.out.println(isbn + "/ CAT EXIST / " + anio + idioma + titulo
                                        + editorial + autor + edicion + categoria + miUsuarioLogueado.getCarnet());
                            } else {
                                ArbolB bt = new ArbolB(5);
                                bt.add(nuevo);
                                Categoria cat = new Categoria(categoria, bt, miUsuarioLogueado.getCarnet());
                                miArbolAVLCategorias.insertar(cat);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "NO se agregó un LIBRO REPETIDO", "ATENCIÓN", 0);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "CARGA REALIZADA EXITOSAMENTE!", "FIN DEL PROCESO", 1);
                    
                } catch (Exception er) {
                    JOptionPane.showMessageDialog(null, "Error, revisa tu documento. Especificacion: " + er.getMessage());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, algo ha fallado");
        }
        //miListaProductos.mostrarTabla(tablaProductos);*/
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (cajasTextoVacias()) {
        } else {
            try {
                Integer a = Integer.parseInt(txtISBN.getText());
                int b = Integer.parseInt(txtAnio.getText());
                int c = Integer.parseInt(txtEdicion.getText());
                Libro nuevo = new Libro( a, b, txtIdioma.getText(), txtTitulo.getText(),
                txtEditorial.getText(), txtAutor.getText(), c, txtCategoria.getText(), miUsuarioLogueado.getCarnet());
                existe2=false;
                existe2(miArbolAVLCategorias.obtenerRaiz(), a);//VALIDACION ISBN REPETIDO
                if(!existe2){
                    NodoArbolAVL nodo = miArbolAVLCategorias.buscar1(txtCategoria.getText(), miArbolAVLCategorias.obtenerRaiz());
                    if (nodo != null) {
                        nodo.getCategoria().getArbolb().add(nuevo);
                    } else {
                        ArbolB bt = new ArbolB(5);
                        bt.add(nuevo);
                        Categoria cat = new Categoria(txtCategoria.getText(), bt, miUsuarioLogueado.getCarnet());
                        miArbolAVLCategorias.insertar(cat);
                    }
                    JOptionPane.showMessageDialog(null, "CREACION REALIZADA EXITOSAMENTE!", "FIN DEL PROCESO", 1);
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null, "Ya existe un libro con el mismo ISBN", "ATENCIÓN", 0);
                }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar números en 'ISBN' , 'Año' y 'Edición'");
        } catch (Exception ed) {
            JOptionPane.showMessageDialog(null, " - ERROR, intenta mas tarde - ", "ERROR", 1);
        }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMisLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMisLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMisLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMisLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMisLibros().setVisible(true);
            }
        });
    }
    
    public static FrmMisLibros getSingletonInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FrmMisLibros();
        }
        return INSTANCE;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarISBN;
    private javax.swing.JButton btnBuscarN;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
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
    private javax.swing.JTable tablaMisLibros;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtISBNBusqueda;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtNBusqueda;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    public boolean cajasTextoVacias(){
        if (txtISBN.getText().equals("") || txtTitulo.getText().equals("") || txtAnio.getText().equals("")
                || txtAutor.getText().equals("") || txtCategoria.getText().equals("") 
                || txtEdicion.getText().equals("") || txtEditorial.getText().equals("") || txtIdioma.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Completar la Información Correpondiente", "ATENCIÓN", 1);
            return true;
        }
        return false;
    }
    
    public void limpiar(){
        txtISBN.setText("");
        txtTitulo.setText("");
        txtAnio.setText("");
        txtAutor.setText("");
        txtCategoria.setText("");
        txtEdicion.setText("");
        txtEditorial.setText("");
        txtIdioma.setText("");
    }
    
    public void limpiarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) tablaMisLibros.getModel();
        int cuantos = tablaMisLibros.getRowCount();
        for (int i = 0; i < cuantos; i++) {
            modelo.removeRow(0);
        }
        tablaMisLibros.setModel(modelo);
        txtISBNBusqueda.setText("");
        txtNBusqueda.setText("");
    }
    
    
    public void existe1(NodoArbolAVL r){
        if(r!=null){
            
            existe=r.getCategoria().getArbolb().contains(isbnBuscado);
            if(existe==true){
                nodo=r.getCategoria().getArbolb().getNodo(isbnBuscado);
                arbolTemp=r.getCategoria().getArbolb();
                existe1=true;
            }
            existe1(r.getHijoIzquierdo());
            existe1(r.getHijoDerecho());
        }
    }
    
    public void existe2(NodoArbolAVL r, Integer isbn){
        if(r!=null){
            
            existe=r.getCategoria().getArbolb().contains(isbn);
            if(existe==true){
                nodo=r.getCategoria().getArbolb().getNodo(isbn);
                arbolTemp=r.getCategoria().getArbolb();
                existe2=true;
            }
            existe2(r.getHijoIzquierdo(), isbn);
            existe2(r.getHijoDerecho(), isbn);
        }
    }
    
    public void busquedaTitulo(NodoArbolAVL r, String cadena){
        if(r!=null){
            
            //existe=r.getCategoria().getArbolb().contains(isbn);
//            if(existe==true){
//                nodo=r.getCategoria().getArbolb().getNodo(isbn);
//                arbolTemp=r.getCategoria().getArbolb();
//                existe2=true;
//            }
            tablaMisLibros.setModel(
                    r.getCategoria().getArbolb().obtenerLibros(tablaMisLibros, 
                    cadena, miUsuarioLogueado.getCarnet()));
            busquedaTitulo(r.getHijoIzquierdo(), cadena);
            busquedaTitulo(r.getHijoDerecho(), cadena);
        }
    }
    
    public void mostrarEnTabla(JTable tabla, Libro aux){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int cuantos = tabla.getRowCount();
        for (int i = 0; i < cuantos; i++) {
            modelo.removeRow(0);
        }
        tabla.setModel(modelo);
        Object[] datos = new Object[5];
        datos[0] = "" + aux.getISBN();
        datos[1] = aux.getTitulo();
        datos[2] = aux.getAutor();
        datos[3] = "" + aux.getEdicion();
        datos[4] = aux.getCategoria();
        modelo.addRow(datos);
        tabla.setModel(modelo);
    }
    
}
