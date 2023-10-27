package ulpprestaurante49.vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import restaurante.Entidades.Producto;
import restaurante.Entidades.ProductoXPedido;
import restaurante.accesoData.ProductoData;
import restaurante.accesoData.ProductoXPedidoData;

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

        jbAñadir.setText("AÑADIR");
        jbAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAñadirActionPerformed(evt);
            }
        });

        jlNumPedido.setForeground(new java.awt.Color(255, 255, 255));
        jlNumPedido.setText("Num de Pedido:");

        jtEliminar.setText("ELIMINAR");
        jtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jbAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(jtEliminar))))
                                .addContainerGap(85, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlIdpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlNumPedido)
                                        .addContainerGap())))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlNumPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIdpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jbAñadir)
                        .addGap(18, 18, 18)
                        .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor selecciona un producto que desea Agregar al pedido");
        }
    }//GEN-LAST:event_jbAñadirActionPerformed

    private void jtablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaProductosMouseClicked
        int filaproduc = jtablaProductos.getSelectedRow();
        int idproducto = (Integer) jtablaProductos.getValueAt(filaproduc, 0);
        int cantidad = prodData.buscarProductoId(idproducto).getStock();
        SpinnerModel model = new SpinnerNumberModel(0, 0, cantidad, 1);
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
            prodXPedidoData.eliminarProductoxPedido(product);
            borradofilasProdXPedidos();
            borradofilasProductos();
            llenartablaPrducto();
            llenarSegundaTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Profavor seleccioname un producto agregado al pedido");
        }

    }//GEN-LAST:event_jtEliminarActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
                System.out.println("aca yo");
                int idpedido = Integer.parseInt(jlIdpedido.getText());
                System.out.println(idpedido);

                for (ProductoXPedido MostrarProducto : prodXPedidoData.MostrarProductos(idpedido)) {
                    modelo2.addRow(new Object[]{
                        MostrarProducto.getProducto().getNombre(),
                        MostrarProducto.getCantidad()
                    });
                }
                crono.cancel();
            }
        }, tiempo);
    }

    public class Fondopantalla extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/imagenes/pedidosProd.jpeg/")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
