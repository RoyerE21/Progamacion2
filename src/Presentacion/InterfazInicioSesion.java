/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import javax.swing.JOptionPane;

/**
 *
 * "@author regr9"
 */
public class InterfazInicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InterfazInicioSesion
     */
    public InterfazInicioSesion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblUsuario = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JTextField();
        lblUserIcon = new javax.swing.JLabel();
        lblPanel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtContraseña = new javax.swing.JTextField();
        imgFrame2 = new javax.swing.JLabel();
        imgFrame3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegister.setText("Crear una Cuenta nueva");
        btnRegister.setBorder(null);
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, -1, -1));

        btnLogin.setBackground(new java.awt.Color(102, 102, 102));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log in");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 370, 40));

        lblUsuario.setText("Usuario:");
        lblUsuario.setBorder(null);
        lblUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 50, 20));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 380, 40));

        lblContraseña.setText("Contraseña:");
        lblContraseña.setBorder(null);
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        lblUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatars_ngg.png"))); // NOI18N
        lblUserIcon.setText("jLabel3");
        jPanel1.add(lblUserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 80, 160));

        lblPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Header_Grey.png"))); // NOI18N
        lblPanel.setText("jLabel1");
        lblPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 450, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 450, 370));

        imgFrame2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame2.png"))); // NOI18N
        imgFrame2.setText("jLabel5");
        jPanel1.add(imgFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 930, 590));

        imgFrame3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame2.png"))); // NOI18N
        imgFrame3.setText("jLabel4");
        jPanel1.add(imgFrame3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 890, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1335, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUsuarioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
               String Usuario = "admin";
       String Contraseña = "1234";
       
       //String Pass = new String(Password.getPassword());
       
       if(txtUsuario.getText().equals(Usuario) && txtContraseña.getText().equals(Contraseña)){
             JOptionPane.showMessageDialog(null, "Usuario creado");
           InterfazTomaDatos TM = new InterfazTomaDatos();
           TM.setVisible(true);
           this.dispose();
           
        
       
        TM.setVisible(true);
        TM.setResizable(false);
        TM.setLocationRelativeTo(null);
        
        
        
         
       }else{
           JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
       }
    }
    /**
     * Logica para el botón log in. Validar si el usuario es correcto
     */
    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {                                            
    // InterfazTomaDatos TM = new InterfazTomaDatos();
        //  this.dispose();
         //  TM.setVisible(true);
           //this.dispose();
           
           InterfazTomaDatos TM = new InterfazTomaDatos();    
        TM.setVisible(true);
        TM.setResizable(false);
        TM.setLocationRelativeTo(null);
         

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
    
    }//GEN-LAST:event_btnLoginMouseClicked
    
     /**
     * Logica para el botón log in. Validar si el usuario es correcto
     */
  /*  
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
 
    }//GEN-LAST:event_btnRegisterActionPerformed
*/
    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
    
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed
    
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
            java.util.logging.Logger.getLogger(InterfazInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel imgFrame2;
    private javax.swing.JLabel imgFrame3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lblContraseña;
    private javax.swing.JLabel lblPanel;
    private javax.swing.JLabel lblUserIcon;
    private javax.swing.JTextField lblUsuario;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
