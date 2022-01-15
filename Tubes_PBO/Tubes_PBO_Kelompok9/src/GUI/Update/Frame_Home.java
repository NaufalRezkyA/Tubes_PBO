/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Update;
import GUI.Data.*;

/**
 *
 * @author ASUS
 */
public class Frame_Home extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Home
     */
    public Frame_Home() {
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

        jLabel1 = new javax.swing.JLabel();
        btn_administrator = new javax.swing.JButton();
        btn_pasien = new javax.swing.JButton();
        btn_terapi = new javax.swing.JButton();
        btn_dokter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 240, 270, 40));

        btn_administrator.setBackground(new java.awt.Color(204, 204, 0));
        btn_administrator.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_administrator.setText("Administrator");
        btn_administrator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_administratorMouseClicked(evt);
            }
        });
        btn_administrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_administratorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_administrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        btn_pasien.setBackground(new java.awt.Color(255, 0, 255));
        btn_pasien.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_pasien.setText("Pasien");
        btn_pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pasienMouseClicked(evt);
            }
        });
        btn_pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pasienActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 132, -1));

        btn_terapi.setBackground(new java.awt.Color(255, 204, 102));
        btn_terapi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_terapi.setText("Terapi");
        btn_terapi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_terapiMouseClicked(evt);
            }
        });
        btn_terapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_terapiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_terapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 123, -1));

        btn_dokter.setBackground(new java.awt.Color(51, 255, 255));
        btn_dokter.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_dokter.setText("Dokter");
        btn_dokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dokterMouseClicked(evt);
            }
        });
        btn_dokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dokterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 111, -1));

        jPanel1.setBackground(new java.awt.Color(37, 41, 88));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dokterActionPerformed

    private void btn_pasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pasienMouseClicked
        // TODO add your handling code here:
        Frame_Pasien jF = new Frame_Pasien();
        jF.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_pasienMouseClicked

    private void btn_terapiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_terapiMouseClicked
        // TODO add your handling code here:
        Frame_DataFarmasi jF = new Frame_DataFarmasi();
        jF.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_terapiMouseClicked

    private void btn_administratorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_administratorMouseClicked
        // TODO add your handling code here:
        Frame_Login jF_1 = new Frame_Login();
        jF_1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_administratorMouseClicked

    private void btn_dokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dokterMouseClicked
        // TODO add your handling code here:
        Frame_DataDokter jF_1 = new Frame_DataDokter();
        jF_1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_dokterMouseClicked

    private void btn_pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pasienActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_pasienActionPerformed

    private void btn_terapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_terapiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_terapiActionPerformed

    private void btn_administratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_administratorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_administratorActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_administrator;
    private javax.swing.JButton btn_dokter;
    private javax.swing.JButton btn_pasien;
    private javax.swing.JButton btn_terapi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}