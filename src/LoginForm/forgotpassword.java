/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginForm;

/**
 *
 * @author HP
 */
public class forgotpassword extends javax.swing.JFrame {

    /**
     * Creates new form forgotpassword
     */
    public forgotpassword() {
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

        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtusername1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtusername2 = new javax.swing.JTextField();
        resetpanel1 = new javax.swing.JPanel();
        lbltitle2 = new javax.swing.JLabel();
        resetpanel2 = new javax.swing.JPanel();
        lblreset = new javax.swing.JLabel();
        lblsetnewpass = new javax.swing.JLabel();
        txtsetnewpass = new javax.swing.JTextField();
        lblconfirmnewpass = new javax.swing.JLabel();
        txtconfirmnewpass = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();

        jLabel10.setFont(new java.awt.Font("Ravie", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("TIKOPAP");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter Email");

        txtusername1.setBackground(new java.awt.Color(0, 0, 0));
        txtusername1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtusername1.setForeground(new java.awt.Color(255, 255, 255));
        txtusername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusername1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Enter Preferred Username");

        txtusername2.setBackground(new java.awt.Color(0, 0, 0));
        txtusername2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtusername2.setForeground(new java.awt.Color(255, 255, 255));
        txtusername2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusername2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resetpanel1.setBackground(new java.awt.Color(104, 104, 103));

        lbltitle2.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        lbltitle2.setForeground(new java.awt.Color(22, 42, 44));
        lbltitle2.setText("TIKOPAP");

        javax.swing.GroupLayout resetpanel1Layout = new javax.swing.GroupLayout(resetpanel1);
        resetpanel1.setLayout(resetpanel1Layout);
        resetpanel1Layout.setHorizontalGroup(
            resetpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resetpanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lbltitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        resetpanel1Layout.setVerticalGroup(
            resetpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resetpanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(lbltitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        getContentPane().add(resetpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 480));

        resetpanel2.setBackground(new java.awt.Color(244, 239, 230));

        lblreset.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblreset.setForeground(new java.awt.Color(104, 104, 103));
        lblreset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreset.setText("PASSWORD RESET");

        lblsetnewpass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblsetnewpass.setForeground(new java.awt.Color(104, 104, 103));
        lblsetnewpass.setText("Enter New Password");

        txtsetnewpass.setBackground(new java.awt.Color(244, 239, 230));
        txtsetnewpass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtsetnewpass.setForeground(new java.awt.Color(255, 255, 255));
        txtsetnewpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsetnewpassActionPerformed(evt);
            }
        });

        lblconfirmnewpass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblconfirmnewpass.setForeground(new java.awt.Color(104, 104, 103));
        lblconfirmnewpass.setText("Confirm New Password");

        txtconfirmnewpass.setBackground(new java.awt.Color(244, 239, 230));
        txtconfirmnewpass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtconfirmnewpass.setForeground(new java.awt.Color(255, 255, 255));
        txtconfirmnewpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfirmnewpassActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(214, 224, 226));
        btnreset.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        btnreset.setForeground(new java.awt.Color(104, 104, 103));
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resetpanel2Layout = new javax.swing.GroupLayout(resetpanel2);
        resetpanel2.setLayout(resetpanel2Layout);
        resetpanel2Layout.setHorizontalGroup(
            resetpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resetpanel2Layout.createSequentialGroup()
                .addGroup(resetpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resetpanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(resetpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblreset, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(resetpanel2Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(resetpanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(resetpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblconfirmnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtconfirmnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsetnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsetnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        resetpanel2Layout.setVerticalGroup(
            resetpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resetpanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblreset)
                .addGap(30, 30, 30)
                .addComponent(lblsetnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsetnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblconfirmnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtconfirmnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        getContentPane().add(resetpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 460, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusername1ActionPerformed

    private void txtusername2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusername2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusername2ActionPerformed

    private void txtsetnewpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsetnewpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsetnewpassActionPerformed

    private void txtconfirmnewpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfirmnewpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmnewpassActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        login lo = new login();
         lo.setVisible(true);
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotpassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblconfirmnewpass;
    private javax.swing.JLabel lblreset;
    private javax.swing.JLabel lblsetnewpass;
    private javax.swing.JLabel lbltitle2;
    private javax.swing.JPanel resetpanel1;
    private javax.swing.JPanel resetpanel2;
    private javax.swing.JTextField txtconfirmnewpass;
    private javax.swing.JTextField txtsetnewpass;
    private javax.swing.JTextField txtusername1;
    private javax.swing.JTextField txtusername2;
    // End of variables declaration//GEN-END:variables
}
