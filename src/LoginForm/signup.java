/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginForm;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class signup extends javax.swing.JFrame {

    public signup() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        signupanel2 = new javax.swing.JPanel();
        lblsignup = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblsetuser = new javax.swing.JLabel();
        lblsetpass = new javax.swing.JLabel();
        txtsetpass = new javax.swing.JPasswordField();
        lblconfirmpass = new javax.swing.JLabel();
        setconfirmpass = new javax.swing.JPasswordField();
        txtsetuser = new javax.swing.JTextField();
        signupbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        stmt1 = new javax.swing.JLabel();
        stmt3 = new javax.swing.JLabel();
        stmt2 = new javax.swing.JLabel();
        stmt4 = new javax.swing.JLabel();
        loginaccess = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");

        txtusername.setBackground(new java.awt.Color(0, 0, 0));
        txtusername.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        txtpassword.setBackground(new java.awt.Color(0, 0, 0));
        txtpassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Remember Password");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Forgot Password?");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signupanel2.setBackground(new java.awt.Color(244, 239, 230));

        lblsignup.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblsignup.setForeground(new java.awt.Color(94, 108, 91));
        lblsignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsignup.setText("SIGN UP");

        lblemail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblemail.setForeground(new java.awt.Color(94, 108, 91));
        lblemail.setText("Enter Email");

        txtemail.setBackground(new java.awt.Color(244, 239, 230));
        txtemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        lblsetuser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblsetuser.setForeground(new java.awt.Color(94, 108, 91));
        lblsetuser.setText("Enter Preferred Username");

        lblsetpass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblsetpass.setForeground(new java.awt.Color(94, 108, 91));
        lblsetpass.setText("Set Password");

        txtsetpass.setBackground(new java.awt.Color(244, 239, 230));
        txtsetpass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtsetpass.setForeground(new java.awt.Color(255, 255, 255));

        lblconfirmpass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblconfirmpass.setForeground(new java.awt.Color(94, 108, 91));
        lblconfirmpass.setText("Confirm Password");

        setconfirmpass.setBackground(new java.awt.Color(244, 239, 230));
        setconfirmpass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setconfirmpass.setForeground(new java.awt.Color(255, 255, 255));

        txtsetuser.setBackground(new java.awt.Color(244, 239, 230));
        txtsetuser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtsetuser.setForeground(new java.awt.Color(255, 255, 255));
        txtsetuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsetuserActionPerformed(evt);
            }
        });

        signupbtn.setBackground(new java.awt.Color(214, 224, 226));
        signupbtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(94, 108, 91));
        signupbtn.setText("SIGN UP");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signupanel2Layout = new javax.swing.GroupLayout(signupanel2);
        signupanel2.setLayout(signupanel2Layout);
        signupanel2Layout.setHorizontalGroup(
            signupanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupanel2Layout.createSequentialGroup()
                .addGroup(signupanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signupanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(signupanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsetuser, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsetpass, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsetpass, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsetuser, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(signupanel2Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signupanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        signupanel2Layout.setVerticalGroup(
            signupanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblsignup)
                .addGap(30, 30, 30)
                .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblsetuser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsetuser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsetpass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsetpass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(signupanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -20, 590, 520));

        jPanel1.setBackground(new java.awt.Color(104, 104, 103));

        lbltitle.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(22, 42, 44));
        lbltitle.setText("TIKOPAP");

        stmt1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        stmt1.setForeground(new java.awt.Color(255, 255, 255));
        stmt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stmt1.setText("WE MISSED YOU!");

        stmt3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stmt3.setForeground(new java.awt.Color(255, 255, 255));
        stmt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stmt3.setText("Exciting new updates and content");

        stmt2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stmt2.setForeground(new java.awt.Color(255, 255, 255));
        stmt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stmt2.setText("Come back and see what's new");
        stmt2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        stmt4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stmt4.setForeground(new java.awt.Color(255, 255, 255));
        stmt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stmt4.setText("awaits!");

        loginaccess.setBackground(new java.awt.Color(244, 239, 230));
        loginaccess.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        loginaccess.setText("LOG IN");
        loginaccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginaccessMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stmt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stmt4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stmt3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(loginaccess)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(stmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(stmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stmt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stmt3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stmt4)
                .addGap(23, 23, 23)
                .addComponent(loginaccess)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        JOptionPane.showInputDialog(null, "You are successfuly logged in");
    }//GEN-LAST:event_signupbtnActionPerformed

    private void txtsetuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsetuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsetuserActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void loginaccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginaccessMouseClicked
        login lo = new login();
        lo.setVisible(true);
    }//GEN-LAST:event_loginaccessMouseClicked

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblconfirmpass;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblsetpass;
    private javax.swing.JLabel lblsetuser;
    private javax.swing.JLabel lblsignup;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JButton loginaccess;
    private javax.swing.JPasswordField setconfirmpass;
    private javax.swing.JPanel signupanel2;
    private javax.swing.JButton signupbtn;
    private javax.swing.JLabel stmt1;
    private javax.swing.JLabel stmt2;
    private javax.swing.JLabel stmt3;
    private javax.swing.JLabel stmt4;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtsetpass;
    private javax.swing.JTextField txtsetuser;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
