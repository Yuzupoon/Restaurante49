package ulpprestaurante49.vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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

    Fondopantalla frame = new Fondopantalla();

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

        this.setContentPane(frame);
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
        jbEntregado = new javax.swing.JButton();
        jcMesero = new javax.swing.JComboBox<>();
        jlReserva = new javax.swing.JLabel();
        JcReserva = new javax.swing.JComboBox<>();
        jtFecha = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jbPagado = new javax.swing.JButton();
        jtRellename = new javax.swing.JLabel();
        jbAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);

        jlMesero.setForeground(new java.awt.Color(255, 255, 255));
        jlMesero.setText("MESERO:");

        jlMesa.setForeground(new java.awt.Color(255, 255, 255));
        jlMesa.setText("MESA:");

        jlEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlEstado.setText("ESTADO:");

        jtMesa.setEditable(false);

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "PENDIENTE", "ENTREGADO" }));

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

        jbGenerarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Generar pedido.png"))); // NOI18N
        jbGenerarPedido.setBorderPainted(false);
        jbGenerarPedido.setContentAreaFilled(false);
        jbGenerarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarPedidoActionPerformed(evt);
            }
        });

        jbAgregarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Agregar producto.png"))); // NOI18N
        jbAgregarPedido.setBorderPainted(false);
        jbAgregarPedido.setContentAreaFilled(false);
        jbAgregarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarPedidoActionPerformed(evt);
            }
        });

        jbEntregado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Entregado.png"))); // NOI18N
        jbEntregado.setBorderPainted(false);
        jbEntregado.setContentAreaFilled(false);
        jbEntregado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEntregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntregadoActionPerformed(evt);
            }
        });

        jcMesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        jlReserva.setForeground(new java.awt.Color(255, 255, 255));
        jlReserva.setText("RESERVA:");

        JcReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        jtFecha.setForeground(new java.awt.Color(255, 255, 255));

        jbPagado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Pagado.png"))); // NOI18N
        jbPagado.setBorderPainted(false);
        jbPagado.setContentAreaFilled(false);
        jbPagado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPagadoActionPerformed(evt);
            }
        });

        jbAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Atras Mediano.png"))); // NOI18N
        jbAtras.setBorderPainted(false);
        jbAtras.setContentAreaFilled(false);
        jbAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });

        jLabel1.setText("TOTAL:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(jtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(jtRellename, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbGenerarPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEntregado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPagado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbAtras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlMesero)
                                    .addComponent(jlMesa)
                                    .addComponent(jlEstado)
                                    .addComponent(jlReserva))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jcEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JcReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addComponent(jbAgregarPedido)
                                .addGap(5, 5, 5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtRellename, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesero)
                            .addComponent(jcMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlReserva)
                            .addComponent(JcReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPagado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEntregado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbGenerarPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                if (reserva.isEstado() == true) {
                    cont2++;
                }
                if (JcReserva.getSelectedIndex() == cont2) {
                    idreserva = reserva.getIdReserva();
                }
            }
            int personas = resData.buscarReservaID(idreserva).getCantidadPersonas();
            int encontroMismaReserva = 0;
            Reserva reserva1 = resData.buscarReservaID(idreserva);
            for (Pedido listadePedido : pedidoData.listadePedidos()) {
                if (listadePedido.getMesa().getReserva().getIdReserva() == reserva1.getIdReserva()) {
                    encontroMismaReserva = 1;
                }
            }

            if (encontroMismaReserva == 0) {
                double total = Double.parseDouble(jlTotal.getText());
                int mesi = Integer.parseInt(jtMesa.getText());
                mesaData.armarMesa(mesi, idreserva, personas);
                pedidoData.crearPedido(mesi, meserito, "Pendiente", total);
                jbGenerarPedido.setVisible(false);
            } else {
                JcReserva.setSelectedIndex(0);
                JOptionPane.showMessageDialog(null, "Esta reserva ya se encuentra en otra mesa");
            }
        }


    }//GEN-LAST:event_jbGenerarPedidoActionPerformed

    private void jbAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarPedidoActionPerformed
        int entro = 0;
        int idpedido = 0;
        for (Pedido listadePedido : pedidoData.listadePedidos()) {
            if (listadePedido.getMesa().getIdMesa() == Integer.parseInt(jtMesa.getText())
                    && !listadePedido.getEstado().equals("Pagado")) {
                entro = 1;
                idpedido = listadePedido.getIdPedido();
            }
        }

        if (entro == 1) {
            ProductosDePedidos produ = new ProductosDePedidos();
            produ.setVisible(true);
            produ.setLocationRelativeTo(null);
            this.dispose();
            ProductosDePedidos.jlIdpedido.setText(idpedido + "");
        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra ningun pedido generado para esta mesa porfavor genera un pedido");
        }
    }//GEN-LAST:event_jbAgregarPedidoActionPerformed

    private void jbEntregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntregadoActionPerformed
        int aviso = 0;
        for (Pedido listadePedido : pedidoData.listadePedidos()) {
            if (listadePedido.getMesa().getIdMesa() == Integer.parseInt(jtMesa.getText())
                    && !listadePedido.getEstado().equals("Pagado")) {
                listadePedido.setEstado("Entregado");
                pedidoData.modificarPedido(listadePedido);
                jcEstado.setSelectedIndex(2);
                aviso = 0;
            } else {
                aviso = 1;
            }
        }
        if (aviso == 1) {
            JOptionPane.showMessageDialog(this, "Porfavor genera un pedido para esta mesa");

        }
//        Mesa idmesa = new Mesa();
//        Mesero meserito = new Mesero();
//        int cont = 0;
//        int idpedido = 0;
//        idmesa = mesaData.buscarMesaID(Integer.parseInt(jtMesa.getText()));
//        for (Pedido listadePedido : pedidoData.listadePedidos()) {
//            if (listadePedido.getMesa().getIdMesa() == Integer.parseInt(jtMesa.getText())) {
//                idpedido = Integer.parseInt(listadePedido.getIdPedido() + "");
//            }
//        }
//        for (Mesero mesero : mesData.listaMesero()) {
//            cont++;
//            if (jcMesero.getSelectedIndex() == cont) {
//
//                meserito = mesero;
//
//            }
//        }
//        double total = Double.parseDouble(jlTotal.getText());
//        Pedido pedido = new Pedido(idpedido, idmesa, meserito, "Entregado", total);
//        jcEstado.setSelectedIndex(2);
//        pedidoData.cambiarEstado(pedido);
    }//GEN-LAST:event_jbEntregadoActionPerformed


    private void jbPagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPagadoActionPerformed
        int aviso = 0;
        for (Pedido listadePedido : pedidoData.listadePedidos()) {
            if (listadePedido.getMesa().getIdMesa() == Integer.parseInt(jtMesa.getText())
                    && !listadePedido.getEstado().equals("Pagado")) {
                listadePedido.setEstado("Pagado");
                listadePedido.setTotal(Double.parseDouble(jlTotal.getText()));
                pedidoData.modificarPedido(listadePedido);
                mesaData.armarMesa(listadePedido.getMesa().getIdMesa(), 1, 4);
                Reserva anularReserva = resData.buscarReservaID(listadePedido.getMesa().getReserva().getIdReserva());
                anularReserva.setEstado(false);
                resData.modificarReserva(anularReserva);
                MesPrincipal pantalla = new MesPrincipal();
                pantalla.setVisible(true);
                pantalla.setLocationRelativeTo(null);
                this.dispose();
                aviso = 0;
            }else{
                aviso = 1;
            }
        }
        if (aviso == 1) {
            JOptionPane.showMessageDialog(this, "Porfavor genera un pedido para esta mesa");

        }

//        Mesa idmesa = new Mesa();
//        Mesero meserito = new Mesero();
//        int cont = 0;
//        int idpedido = 0;
//        int mesa = Integer.parseInt(jtMesa.getText());
//        idmesa = mesaData.buscarMesaID(Integer.parseInt(jtMesa.getText()));
//        for (Pedido listadePedido : pedidoData.listadePedidos()) {
//            if (listadePedido.getMesa().getIdMesa() == Integer.parseInt(jtMesa.getText())) {
//                idpedido = Integer.parseInt(listadePedido.getIdPedido() + "");
//            }
//        }
//        for (Mesero mesero : mesData.listaMesero()) {
//            cont++;
//            if (jcMesero.getSelectedIndex() == cont) {
//
//                meserito = mesero;
//
//            }
//        }
//        double total = Double.parseDouble(jlTotal.getText());
//        Pedido pedido = new Pedido(idpedido, idmesa, meserito, "Pagado", total);
//        mesaData.armarMesa(mesa, 1);
//        mesaData.liberarMesa(mesa);
//        resData.eliminarReserva(Integer.parseInt(jtRellename.getText()));
//        pedidoData.modificarPedido(pedido);
    }//GEN-LAST:event_jbPagadoActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        MesPrincipal mesPrin = new MesPrincipal();
        mesPrin.setVisible(true);
        mesPrin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> JcReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JButton jbAgregarPedido;
    private javax.swing.JButton jbAtras;
    public static javax.swing.JButton jbEntregado;
    public static javax.swing.JButton jbGenerarPedido;
    public static javax.swing.JButton jbPagado;
    public static javax.swing.JComboBox<String> jcEstado;
    public static javax.swing.JComboBox<String> jcMesero;
    public static javax.swing.JLabel jlEstado;
    public static javax.swing.JLabel jlMesa;
    public static javax.swing.JLabel jlMesero;
    public static javax.swing.JLabel jlReserva;
    public static javax.swing.JLabel jlTotal;
    private javax.swing.JLabel jtFecha;
    public static javax.swing.JTextField jtMesa;
    public static javax.swing.JLabel jtRellename;
    public static javax.swing.JTable jttablaPedida;
    // End of variables declaration//GEN-END:variables

    private void llenarComboMesero() {
        for (Mesero mes : mesData.listaMesero()) {
            jcMesero.addItem(mes + "");
        }
    }

    private void llenarComboReserva() {
        for (Reserva listaReserva : resData.listaReservasXFecha(fechalista)) {
            if (listaReserva.isEstado() == true) {
                JcReserva.addItem(listaReserva + "");
            }
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
                    if (listadePedido.getMesa().getIdMesa() == mesa
                            && listadePedido.getMesa().getReserva().getIdReserva() != 1) {
                        idpedido = listadePedido.getIdPedido();
                    }
                }
                crono.cancel();
                if (idpedido != 0) {
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
                }

                int fila = jttablaPedida.getRowCount() - 1;
                double total = 0;
                for (int i = fila; i >= 0; i--) {

                    total = Double.parseDouble(jttablaPedida.getValueAt(i, 2) + "") + total;

                }
                jlTotal.setText(total + "");
            }
        }, tiempo);

    }

    public class Fondopantalla extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/imagenes/pedMesa.jpg/")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
