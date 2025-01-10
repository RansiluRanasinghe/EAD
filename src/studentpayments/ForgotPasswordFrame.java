/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentpayments;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import ClassFiles.*;
import java.util.Random;

/**
 *
 * @author dinis
 */
public class ForgotPasswordFrame extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPasswordFrame
     */
    int otp;

    public ForgotPasswordFrame(String uID) {
        initComponents();

        userIDTxtBox.setText(uID);
    }

    public void otpGenrator() {

        Random random = new Random();
        otp = random.nextInt(100000);
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
        jLabel3 = new javax.swing.JLabel();
        confPasswordField = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        closeBtn1 = new javax.swing.JButton();
        userIDTxtBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        viewRetypePwdChkBox = new javax.swing.JCheckBox();
        newPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        viewNewPwdChkBox = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        otpTxtBox = new javax.swing.JTextField();
        savePwdBtn = new javax.swing.JButton();
        getOtpBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHANGE PASSWORD AREA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 530, 40));

        confPasswordField.setBackground(new java.awt.Color(204, 204, 204));
        confPasswordField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        confPasswordField.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.add(confPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 510, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 350, 10));

        closeBtn1.setBackground(new java.awt.Color(204, 204, 204));
        closeBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closeBtn1.setText("CLOSE");
        closeBtn1.setToolTipText("Close App");
        closeBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        closeBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtn1MouseExited(evt);
            }
        });
        closeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(closeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 510, 20));

        userIDTxtBox.setEditable(false);
        userIDTxtBox.setBackground(new java.awt.Color(204, 204, 204));
        userIDTxtBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        userIDTxtBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.add(userIDTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 510, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("USER ID :-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 360, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CONFIRM PASSWORD :-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 280, 20));

        viewRetypePwdChkBox.setBackground(new java.awt.Color(204, 204, 204));
        viewRetypePwdChkBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewRetypePwdChkBox.setText("VIEW ");
        viewRetypePwdChkBox.setToolTipText("View Password");
        viewRetypePwdChkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRetypePwdChkBoxActionPerformed(evt);
            }
        });
        jPanel1.add(viewRetypePwdChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 70, -1));

        newPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        newPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        newPasswordField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.add(newPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 510, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NEW PASSWORD :-");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, 20));

        viewNewPwdChkBox.setBackground(new java.awt.Color(204, 204, 204));
        viewNewPwdChkBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewNewPwdChkBox.setText("VIEW ");
        viewNewPwdChkBox.setToolTipText("View Password");
        viewNewPwdChkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNewPwdChkBoxActionPerformed(evt);
            }
        });
        jPanel1.add(viewNewPwdChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("OTP :-");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 100, 20));

        otpTxtBox.setBackground(new java.awt.Color(204, 204, 204));
        otpTxtBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        otpTxtBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.add(otpTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 510, 40));

        savePwdBtn.setBackground(new java.awt.Color(204, 204, 204));
        savePwdBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        savePwdBtn.setText("SAVE PASSWORD");
        savePwdBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
        savePwdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savePwdBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savePwdBtnMouseExited(evt);
            }
        });
        savePwdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePwdBtnActionPerformed(evt);
            }
        });
        jPanel1.add(savePwdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 510, 30));

        getOtpBtn1.setBackground(new java.awt.Color(204, 204, 204));
        getOtpBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getOtpBtn1.setText("GET OTP");
        getOtpBtn1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 153, 153)));
        getOtpBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                getOtpBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                getOtpBtn1MouseExited(evt);
            }
        });
        getOtpBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getOtpBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(getOtpBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 510, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtn1ActionPerformed
        JFrame f = new JFrame();
        if (JOptionPane.showConfirmDialog(f, "DO YOU WANT TO CLOSE?") == JOptionPane.YES_NO_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_closeBtn1ActionPerformed

    private void viewRetypePwdChkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRetypePwdChkBoxActionPerformed
        if (viewRetypePwdChkBox.isSelected()) {
            if (confPasswordField.getEchoChar() == '*') {

                confPasswordField.setEchoChar((char) 0);

            } else {
                confPasswordField.setEchoChar('*');

            }
        } else {
            if (confPasswordField.getEchoChar() == '*') {

                confPasswordField.setEchoChar((char) 0);

            } else {
                confPasswordField.setEchoChar('*');

            }
        }
    }//GEN-LAST:event_viewRetypePwdChkBoxActionPerformed

    private void viewNewPwdChkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNewPwdChkBoxActionPerformed
        if (viewNewPwdChkBox.isSelected()) {
            if (confPasswordField.getEchoChar() == '*') {

                confPasswordField.setEchoChar((char) 0);

            } else {
                confPasswordField.setEchoChar('*');

            }
        } else {
            if (confPasswordField.getEchoChar() == '*') {

                confPasswordField.setEchoChar((char) 0);

            } else {
                confPasswordField.setEchoChar('*');

            }
        }
    }//GEN-LAST:event_viewNewPwdChkBoxActionPerformed

    private void savePwdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePwdBtnActionPerformed
        if (newPasswordField1.getText().equals(confPasswordField.getText())) {
            if (Integer.parseInt(otpTxtBox.getText()) == otp) {
                try {
                    String tblName = "";
                    String id = "";

                    if (userIDTxtBox.getText().contains("ADM")) {
                        tblName = "admin";
                        id = "adminID";
                    } else if (userIDTxtBox.getText().contains("STD")) {
                        tblName = "student";
                        id = "StudentID";

                    }

                    String updatwPwd = "update " + tblName + " set password = '" + confPasswordField.getText() + "' where "+id+" =  '"+userIDTxtBox.getText()+"'";
                    MyConn.save(updatwPwd);
                    JOptionPane.showMessageDialog(null, "Changed Successfully");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong OTP");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Passwords Does not match");
        }
    }//GEN-LAST:event_savePwdBtnActionPerformed

    private void getOtpBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getOtpBtn1ActionPerformed
        otpGenrator();

        OTPWriter otpWriter = new OTPWriter();
        otpWriter.otpGen(userIDTxtBox.getText(), otp, "Change your password");

        JOptionPane.showMessageDialog(null, "OTP WAS GENERATED");
    }//GEN-LAST:event_getOtpBtn1ActionPerformed

    private void getOtpBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getOtpBtn1MouseEntered
        getOtpBtn1.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_getOtpBtn1MouseEntered

    private void getOtpBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getOtpBtn1MouseExited
        getOtpBtn1.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_getOtpBtn1MouseExited

    private void savePwdBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savePwdBtnMouseEntered
        savePwdBtn.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_savePwdBtnMouseEntered

    private void savePwdBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savePwdBtnMouseExited
        savePwdBtn.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_savePwdBtnMouseExited

    private void closeBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtn1MouseEntered
        closeBtn1.setBackground(Color.red);
    }//GEN-LAST:event_closeBtn1MouseEntered

    private void closeBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtn1MouseExited
        closeBtn1.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_closeBtn1MouseExited

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
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordFrame("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn1;
    private javax.swing.JPasswordField confPasswordField;
    private javax.swing.JButton getOtpBtn1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField newPasswordField1;
    private javax.swing.JTextField otpTxtBox;
    private javax.swing.JButton savePwdBtn;
    private javax.swing.JTextField userIDTxtBox;
    private javax.swing.JCheckBox viewNewPwdChkBox;
    private javax.swing.JCheckBox viewRetypePwdChkBox;
    // End of variables declaration//GEN-END:variables
}
