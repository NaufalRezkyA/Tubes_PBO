/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Update;

import Class.Payment;
import Database.DB_Pasien;
import GUI.Data.Frame_DataPayment;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import GUI.Data.Frame_DataTerapi;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Frame_Pasien extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Pasien
     */
    public Frame_Pasien() {
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
        jButton2_Payment = new javax.swing.JButton();
        jButton3_Terapi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1_NamaPasien = new javax.swing.JTextField();
        jTextField2_Keluhan = new javax.swing.JTextField();
        jTextField3_DokterRujukan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField1_KodePasien1 = new javax.swing.JTextField();
        jLabel6_Tanggal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3_KodeTerapi = new javax.swing.JTextField();
        jButton2_Add = new javax.swing.JButton();
        jButton1_reset = new javax.swing.JButton();
        jButton3_Delete = new javax.swing.JButton();
        jButton4_Update = new javax.swing.JButton();
        jButton4_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 41, 88));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2_Payment.setBackground(new java.awt.Color(51, 255, 255));
        jButton2_Payment.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2_Payment.setText("Payment");
        jButton2_Payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2_PaymentMouseClicked(evt);
            }
        });
        jPanel1.add(jButton2_Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 128, -1));

        jButton3_Terapi.setBackground(new java.awt.Color(0, 255, 204));
        jButton3_Terapi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3_Terapi.setText("Terapi");
        jButton3_Terapi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3_TerapiMouseClicked(evt);
            }
        });
        jPanel1.add(jButton3_Terapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal Pendaftaran");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dokter Rujukan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Keluhan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Pasien");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Pasien");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jTextField1_NamaPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_NamaPasienActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_NamaPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 520, -1));
        jPanel1.add(jTextField2_Keluhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 520, -1));
        jPanel1.add(jTextField3_DokterRujukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 520, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nama Pasien   : ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextField1_KodePasien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_KodePasien1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_KodePasien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 520, -1));

        jLabel6_Tanggal.setForeground(new java.awt.Color(255, 255, 255));
        LocalDate localDate = LocalDate.now();//For reference
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedString = localDate.format(formatter);
        jLabel6_Tanggal.setText(formattedString);
        jPanel1.add(jLabel6_Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kode Terapi");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));
        jPanel1.add(jTextField3_KodeTerapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 520, -1));

        jButton2_Add.setText("add");
        jButton2_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2_AddMouseClicked(evt);
            }
        });
        jPanel1.add(jButton2_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));

        jButton1_reset.setText("reset");
        jButton1_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_resetMouseClicked(evt);
            }
        });
        jPanel1.add(jButton1_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, -1, -1));

        jButton3_Delete.setText("delete");
        jButton3_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3_DeleteMouseClicked(evt);
            }
        });
        jPanel1.add(jButton3_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        jButton4_Update.setText("update");
        jButton4_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4_UpdateMouseClicked(evt);
            }
        });
        jButton4_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        jButton4_Back.setBackground(new java.awt.Color(204, 204, 0));
        jButton4_Back.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4_Back.setText("Back");
        jButton4_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4_BackMouseClicked(evt);
            }
        });
        jButton4_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_BackActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 103, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4_BackMouseClicked
        // TODO add your handling code here:
        Frame_Home jF = new Frame_Home();
        jF.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4_BackMouseClicked

    private void jButton2_PaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_PaymentMouseClicked
        // TODO add your handling code here:
        Frame_DataPayment jF_2 = new Frame_DataPayment();
        jF_2.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2_PaymentMouseClicked

    private void jButton3_TerapiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3_TerapiMouseClicked
        // TODO add your handling code here:
        Frame_DataTerapi jF_3 = new Frame_DataTerapi();
        jF_3.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3_TerapiMouseClicked

    private void jButton4_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4_BackActionPerformed

    private void jTextField1_NamaPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_NamaPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_NamaPasienActionPerformed

    private void jTextField1_KodePasien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_KodePasien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_KodePasien1ActionPerformed

    private void jButton4_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4_UpdateActionPerformed

    private void jButton2_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_AddMouseClicked
        // TODO add your handling code here:
        DB_Pasien farmasi = new DB_Pasien(
                jTextField1_KodePasien1.getText(), 
                jTextField2_Keluhan.getText(), 
                jTextField3_DokterRujukan.getText(), 
                jTextField3_KodeTerapi.getText(), 
                jTextField1_NamaPasien.getText(), 
                LocalDate.now(),
                null
        );
        farmasi.insert(); 
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan..");
    }//GEN-LAST:event_jButton2_AddMouseClicked

    private void jButton1_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_resetMouseClicked
        // TODO add your handling code here:
        DB_Pasien farmasi = new DB_Pasien(
                jTextField1_KodePasien1.getText(), 
                jTextField2_Keluhan.getText(), 
                jTextField3_DokterRujukan.getText(), 
                jTextField3_KodeTerapi.getText(), 
                jTextField1_NamaPasien.getText(), 
                LocalDate.now(),
                null
        );
        farmasi.reset();
        JOptionPane.showMessageDialog(null, "Data Berhasil Direset..");
    }//GEN-LAST:event_jButton1_resetMouseClicked

    private void jButton3_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3_DeleteMouseClicked
        // TODO add your handling code here:
        DB_Pasien farmasi = new DB_Pasien(
                jTextField1_KodePasien1.getText(), 
                jTextField2_Keluhan.getText(), 
                jTextField3_DokterRujukan.getText(), 
                jTextField3_KodeTerapi.getText(), 
                jTextField1_NamaPasien.getText(), 
                LocalDate.now(),
                null
        );
        farmasi.delete();
        JOptionPane.showMessageDialog(null, "Data Berhasil DiHapus..");
    }//GEN-LAST:event_jButton3_DeleteMouseClicked

    private void jButton4_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4_UpdateMouseClicked
        // TODO add your handling code here:
        DB_Pasien farmasi = new DB_Pasien(
                jTextField1_KodePasien1.getText(), 
                jTextField2_Keluhan.getText(), 
                jTextField3_DokterRujukan.getText(), 
                jTextField3_KodeTerapi.getText(), 
                jTextField1_NamaPasien.getText(), 
                LocalDate.now(),
                null
        );
        farmasi.update();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
    }//GEN-LAST:event_jButton4_UpdateMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Pasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_reset;
    private javax.swing.JButton jButton2_Add;
    private javax.swing.JButton jButton2_Payment;
    private javax.swing.JButton jButton3_Delete;
    private javax.swing.JButton jButton3_Terapi;
    private javax.swing.JButton jButton4_Back;
    private javax.swing.JButton jButton4_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6_Tanggal;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_KodePasien1;
    private javax.swing.JTextField jTextField1_NamaPasien;
    private javax.swing.JTextField jTextField2_Keluhan;
    private javax.swing.JTextField jTextField3_DokterRujukan;
    private javax.swing.JTextField jTextField3_KodeTerapi;
    // End of variables declaration//GEN-END:variables
}
