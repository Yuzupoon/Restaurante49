package ulpprestaurante49.vistas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import restaurante.Entidades.Mesero;
import restaurante.accesoData.MeseroData;

public class AdmMesero extends javax.swing.JFrame {

    Fondopantalla frame = new Fondopantalla();
    MeseroData meseroData = new MeseroData();

    public AdmMesero() {
        this.setLocationRelativeTo(null);
        this.setContentPane(frame);
        initComponents();
        armarCabecera();
        llenartabla();
        Font fuente = new Font("Segoe UI", Font.PLAIN, 12);
        jbCerrarSesion.setFont(fuente);
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
        jbLimpiar = new javax.swing.JButton();
        jlControl = new javax.swing.JLabel();

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
        jbCrearMozo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCrearMozoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCrearMozoMouseExited(evt);
            }
        });
        jbCrearMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearMozoActionPerformed(evt);
            }
        });

        jbEliminarMozo.setText("ELIMINAR ");
        jbEliminarMozo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbEliminarMozoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbEliminarMozoMouseExited(evt);
            }
        });
        jbEliminarMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarMozoActionPerformed(evt);
            }
        });

        jbCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jbCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        jbCerrarSesion.setText("CERRAR SESION");
        jbCerrarSesion.setBorder(null);
        jbCerrarSesion.setContentAreaFilled(false);
        jbCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCerrarSesionMouseExited(evt);
            }
        });
        jbCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSesionActionPerformed(evt);
            }
        });

        jtContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtContraseniaKeyReleased(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        jLabel3.setText("USUARIO");

        jLabel4.setText("CONTRASEÑA");

        jbModificarMozo.setText("MODIFICAR");
        jbModificarMozo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbModificarMozoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbModificarMozoMouseExited(evt);
            }
        });
        jbModificarMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarMozoActionPerformed(evt);
            }
        });

        jtAtras.setText("ATRAS");
        jtAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jtAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtAtrasMouseExited(evt);
            }
        });
        jtAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAtrasActionPerformed(evt);
            }
        });

        jbLimpiar.setText("LIMPIAR");
        jbLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbLimpiarMouseExited(evt);
            }
        });
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jlControl.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 26, Short.MAX_VALUE)
                        .addComponent(jbEliminarMozo)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jbCrearMozo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLimpiar)
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlControl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtAtras))
                        .addGap(15, 15, 15))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtContrasenia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)))
                .addGap(152, 152, 152))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2))
                            .addComponent(jbModificarMozo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCerrarSesion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jbEliminarMozo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlControl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrearMozo)
                    .addComponent(jbModificarMozo)
                    .addComponent(jtAtras)
                    .addComponent(jbLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jbCerrarSesion)
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

    private void jTablaMozoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMozoMouseClicked
        int fila = jTablaMozo.getSelectedRow();
        Mesero mes = new Mesero();
        int dato = (int) modelo.getValueAt(fila, 0);
        mes = meseroData.buscarMeseroPorId(dato);
        if (fila != -1) {
            jtNombre.setText(mes.getNombre());
            jtUsuario.setText(mes.getUsuario());
            jtContrasenia.setText(mes.getContraseña());
            jlControl.setText("");
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
                        if (soloLetras(jtNombre.getText()) == true) {
                            mesero.setNombre(jtNombre.getText());
                        } else {
                            JOptionPane.showMessageDialog(this, "Porfavor ingresa solo Letras en la casilla nombre");
                            jtNombre.setText("");
                            error = 1;
                        }
                        mesero.setContraseña(jtContrasenia.getText());
                        mesero.setUsuario(jtUsuario.getText());
                    }

                }
            }
            if (error == 0) {
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
        AdmPrincipal principal = new AdmPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jtAtrasActionPerformed

    private void jbCrearMozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearMozoActionPerformed

        Mesero mesero = new Mesero();
        int error = 0;
        if (jtNombre.getText().isEmpty()
                || jtUsuario.getText().isEmpty()
                || jtContrasenia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellene las casillas vacias");
        } else {
            if (soloLetras(jtNombre.getText()) == true) {
                mesero.setNombre(jtNombre.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Porfavor ingresa solo Letras en la casilla nombre");
                jtNombre.setText("");
                error = 1;
            }
            mesero.setUsuario(jtUsuario.getText());
            mesero.setContraseña(jtContrasenia.getText());
            if (error == 0) {
                meseroData.crearMesero(mesero);
                jtNombre.setText("");
                jtUsuario.setText("");
                jtContrasenia.setText("");
                borradofilas();
                llenartabla();
            }
        }
    }//GEN-LAST:event_jbCrearMozoActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtNombre.setText("");
        jtUsuario.setText("");
        jtContrasenia.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarSesionMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbCerrarSesion.setForeground(Color.red);
        Font font1 = new Font("Segoe UI", Font.BOLD, 12);
        jbCerrarSesion.setFont(font1);
    }//GEN-LAST:event_jbCerrarSesionMouseEntered

    private void jbCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarSesionMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jbCerrarSesion.setForeground(Color.black);
        Font font2 = new Font("Segoe UI", Font.PLAIN, 12);
        jbCerrarSesion.setFont(font2);
    }//GEN-LAST:event_jbCerrarSesionMouseExited

    private void jbCrearMozoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCrearMozoMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jbCrearMozoMouseEntered

    private void jbCrearMozoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCrearMozoMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jbCrearMozoMouseExited

    private void jbModificarMozoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbModificarMozoMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jbModificarMozoMouseEntered

    private void jbModificarMozoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbModificarMozoMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jbModificarMozoMouseExited

    private void jbLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimpiarMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jbLimpiarMouseEntered

    private void jbLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimpiarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jbLimpiarMouseExited

    private void jtAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAtrasMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jtAtrasMouseEntered

    private void jtAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAtrasMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jtAtrasMouseExited

    private void jbEliminarMozoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEliminarMozoMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jbEliminarMozoMouseEntered

    private void jbEliminarMozoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEliminarMozoMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jbEliminarMozoMouseExited

    private void jtContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtContraseniaKeyReleased
        int cantidadDeLetras = jtContrasenia.getText().length();
        Font font3 = new Font("Segoe UI", Font.BOLD, 8);
        Color colorRojo = new Color(158, 66, 46);
        Color colorVerde = new Color(29, 113, 27);
        Color colorAmarillo = new Color(154, 155, 34);     
        jlControl.setFont(font3);
        if (cantidadDeLetras==0) {
            jlControl.setText("");
        }
        if (cantidadDeLetras <= 3 && cantidadDeLetras != 0) {
            jlControl.setText("POCO SEGURA");
            jlControl.setForeground(colorRojo);
        }
        if (cantidadDeLetras <= 7 && cantidadDeLetras >= 4 ) {
            jlControl.setText("SEGURA");
            jlControl.setForeground(colorAmarillo);
        }
        if (cantidadDeLetras >= 8) {
            jlControl.setText(" MUY SEGURA");
            jlControl.setForeground(colorVerde);
        }
    }//GEN-LAST:event_jtContraseniaKeyReleased

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
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificarMozo;
    private javax.swing.JLabel jlControl;
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
