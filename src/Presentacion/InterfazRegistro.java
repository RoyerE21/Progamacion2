/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Entidades.Usuario;
import LogicaNegocio.LogicaUsuario;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author regr9
 */
public class InterfazRegistro extends javax.swing.JFrame {

    public InterfazRegistro() {
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

        jplRegister = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        lblContrasena = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextArea();
        txtApellido = new javax.swing.JTextField();
        btnSingup = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        imgFont = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplRegister.setBackground(new java.awt.Color(255, 255, 255));
        jplRegister.setForeground(new java.awt.Color(255, 255, 255));
        jplRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Registro de Usuario3.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jplRegister.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 160, -1));

        lblUsuario.setText("Nombre de Usuario");
        jplRegister.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));
        jplRegister.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 140, 30));
        jplRegister.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 140, 30));
        jplRegister.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 140, 30));

        lblContrasena.setText("Contraseña");
        jplRegister.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        lblMail.setText("Email");
        jplRegister.add(lblMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        lblApellido.setText("Apellidos:");
        jplRegister.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        lblNombre.setText("Nombre:");
        jplRegister.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        txtNombre.setColumns(20);
        txtNombre.setRows(5);
        txtNombre.setText("\n");
        jplRegister.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 140, 30));
        jplRegister.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 140, 30));

        btnSingup.setText("Registrarse");
        btnSingup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSingupMouseClicked(evt);
            }
        });
        btnSingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingupActionPerformed(evt);
            }
        });
        jplRegister.add(btnSingup, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 120, 30));

        jButton1.setText("¿Ya tienes una cuenta?");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jplRegister.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, -1, -1));

        imgFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left_Background.png"))); // NOI18N
        imgFont.setText("jLabel1");
        imgFont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jplRegister.add(imgFont, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 650, 540));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jplRegister.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 940, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jplRegister.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 930, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 1330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        InterfazInicioSesion newframe = new InterfazInicioSesion();

        newframe.setVisible(true);

        
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnSingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingupActionPerformed
      
 
        LogicaUsuario objLogicaUsuario = new LogicaUsuario();
        Usuario objUsuario = new Usuario();
        
        objUsuario.setNombreUsuario(txtUser.getText());
        objUsuario.setApellidos(txtApellido.getText());
        objUsuario.setCorreo(txtMail.getText());
        objUsuario.setNombre(txtNombre.getText());
        objUsuario.setContraseña(txtContrasena.getText());
        
        
        
        try {
            objLogicaUsuario.insert(objUsuario);
            JOptionPane.showMessageDialog(null, "Usuario Creado Exitosamente", "Información Sisitema", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(null, "Errro Al Crear El Usuario "+ex.getMessage(), "Error de Sisitema", JOptionPane.ERROR_MESSAGE);
            
        }
        
    
        
        
        
        
        
        
  


        InterfazInicioSesion newframe = new InterfazInicioSesion();

        newframe.setVisible(true);
        

      
    }//GEN-LAST:event_btnSingupActionPerformed

    /**
     * Botón para validar que los datos del registro esten correctos
     */

    private void btnSingupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSingupMouseClicked
        InterfazInicioSesion newframe = new InterfazInicioSesion();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnSingupMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSingup;
    private javax.swing.JLabel imgFont;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jplRegister;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextArea txtNombre;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
