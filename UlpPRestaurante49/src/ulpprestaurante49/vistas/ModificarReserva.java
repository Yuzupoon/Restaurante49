package ulpprestaurante49.vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Time;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import restaurante.Entidades.Reserva;
import restaurante.accesoData.ReservaData;

public class ModificarReserva extends javax.swing.JFrame {

    Fondopantalla frame = new Fondopantalla();

    MesPrincipal mes = new MesPrincipal();

    public ModificarReserva() {
        this.setContentPane(frame);
        initComponents();
        jdFecha.getDateEditor().getUiComponent().setEnabled(false);
        jdFecha.getDateEditor().getUiComponent().setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtCantPersonas = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jcEstado = new javax.swing.JComboBox<>();
        jsHora = new javax.swing.JSpinner();
        jsMinutos = new javax.swing.JSpinner();
        jtFecha = new javax.swing.JLabel();
        jtId = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MODIFICAR RESERVA");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APELLIDO:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DNI:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CANT.PERSONAS:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HORA:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ESTADO:");

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jtCantPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantPersonasKeyTyped(evt);
            }
        });

        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));

        jsHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jsHora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jsMinutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 10));

        jtFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtFecha.setForeground(new java.awt.Color(255, 255, 255));

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Guardar.png"))); // NOI18N
        jbGuardar.setBorderPainted(false);
        jbGuardar.setContentAreaFilled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jsHora, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jsMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(246, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbGuardar)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(207, 207, 207)
                                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 32, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAtras)
                        .addGap(20, 373, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jsHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAtras)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(269, 269, 269))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange
        if (jdFecha.getDate() != null) {
            LocalDate fecha = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            jtFecha.setText(fecha + "");
        }
    }//GEN-LAST:event_jdFechaPropertyChange

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        Reserva res = new Reserva();
        ReservaData resdata = new ReservaData();
        int error = 0;
        int aviso = 0;
        int alerta = 0;
        if (jtNombre.getText().isEmpty()
                || jtApellido.getText().isEmpty()
                || jtCantPersonas.getText().isEmpty()
                || jtDni.getText().isEmpty()
                || jdFecha.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Porfavor Flac@ Rellename los campos");
        } else {
            res = resdata.buscarReservaID(Integer.parseInt(jtId.getText()));
            if (soloLetras(jtNombre.getText()) == true) {
                res.setNombre(jtNombre.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Flac@ Poneme solo letras en el nombre");
                jtNombre.setText("");
                error = 1;
            }
            if (soloLetras(jtApellido.getText()) == true) {
                res.setApellido(jtApellido.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Flac@ Poneme solo letras en el apellido");
                jtApellido.setText("");
                error = 1;
            }
            try {
                for (Reserva listaReserva : resdata.listaReservas()) {
                    if (Integer.parseInt(jtDni.getText()) == listaReserva.getDni()) {
                        aviso = 1;
                    }
                }
                if (aviso == 0) {
                    res.setDni(Integer.parseInt(jtDni.getText()));
                }
                alerta = 1;
                res.setCantidadPersonas(Integer.parseInt(jtCantPersonas.getText()));

            } catch (NumberFormatException e) {
                if (alerta == 0) {
                    JOptionPane.showMessageDialog(null, "Por favor ingresa solo numeros en el Dni");
                    jtDni.setText("");
                }
                if (alerta == 1) {
                    JOptionPane.showMessageDialog(null, "Por favor ingresa solo numeros en la cantidad de personas");
                    jtCantPersonas.setText("");
                }
                error = 1;

            }
            res.setFecha(jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            int hora = (Integer) jsHora.getValue();
            int minuto = (Integer) jsMinutos.getValue();
            Time tiempo = new Time(hora, minuto, 0);
            res.setHora(tiempo);
            if (jcEstado.getSelectedIndex() == 0) {
                res.setEstado(true);
            } else {
                res.setEstado(false);
            }

        }
        if (error == 0) {
            resdata.modificarReserva(res);
            MesPrincipal mesp = new MesPrincipal();
            mesp.setVisible(true);
            mesp.setLocationRelativeTo(null);
            this.dispose();

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char nombre = evt.getKeyChar();
        if (Character.isLetter(nombre) || Character.isWhitespace(nombre) || Character.isISOControl(nombre)) {
            jtNombre.setEditable(true);
        } else {
            jtNombre.setEditable(false);
            JOptionPane.showMessageDialog(this, "Ingresa solo letras");
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        char nombre = evt.getKeyChar();
        if (Character.isLetter(nombre) || Character.isWhitespace(nombre) || Character.isISOControl(nombre)) {
            jtApellido.setEditable(true);
        } else {
            jtApellido.setEditable(false);
            JOptionPane.showMessageDialog(this, "Ingresa solo letras");
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c)) {
            jtDni.setEditable(true);

        } else {
            jtDni.setEditable(false);
            JOptionPane.showMessageDialog(null, "Ingrese solamente numeros");
            return;

        }
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtCantPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantPersonasKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c)) {
            jtCantPersonas.setEditable(true);

        } else {
            jtCantPersonas.setEditable(false);
            JOptionPane.showMessageDialog(null, "Ingrese solamente numeros");
            return;

        }
    }//GEN-LAST:event_jtCantPersonasKeyTyped

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        MesPrincipal pantalla = new MesPrincipal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed

    public static boolean soloLetras(String cadena) {

        Pattern pattern = Pattern.compile("[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]+");
        Matcher matcher = pattern.matcher(cadena);

        return !matcher.find();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbGuardar;
    public static javax.swing.JComboBox<String> jcEstado;
    public static com.toedter.calendar.JDateChooser jdFecha;
    public static javax.swing.JSpinner jsHora;
    public static javax.swing.JSpinner jsMinutos;
    public static javax.swing.JTextField jtApellido;
    public static javax.swing.JTextField jtCantPersonas;
    public static javax.swing.JTextField jtDni;
    private javax.swing.JLabel jtFecha;
    public static javax.swing.JLabel jtId;
    public static javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    public class Fondopantalla extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/imagenes/rescubierto2.jpeg/")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
