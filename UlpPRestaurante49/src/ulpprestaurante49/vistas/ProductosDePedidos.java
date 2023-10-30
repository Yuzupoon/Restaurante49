package ulpprestaurante49.vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import restaurante.Entidades.Mesero;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.Producto;
import restaurante.Entidades.ProductoXPedido;
import restaurante.Entidades.Reserva;
import restaurante.accesoData.MesaData;
import restaurante.accesoData.MeseroData;
import restaurante.accesoData.PedidoData;
import restaurante.accesoData.ProductoData;
import restaurante.accesoData.ProductoXPedidoData;
import restaurante.accesoData.ReservaData;

public class ProductosDePedidos extends javax.swing.JFrame {

    ProductoData prodData = new ProductoData();
    ProductoXPedidoData prodXPedidoData = new ProductoXPedidoData();
    Producto producto = new Producto();

    Fondopantalla frame = new Fondopantalla();

    public ProductosDePedidos() {
        this.setContentPane(frame);
        initComponents();
        crearCabeceraProducto();
        crearCabeceraProductoXPedido();
        llenartablaPrducto();
        llenarSegundaTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaProductos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablaPedido = new javax.swing.JTable();
        jbAñadir = new javax.swing.JButton();
        jsCantidad = new javax.swing.JSpinner();
        jlNumPedido = new javax.swing.JLabel();
        jlIdpedido = new javax.swing.JLabel();
        jtEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        jtablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtablaProductos.setOpaque(false);
        jtablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablaProductos);

        jtablaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtablaPedido.setOpaque(false);
        jScrollPane2.setViewportView(jtablaPedido);

        jbAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton añadir.png"))); // NOI18N
        jbAñadir.setBorderPainted(false);
        jbAñadir.setContentAreaFilled(false);
        jbAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAñadirActionPerformed(evt);
            }
        });

        jsCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));

        jlNumPedido.setForeground(new java.awt.Color(255, 255, 255));
        jlNumPedido.setText("Num de Pedido:");

        jlIdpedido.setBackground(new java.awt.Color(255, 255, 255));
        jlIdpedido.setForeground(new java.awt.Color(255, 255, 255));

        jtEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Eliminar.png"))); // NOI18N
        jtEliminar.setBorderPainted(false);
        jtEliminar.setContentAreaFilled(false);
        jtEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCTOS CARGADOS");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUCTOS");

        jbAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Atras Mediano.png"))); // NOI18N
        jbAtras.setBorderPainted(false);
        jbAtras.setContentAreaFilled(false);
        jbAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jlNumPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIdpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbAtras)
                            .addComponent(jtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNumPedido)
                    .addComponent(jlIdpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbAñadir)
                                .addGap(18, 18, 18)
                                .addComponent(jtEliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAtras)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAñadirActionPerformed
        int filaproduc = jtablaProductos.getSelectedRow();
        if (filaproduc != -1) {
            int idproducto = (Integer) jtablaProductos.getValueAt(filaproduc, 0);
            int idpedido = Integer.parseInt(jlIdpedido.getText());
            Producto prod = prodData.buscarProductoId(idproducto);
            String produ = prodData.buscarProductoId(idproducto).getNombre();
            int cant = (Integer) jsCantidad.getValue();
            prodXPedidoData.crearPedidoDeProducto(idpedido, produ, cant);
            borradofilasProdXPedidos();
            llenarSegundaTabla();
            int cantidadrequerida = (Integer) jsCantidad.getValue();
            prodData.buscarProductoId(idproducto).restarStock(cantidadrequerida);
            borradofilasProductos();
            llenartablaPrducto();
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor selecciona un producto que desea Agregar al pedido");
        }
    }//GEN-LAST:event_jbAñadirActionPerformed

    private void jtablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaProductosMouseClicked
        int filaproduc = jtablaProductos.getSelectedRow();
        int idproducto = (Integer) jtablaProductos.getValueAt(filaproduc, 0);
        int cantidad = prodData.buscarProductoId(idproducto).getStock();
        SpinnerModel model = new SpinnerNumberModel(1, 1, cantidad, 1);
        jsCantidad.setModel(model);


    }//GEN-LAST:event_jtablaProductosMouseClicked

    private void jtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEliminarActionPerformed
        int fila = jtablaPedido.getSelectedRow();
        if (fila != -1) {
            int idpedido = Integer.parseInt(jlIdpedido.getText());
            String product = jtablaPedido.getValueAt(fila, 0) + "";
            int cantidad = (Integer) jtablaPedido.getValueAt(fila, 1);
            for (ProductoXPedido MostrarProducto : prodXPedidoData.MostrarProductos(idpedido)) {
                System.out.println(MostrarProducto.getProducto().getNombre());
                if (MostrarProducto.getProducto().getNombre().equals(product)) {
                    System.out.println(cantidad);
                    prodData.buscarProductoPorNombre(product).cargarStock(cantidad);
                }
            }
            prodXPedidoData.eliminarProductoxPedido2(product, idpedido);
            borradofilasProdXPedidos();
            borradofilasProductos();
            llenartablaPrducto();
            llenarSegundaTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Profavor seleccioname un producto agregado al pedido");
        }
    }//GEN-LAST:event_jtEliminarActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        PedidoPorMesa pantalla = new PedidoPorMesa();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
        PedidoData pedidoData = new PedidoData();
        MeseroData meseroData = new MeseroData();
        ReservaData reservaData = new ReservaData();
        int contador = 0;
        Pedido pedido = pedidoData.buscarPedidoID(Integer.parseInt(jlIdpedido.getText()));
        PedidoPorMesa.jtMesa.setText(pedido.getMesa().getIdMesa() + "");
        for (Mesero mesero : meseroData.listaMesero()) {
            contador++;
            if (mesero.getIdMesero() == pedido.getMesero().getIdMesero()) {
                PedidoPorMesa.jcMesero.setSelectedIndex(contador);
            }
        }

        if (pedido.getEstado().equals("Pendiente")) {
            PedidoPorMesa.jcEstado.setSelectedIndex(1);
        } else {
            PedidoPorMesa.jcEstado.setSelectedIndex(2);
        }

        int contador1 = 0;
        for (Reserva reserva : reservaData.listaReservasXFecha(LocalDate.now())) {
            if (reserva.isEstado() == true) {
                contador1++;
            }

            if (reserva.getIdReserva() == pedido.getMesa().getReserva().getIdReserva()) {
                PedidoPorMesa.JcReserva.setSelectedIndex(contador1);
            }
        }
        int fila = jtablaPedido.getRowCount() - 1;
        double total = 0;
        for (int i = fila; i >= 0; i--) {

            total = Double.parseDouble(jtablaPedido.getValueAt(i, 2) + "") + total;

        }
        if (pedido.getTotal() != total) {
            pedido.setTotal(total);
            pedidoData.modificarPedido(pedido);
        }

        PedidoPorMesa.jbGenerarPedido.setVisible(false);
    }//GEN-LAST:event_jbAtrasActionPerformed

    public DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public DefaultTableModel modelo2 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbAñadir;
    public static javax.swing.JLabel jlIdpedido;
    private javax.swing.JLabel jlNumPedido;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JButton jtEliminar;
    private javax.swing.JTable jtablaPedido;
    private javax.swing.JTable jtablaProductos;
    // End of variables declaration//GEN-END:variables

    public void crearCabeceraProducto() {

        modelo.addColumn("IdProducto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        jtablaProductos.setModel(modelo);

    }

    public void crearCabeceraProductoXPedido() {

        modelo2.addColumn("Producto");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Subtotal");
        jtablaPedido.setModel(modelo2);

    }

    public void llenartablaPrducto() {

        for (restaurante.Entidades.Producto listaProducto : prodData.listaProductos()) {
            if (listaProducto.getStock() != 0) {
                modelo.addRow(new Object[]{
                    listaProducto.getIdProducto(),
                    listaProducto.getNombre(),
                    listaProducto.getPrecio()
                });
            }
        }
    }

    public void borradofilasProductos() {

        int fila = jtablaProductos.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {

            modelo.removeRow(i);

        }
    }

    public void borradofilasProdXPedidos() {

        int fila = jtablaPedido.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {

            modelo2.removeRow(i);

        }
    }

    public void llenarSegundaTabla() {
        Timer crono = new Timer();
        int tiempo = 300;
        crono.schedule(new TimerTask() {
            @Override
            public void run() {

                int idpedido = Integer.parseInt(jlIdpedido.getText());
                int repetido = 0;
                int cantidad = 0;
                for (ProductoXPedido MostrarProducto : prodXPedidoData.MostrarProductos(idpedido)) {
                    for (ProductoXPedido MostrarProducto1 : prodXPedidoData.MostrarProductos(idpedido)) {
                        if (MostrarProducto.getProducto().getNombre().equals(MostrarProducto1.getProducto().getNombre())) {
                            repetido++;
                            cantidad += MostrarProducto1.getCantidad();
                            if (repetido == 2) {
                                String nombre = MostrarProducto1.getProducto().getNombre();
                                prodXPedidoData.eliminarProductoxPedido2(nombre, idpedido);
                                prodXPedidoData.crearPedidoDeProducto(idpedido, nombre, cantidad);

                            }
                        }
                    }
                    repetido = 0;
                    cantidad = 0;
                }
                for (ProductoXPedido MostrarProducto : prodXPedidoData.MostrarProductos(idpedido)) {
                    modelo2.addRow(new Object[]{
                        MostrarProducto.getProducto().getNombre(),
                        MostrarProducto.getCantidad(),
                        prodData.buscarProductoPorNombre(MostrarProducto.getProducto().getNombre()).getPrecio() * MostrarProducto.getCantidad()
                    });
                }
//

                crono.cancel();
            }
        }, tiempo);
    }

    public class Fondopantalla extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/imagenes/productos.jpeg/")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
