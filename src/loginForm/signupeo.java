/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginForm;

import LessJava.UserAuthenticator;
import javax.swing.JOptionPane;
import Utils.PasswordUtils;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import raven.toast.Notifications;

/**
 *
 * @author HP
 */
public class signupeo extends javax.swing.JFrame {

    PasswordUtils passwordUtils = new PasswordUtils();
    UserAuthenticator userAuthenticator = new UserAuthenticator();
    private String userType;
    

    /**
     * Creates new form signupeo
     */
    public signupeo() {
        initComponents();
        FlatIntelliJLaf.setup();
        Notifications.getInstance().setJFrame(this);
    }
    
     public signupeo(String userType) {
        initComponents();
        FlatIntelliJLaf.setup();
        Notifications.getInstance().setJFrame(this);
        this.userType = userType;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblogin = new javax.swing.JLabel();
        lblenteruser = new javax.swing.JLabel();
        lblenterpass = new javax.swing.JLabel();
        signUpBtn = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        lblenteruser1 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblenterpass1 = new javax.swing.JLabel();
        txtphoneNumber = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        signupanel1 = new javax.swing.JPanel();
        lgnstmt1 = new javax.swing.JLabel();
        lgnstmt2 = new javax.swing.JLabel();
        lgnstmt3 = new javax.swing.JLabel();
        lgnstmt4 = new javax.swing.JLabel();
        loginAccess = new javax.swing.JButton();
        lbltitle3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(244, 239, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblogin.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblogin.setForeground(new java.awt.Color(94, 108, 91));
        lblogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblogin.setText("SIGNUP");
        jPanel2.add(lblogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 320, -1));

        lblenteruser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblenteruser.setForeground(new java.awt.Color(22, 42, 44));
        lblenteruser.setText("Enter Email");
        jPanel2.add(lblenteruser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 89, 31));

        lblenterpass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblenterpass.setForeground(new java.awt.Color(22, 42, 44));
        lblenterpass.setText("Enter Password");
        jPanel2.add(lblenterpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 110, 26));

        signUpBtn.setBackground(new java.awt.Color(214, 224, 226));
        signUpBtn.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(94, 108, 91));
        signUpBtn.setText("SIGNUP");
        signUpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        jPanel2.add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 199, 45));

        txtemail.setBackground(new java.awt.Color(244, 239, 230));
        txtemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 265, 32));

        txtpassword.setBackground(new java.awt.Color(244, 239, 230));
        txtpassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 265, 34));

        lblenteruser1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblenteruser1.setForeground(new java.awt.Color(22, 42, 44));
        lblenteruser1.setText("Enter Username");
        jPanel2.add(lblenteruser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, 31));

        txtusername.setBackground(new java.awt.Color(244, 239, 230));
        txtusername.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 265, 32));

        lblenterpass1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblenterpass1.setForeground(new java.awt.Color(22, 42, 44));
        lblenterpass1.setText("Phone Number");
        jPanel2.add(lblenterpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 26));

        txtphoneNumber.setBackground(new java.awt.Color(244, 239, 230));
        txtphoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtphoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtphoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 265, 34));

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

        loginAccess.setBackground(new java.awt.Color(244, 239, 230));
        loginAccess.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        loginAccess.setForeground(new java.awt.Color(22, 42, 44));
        loginAccess.setText("LOGIN");
        loginAccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginAccessMouseClicked(evt);
            }
        });
        loginAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAccessActionPerformed(evt);
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
                        .addComponent(loginAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(loginAccess)
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
                .addGap(18, 18, 18)
                .addComponent(signupanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        
        String email = txtemail.getText();
        String password = txtpassword.getText();
        String username = txtusername.getText();
        String phoneNumber = txtphoneNumber.getText();

        boolean isPasswordOk = passwordUtils.validatePassword(password);

        if (isPasswordOk) {
            
            try {
                boolean doesUserQualify = false;
                if(this.userType.equals("normalUser")){
                    
                    doesUserQualify = userAuthenticator.SignUpUser(email, username, password, phoneNumber, "users");
                }
                if(this.userType.equals("eventOrg")){
                    doesUserQualify = userAuthenticator.SignUpUser(email, username, password, phoneNumber, "event_organizer");
                }
               
                if (doesUserQualify) {
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Welcome to tiko-pap");
                    logineo le = new logineo();
                    le.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(signupeo.class.getName()).log(Level.SEVERE, null, ex);
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "The records already exist");
            }
        }else{
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Your password does not follow the rules try another one");    
        }
        
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void loginAccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginAccessMouseClicked
        logineo le = new logineo(this.userType);
        le.setVisible(true);
    }//GEN-LAST:event_loginAccessMouseClicked

    private void loginAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAccessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAccessActionPerformed

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
            java.util.logging.Logger.getLogger(signupeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupeo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton loginAccess;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JPanel signupanel1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtphoneNumber;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
