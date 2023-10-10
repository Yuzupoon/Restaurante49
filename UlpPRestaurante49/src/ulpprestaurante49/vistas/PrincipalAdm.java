package ulpprestaurante49.vistas;

public class PrincipalAdm extends javax.swing.JFrame {

    public PrincipalAdm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbMeseros = new javax.swing.JButton();
        jbProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbMeseros.setText("MESEROS");
        jbMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMeserosActionPerformed(evt);
            }
        });

        jbProductos.setText("PRODUCTOS");
        jbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbProductos)
                    .addComponent(jbMeseros))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jbMeseros)
                .addGap(68, 68, 68)
                .addComponent(jbProductos)
                .addContainerGap(228, Short.MAX_VALUE))
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
    }// </editor-fold>                        

    private void jbMeserosActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Administracion principal = new Administracion();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }                                         

    private void jbProductosActionPerformed(java.awt.event.ActionEvent evt) {                                            

        Productos principal = new Productos();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }                                           


    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbMeseros;
    private javax.swing.JButton jbProductos;
    // End of variables declaration                   
}
