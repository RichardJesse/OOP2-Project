/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginForm;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
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

        jPanel4 = new javax.swing.JPanel();
        signupanel1 = new javax.swing.JPanel();
        lgnstmt1 = new javax.swing.JLabel();
        lgnstmt2 = new javax.swing.JLabel();
        lgnstmt3 = new javax.swing.JLabel();
        lgnstmt4 = new javax.swing.JLabel();
        signupaccess = new javax.swing.JButton();
        lbltitle3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblogin = new javax.swing.JLabel();
        lblenteruser = new javax.swing.JLabel();
        lblenterpass = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        lblenteruser1 = new javax.swing.JLabel();
        txtusername1 = new javax.swing.JTextField();
        lblenterpass1 = new javax.swing.JLabel();
        txtpassword1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(104, 104, 103));

        signupanel1.setBackground(new java.awt.Color(104, 104, 103));

        lgnstmt1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lgnstmt1.setForeground(new java.awt.Color(255, 255, 255));
        lgnstmt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lgnstmt1.setText("WELCOME BACK!");

        lgnstmt2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lgnstmt2.setForeground(new java.awt.Color(255, 255, 255));
        lgnstmt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lgnstmt2.setText("Log back in to access your personalized ");
        lgnstmt2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lgnstmt3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lgnstmt3.setForeground(new java.awt.Color(255, 255, 255));
        lgnstmt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lgnstmt3.setText("content, exclusive updates, and new");

        lgnstmt4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lgnstmt4.setForeground(new java.awt.Color(255, 255, 255));
        lgnstmt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lgnstmt4.setText(" features designed just for you. ");

        signupaccess.setBackground(new java.awt.Color(244, 239, 230));
        signupaccess.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        signupaccess.setForeground(new java.awt.Color(22, 42, 44));
        signupaccess.setText("LOGIN");
        signupaccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupaccessMouseClicked(evt);
            }
        });
        signupaccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupaccessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signupanel1Layout = new javax.swing.GroupLayout(signupanel1);
        signupanel1.setLayout(signupanel1Layout);
        signupanel1Layout.setHorizontalGroup(
            signupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupanel1Layout.createSequentialGroup()
                .addGroup(signupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signupanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lgnstmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signupanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(signupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lgnstmt2)
                            .addComponent(lgnstmt3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(signupanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lgnstmt4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(signupanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(signupaccess, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        signupanel1Layout.setVerticalGroup(
            signupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lgnstmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lgnstmt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lgnstmt3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lgnstmt4)
                .addGap(45, 45, 45)
                .addComponent(signupaccess)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        lbltitle3.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        lbltitle3.setForeground(new java.awt.Color(22, 42, 44));
        lbltitle3.setText("TIKOPAP");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signupanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbltitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(signupanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(244, 239, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblogin.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblogin.setForeground(new java.awt.Color(94, 108, 91));
        lblogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblogin.setText("SIGNUP");
        jPanel2.add(lblogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 320, -1));

        lblenteruser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblenteruser.setForeground(new java.awt.Color(22, 42, 44));
        lblenteruser.setText("Enter Email");
        jPanel2.add(lblenteruser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 89, 31));

        lblenterpass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblenterpass.setForeground(new java.awt.Color(22, 42, 44));
        lblenterpass.setText("Enter Password");
        jPanel2.add(lblenterpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 110, 26));

        btnlogin.setBackground(new java.awt.Color(214, 224, 226));
        btnlogin.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(94, 108, 91));
        btnlogin.setText("SIGNUP");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 199, 45));

        txtusername.setBackground(new java.awt.Color(244, 239, 230));
        txtusername.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 265, 32));

        txtpassword.setBackground(new java.awt.Color(244, 239, 230));
        txtpassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 265, 34));

        lblenteruser1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblenteruser1.setForeground(new java.awt.Color(22, 42, 44));
        lblenteruser1.setText("Enter Username");
        jPanel2.add(lblenteruser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, 31));

        txtusername1.setBackground(new java.awt.Color(244, 239, 230));
        txtusername1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtusername1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtusername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 265, 32));

        lblenterpass1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblenterpass1.setForeground(new java.awt.Color(22, 42, 44));
        lblenterpass1.setText("Confirm Password");
        jPanel2.add(lblenterpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 26));

        txtpassword1.setBackground(new java.awt.Color(244, 239, 230));
        txtpassword1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpassword1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 265, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupaccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupaccessMouseClicked
        login lo = new login();
        lo.setVisible(true);
    }//GEN-LAST:event_signupaccessMouseClicked

    private void signupaccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupaccessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupaccessActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        JOptionPane.showInputDialog(null, "You are successfuly logged in");
    }//GEN-LAST:event_btnloginActionPerformed

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
    private javax.swing.JButton btnlogin;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblenterpass;
    private javax.swing.JLabel lblenterpass1;
    private javax.swing.JLabel lblenteruser;
    private javax.swing.JLabel lblenteruser1;
    private javax.swing.JLabel lblogin;
    private javax.swing.JLabel lbltitle3;
    private javax.swing.JLabel lgnstmt1;
    private javax.swing.JLabel lgnstmt2;
    private javax.swing.JLabel lgnstmt3;
    private javax.swing.JLabel lgnstmt4;
    private javax.swing.JButton signupaccess;
    private javax.swing.JPanel signupanel1;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtpassword1;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField txtusername1;
    // End of variables declaration//GEN-END:variables
}
