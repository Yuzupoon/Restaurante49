package ulpprestaurante49.vistas;

import java.awt.event.KeyEvent;
import java.sql.Time;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import restaurante.Entidades.Reserva;
import restaurante.accesoData.ReservaData;

public class GenerarReserva extends javax.swing.JFrame {

    public GenerarReserva() {
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
        jbGuardar = new javax.swing.JButton();
        jtFecha = new javax.swing.JLabel();
        jbAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RESERVA");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDO:");

        jLabel4.setText("DNI:");

        jLabel5.setText("FECHA:");

        jLabel6.setText("CANT.PERSONAS:");

        jLabel7.setText("HORA:");

        jLabel8.setText("ESTADO:");

        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));

        jsHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jsHora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jsMinutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 10));

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbAtras.setText("ATRAS");
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
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jbAtras))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(jtApellido)
                                .addComponent(jtDni)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jsHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jsMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(47, 47, 47)
                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbAtras)
                .addGap(13, 13, 13))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//        int limitereservas = 0;
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        Reserva res = new Reserva();
        ReservaData resdata = new ReservaData();
        int error = 0;
        int aviso = 0;
        int alerta = 0;
        int cantidades = 4;
        LocalDate Ingreso = null;
        LocalDate hoy = LocalDate.now();
        try {
//            if (jtNombre.getText().isEmpty()
//                    || jtApellido.getText().isEmpty()
//                    || jtCantPersonas.getText().isEmpty()
//                    || jtDni.getText().isEmpty()
//                    || jdFecha.getDate() == null) {
//                JOptionPane.showMessageDialog(null, "Porfavor Flac@ Rellename los campos");
//            } else {
            res.setNombre(jtNombre.getText());
            res.setApellido(jtApellido.getText());
            if (!jtDni.getText().equals("")) {
                for (Reserva listaReserva : resdata.listaReservas()) {
                    if (Integer.parseInt(jtDni.getText()) == listaReserva.getDni()) {
                        aviso = 1;
                    }
                }
                res.setDni(Integer.parseInt(jtDni.getText()));
            }
            res.setCantidadPersonas(Integer.parseInt(jtCantPersonas.getText()));
            System.out.println("1" + cantidades);
            for (Reserva reserva : resdata.listaReservasXFecha(jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())) {
                if (reserva.getFecha().equals(jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())) {
                    cantidades--;
                    System.out.println(cantidades);
                }
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
//            }
            if (jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate() != null) {
                Ingreso = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona una fecha porfavor");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Profavor rellename todos los campos");
        }
        System.out.println(Ingreso);

        if (hoy.equals(Ingreso)) {

            MesPrincipal mesp = new MesPrincipal();
            resdata.crearReserva(res);
            mesp.setVisible(true);
            mesp.setLocationRelativeTo(null);
            this.dispose();

        } else if (!hoy.equals(Ingreso) && Ingreso != null) {
            if (cantidades > 0) {
                MesPrincipal mesp = new MesPrincipal();
                resdata.crearReserva(res);
                mesp.setVisible(true);
                mesp.setLocationRelativeTo(null);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "No quedan mas reservas para el dia seleccionado");
            }

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange
        if (jdFecha.getDate() != null) {
            LocalDate fecha = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            jtFecha.setText(fecha + "");
        }
    }//GEN-LAST:event_jdFechaPropertyChange

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
    private javax.swing.JComboBox<String> jcEstado;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JSpinner jsHora;
    private javax.swing.JSpinner jsMinutos;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCantPersonas;
    private javax.swing.JTextField jtDni;
    private javax.swing.JLabel jtFecha;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
