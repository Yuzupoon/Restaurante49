package ulpprestaurante49.vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import restaurante.Entidades.Mesero;
import restaurante.accesoData.MeseroData;

public class Login extends javax.swing.JFrame {

    Fondopantalla frame = new Fondopantalla();
    MeseroData meseroData = new MeseroData();

    public Login() {
        this.setLocationRelativeTo(null);
        this.setContentPane(frame);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jpContrasena = new javax.swing.JPasswordField();
        jbLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA");

        jpContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpContrasenaKeyPressed(evt);
            }
        });

        jbLogin.setBackground(new java.awt.Color(102, 102, 102));
        jbLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Ingresar.png"))); // NOI18N
        jbLogin.setBorderPainted(false);
        jbLogin.setContentAreaFilled(false);
        jbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLogin.setDefaultCapable(false);
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)))
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLogin)
                .addGap(205, 205, 205))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbLogin)
                .addContainerGap(288, Short.MAX_VALUE))
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

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed

        String admi = "Administracion";
        String usu = "proyecto49";
        if (jtUsuario.getText().equals(admi) && jpContrasena.getText().equals(usu)) {
            AdmPrincipal adm = new AdmPrincipal();
            adm.setVisible(true);
            adm.setLocationRelativeTo(null);
            this.dispose();
        } else {
            int acierto = 0;

            for (Mesero mesero : meseroData.listaMesero()) {

                if (jtUsuario.getText().equals(mesero.getUsuario()) && jpContrasena.getText().equals(mesero.getContraseña())) {
                    acierto = 1;
                }
            }

            if (acierto == 1) {
                MesPrincipal mesero = new MesPrincipal();
                mesero.setVisible(true);
                mesero.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña son incorrectos");
                jpContrasena.setText("");
            }
        }
//      AdmPrincipal mes = new AdmPrincipal();
//      mes.setVisible(true);
//      mes.setLocationRelativeTo(null);
//      dispose();
    }//GEN-LAST:event_jbLoginActionPerformed

    private void jpContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpContrasenaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String admi = "Administracion";
            String usu = "proyecto49";
            if (jtUsuario.getText().equals(admi) && jpContrasena.getText().equals(usu)) {
                AdmPrincipal adm = new AdmPrincipal();
                adm.setVisible(true);
                adm.setLocationRelativeTo(null);
                this.dispose();
            } else {
                int acierto = 0;

                for (Mesero mesero : meseroData.listaMesero()) {

                    if (jtUsuario.getText().equals(mesero.getUsuario()) && jpContrasena.getText().equals(mesero.getContraseña())) {
                        acierto = 1;
                    }
                }

                if (acierto == 1) {
                    MesPrincipal mesero = new MesPrincipal();
                    mesero.setVisible(true);
                    mesero.setLocationRelativeTo(null);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña son incorrectos");
                    jpContrasena.setText("");
                }
            }

        }

    }//GEN-LAST:event_jpContrasenaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbLogin;
    public static javax.swing.JPasswordField jpContrasena;
    public static javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables

    public class Fondopantalla extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/imagenes/mejores_restaurantes.jpg/")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
