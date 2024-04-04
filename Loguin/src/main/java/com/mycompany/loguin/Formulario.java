
package com.mycompany.loguin;


public class Formulario extends javax.swing.JFrame {

   
    public Formulario() { //constructor
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel_principal = new javax.swing.JPanel();
        jlbl_usuario = new javax.swing.JLabel();
        jlbl_contrasena = new javax.swing.JLabel();
        txt_usario = new javax.swing.JTextField();
        txt_contrasena = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loguin");

        Jpanel_principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbl_usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_usuario.setText("Usuario: ");

        jlbl_contrasena.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_contrasena.setText("Contraseña: ");

        txt_usario.setToolTipText("Ingrese su nombre de usuario");
        txt_usario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usarioActionPerformed(evt);
            }
        });

        txt_contrasena.setToolTipText("Ingrese su contraseña");
        txt_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contrasenaActionPerformed(evt);
            }
        });

        btn_ingresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setToolTipText("Iniciar Sesion");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setToolTipText("Cierra la aplicación");

        javax.swing.GroupLayout Jpanel_principalLayout = new javax.swing.GroupLayout(Jpanel_principal);
        Jpanel_principal.setLayout(Jpanel_principalLayout);
        Jpanel_principalLayout.setHorizontalGroup(
            Jpanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_principalLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(Jpanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Jpanel_principalLayout.createSequentialGroup()
                        .addComponent(jlbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_usario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Jpanel_principalLayout.createSequentialGroup()
                        .addGroup(Jpanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_ingresar)
                            .addComponent(jlbl_contrasena))
                        .addGroup(Jpanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Jpanel_principalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_contrasena))
                            .addGroup(Jpanel_principalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cancelar)
                                .addGap(44, 44, 44)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        Jpanel_principalLayout.setVerticalGroup(
            Jpanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_principalLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(Jpanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_usuario)
                    .addComponent(txt_usario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(Jpanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_contrasena)
                    .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(Jpanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_cancelar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Jpanel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Jpanel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usarioActionPerformed

    private void txt_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contrasenaActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        int numeroLineas=0;
        int indix =0;
        String [] usurios= null;
        String linea;
    }//GEN-LAST:event_btn_ingresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel_principal;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel jlbl_contrasena;
    private javax.swing.JLabel jlbl_usuario;
    private javax.swing.JPasswordField txt_contrasena;
    private javax.swing.JTextField txt_usario;
    // End of variables declaration//GEN-END:variables
}
