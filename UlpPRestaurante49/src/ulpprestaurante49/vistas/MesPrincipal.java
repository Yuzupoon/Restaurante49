package ulpprestaurante49.vistas;

import java.time.ZoneId;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Mesero;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.Reserva;
import restaurante.accesoData.MesaData;
import restaurante.accesoData.MeseroData;
import restaurante.accesoData.PedidoData;
import restaurante.accesoData.ReservaData;

public class MesPrincipal extends javax.swing.JFrame {

    MeseroData meseroData = new MeseroData();
    ReservaData reservadata = new ReservaData();
    MesaData mesdata = new MesaData();
    PedidoData pedidoData = new PedidoData();

    public MesPrincipal() {
        initComponents();
        armarTabla();
        llenarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaReserva = new javax.swing.JTable();
        jbGenerarRes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbModificarRes = new javax.swing.JButton();
        jbEliminarRes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        jTablaReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablaReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaReservaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaReserva);

        jbGenerarRes.setText("GENERAR RESERVA");
        jbGenerarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarResActionPerformed(evt);
            }
        });

        jLabel1.setText("FECHA:");

        jLabel2.setText("CAPACIDAD DISPONIBLE: 100");

        jbModificarRes.setText("MODIFICAR RESERVA");
        jbModificarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarResActionPerformed(evt);
            }
        });

        jbEliminarRes.setText("ELIMINAR RESERVA");
        jbEliminarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarResActionPerformed(evt);
            }
        });

        jLabel3.setText("SISTEMA DE RESERVAS");

        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });

        jButton8.setText("Mostrar todas las Reservas");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jbModificarRes)
                                .addGap(18, 18, 18)
                                .addComponent(jbEliminarRes))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbGenerarRes)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbGenerarRes))
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificarRes)
                    .addComponent(jbEliminarRes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Mesa 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButton5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addGap(95, 95, 95)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)))
                .addGap(95, 95, 95))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(53, 53, 53)
                .addComponent(jButton5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(106, 106, 106))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jbGenerarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenerarResActionPerformed

        GenerarReserva reserva = new GenerarReserva();
        reserva.setVisible(true);
        reserva.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbGenerarResActionPerformed

    private void jbEliminarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarResActionPerformed
        int fila = jTablaReserva.getSelectedRow();
        int id = (Integer) modelo.getValueAt(fila, 0);

        if (fila != -1) {
            Reserva a = reservadata.buscarReservaID(id);
            a.setEstado(false);
            reservadata.modificarReserva(a);
        }
        borradofilas();
        llenarTabla();
    }//GEN-LAST:event_jbEliminarResActionPerformed

    private void jbModificarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarResActionPerformed
        int fila = jTablaReserva.getSelectedRow();
        int id = (Integer) modelo.getValueAt(fila, 0);
        if (fila != -1) {
            ModificarReserva modificar = new ModificarReserva();
            modificar.setVisible(true);
            modificar.setLocationRelativeTo(null);
            this.dispose();

            Reserva res = new Reserva();
            res = reservadata.buscarReservaID(id);

            ModificarReserva.jtId.setText(id + "");
            ModificarReserva.jtNombre.setText(res.getNombre());
            ModificarReserva.jtApellido.setText(res.getApellido());
            ModificarReserva.jtDni.setText(res.getDni() + "");
            ModificarReserva.jdFecha.setDate(java.sql.Date.valueOf(res.getFecha()));
            ModificarReserva.jsHora.setValue(res.getHora().getHours());
            ModificarReserva.jsMinutos.setValue(res.getHora().getMinutes());
            ModificarReserva.jtCantPersonas.setText(res.getCantidadPersonas() + "");
            if (res.isEstado() == true) {
                ModificarReserva.jcEstado.setSelectedIndex(0);
            } else {
                ModificarReserva.jcEstado.setSelectedIndex(1);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccioname una reserva para modificar");
        }

    }//GEN-LAST:event_jbModificarResActionPerformed

    private void jTablaReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaReservaMouseClicked
        System.out.println(jdFecha.getDate());
        int fila = jTablaReserva.getSelectedRow();
        int id = (Integer) modelo.getValueAt(fila, 0);

//        Reserva a = reservadata.buscarReservaID(datoid);
    }//GEN-LAST:event_jTablaReservaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        PedidoPorMesa pedidoMesa = new PedidoPorMesa();
        pedidoMesa.setVisible(true);
        pedidoMesa.setLocationRelativeTo(null);
        this.dispose();
        PedidoPorMesa.jtMesa.setText("1");

        Mesa mesa = new Mesa();
        int contador = 0;
        for (Pedido listadePedido : pedidoData.listadePedidos()) {
            if (listadePedido.getMesa().getIdMesa() == Integer.parseInt(PedidoPorMesa.jtMesa.getText())
                    && listadePedido.getMesa().getReserva().getIdReserva() != 1
                    && !listadePedido.getEstado().equals("Pagado")) {
                for (Mesero mesero : meseroData.listaMesero()) {
                    contador++;
                    if (mesero.getIdMesero() == listadePedido.getMesero().getIdMesero()) {
                        PedidoPorMesa.jcMesero.setSelectedIndex(contador);
                    }
                }
                if (listadePedido.getEstado().equals("Pendiente")) {
                    PedidoPorMesa.jcEstado.setSelectedIndex(1);
                } else {
                    PedidoPorMesa.jcEstado.setSelectedIndex(2);
                }
                contador=0;
                for (Reserva reserva : reservadata.listaReservasXFecha(listadePedido.getMesa().getReserva().getFecha())) {
                    contador++;
                    if (reserva.getFecha().equals(listadePedido.getMesa().getReserva().getFecha())) {
                        PedidoPorMesa.JcReserva.setSelectedIndex(contador);
                    }
                    
                           
                }

            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private int numero = 0;
    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange
        System.out.println("acA");
        numero++;
        if (numero == 3) {
            borradofilas();
            if (jdFecha.getDate() == null) {
                for (Reserva listaReserva : reservadata.listaReservas()) {
                    modelo.addRow(new Object[]{
                        listaReserva.getIdReserva(),
                        listaReserva.getNombre(),
                        listaReserva.getFecha(),
                        listaReserva.getHora(),
                        listaReserva.getCantidadPersonas()

                    });
                }
            } else {
                for (Reserva listaReserva : reservadata.listaReservas()) {
                    if (listaReserva.isEstado() == true
                            && listaReserva.getFecha().isEqual(jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())) {

                        modelo.addRow(new Object[]{
                            listaReserva.getIdReserva(),
                            listaReserva.getNombre(),
                            listaReserva.getFecha(),
                            listaReserva.getHora(),
                            listaReserva.getCantidadPersonas()

                        });
                    }
                }
            }
            numero = 2;
        }
    }//GEN-LAST:event_jdFechaPropertyChange

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jdFecha.setDate(null);
    }//GEN-LAST:event_jButton8ActionPerformed

    public DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public void armarTabla() {
        modelo.addColumn("IdReserva");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Cant Personas");
        jTablaReserva.setModel(modelo);
    }

    public void llenarTabla() {
        for (Reserva listaReserva : reservadata.listaReservas()) {
            if (listaReserva.isEstado() == true) {
                modelo.addRow(new Object[]{
                    listaReserva.getIdReserva(),
                    listaReserva.getNombre(),
                    listaReserva.getFecha(),
                    listaReserva.getHora(),
                    listaReserva.getCantidadPersonas()

                });
            }
        }
    }

    public void borradofilas() {

        int fila = jTablaReserva.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {

            modelo.removeRow(i);

        }
    }

    public static boolean soloLetras(String cadena) {

        Pattern pattern = Pattern.compile("[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]+");
        Matcher matcher = pattern.matcher(cadena);

        return !matcher.find();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaReserva;
    private javax.swing.JButton jbEliminarRes;
    private javax.swing.JButton jbGenerarRes;
    private javax.swing.JButton jbModificarRes;
    private com.toedter.calendar.JDateChooser jdFecha;
    // End of variables declaration//GEN-END:variables
}
