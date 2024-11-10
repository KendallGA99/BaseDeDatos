/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto2;

/**
 *
 * @author KendallGamboa
 */
public class IngresarVuelo extends javax.swing.JFrame {

    /**
     * Creates new form IngresarVuelo
     */
    public IngresarVuelo() {
        initComponents();
        
        setExtendedState(IngresarVuelo.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIdUsuario = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelPais = new javax.swing.JLabel();
        jTextFieldApellido1 = new javax.swing.JTextField();
        jLabelCiudad = new javax.swing.JLabel();
        jTextFieldApellido2 = new javax.swing.JTextField();
        jButtonIngresarV = new javax.swing.JButton();
        jLabelAvion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelCiudad1 = new javax.swing.JLabel();
        jTextFieldApellido3 = new javax.swing.JTextField();
        jLabelCiudad2 = new javax.swing.JLabel();
        jTextFieldApellido4 = new javax.swing.JTextField();
        jLabelCiudad3 = new javax.swing.JLabel();
        jTextFieldApellido5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIdUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelIdUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdUsuario.setText("Nombre:");
        getContentPane().add(jLabelIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, -1, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, 370, -1));

        jLabelPais.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPais.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPais.setText("Primer apellido:");
        getContentPane().add(jLabelPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, -1, -1));

        jTextFieldApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, 370, -1));

        jLabelCiudad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCiudad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCiudad.setText("Segundo apellido:");
        getContentPane().add(jLabelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, -1, -1));

        jTextFieldApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, 370, -1));

        jButtonIngresarV.setBackground(new java.awt.Color(0, 0, 153));
        jButtonIngresarV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonIngresarV.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngresarV.setText("Registrar Vuelo");
        jButtonIngresarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarVActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 810, 220, 50));

        jLabelAvion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(jLabelAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, -30, 500, 490));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VuelosCR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 250, 100));

        jButtonVolver.setBackground(new java.awt.Color(0, 0, 153));
        jButtonVolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setText("<--");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(0, 0, 153));
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("X");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 10, 50, -1));

        jLabelCiudad1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCiudad1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCiudad1.setText("Sexo M/F/O:");
        getContentPane().add(jLabelCiudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, -1, -1));

        jTextFieldApellido3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 370, -1));

        jLabelCiudad2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCiudad2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCiudad2.setText("Celular:");
        getContentPane().add(jLabelCiudad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 630, -1, -1));

        jTextFieldApellido4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 630, 370, -1));

        jLabelCiudad3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCiudad3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCiudad3.setText("Correo alectrónico:");
        getContentPane().add(jLabelCiudad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 670, -1, -1));

        jTextFieldApellido5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 670, 370, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HD Desktop Blue206572979.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        Principal Principal = new Principal();

        Principal.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido1ActionPerformed

    private void jTextFieldApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido2ActionPerformed

    private void jButtonIngresarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarVActionPerformed

    }//GEN-LAST:event_jButtonIngresarVActionPerformed

    private void jTextFieldApellido3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido3ActionPerformed

    private void jTextFieldApellido4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido4ActionPerformed

    private void jTextFieldApellido5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido5ActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarVuelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresarV;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAvion;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelCiudad1;
    private javax.swing.JLabel jLabelCiudad2;
    private javax.swing.JLabel jLabelCiudad3;
    private javax.swing.JLabel jLabelIdUsuario;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JTextField jTextFieldApellido1;
    private javax.swing.JTextField jTextFieldApellido2;
    private javax.swing.JTextField jTextFieldApellido3;
    private javax.swing.JTextField jTextFieldApellido4;
    private javax.swing.JTextField jTextFieldApellido5;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}