package ulpprestaurante49.vistas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restaurante.Entidades.Mesa;
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

public class PedidoPorMesa extends javax.swing.JFrame {

    MeseroData mesData = new MeseroData();
    PedidoData pedidoData = new PedidoData();
    MesaData mesaData = new MesaData();
    ReservaData resData = new ReservaData();
    Date fechaDia = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String fecha = formato.format(fechaDia);
    LocalDate fechalista = LocalDate.now();
    ProductoXPedidoData prodXPedidoData = new ProductoXPedidoData();
    ProductoData produdata = new ProductoData();

    public PedidoPorMesa() {
        initComponents();

        llenarComboMesero();
        llenarComboReserva();
        crearCabecera();
        llenarTabla();
        jtFecha.setText(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlMesero = new javax.swing.JLabel();
        jlMesa = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jtMesa = new javax.swing.JTextField();
        jcEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jttablaPedida = new javax.swing.JTable();
        jbGenerarPedido = new javax.swing.JButton();
        jbAgregarPedido = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jcMesero = new javax.swing.JComboBox<>();
        jlReserva = new javax.swing.JLabel();
        JcReserva = new javax.swing.JComboBox<>();
        jtFecha = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlMesero.setText("MESERO:");

        jlMesa.setText("MESA:");

        jlEstado.setText("ESTADO:");

        jtMesa.setEditable(false);

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "PENDIENTE", "ENTREGADO", "PAGADO" }));

        jttablaPedida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jttablaPedida);

        jbGenerarPedido.setText("GENERAR PEDIDO");
        jbGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarPedidoActionPerformed(evt);
            }
        });

        jbAgregarPedido.setText("AGREGAR PRODUCTO");
        jbAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarPedidoActionPerformed(evt);
            }
        });

        jbGuardar.setText("GUARDAR");

        jcMesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        jlReserva.setText("RESERVA:");

        JcReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jbGenerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMesero)
                    .addComponent(jlMesa)
                    .addComponent(jlEstado)
                    .addComponent(jlReserva))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbAgregarPedido)
                                .addGap(42, 42, 42))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JcReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesero)
                            .addComponent(jcMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMesa)
                    .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEstado)
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregarPedido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlReserva)
                            .addComponent(JcReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbGenerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbGuardar)))
                    .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
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

    private void jbGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenerarPedidoActionPerformed
        Pedido pedido = new Pedido();
        int meserito = 0;
        int idreserva = 0;
        if (jcMesero.getSelectedIndex() == 0
                || jtMesa.getText().isEmpty()
                || jcEstado.getSelectedIndex() == 0
                || JcReserva.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione todos los campos");
        } else {
            int cont = 0;
            for (Mesero mesero : mesData.listaMesero()) {
                cont++;
                if (jcMesero.getSelectedIndex() == cont) {

                    meserito = mesero.getIdMesero();

                }

            }
            int cont2 = 0;
            for (Reserva reserva : resData.listaReservasXFecha(fechalista)) {
                cont2++;
                if (JcReserva.getSelectedIndex() == cont2) {
                    idreserva = reserva.getIdReserva();
                }
            }
            int mesi = Integer.parseInt(jtMesa.getText());
            pedidoData.crearPedido(mesi, meserito, "Pendiente");
            mesaData.armarMesa(mesi, idreserva);

        }


    }//GEN-LAST:event_jbGenerarPedidoActionPerformed

    private void jbAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarPedidoActionPerformed
        ProductosDePedidos produ = new ProductosDePedidos();
        produ.setVisible(true);
        produ.setLocationRelativeTo(null);
        this.dispose();

        for (Pedido listadePedido : pedidoData.listadePedidos()) {
            if (listadePedido.getMesa().getIdMesa() == Integer.parseInt(jtMesa.getText())) {
                int idpedido = Integer.parseInt(listadePedido.getIdPedido() + "");
                ProductosDePedidos.jlIdpedido.setText(idpedido + "");
            }
        }
    }//GEN-LAST:event_jbAgregarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> JcReserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JButton jbAgregarPedido;
    public static javax.swing.JButton jbGenerarPedido;
    public static javax.swing.JButton jbGuardar;
    public static javax.swing.JComboBox<String> jcEstado;
    public static javax.swing.JComboBox<String> jcMesero;
    public static javax.swing.JLabel jlEstado;
    public static javax.swing.JLabel jlMesa;
    public static javax.swing.JLabel jlMesero;
    public static javax.swing.JLabel jlReserva;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JLabel jtFecha;
    public static javax.swing.JTextField jtMesa;
    public static javax.swing.JTable jttablaPedida;
    // End of variables declaration//GEN-END:variables

    private void llenarComboMesero() {
        for (Mesero mes : mesData.listaMesero()) {
            jcMesero.addItem(mes + "");

        }
    }

    private void llenarComboReserva() {
        for (Reserva listaReserva : resData.listaReservasXFecha(fechalista)) {
            JcReserva.addItem(listaReserva + "");
        }
    }

    public DefaultTableModel modelo2 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public void crearCabecera() {
        modelo2.addColumn("Producto");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Subtotal");
        jttablaPedida.setModel(modelo2);

    }

    public void llenarTabla() {

        Timer crono = new Timer();
        int tiempo = 300;

        crono.schedule(new TimerTask() {
            @Override
            public void run() {
                int idpedido = 0;
                for (Pedido listadePedido : pedidoData.listadePedidos()) {
                    int mesa = Integer.parseInt(jtMesa.getText());
                    if (listadePedido.getMesa().getIdMesa() == mesa) {
                        idpedido = Integer.parseInt(listadePedido.getIdPedido() + "");
                    }
                }
                crono.cancel();
                for (ProductoXPedido MostrarProducto : prodXPedidoData.MostrarProductos(idpedido)) {
                    for (Producto listaProducto : produdata.listaProductos()) {
                        if (MostrarProducto.getProducto().getNombre().equals(listaProducto.getNombre())) {
                            modelo2.addRow(new Object[]{
                                MostrarProducto.getProducto().getNombre(),
                                MostrarProducto.getCantidad(),
                                listaProducto.getPrecio() * MostrarProducto.getCantidad()
                            });
                        }

                    }
                }
                int fila = jttablaPedida.getRowCount() - 1;
                double total = 0;
                for (int i = fila; i >= 0; i--) {

                    total = Double.parseDouble(jttablaPedida.getValueAt(i, 2) + "") + total;

                }
                jlTotal.setText( total + "");
            }
        }, tiempo);

    }

}
