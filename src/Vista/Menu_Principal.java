/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Diego
 */
public class Menu_Principal extends javax.swing.JFrame {

    private boolean repetirCarga = true;
    ActionListener mostrarCarga = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (repetirCarga) {
                    lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuFinal.gif")));
                    lblPlay1.setVisible(false);
                    lblHelp.setVisible(false);
                    lblOption.setVisible(false);
                    lblScore.setVisible(false);
                }
                else{
                    tCarga.stop();
                    lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuFinal.png")));
                    lblPlay1.setVisible(true);
                    lblHelp.setVisible(true);
                    lblOption.setVisible(true);
                    lblScore.setVisible(true);
                }
            }
        };
    Timer tCarga = new Timer(2000,mostrarCarga);
    public Menu_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        tCarga.start();
        repetirCarga = false;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblScore = new javax.swing.JLabel();
        lblOption = new javax.swing.JLabel();
        lblPlay1 = new javax.swing.JLabel();
        lblHelp = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblScore.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        lblScore.setText("Score #");
        lblScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblScoreMouseClicked(evt);
            }
        });
        getContentPane().add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 505, 120, 50));

        lblOption.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        lblOption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOption.setText("Options");
        lblOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOptionMouseClicked(evt);
            }
        });
        getContentPane().add(lblOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 325, 110, 50));

        lblPlay1.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        lblPlay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlay1.setText("Play");
        lblPlay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlay1MouseClicked(evt);
            }
        });
        getContentPane().add(lblPlay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 235, 105, 40));

        lblHelp.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        lblHelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHelp.setText("Help");
        lblHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHelpMouseClicked(evt);
            }
        });
        getContentPane().add(lblHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 405, 140, 50));

        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuFinal.png"))); // NOI18N
        lblFondo.setToolTipText("");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPlay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlay1MouseClicked
        Seleccion_Modalidad c = new Seleccion_Modalidad();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblPlay1MouseClicked

    private void lblOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOptionMouseClicked
        Formulario_Ayuda c = new Formulario_Ayuda();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblOptionMouseClicked

    private void lblScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblScoreMouseClicked
        Puntuaciones_Individuales c = new Puntuaciones_Individuales();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblScoreMouseClicked

    private void lblHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHelpMouseClicked
        Instrucciones c = new Instrucciones();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblHelpMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JLabel lblOption;
    private javax.swing.JLabel lblPlay1;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
