package ulpprestaurante49.vistas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.time.ZoneId;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Mesero;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.Reserva;
import restaurante.accesoData.MesaData;
import restaurante.accesoData.MeseroData;
import restaurante.accesoData.PedidoData;
import restaurante.accesoData.ReservaData;
import static ulpprestaurante49.vistas.Login.jpContrasena;
import static ulpprestaurante49.vistas.Login.jtUsuario;

public class MesPrincipal extends javax.swing.JFrame {

    MeseroData meseroData = new MeseroData();
    ReservaData reservadata = new ReservaData();
    MesaData mesdata = new MesaData();
    PedidoData pedidoData = new PedidoData();
    java.util.Date fechaDia = new java.util.Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String fecha = formato.format(fechaDia);
    LocalDate fechalista = LocalDate.now();

    Fondopantalla frame = new Fondopantalla();

    public MesPrincipal() {
        this.setContentPane(frame);
        initComponents();
        corregirMesa();
        iconosMesas();
        armarTabla();
        llenarTabla();
        cantidadEspacio();
        JtxCantReserv.setVisible(false);
        JtxReservadiatx.setVisible(false);
        String admi = "Administracion";
        String usu = "proyecto49";
        if (jtUsuario.getText().equals(admi) && jpContrasena.getText().equals(usu)) {
            jbCerrar.setVisible(true);
            jbSalir.setVisible(true);

        } else {
            jbCerrar.setVisible(true);
            jbSalir.setVisible(false);

        }

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
        jbModificarRes = new javax.swing.JButton();
        jbEliminarRes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jbMostrarreservas = new javax.swing.JButton();
        jsHora = new javax.swing.JSpinner();
        jsMinutos = new javax.swing.JSpinner();
        jbCerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbMesa1 = new javax.swing.JButton();
        jbMesa2 = new javax.swing.JButton();
        jbMesa3 = new javax.swing.JButton();
        jbMesa4 = new javax.swing.JButton();
        jbMesa5 = new javax.swing.JButton();
        jbMesa6 = new javax.swing.JButton();
        jbMesa7 = new javax.swing.JButton();
        jbMesa8 = new javax.swing.JButton();
        jbMesa9 = new javax.swing.JButton();
        jbMesa10 = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCantidaddisponible = new javax.swing.JLabel();
        JtxReservadiatx = new javax.swing.JLabel();
        JtxCantReserv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        jPanel2.setOpaque(false);

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

        jbGenerarRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Generar Reserva.png"))); // NOI18N
        jbGenerarRes.setBorderPainted(false);
        jbGenerarRes.setContentAreaFilled(false);
        jbGenerarRes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGenerarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarResActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FECHA:");

        jbModificarRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton modficar reserva.png"))); // NOI18N
        jbModificarRes.setBorderPainted(false);
        jbModificarRes.setContentAreaFilled(false);
        jbModificarRes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbModificarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarResActionPerformed(evt);
            }
        });

        jbEliminarRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Eliminar reserva.png"))); // NOI18N
        jbEliminarRes.setBorderPainted(false);
        jbEliminarRes.setContentAreaFilled(false);
        jbEliminarRes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEliminarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarResActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SISTEMA DE RESERVAS");

        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });

        jbMostrarreservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton mostrar reservas.png"))); // NOI18N
        jbMostrarreservas.setBorderPainted(false);
        jbMostrarreservas.setContentAreaFilled(false);
        jbMostrarreservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMostrarreservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarreservasActionPerformed(evt);
            }
        });

        jsHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jsHora.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsHoraStateChanged(evt);
            }
        });

        jsMinutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 10));
        jsMinutos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsMinutosStateChanged(evt);
            }
        });

        jbCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jbCerrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbCerrar.setForeground(new java.awt.Color(0, 0, 0));
        jbCerrar.setText("CERRAR SESION");
        jbCerrar.setBorder(null);
        jbCerrar.setContentAreaFilled(false);
        jbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCerrarMouseExited(evt);
            }
        });
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RELOJ:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jsHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jsMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbMostrarreservas, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jbGenerarRes)
                .addGap(18, 18, 18)
                .addComponent(jbModificarRes, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbEliminarRes))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbCerrar)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbMostrarreservas)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jsHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGenerarRes)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbModificarRes)
                        .addComponent(jbEliminarRes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCerrar))
        );

        jPanel3.setOpaque(false);

        jbMesa1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMesa1.setForeground(new java.awt.Color(255, 255, 255));
        jbMesa1.setText("Mesa 1");
        jbMesa1.setBorder(null);
        jbMesa1.setContentAreaFilled(false);
        jbMesa1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMesa1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbMesa1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa1ActionPerformed(evt);
            }
        });

        jbMesa2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMesa2.setForeground(new java.awt.Color(255, 255, 255));
        jbMesa2.setText("Mesa 2");
        jbMesa2.setBorder(null);
        jbMesa2.setContentAreaFilled(false);
        jbMesa2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMesa2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbMesa2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa2ActionPerformed(evt);
            }
        });

        jbMesa3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMesa3.setForeground(new java.awt.Color(255, 255, 255));
        jbMesa3.setText("Mesa 3");
        jbMesa3.setBorder(null);
        jbMesa3.setContentAreaFilled(false);
        jbMesa3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMesa3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbMesa3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa3ActionPerformed(evt);
            }
        });

        jbMesa4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMesa4.setForeground(new java.awt.Color(255, 255, 255));
        jbMesa4.setText("Mesa 4");
        jbMesa4.setBorder(null);
        jbMesa4.setContentAreaFilled(false);
        jbMesa4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMesa4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbMesa4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa4ActionPerformed(evt);
            }
        });

        jbMesa5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMesa5.setForeground(new java.awt.Color(255, 255, 255));
        jbMesa5.setText("Mesa 5");
        jbMesa5.setBorder(null);
        jbMesa5.setContentAreaFilled(false);
        jbMesa5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMesa5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbMesa5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa5ActionPerformed(evt);
            }
        });

        jbMesa6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMesa6.setForeground(new java.awt.Color(255, 255, 255));
        jbMesa6.setText("Mesa 6");
        jbMesa6.setBorder(null);
        jbMesa6.setContentAreaFilled(false);
        jbMesa6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMesa6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbMesa6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa6ActionPerformed(evt);
            }
        });

        jbMesa7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMesa7.setForeground(new java.awt.Color(255, 255, 255));
        jbMesa7.setText("Mesa 7");
        jbMesa7.setBorder(null);
        jbMesa7.setContentAreaFilled(false);
        jbMesa7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMesa7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbMesa7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa7ActionPerformed(evt);
            }
        });

        jbMesa8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMesa8.setForeground(new java.awt.Color(255, 255, 255));
        jbMesa8.setText("Mesa 8");
        jbMesa8.setBorder(null);
        jbMesa8.setContentAreaFilled(false);
        jbMesa8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMesa8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbMesa8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa8ActionPerformed(evt);
            }
        });

        jbMesa9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMesa9.setForeground(new java.awt.Color(255, 255, 255));
        jbMesa9.setText("Mesa 9");
        jbMesa9.setBorder(null);
        jbMesa9.setContentAreaFilled(false);
        jbMesa9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMesa9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbMesa9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa9ActionPerformed(evt);
            }
        });

        jbMesa10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMesa10.setForeground(new java.awt.Color(255, 255, 255));
        jbMesa10.setText("Mesa 10");
        jbMesa10.setBorder(null);
        jbMesa10.setContentAreaFilled(false);
        jbMesa10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMesa10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbMesa10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbMesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa10ActionPerformed(evt);
            }
        });

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Atras Mediano.png"))); // NOI18N
        jbSalir.setBorderPainted(false);
        jbSalir.setContentAreaFilled(false);
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CAPACIDAD DISPONIBLE:");

        jCantidaddisponible.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCantidaddisponible.setForeground(new java.awt.Color(0, 0, 0));

        JtxReservadiatx.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JtxReservadiatx.setForeground(new java.awt.Color(0, 0, 0));
        JtxReservadiatx.setText("RESERVAS POR DIA:");

        JtxCantReserv.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JtxCantReserv.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jbMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jbMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jbMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCantidaddisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JtxReservadiatx)
                        .addGap(18, 18, 18)
                        .addComponent(JtxCantReserv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(15, 15, 15))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbMesa8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbMesa9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JtxCantReserv, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtxReservadiatx, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jCantidaddisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        if (fila != -1) {
            int id = (Integer) modelo.getValueAt(fila, 0);
            Reserva a = reservadata.buscarReservaID(id);
            a.setEstado(false);
            reservadata.modificarReserva(a);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una Reserva de la Tabla");
        }
        borradofilas();
        llenarTabla();
    }//GEN-LAST:event_jbEliminarResActionPerformed

    private void jbModificarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarResActionPerformed
  int fila = jTablaReserva.getSelectedRow();
        int yaExiste = 0;
        if (fila != -1) {
            int id = (Integer) modelo.getValueAt(fila, 0);
            for (Pedido listadePedido : pedidoData.listadePedidos()) {
                if (listadePedido.getMesa().getReserva().getIdReserva() == id) {
                    yaExiste = 1;
                }
            }

            if (yaExiste == 0) {

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
            }else{
                JOptionPane.showMessageDialog(null, "<html>La Reserva ya esta en <b> una mesa no se puedo Modificar</html>");
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

    private void jbMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa1ActionPerformed

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
                contador = 0;
                for (Reserva reserva : reservadata.listaReservasXFecha(listadePedido.getMesa().getReserva().getFecha())) {
                    if (reserva.isEstado() == true) {
                        contador++;
                    }
                    if (reserva.getIdReserva() == listadePedido.getMesa().getReserva().getIdReserva()) {
                        PedidoPorMesa.JcReserva.setSelectedIndex(contador);
                        PedidoPorMesa.jtRellename.setText(reserva.getIdReserva() + "");
                        PedidoPorMesa.jtRellename.setVisible(false);

                    }
                }
                PedidoPorMesa.jlTotal.setText(listadePedido.getTotal() + "");
                PedidoPorMesa.jbGenerarPedido.setVisible(false);

            }
        }


    }//GEN-LAST:event_jbMesa1ActionPerformed

    private int numero = 0;
    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange
        numero++;
        int reservaspordia = 4;
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
                LocalDate hoy = LocalDate.now();
                for (Reserva listaReserva : reservadata.listaReservas()) {
                    JtxCantReserv.setVisible(true);
                    JtxReservadiatx.setVisible(true);
                    JtxCantReserv.setText(reservaspordia + "");
                    if (listaReserva.isEstado() == true
                            && listaReserva.getFecha().isEqual(jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())) {
                        reservaspordia--;
                        if (listaReserva.getFecha().equals(hoy)) {
                            JtxCantReserv.setVisible(false);
                            JtxReservadiatx.setVisible(false);
                            JtxCantReserv.setText("");
                            modelo.addRow(new Object[]{
                                listaReserva.getIdReserva(),
                                listaReserva.getNombre(),
                                listaReserva.getFecha(),
                                listaReserva.getHora(),
                                listaReserva.getCantidadPersonas()

                            });
                        } else {
                            JtxCantReserv.setVisible(true);
                            JtxReservadiatx.setVisible(true);
                            JtxCantReserv.setText(reservaspordia + "");
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
            }
            numero = 2;
        }
    }//GEN-LAST:event_jdFechaPropertyChange

    private void jbMostrarreservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarreservasActionPerformed
        jdFecha.setDate(null);
    }//GEN-LAST:event_jbMostrarreservasActionPerformed

    private void jsHoraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsHoraStateChanged
        LocalTime tiempo2 = new Time(Integer.parseInt(jsHora.getValue() + ""), Integer.parseInt(jsMinutos.getValue() + ""), 00).toLocalTime();

        for (Reserva reserva : reservadata.listaReservasXFecha(fechalista)) {
            LocalTime tiempo1 = reserva.getHora().toLocalTime();
            LocalTime diferencia = tiempo1.minusMinutes(10);
            if (diferencia.equals(tiempo2)) {
                JOptionPane.showMessageDialog(null, "La Reserva a nombre de " + reserva.getNombre() + " esta por llegar.");
            }
        }
    }//GEN-LAST:event_jsHoraStateChanged

    private void jsMinutosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsMinutosStateChanged
        LocalTime tiempo2 = new Time(Integer.parseInt(jsHora.getValue() + ""), Integer.parseInt(jsMinutos.getValue() + ""), 00).toLocalTime();

        for (Reserva reserva : reservadata.listaReservasXFecha(fechalista)) {
            LocalTime tiempo1 = reserva.getHora().toLocalTime();
            LocalTime diferencia = tiempo1.minusMinutes(10);
            if (diferencia.equals(tiempo2)) {
                JOptionPane.showMessageDialog(null, "La Reserva a nombre de " + reserva.getNombre() + " esta por llegar.");
            }
        }
    }//GEN-LAST:event_jsMinutosStateChanged

    private void jbMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa2ActionPerformed
        PedidoPorMesa pedidoMesa = new PedidoPorMesa();
        pedidoMesa.setVisible(true);
        pedidoMesa.setLocationRelativeTo(null);
        this.dispose();
        PedidoPorMesa.jtMesa.setText("2");

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
                contador = 0;
                for (Reserva reserva : reservadata.listaReservasXFecha(listadePedido.getMesa().getReserva().getFecha())) {
                    if (reserva.isEstado() == true) {
                        contador++;
                    }
                    if (reserva.getIdReserva() == listadePedido.getMesa().getReserva().getIdReserva()) {
                        PedidoPorMesa.JcReserva.setSelectedIndex(contador);
                        PedidoPorMesa.jtRellename.setText(reserva.getIdReserva() + "");
                        PedidoPorMesa.jtRellename.setVisible(false);

                    }
                }
                PedidoPorMesa.jlTotal.setText(listadePedido.getTotal() + "");
                PedidoPorMesa.jbGenerarPedido.setVisible(false);

            }
        }
    }//GEN-LAST:event_jbMesa2ActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed

        Home home = new Home();
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbCerrar.setForeground(Color.red);
        Font font1 = new Font("Segoe UI", Font.BOLD, 14);
        jbCerrar.setFont(font1);
    }//GEN-LAST:event_jbCerrarMouseEntered

    private void jbCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jbCerrar.setForeground(Color.black);
        Font font2 = new Font("Segoe UI", Font.BOLD, 14);
        jbCerrar.setFont(font2);
    }//GEN-LAST:event_jbCerrarMouseExited

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        AdmPrincipal adm = new AdmPrincipal();
        adm.setVisible(true);
        adm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa3ActionPerformed
        PedidoPorMesa pedidoMesa = new PedidoPorMesa();
        pedidoMesa.setVisible(true);
        pedidoMesa.setLocationRelativeTo(null);
        this.dispose();
        PedidoPorMesa.jtMesa.setText("3");

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
                contador = 0;
                for (Reserva reserva : reservadata.listaReservasXFecha(listadePedido.getMesa().getReserva().getFecha())) {
                    if (reserva.isEstado() == true) {
                        contador++;
                    }
                    if (reserva.getIdReserva() == listadePedido.getMesa().getReserva().getIdReserva()) {
                        PedidoPorMesa.JcReserva.setSelectedIndex(contador);
                        PedidoPorMesa.jtRellename.setText(reserva.getIdReserva() + "");
                        PedidoPorMesa.jtRellename.setVisible(false);

                    }
                }
                PedidoPorMesa.jlTotal.setText(listadePedido.getTotal() + "");
                PedidoPorMesa.jbGenerarPedido.setVisible(false);

            }
        }
    }//GEN-LAST:event_jbMesa3ActionPerformed

    private void jbMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa4ActionPerformed
        PedidoPorMesa pedidoMesa = new PedidoPorMesa();
        pedidoMesa.setVisible(true);
        pedidoMesa.setLocationRelativeTo(null);
        this.dispose();
        PedidoPorMesa.jtMesa.setText("4");

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
                contador = 0;
                for (Reserva reserva : reservadata.listaReservasXFecha(listadePedido.getMesa().getReserva().getFecha())) {
                    if (reserva.isEstado() == true) {
                        contador++;
                    }
                    if (reserva.getIdReserva() == listadePedido.getMesa().getReserva().getIdReserva()) {
                        PedidoPorMesa.JcReserva.setSelectedIndex(contador);
                        PedidoPorMesa.jtRellename.setText(reserva.getIdReserva() + "");
                        PedidoPorMesa.jtRellename.setVisible(false);

                    }
                }
                PedidoPorMesa.jlTotal.setText(listadePedido.getTotal() + "");
                PedidoPorMesa.jbGenerarPedido.setVisible(false);

            }
        }

    }//GEN-LAST:event_jbMesa4ActionPerformed

    private void jbMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa5ActionPerformed
        PedidoPorMesa pedidoMesa = new PedidoPorMesa();
        pedidoMesa.setVisible(true);
        pedidoMesa.setLocationRelativeTo(null);
        this.dispose();
        PedidoPorMesa.jtMesa.setText("5");
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
                contador = 0;
                for (Reserva reserva : reservadata.listaReservasXFecha(listadePedido.getMesa().getReserva().getFecha())) {
                    if (reserva.isEstado() == true) {
                        contador++;
                    }
                    if (reserva.getIdReserva() == listadePedido.getMesa().getReserva().getIdReserva()) {
                        PedidoPorMesa.JcReserva.setSelectedIndex(contador);
                        PedidoPorMesa.jtRellename.setText(reserva.getIdReserva() + "");
                        PedidoPorMesa.jtRellename.setVisible(false);

                    }
                }
                PedidoPorMesa.jlTotal.setText(listadePedido.getTotal() + "");
                PedidoPorMesa.jbGenerarPedido.setVisible(false);

            }
        }
    }//GEN-LAST:event_jbMesa5ActionPerformed

    private void jbMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa6ActionPerformed
        PedidoPorMesa pedidoMesa = new PedidoPorMesa();
        pedidoMesa.setVisible(true);
        pedidoMesa.setLocationRelativeTo(null);
        this.dispose();
        PedidoPorMesa.jtMesa.setText("6");

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
                contador = 0;
                for (Reserva reserva : reservadata.listaReservasXFecha(listadePedido.getMesa().getReserva().getFecha())) {
                    if (reserva.isEstado() == true) {
                        contador++;
                    }
                    if (reserva.getIdReserva() == listadePedido.getMesa().getReserva().getIdReserva()) {
                        PedidoPorMesa.JcReserva.setSelectedIndex(contador);
                        PedidoPorMesa.jtRellename.setText(reserva.getIdReserva() + "");
                        PedidoPorMesa.jtRellename.setVisible(false);

                    }
                }
                PedidoPorMesa.jlTotal.setText(listadePedido.getTotal() + "");
                PedidoPorMesa.jbGenerarPedido.setVisible(false);

            }
        }


    }//GEN-LAST:event_jbMesa6ActionPerformed

    private void jbMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa7ActionPerformed
        PedidoPorMesa pedidoMesa = new PedidoPorMesa();
        pedidoMesa.setVisible(true);
        pedidoMesa.setLocationRelativeTo(null);
        this.dispose();
        PedidoPorMesa.jtMesa.setText("7");
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
                contador = 0;
                for (Reserva reserva : reservadata.listaReservasXFecha(listadePedido.getMesa().getReserva().getFecha())) {
                    if (reserva.isEstado() == true) {
                        contador++;
                    }
                    if (reserva.getIdReserva() == listadePedido.getMesa().getReserva().getIdReserva()) {
                        PedidoPorMesa.JcReserva.setSelectedIndex(contador);
                        PedidoPorMesa.jtRellename.setText(reserva.getIdReserva() + "");
                        PedidoPorMesa.jtRellename.setVisible(false);

                    }
                }
                PedidoPorMesa.jlTotal.setText(listadePedido.getTotal() + "");
                PedidoPorMesa.jbGenerarPedido.setVisible(false);

            }
        }

    }//GEN-LAST:event_jbMesa7ActionPerformed

    private void jbMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa8ActionPerformed
        PedidoPorMesa pedidoMesa = new PedidoPorMesa();
        pedidoMesa.setVisible(true);
        pedidoMesa.setLocationRelativeTo(null);
        this.dispose();
        PedidoPorMesa.jtMesa.setText("8");

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
                contador = 0;
                for (Reserva reserva : reservadata.listaReservasXFecha(listadePedido.getMesa().getReserva().getFecha())) {
                    if (reserva.isEstado() == true) {
                        contador++;
                    }
                    if (reserva.getIdReserva() == listadePedido.getMesa().getReserva().getIdReserva()) {
                        PedidoPorMesa.JcReserva.setSelectedIndex(contador);
                        PedidoPorMesa.jtRellename.setText(reserva.getIdReserva() + "");
                        PedidoPorMesa.jtRellename.setVisible(false);

                    }
                }
                PedidoPorMesa.jlTotal.setText(listadePedido.getTotal() + "");
                PedidoPorMesa.jbGenerarPedido.setVisible(false);

            }
        }

    }//GEN-LAST:event_jbMesa8ActionPerformed

    private void jbMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa9ActionPerformed
        PedidoPorMesa pedidoMesa = new PedidoPorMesa();
        pedidoMesa.setVisible(true);
        pedidoMesa.setLocationRelativeTo(null);
        this.dispose();
        PedidoPorMesa.jtMesa.setText("9");

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
                contador = 0;
                for (Reserva reserva : reservadata.listaReservasXFecha(listadePedido.getMesa().getReserva().getFecha())) {
                    if (reserva.isEstado() == true) {
                        contador++;
                    }
                    if (reserva.getIdReserva() == listadePedido.getMesa().getReserva().getIdReserva()) {
                        PedidoPorMesa.JcReserva.setSelectedIndex(contador);
                        PedidoPorMesa.jtRellename.setText(reserva.getIdReserva() + "");
                        PedidoPorMesa.jtRellename.setVisible(false);

                    }
                }
                PedidoPorMesa.jlTotal.setText(listadePedido.getTotal() + "");
                PedidoPorMesa.jbGenerarPedido.setVisible(false);

            }
        }

    }//GEN-LAST:event_jbMesa9ActionPerformed

    private void jbMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa10ActionPerformed
        PedidoPorMesa pedidoMesa = new PedidoPorMesa();
        pedidoMesa.setVisible(true);
        pedidoMesa.setLocationRelativeTo(null);
        this.dispose();
        PedidoPorMesa.jtMesa.setText("10");

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
                contador = 0;
                for (Reserva reserva : reservadata.listaReservasXFecha(listadePedido.getMesa().getReserva().getFecha())) {
                    if (reserva.isEstado() == true) {
                        contador++;
                    }
                    if (reserva.getIdReserva() == listadePedido.getMesa().getReserva().getIdReserva()) {
                        PedidoPorMesa.JcReserva.setSelectedIndex(contador);
                        PedidoPorMesa.jtRellename.setText(reserva.getIdReserva() + "");
                        PedidoPorMesa.jtRellename.setVisible(false);

                    }
                }
                PedidoPorMesa.jlTotal.setText(listadePedido.getTotal() + "");
                PedidoPorMesa.jbGenerarPedido.setVisible(false);

            }
        }

    }//GEN-LAST:event_jbMesa10ActionPerformed

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
    public static javax.swing.JLabel JtxCantReserv;
    private javax.swing.JLabel JtxReservadiatx;
    private javax.swing.JLabel jCantidaddisponible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaReserva;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbEliminarRes;
    private javax.swing.JButton jbGenerarRes;
    private javax.swing.JButton jbMesa1;
    private javax.swing.JButton jbMesa10;
    private javax.swing.JButton jbMesa2;
    private javax.swing.JButton jbMesa3;
    private javax.swing.JButton jbMesa4;
    private javax.swing.JButton jbMesa5;
    private javax.swing.JButton jbMesa6;
    private javax.swing.JButton jbMesa7;
    private javax.swing.JButton jbMesa8;
    private javax.swing.JButton jbMesa9;
    private javax.swing.JButton jbModificarRes;
    private javax.swing.JButton jbMostrarreservas;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JSpinner jsHora;
    private javax.swing.JSpinner jsMinutos;
    // End of variables declaration//GEN-END:variables

    public void corregirMesa() {
        for (Pedido listadePedido : pedidoData.listadePedidos()) {
            if (!listadePedido.getMesa().getReserva().getFecha().equals(LocalDate.now())
                    && listadePedido.getMesa().getReserva().isEstado() == true
                    && !listadePedido.getEstado().equals("Pagado")) {

                listadePedido.setEstado("Pagado");
                mesdata.armarMesa(listadePedido.getMesa().getIdMesa(), 1, 4);
                pedidoData.modificarPedido(listadePedido);
                Reserva reserva = reservadata.buscarReservaID(listadePedido.getMesa().getReserva().getIdReserva());
                reserva.setEstado(false);
                reservadata.modificarReserva(reserva);

            }
        }
    }

    public void iconosMesas() {

        JButton[] botonesMesas = {jbMesa1, jbMesa2, jbMesa3, jbMesa4, jbMesa5, jbMesa6, jbMesa7, jbMesa8, jbMesa9, jbMesa10};

        List<Mesa> listaMesas = mesdata.listaMesa();

        for (int i = 0; i < botonesMesas.length; i++) {
            Mesa mesa = listaMesas.get(i);

            if (mesa.getReserva().getIdReserva() != 1) {
//                 Mesa ocupada
                ImageIcon imagenConpedido = new ImageIcon(getClass().getResource("/imagenes/mesaroja1.png/"));
                botonesMesas[i].setIcon(imagenConpedido);

            } else {
//                 Mesa disponible
                ImageIcon imagenSinpedido = new ImageIcon(getClass().getResource("/imagenes/mesa1.png/"));
                botonesMesas[i].setIcon(imagenSinpedido);

            }
        }
    }

    public class Fondopantalla extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/imagenes/Fondo_reserva2.png/")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

    public void cantidadEspacio() {
        int cantidadtotal = 0;
        for (Mesa mesa : mesdata.listaMesa()) {
            if (mesa.getReserva().getIdReserva() != 1) {
                cantidadtotal = cantidadtotal;
            } else {
                cantidadtotal = cantidadtotal + mesa.getCapacidad();
            }
        }
        jCantidaddisponible.setText(cantidadtotal + "");
    }
}
