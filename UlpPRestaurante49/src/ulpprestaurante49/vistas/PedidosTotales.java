
package ulpprestaurante49.vistas;

import javax.swing.table.DefaultTableModel;
import restaurante.Entidades.Pedido;
import restaurante.accesoData.PedidoData;


public class PedidosTotales extends javax.swing.JFrame {
    
    PedidoData pedidodata = new PedidoData();
   
    public PedidosTotales() {
        initComponents();
        crearCabecera();
        llenartablaPedido();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedido = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jtPedido);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public DefaultTableModel modelo = new DefaultTableModel() {

        @Override
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
    
    public void llenartablaPedido() {
        for (Pedido listadePedido : pedidodata.listadePedidos()) {
                if(listadePedido.getEstado().equals("Pagado")){
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPedido;
    // End of variables declaration//GEN-END:variables
}
