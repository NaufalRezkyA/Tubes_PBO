/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Update;

import Database.DB_Dokter;
import javax.swing.JOptionPane;

/**
 *
 * @author Naufal
 */
public class Frame_Dokter extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public Frame_Dokter() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1_EmailDokter = new javax.swing.JTextField();
        jTextField2_KodeDokter = new javax.swing.JTextField();
        jTextField3_Spesialis = new javax.swing.JTextField();
        jTextField4_NamaDokter = new javax.swing.JTextField();
        jButton1_Back = new javax.swing.JButton();
        jButton2_Add = new javax.swing.JButton();
        jButton3_Delete = new javax.swing.JButton();
        jButton4_Update = new javax.swing.JButton();
        jButton1_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(37, 41, 88));

        jLabel1.setFont(new java.awt.Font("News701 BT", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA DOKTER");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Dokter   :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Dokter  :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email Dokter  :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Spesialis        :");

        jTextField1_EmailDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_EmailDokterActionPerformed(evt);
            }
        });

        jTextField2_KodeDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_KodeDokterActionPerformed(evt);
            }
        });

        jButton1_Back.setText("Back");
        jButton1_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_BackMouseClicked(evt);
            }
        });
        jButton1_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_BackActionPerformed(evt);
            }
        });

        jButton2_Add.setText("add");
        jButton2_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2_AddMouseClicked(evt);
            }
        });
        jButton2_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_AddActionPerformed(evt);
            }
        });

        jButton3_Delete.setText("delete");
        jButton3_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3_DeleteMouseClicked(evt);
            }
        });

        jButton4_Update.setText("update");
        jButton4_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4_UpdateMouseClicked(evt);
            }
        });

        jButton1_reset.setText("reset");
        jButton1_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_resetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton1_Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField1_EmailDokter, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                                .addComponent(jTextField3_Spesialis)
                                .addComponent(jTextField4_NamaDokter, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jTextField2_KodeDokter)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton2_Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(jButton1_reset)
                        .addGap(83, 83, 83)
                        .addComponent(jButton3_Delete)
                        .addGap(209, 209, 209)
                        .addComponent(jButton4_Update)))
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(349, 349, 349))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1_Back)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2_KodeDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4_NamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1_EmailDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3_Spesialis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_Add)
                    .addComponent(jButton3_Delete)
                    .addComponent(jButton4_Update)
                    .addComponent(jButton1_reset))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_EmailDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_EmailDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_EmailDokterActionPerformed

    private void jTextField2_KodeDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_KodeDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_KodeDokterActionPerformed

    private void jButton1_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_BackMouseClicked
        // TODO add your handling code here:
        Frame_Home jF = new Frame_Home();
        jF.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1_BackMouseClicked

    private void jButton1_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_BackActionPerformed

    private void jButton2_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_AddMouseClicked
        // TODO add your handling code here:
        DB_Dokter dokter = new DB_Dokter(
            jTextField2_KodeDokter.getText(),
            jTextField4_NamaDokter.getText(),
            jTextField1_EmailDokter.getText(),
            jTextField3_Spesialis.getText()
        );

        dokter.insert();
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan..");
    }//GEN-LAST:event_jButton2_AddMouseClicked

    private void jButton2_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2_AddActionPerformed

    private void jButton3_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3_DeleteMouseClicked
        // TODO add your handling code here:
        DB_Dokter dokter = new DB_Dokter(
            jTextField2_KodeDokter.getText(),
            jTextField4_NamaDokter.getText(),
            jTextField1_EmailDokter.getText(),
            jTextField3_Spesialis.getText()
        );

        dokter.delete();
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
    }//GEN-LAST:event_jButton3_DeleteMouseClicked

    private void jButton4_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4_UpdateMouseClicked
        // TODO add your handling code here:
        DB_Dokter dokter = new DB_Dokter(
            jTextField2_KodeDokter.getText(),
            jTextField4_NamaDokter.getText(),
            jTextField1_EmailDokter.getText(),
            jTextField3_Spesialis.getText()
        );

        dokter.update();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
    }//GEN-LAST:event_jButton4_UpdateMouseClicked

    private void jButton1_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_resetMouseClicked
        // TODO add your handling code here:
        DB_Dokter dokter = new DB_Dokter(
            jTextField2_KodeDokter.getText(),
            jTextField4_NamaDokter.getText(),
            jTextField1_EmailDokter.getText(),
            jTextField3_Spesialis.getText()
        );

        dokter.reset();
        JOptionPane.showMessageDialog(null, "Data Berhasil Direset..");
    }//GEN-LAST:event_jButton1_resetMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Dokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Back;
    private javax.swing.JButton jButton1_reset;
    private javax.swing.JButton jButton2_Add;
    private javax.swing.JButton jButton3_Delete;
    private javax.swing.JButton jButton4_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_EmailDokter;
    private javax.swing.JTextField jTextField2_KodeDokter;
    private javax.swing.JTextField jTextField3_Spesialis;
    private javax.swing.JTextField jTextField4_NamaDokter;
    // End of variables declaration//GEN-END:variables
}
