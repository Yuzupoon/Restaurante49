package ulpprestaurante49.vistas;

import javax.swing.table.DefaultTableModel;
import restaurante.Entidades.ProductoXPedido;
import restaurante.accesoData.ProductoData;
import restaurante.accesoData.ProductoXPedidoData;

public class ProductosDePedidos extends javax.swing.JFrame {

    ProductoData prodData = new ProductoData();
    ProductoXPedidoData prodXPedidoData = new ProductoXPedidoData();

    public ProductosDePedidos() {
        initComponents();
        crearCabeceraProducto();
        crearCabeceraProductoXPedido();
        llenartablaPrducto();
        llenartablaPrductoXPedido();
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jScrollPane2.setViewportView(jtablaPedido);

        jbAñadir.setText("AÑADIR");

        jlNumPedido.setText("Num de Pedido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbAñadir))
                    .addComponent(jsCantidad)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlIdpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNumPedido))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlNumPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIdpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(jbAñadir)
                        .addGap(18, 18, 18)
                        .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public DefaultTableModel modelo = new DefaultTableModel() {

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

        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        jtablaPedido.setModel(modelo);

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

    public void llenartablaPrductoXPedido() {

        for (ProductoXPedido MostrarProducto : prodXPedidoData.MostrarProductos(Integer.parseInt(jlIdpedido.getText()))) {
            
            modelo.addRow(new Object[]{
                MostrarProducto.getProducto().getNombre(),
                MostrarProducto.getCantidad()
            });
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

            modelo.removeRow(i);

        }
    }
}
