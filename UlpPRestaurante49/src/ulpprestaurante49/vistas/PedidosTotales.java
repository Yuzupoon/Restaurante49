package ulpprestaurante49.vistas;

import javax.swing.table.DefaultTableModel;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.ProductoXPedido;
import restaurante.accesoData.PedidoData;
import restaurante.accesoData.ProductoXPedidoData;

public class PedidosTotales extends javax.swing.JFrame {

    PedidoData pedidodata = new PedidoData();
    ProductoXPedidoData proxPed = new ProductoXPedidoData();

    public PedidosTotales() {
        initComponents();
        crearCabecera();
        crearCabecera2();
        llenartablaPedido2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedido = new javax.swing.JTable();
        jbPago = new javax.swing.JButton();
        jbActivo = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaDeProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPedido);

        jbPago.setText("Pago");
        jbPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPagoActionPerformed(evt);
            }
        });

        jbActivo.setText("Activos");
        jbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivoActionPerformed(evt);
            }
        });

        jbAtras.setText("Atras");
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });

        jtTablaDeProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtTablaDeProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbActivo)
                    .addComponent(jbPago)
                    .addComponent(jbAtras))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jbPago)
                        .addGap(18, 18, 18)
                        .addComponent(jbActivo)
                        .addGap(18, 18, 18)
                        .addComponent(jbAtras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPagoActionPerformed
        borradofilas();
        borradofilas2();
        llenartablaPedido();
    }//GEN-LAST:event_jbPagoActionPerformed

    private void jbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivoActionPerformed
        borradofilas();
        borradofilas2();
        llenartablaPedido2();
    }//GEN-LAST:event_jbActivoActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        AdmPrincipal principal = new AdmPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void jtPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPedidoMouseClicked
        llenartablaProductos();
    }//GEN-LAST:event_jtPedidoMouseClicked

    public DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    
    public DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public void crearCabecera() {
        modelo.addColumn("IdPedido");
        modelo.addColumn("Mesa");
        modelo.addColumn("Mesero");
        modelo.addColumn("Estado");
        modelo.addColumn("Total pagado");
        jtPedido.setModel(modelo);
    }

    public void crearCabecera2() {
        modelo2.addColumn("Productos");
        modelo2.addColumn("Cantidad");
        jtTablaDeProductos.setModel(modelo2);
    }

    public void llenartablaPedido() {
        for (Pedido listadePedido : pedidodata.listadePedidos()) {
            if (listadePedido.getEstado().equals("Pagado")) {
                modelo.addRow(new Object[]{
                    listadePedido.getIdPedido(),
                    listadePedido.getMesa().getIdMesa(),
                    listadePedido.getMesero().getNombre(),
                    listadePedido.getEstado(),
                    listadePedido.getTotal()
                });
            }
        }

    }

    public void llenartablaPedido2() {
        for (Pedido listadePedido : pedidodata.listadePedidos()) {
            if (!listadePedido.getEstado().equals("Pagado")) {
                modelo.addRow(new Object[]{
                    listadePedido.getIdPedido(),
                    listadePedido.getMesa().getIdMesa(),
                    listadePedido.getMesero().getNombre(),
                    listadePedido.getEstado(),
                    listadePedido.getTotal()
                });
            }
        }
    }

    public void llenartablaProductos() {
        int fila = jtPedido.getSelectedRow();
        if (fila != -1) {
            borradofilas2();
            int id = (Integer) modelo.getValueAt(fila, 0);
            if (proxPed.MostrarProductos(id).isEmpty()) {
                String a = "Pendiente de generar un pedido" ;
                String b="                       ---";                
                modelo2.addRow(new Object[]{
                    a,
                    b
                });

            } else {
                for (ProductoXPedido MostrarProducto : proxPed.MostrarProductos(id)) {
                    modelo2.addRow(new Object[]{
                        MostrarProducto.getProducto().getNombre(),
                        MostrarProducto.getCantidad()
                    });
                }
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbActivo;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbPago;
    private javax.swing.JTable jtPedido;
    private javax.swing.JTable jtTablaDeProductos;
    // End of variables declaration//GEN-END:variables

    private void borradofilas() {

        int fila = jtPedido.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {

            modelo.removeRow(i);

        }
    }
     private void borradofilas2() {

        int fila = jtTablaDeProductos.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {

            modelo2.removeRow(i);

        }
    }


}
