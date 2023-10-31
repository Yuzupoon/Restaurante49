package ulpprestaurante49.vistas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import restaurante.Entidades.Mesero;
import restaurante.Entidades.Producto;
import restaurante.accesoData.ProductoData;
import static ulpprestaurante49.vistas.AdmMesero.soloLetras;

public class AdmProducto extends javax.swing.JFrame {

    Fondopantalla frame = new Fondopantalla();
    ProductoData productoData = new ProductoData();

    public AdmProducto() {
        this.setLocationRelativeTo(null);
        this.setContentPane(frame);
        initComponents();
        armarCabecera();
        llenartabla();
        Font font2 = new Font("Segoe UI", Font.PLAIN, 12);
        jbCerrarSesion.setFont(font2);
    }
       public class Fondopantalla extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/imagenes/_VINO2.png/")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaProducto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();
        jbModificar = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jcEstado = new javax.swing.JComboBox<>();
        jbCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);

        jtTablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtTablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTablaProducto);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("SISTEMA ADMINISTRADOR DE PRODUCTOS");

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });

        jtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtStockKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        jLabel4.setText("Stock");

        jLabel5.setText("Estado");

        jLabel6.setText("Buscar:");

        jtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jtBuscarMouseEntered(evt);
            }
        });
        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtBuscarKeyTyped(evt);
            }
        });

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Modificar.png"))); // NOI18N
        jbModificar.setBorderPainted(false);
        jbModificar.setContentAreaFilled(false);
        jbModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbModificarMouseExited(evt);
            }
        });
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Crear.png"))); // NOI18N
        jbAgregar.setBorderPainted(false);
        jbAgregar.setContentAreaFilled(false);
        jbAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbAgregarMouseExited(evt);
            }
        });
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Eliminar.png"))); // NOI18N
        jbEliminar.setBorderPainted(false);
        jbEliminar.setContentAreaFilled(false);
        jbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbEliminarMouseExited(evt);
            }
        });
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Atras.png"))); // NOI18N
        jbAtras.setBorderPainted(false);
        jbAtras.setContentAreaFilled(false);
        jbAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbAtrasMouseExited(evt);
            }
        });
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });

        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton limpiar.png"))); // NOI18N
        jbLimpiar.setBorderPainted(false);
        jbLimpiar.setContentAreaFilled(false);
        jbLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbLimpiarMouseExited(evt);
            }
        });
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Disponible", "Sin Stock" }));

        jbCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jbCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        jbCerrarSesion.setText("CERRAR SESION");
        jbCerrarSesion.setBorder(null);
        jbCerrarSesion.setContentAreaFilled(false);
        jbCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCerrarSesionMouseExited(evt);
            }
        });
        jbCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtStock)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcEstado, 0, 128, Short.MAX_VALUE))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(jbAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCerrarSesion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jbCerrarSesion)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jbAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int error = 0;
        try {
            int fila = jtTablaProducto.getSelectedRow();
            if (fila != -1) {
                if (jtNombre.getText().isEmpty()
                        || jtPrecio.getText().isEmpty()
                        || jtStock.getText().isEmpty()
                        || jcEstado.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Por favor rellene las casillas vacias");
                } else {

                    Producto producto = new Producto();
                    int dato = (int) modelo.getValueAt(fila, 0);
                    producto = productoData.buscarProductoId(dato);
                    if (!jtNombre.getText().equals(producto.getNombre())) {
                        producto.setNombre(jtNombre.getText());
                    }
                    producto.setPrecio(Double.parseDouble(jtPrecio.getText()));
                    error = 1;
                    producto.setStock(Integer.parseInt(jtStock.getText()));
                    if (jcEstado.getSelectedIndex() == 1) {
                        producto.setEstado(true);
                    } else {
                        producto.setEstado(false);
                    }
                    productoData.modificarProducto(producto);
                    borradofilas();
                    llenartabla();
                    limpiarCasillas();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor seleccione un Producto de la tabla");
            }
        } catch (NumberFormatException e) {
            if (error == 0) {
                JOptionPane.showMessageDialog(null, "Precio solo admiten numeros y para indicar las decimas usar el Punto ' . ' ");
                jtPrecio.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Stock solo admiten numeros");
                jtStock.setText("");
            }

        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtTablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaProductoMouseClicked
        int fila = jtTablaProducto.getSelectedRow();
        Producto producto = new Producto();
        int dato = (int) modelo.getValueAt(fila, 0);
        producto = productoData.buscarProductoId(dato);
        if (fila != -1) {
            jtNombre.setText(producto.getNombre());
            jtPrecio.setText(producto.getPrecio() + "");
            jtStock.setText(producto.getStock() + "");
            if (producto.isEstado() == true) {
                jcEstado.setSelectedIndex(1);
            } else {
                jcEstado.setSelectedIndex(2);
            }
        }
    }//GEN-LAST:event_jtTablaProductoMouseClicked

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCasillas();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyReleased
        String escritura = jtBuscar.getText().toLowerCase();
        if (!escritura.equalsIgnoreCase("")) {
            borradofilas();
            for (Producto listaProducto : productoData.listaProductos()) {
                if (listaProducto.getNombre().toLowerCase().startsWith(escritura) == true) {

                    modelo.addRow(new Object[]{
                        listaProducto.getIdProducto(),
                        listaProducto.getNombre(),
                        listaProducto.getPrecio(),
                        listaProducto.getStock(),
                        listaProducto.isEstado()
                    });
                }
            }
        } else {
            borradofilas();
            llenartabla();
        }
    }//GEN-LAST:event_jtBuscarKeyReleased

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        Producto producto = new Producto();
        if (jtNombre.getText().isEmpty()
                || jtPrecio.getText().isEmpty()
                || jtStock.getText().isEmpty()
                || jcEstado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor rellene las casillas vacias");
        } else {

            producto.setNombre(jtNombre.getText());
            producto.setPrecio(Double.parseDouble(jtPrecio.getText()));
            producto.setStock(Integer.parseInt(jtStock.getText()));
            if (jcEstado.getSelectedIndex() == 1) {
                producto.setEstado(true);
            } else {
                producto.setEstado(false);
            }

            productoData.crearProducto(producto);
            limpiarCasillas();
            borradofilas();
            llenartabla();

        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int fila = jtTablaProducto.getSelectedRow();
        if (fila != -1) {
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Estas seguro que desea eliminar el producto?"
                    + "", "Eliminar Prodcuto", JOptionPane.YES_NO_OPTION);
            if (seleccion == 0) {

                int dato = (int) modelo.getValueAt(fila, 0);
                productoData.eliminarProducto(dato);
                borradofilas();
                llenartabla();
                limpiarCasillas();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un Producto de la tabla");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        AdmPrincipal pantalla = new AdmPrincipal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void jbCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSesionActionPerformed
        Login pantalla = new Login();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbCerrarSesionActionPerformed

    private void jbCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarSesionMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbCerrarSesion.setForeground(Color.red);
        Font font1 = new Font("Segoe UI", Font.BOLD, 12);
        jbCerrarSesion.setFont(font1);
        jbCerrarSesion.setToolTipText("Regresas al Login");
    }//GEN-LAST:event_jbCerrarSesionMouseEntered

    private void jbCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarSesionMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jbCerrarSesion.setForeground(Color.BLACK);
        Font font2 = new Font("Segoe UI", Font.PLAIN, 12);
        jbCerrarSesion.setFont(font2);
    }//GEN-LAST:event_jbCerrarSesionMouseExited

    private void jbAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseEntered
        jbAgregar.setToolTipText("Permite agregar Productos");
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jbAgregarMouseEntered

    private void jbAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jbAgregarMouseExited

    private void jbModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbModificarMouseEntered
       jbModificar.setToolTipText("Permite modificar un Producto");
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jbModificarMouseEntered

    private void jbModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbModificarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jbModificarMouseExited

    private void jbEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEliminarMouseEntered
        jbEliminar.setToolTipText("Permite eliminar un Producto");
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jbEliminarMouseEntered

    private void jbEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEliminarMouseExited
       setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jbEliminarMouseExited

    private void jbLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimpiarMouseEntered
       jbLimpiar.setToolTipText("Borra los textos de las casillas");
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jbLimpiarMouseEntered

    private void jbLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimpiarMouseExited
         setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jbLimpiarMouseExited

    private void jbAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAtrasMouseEntered
      jbAtras.setToolTipText("Te dirijes a las pantalla anterior");
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jbAtrasMouseEntered

    private void jbAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAtrasMouseExited
       setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jbAtrasMouseExited

    private void jtBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBuscarMouseEntered
        jtBuscar.setToolTipText("Busca el producto por su nombre");
    }//GEN-LAST:event_jtBuscarMouseEntered

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char nombre = evt.getKeyChar();
        if (Character.isLetter(nombre) || Character.isWhitespace(nombre) || Character.isISOControl(nombre)) {
            jtNombre.setEditable(true);
        } else {
            jtNombre.setEditable(false);
            JOptionPane.showMessageDialog(this, "Ingresa solo letras");
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtStockKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c)) {
            jtStock.setEditable(true);

        } else {
            jtStock.setEditable(false);
            JOptionPane.showMessageDialog(null, "Ingrese solamente numeros");
            return;

        }
    }//GEN-LAST:event_jtStockKeyTyped

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c) || evt.getKeyChar() == '.') {
            jtPrecio.setEditable(true);

        } else {
            jtPrecio.setEditable(false);
            JOptionPane.showMessageDialog(null, "Ingrese solamente numeros");
            return;

        }
    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyTyped
        char nombre = evt.getKeyChar();
        if (Character.isLetter(nombre) || Character.isWhitespace(nombre) || Character.isISOControl(nombre)) {
            jtBuscar.setEditable(true);
        } else {
            jtBuscar.setEditable(false);
            JOptionPane.showMessageDialog(this, "Ingresa solo letras");
        }
    }//GEN-LAST:event_jtBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbCerrarSesion;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    private javax.swing.JTable jtTablaProducto;
    // End of variables declaration//GEN-END:variables
        public DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public void armarCabecera() {
        modelo.addColumn("IdProducto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Estado");
        jtTablaProducto.setModel(modelo);
    }

    public void llenartabla() {

        for (Producto producto : productoData.listaProductos()) {
            modelo.addRow(new Object[]{
                producto.getIdProducto(),
                producto.getNombre(),
                producto.getPrecio(),
                producto.getStock(),
                producto.isEstado()
            });
        }
    }

    public void borradofilas() {

        int fila = jtTablaProducto.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {

            modelo.removeRow(i);

        }
    }

    public void limpiarCasillas() {
        jtNombre.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        jcEstado.setSelectedIndex(0);
    }

    public static boolean soloLetras(String cadena) {

        Pattern pattern = Pattern.compile("[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]+");
        Matcher matcher = pattern.matcher(cadena);

        return !matcher.find();
    }

}
