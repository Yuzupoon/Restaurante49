package ulpprestaurante49.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class AdmPrincipal extends javax.swing.JFrame {

    Fondopantalla frame = new Fondopantalla();

    public AdmPrincipal() {
        this.setLocationRelativeTo(null);
        this.setContentPane(frame);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbMeseros = new javax.swing.JButton();
        jbProductos = new javax.swing.JButton();
        jbMozo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);

        jbMeseros.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jbMeseros.setForeground(new java.awt.Color(255, 255, 255));
        jbMeseros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Mesero.png"))); // NOI18N
        jbMeseros.setBorder(null);
        jbMeseros.setContentAreaFilled(false);
        jbMeseros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMeseros.setMaximumSize(new java.awt.Dimension(100, 22));
        jbMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMeserosActionPerformed(evt);
            }
        });

        jbProductos.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Productos.png"))); // NOI18N
        jbProductos.setBorder(null);
        jbProductos.setContentAreaFilled(false);
        jbProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbProductos.setMaximumSize(new java.awt.Dimension(100, 22));
        jbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosActionPerformed(evt);
            }
        });

        jbMozo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jbMozo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vista Mozo.png"))); // NOI18N
        jbMozo.setBorder(null);
        jbMozo.setContentAreaFilled(false);
        jbMozo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMozo.setMaximumSize(new java.awt.Dimension(100, 22));
        jbMozo.setMinimumSize(new java.awt.Dimension(91, 22));
        jbMozo.setPreferredSize(new java.awt.Dimension(91, 22));
        jbMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMozoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pedidos realizados.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMaximumSize(new java.awt.Dimension(100, 22));
        jButton1.setMinimumSize(new java.awt.Dimension(91, 22));
        jButton1.setPreferredSize(new java.awt.Dimension(91, 22));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMozo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
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

    private void jbMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMeserosActionPerformed
        AdmMesero principal = new AdmMesero();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbMeserosActionPerformed

    private void jbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosActionPerformed

        AdmProducto principal = new AdmProducto();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_jbProductosActionPerformed

    private void jbMozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMozoActionPerformed
        MesPrincipal principal = new MesPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbMozoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       PedidosTotales principal = new PedidosTotales();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbMeseros;
    private javax.swing.JButton jbMozo;
    private javax.swing.JButton jbProductos;
    // End of variables declaration//GEN-END:variables

    public class Fondopantalla extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/imagenes/meseros_product.jpg/")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
