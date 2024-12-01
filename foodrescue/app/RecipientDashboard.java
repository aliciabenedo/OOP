/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package foodrescue.app;

import javax.swing.*;


/**
 *
 * @author NagbontianAliciaBene
 */
public class RecipientDashboard extends javax.swing.JFrame {

    /**
     * Creates new form RecipientDashboard
     */
    public RecipientDashboard() {
        initComponents();
        setLocationRelativeTo(null); // Center the window
        setTitle("Food Rescue Network - Recipient Dashboard");       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewAvailableDonations = new javax.swing.JButton();
        claimDonation = new javax.swing.JButton();
        updateProfile = new javax.swing.JButton();
        backToMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));

        viewAvailableDonations.setText("view available donations");
        viewAvailableDonations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAvailableDonationsActionPerformed(evt);
            }
        });

        claimDonation.setText("claim Donation");
        claimDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claimDonationActionPerformed(evt);
            }
        });

        updateProfile.setText("update profile");
        updateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfileActionPerformed(evt);
            }
        });

        backToMainMenu.setForeground(new java.awt.Color(255, 102, 255));
        backToMainMenu.setText("mainu menu");
        backToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewAvailableDonations)
                    .addComponent(updateProfile, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(claimDonation, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(backToMainMenu)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(viewAvailableDonations)
                .addGap(48, 48, 48)
                .addComponent(claimDonation)
                .addGap(44, 44, 44)
                .addComponent(updateProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(backToMainMenu)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewAvailableDonationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAvailableDonationsActionPerformed
        // TODO add your handling code here:
                JOptionPane.showMessageDialog(this, "View Available Donations button clicked!");
    }//GEN-LAST:event_viewAvailableDonationsActionPerformed

    private void claimDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claimDonationActionPerformed
        // TODO add your handling code here:
                JOptionPane.showMessageDialog(this, "Claim Donation button clicked!");
    }//GEN-LAST:event_claimDonationActionPerformed

    private void updateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfileActionPerformed
        // TODO add your handling code here:
                JOptionPane.showMessageDialog(this, "Update Profile button clicked!");
    }//GEN-LAST:event_updateProfileActionPerformed

    private void backToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMainMenuActionPerformed
        // TODO add your handling code here:
                new MainLandingPage().setVisible(true); // Navigate back to Main Landing Page
                this.dispose();
        
    }//GEN-LAST:event_backToMainMenuActionPerformed

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
            java.util.logging.Logger.getLogger(RecipientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecipientDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMainMenu;
    private javax.swing.JButton claimDonation;
    private javax.swing.JButton updateProfile;
    private javax.swing.JButton viewAvailableDonations;
    // End of variables declaration//GEN-END:variables
}
