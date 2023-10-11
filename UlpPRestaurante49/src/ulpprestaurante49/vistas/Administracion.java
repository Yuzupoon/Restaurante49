package ulpprestaurante49.vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import restaurante.Entidades.Mesero;
import restaurante.accesoData.MeseroData;

public class Administracion extends javax.swing.JFrame {

    Fondopantalla frame = new Fondopantalla();
    MeseroData meseroData = new MeseroData();

    public Administracion() {
        this.setLocationRelativeTo(null);
        this.setContentPane(frame);
        initComponents();
        armarCabecera();
        llenartabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaMozo = new javax.swing.JTable();
        jbCrearMozo = new javax.swing.JButton();
        jbEliminarMozo = new javax.swing.JButton();
        jbCerrarSesion = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jtUsuario = new javax.swing.JTextField();
        jtContrasenia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbModificarMozo = new javax.swing.JButton();
        jtAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("SISTEMA ADMINISTRADOR DE MOZOS");

        jTablaMozo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablaMozo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMozoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaMozo);

        jbCrearMozo.setText("CREAR");

        jbEliminarMozo.setText("ELIMINAR ");
        jbEliminarMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarMozoActionPerformed(evt);
            }
        });

        jbCerrarSesion.setText("CERRAR SESION");
        jbCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSesionActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        jLabel3.setText("USUARIO");

        jLabel4.setText("CONTRASEÑA");

        jbModificarMozo.setText("MODIFICAR");
        jbModificarMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarMozoActionPerformed(evt);
            }
        });

        jtAtras.setText("ATRAS");
        jtAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 26, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addComponent(jbEliminarMozo)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jbCrearMozo)
                        .addGap(44, 44, 44)
                        .addComponent(jbModificarMozo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCerrarSesion)
                        .addGap(65, 65, 65)
                        .addComponent(jtAtras)
                        .addGap(81, 81, 81))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jbEliminarMozo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrearMozo)
                    .addComponent(jbModificarMozo)
                    .addComponent(jbCerrarSesion)
                    .addComponent(jtAtras))
                .addContainerGap(65, Short.MAX_VALUE))
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

    private void jTablaMozoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMozoMouseClicked
        int fila = jTablaMozo.getSelectedRow();
        Mesero mes = new Mesero();
        int dato = (int) modelo.getValueAt(fila, 0);
        mes = meseroData.buscarMeseroPorId(dato);
        if (fila != -1) {
            jtNombre.setText(mes.getNombre());
            jtUsuario.setText(mes.getUsuario());
            jtContrasenia.setText(mes.getContraseña());
        }
    }//GEN-LAST:event_jTablaMozoMouseClicked

    private void jbEliminarMozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarMozoActionPerformed
        int fila = jTablaMozo.getSelectedRow();
        int id = (Integer) modelo.getValueAt(fila, 0);

        if (fila != -1) {
            for (Mesero mesero : meseroData.listaMesero()) {
                if (mesero.getIdMesero() == id) {
                    meseroData.eliminarMesero(id);
                }

            }
            borradofilas();
            llenartabla();
            jtNombre.setText("");
            jtUsuario.setText("");
            jtContrasenia.setText("");

        }
    }//GEN-LAST:event_jbEliminarMozoActionPerformed

    private void jbModificarMozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarMozoActionPerformed
        int fila = jTablaMozo.getSelectedRow();
        Mesero mesero = new Mesero();
        int error = 0;
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un Mesero porfavor");
        } else {
            int id = (Integer) modelo.getValueAt(fila, 0);
            if (jtContrasenia.getText().isEmpty()
                    || jtNombre.getText().isEmpty()
                    || jtUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Porfavor no dejar campos vacios");
            } else {
                MeseroData meserData = new MeseroData();
                for (Mesero meser : meserData.listaMesero()) {
                    if (meser.getIdMesero() == id) {
                        mesero.setIdMesero(id);
                        if(soloLetras(jtNombre.getText()) == true){
                        mesero.setNombre(jtNombre.getText());
                        }else{ 
                            JOptionPane.showMessageDialog(this, "Porfavor ingresa solo Letras en la casilla nombre");
                            jtNombre.setText("");
                            error = 1;
                        }
                        mesero.setContraseña(jtContrasenia.getText());
                        mesero.setUsuario(jtUsuario.getText());
                    }

                }
            }
            if (error == 0){
                meseroData.modificarMesero(mesero);
                borradofilas();
                llenartabla();
                jtContrasenia.setText("");
                jtNombre.setText("");
                jtUsuario.setText("");
            }
        }
    }//GEN-LAST:event_jbModificarMozoActionPerformed

    private void jbCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSesionActionPerformed
        Home home = new Home();
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbCerrarSesionActionPerformed

    private void jtAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAtrasActionPerformed
        PrincipalAdm principal = new PrincipalAdm();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jtAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaMozo;
    private javax.swing.JButton jbCerrarSesion;
    private javax.swing.JButton jbCrearMozo;
    private javax.swing.JButton jbEliminarMozo;
    private javax.swing.JButton jbModificarMozo;
    private javax.swing.JButton jtAtras;
    private javax.swing.JTextField jtContrasenia;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables

    public class Fondopantalla extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/imagenes/mozo.jpg/")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    public DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public void armarCabecera() {
        modelo.addColumn("IdMesero");
        modelo.addColumn("Nombre");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        jTablaMozo.setModel(modelo);
    }

    public void llenartabla() {

        for (Mesero mesero : meseroData.listaMesero()) {
            modelo.addRow(new Object[]{
                mesero.getIdMesero(),
                mesero.getNombre(),
                mesero.getUsuario(),
                mesero.getContraseña()
            });
        }
    }

    public void borradofilas() {

        int fila = jTablaMozo.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {

            modelo.removeRow(i);

        }
    }

    public static boolean soloLetras(String cadena) {

        Pattern pattern = Pattern.compile("[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]+");
        Matcher matcher = pattern.matcher(cadena);

        return !matcher.find();
    }
}
