/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mecanica;

import decorador.Accidente;
import decorador.Robo;
import decorador.SeguroBasico;
import decorador.SeguroCompleto;
import decorador.SeguroMedio;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Seguro extends javax.swing.JFrame {

    /**
     * Creates new form SEguro
     */
    public Seguro() {
        initComponents();

        this.setLocationRelativeTo(null);
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
        jbntBasico = new javax.swing.JButton();
        jbtnMedio = new javax.swing.JButton();
        jbtnCompleto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtnRobo = new javax.swing.JButton();
        jbtnAccidente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbntBasico.setText("Basico");
        jbntBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntBasicoActionPerformed(evt);
            }
        });

        jbtnMedio.setText("Medio");
        jbtnMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMedioActionPerformed(evt);
            }
        });

        jbtnCompleto.setText("Completo");
        jbtnCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCompletoActionPerformed(evt);
            }
        });

        jLabel1.setText("SEGUROS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jbntBasico)
                .addGap(38, 38, 38)
                .addComponent(jbtnMedio)
                .addGap(36, 36, 36)
                .addComponent(jbtnCompleto)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnMedio)
                    .addComponent(jbtnCompleto)
                    .addComponent(jbntBasico))
                .addGap(34, 34, 34))
        );

        jbtnRobo.setText("Robo");
        jbtnRobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRoboActionPerformed(evt);
            }
        });

        jbtnAccidente.setText("Accidente");
        jbtnAccidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAccidenteActionPerformed(evt);
            }
        });

        jLabel2.setText("ADICIONES AL SEGURO");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jbtnRobo)
                        .addGap(61, 61, 61)
                        .addComponent(jbtnAccidente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAccidente)
                    .addComponent(jbtnRobo))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbntBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntBasicoActionPerformed
        basico();
    }//GEN-LAST:event_jbntBasicoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMedioActionPerformed
        medio();
    }//GEN-LAST:event_jbtnMedioActionPerformed

    private void jbtnCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCompletoActionPerformed
        completo();
    }//GEN-LAST:event_jbtnCompletoActionPerformed

    private void jbtnRoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRoboActionPerformed
        robo();
    }//GEN-LAST:event_jbtnRoboActionPerformed

    private void jbtnAccidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAccidenteActionPerformed
        accidente();
    }//GEN-LAST:event_jbtnAccidenteActionPerformed

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
            java.util.logging.Logger.getLogger(Seguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seguro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbntBasico;
    private javax.swing.JButton jbtnAccidente;
    private javax.swing.JButton jbtnCompleto;
    private javax.swing.JButton jbtnMedio;
    private javax.swing.JButton jbtnRobo;
    // End of variables declaration//GEN-END:variables

    private void basico() {
        SeguroBasico seguroBasico = new SeguroBasico();
        JOptionPane.showConfirmDialog(null, seguroBasico.getDescripcion() + "\n" + seguroBasico.valor() + "$ ", "Seguro Básico", WIDTH);
    }

    private void medio() {
        SeguroMedio seguroMedio = new SeguroMedio();
        JOptionPane.showConfirmDialog(null, seguroMedio.getDescripcion() + "\n" + seguroMedio.valor() + "$ ", "Seguro Medio", WIDTH);
    }

    private void completo() {
        SeguroCompleto seguroCompleto = new SeguroCompleto();
        JOptionPane.showConfirmDialog(null, seguroCompleto.getDescripcion() + "\n" + seguroCompleto.valor() + "$ ", "Seguro Medio", WIDTH);
    }

    private void robo() {
        Robo robo = new Robo();
        JOptionPane.showConfirmDialog(null, robo.getDescripcion() + "\n" + robo.valor() + "$ ", "Seguro Medio", WIDTH);
    }

    private void accidente() {
        Accidente accidente = new Accidente();
        JOptionPane.showConfirmDialog(null, accidente.getDescripcion() + "\n" + accidente.valor() + "$ ", "Seguro Medio", WIDTH);

    }
}
