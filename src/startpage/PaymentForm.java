/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package startpage;

import Mpesa.Mpesa;
import Mpesa.Constants;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Database.*;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import raven.toast.Notifications;

/**
 *
 * @author user
 */
public class PaymentForm extends javax.swing.JFrame {

    private String Amount;

    /**
     * Creates new form PaymentForm
     */
    public PaymentForm(String Amount) {
        initComponents();
        FlatIntelliJLaf.setup();
        Notifications.getInstance().setJFrame(this);

        this.Amount = Amount;

    }

    public PaymentForm() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed


    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        QueryBuilder qb = new QueryBuilder();
        String phoneNumber = jTextField1.getText();
        Mpesa mpesa = new Mpesa(Constants.APP_KEY, Constants.APP_SECRET);
        try {
            String res = mpesa.STKPushSimulation(
                    "174379",
                    "MTc0Mzc5YmZiMjc5ZjlhYTliZGJjZjE1OGU5N2RkNzFhNDY3Y2QyZTBjODkzMDU5YjEwZjc4ZTZiNzJhZGExZWQyYzkxOTIwMTcwODI0MTU1MDU1",
                    "20170824155055",
                    "CustomerPayBillOnline",
                    this.Amount,
                    phoneNumber,
                    "254715598801",
                    "174379",
                    "http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BValidation",
                    "http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BValidation",
                    "Tiko-pap", "asdasd"
            );

            String checkoutRequestID = mpesa.extractCheckoutRequestID(res);

            boolean transactionSuccess = false;
            int attempts = 0;
            int maxAttempts = 10; // Check up to 10 times
            int interval = 5000; // 5 seconds interval

            while (attempts < maxAttempts && !transactionSuccess) {
                String statusResponse = mpesa.STKPushTransactionStatus(
                        "174379",
                        "MTc0Mzc5YmZiMjc5ZjlhYTliZGJjZjE1OGU5N2RkNzFhNDY3Y2QyZTBjODkzMDU5YjEwZjc4ZTZiNzJhZGExZWQyYzkxOTIwMTcwODI0MTU1MDU1",
                        "20170824155055",
                        checkoutRequestID
                );

                String resultCode = mpesa.extractResultCode(statusResponse);
                String errorCode = mpesa.extractErrorCode(statusResponse);

                if (resultCode != null && resultCode.equals("0")) { // Assuming "0" indicates success
                    transactionSuccess = true;
                } else if (resultCode != null && (resultCode.equals("1032") || resultCode.equals("2001"))) { 
                    break;
                } else if (errorCode != null && errorCode.equals("500.001.1001")) { 
                    // Continue polling
                } else if (errorCode != null) {
                    // Handle other error codes if necessary
                    break;
                }

                attempts++;
                try {
                    Thread.sleep(interval); // Wait before the next check
                } catch (InterruptedException ex) {
                    Logger.getLogger(PaymentForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (transactionSuccess) {
                PreparedStatement statement;
                try {
                    statement = qb.insert("payments", "user_id", "amount", "method").values("1", this.Amount, "mpesa").build();
                    statement.execute();
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, "Payment successful and recorded.");
                } catch (SQLException ex) {
                    Logger.getLogger(PaymentForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, "Payment failed or timed out.");
            }

        } catch (IOException ex) {
            Logger.getLogger(PaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
