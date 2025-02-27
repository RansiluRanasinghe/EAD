/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentpayments;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ClassFiles.MyConn;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;

/**
 *
 * @author dinis
 */
public class StudentRegiter extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegiter
     */
    public StudentRegiter() {
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
        jPanel2 = new javax.swing.JPanel();
        nicTxtBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        stdIDTxtBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fullNameTxtBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dateTxtBox = new javax.swing.JTextField();
        yearTxtBox = new javax.swing.JTextField();
        monthTxtBox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mobileTxtBox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        emailTxtBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        passwordPwdBox = new javax.swing.JPasswordField();
        viewChkBox = new javax.swing.JCheckBox();
        nicValidChkBox = new javax.swing.JCheckBox();
        mobileValidChkBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        directToLoginLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        closeBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nicTxtBox.setBackground(new java.awt.Color(204, 204, 204));
        nicTxtBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nicTxtBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        nicTxtBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nicTxtBoxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicTxtBoxKeyTyped(evt);
            }
        });
        jPanel2.add(nicTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 370, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("NIC :-");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 350, 20));

        stdIDTxtBox.setBackground(new java.awt.Color(204, 204, 204));
        stdIDTxtBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stdIDTxtBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel2.add(stdIDTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 360, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("STUDENT ID :-");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 360, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("FULL NAME :-");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 750, 20));

        fullNameTxtBox.setBackground(new java.awt.Color(204, 204, 204));
        fullNameTxtBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fullNameTxtBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel2.add(fullNameTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 750, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("DATE OF BIRTH :-");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 750, 20));

        dateTxtBox.setBackground(new java.awt.Color(204, 204, 204));
        dateTxtBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dateTxtBox.setForeground(new java.awt.Color(153, 153, 153));
        dateTxtBox.setText("DATE");
        dateTxtBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        dateTxtBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateTxtBoxMouseClicked(evt);
            }
        });
        dateTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtBoxActionPerformed(evt);
            }
        });
        jPanel2.add(dateTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 230, 40));

        yearTxtBox.setBackground(new java.awt.Color(204, 204, 204));
        yearTxtBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        yearTxtBox.setForeground(new java.awt.Color(153, 153, 153));
        yearTxtBox.setText("YEAR");
        yearTxtBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        yearTxtBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearTxtBoxMouseClicked(evt);
            }
        });
        jPanel2.add(yearTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 40));

        monthTxtBox.setBackground(new java.awt.Color(204, 204, 204));
        monthTxtBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        monthTxtBox.setForeground(new java.awt.Color(153, 153, 153));
        monthTxtBox.setText("MONTH");
        monthTxtBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        monthTxtBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthTxtBoxMouseClicked(evt);
            }
        });
        jPanel2.add(monthTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 230, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("MOBILE :-");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 280, 20));

        mobileTxtBox.setBackground(new java.awt.Color(204, 204, 204));
        mobileTxtBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mobileTxtBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        mobileTxtBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobileTxtBoxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileTxtBoxKeyTyped(evt);
            }
        });
        jPanel2.add(mobileTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 370, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("EMAIL :-");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 370, 20));

        emailTxtBox.setBackground(new java.awt.Color(204, 204, 204));
        emailTxtBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emailTxtBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel2.add(emailTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 370, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("PASSWORD :-");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 690, 20));

        registerBtn.setBackground(new java.awt.Color(153, 153, 153));
        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.setToolTipText("Click to Register");
        registerBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerBtnMouseExited(evt);
            }
        });
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        jPanel2.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 170, 30));

        clearBtn.setBackground(new java.awt.Color(153, 153, 153));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.setToolTipText("Clear the text fields");
        clearBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearBtnMouseExited(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 170, 30));

        passwordPwdBox.setBackground(new java.awt.Color(204, 204, 204));
        passwordPwdBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passwordPwdBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel2.add(passwordPwdBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 750, 40));

        viewChkBox.setBackground(new java.awt.Color(204, 204, 204));
        viewChkBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewChkBox.setText("VIEW ");
        viewChkBox.setToolTipText("View Password");
        viewChkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewChkBoxActionPerformed(evt);
            }
        });
        jPanel2.add(viewChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 60, -1));

        nicValidChkBox.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(nicValidChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        mobileValidChkBox1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(mobileValidChkBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 790, 490));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT REGISTER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 800, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 420, 10));

        directToLoginLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        directToLoginLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        directToLoginLbl.setText("ALREADY HAVE AN ACCOUNT - CLICK TO LOGIN");
        directToLoginLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                directToLoginLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                directToLoginLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                directToLoginLblMouseExited(evt);
            }
        });
        jPanel1.add(directToLoginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 350, 20));

        backBtn.setBackground(new java.awt.Color(153, 153, 153));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_left_arrow_24px_2.png"))); // NOI18N
        backBtn.setToolTipText("Back");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBtnMouseExited(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 70, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 350, 10));

        closeBtn1.setBackground(new java.awt.Color(153, 153, 153));
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
        jPanel1.add(closeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 590, 70, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dateTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtBoxActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void closeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtn1ActionPerformed
        JFrame f = new JFrame();
        if (JOptionPane.showConfirmDialog(f, "DO YOU WANT TO EXIT") == JOptionPane.YES_NO_OPTION) {
            java.lang.System.exit(0);
        }
    }//GEN-LAST:event_closeBtn1ActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        nicTxtBox.setText("");
        stdIDTxtBox.setText("");
        fullNameTxtBox.setText("");
        mobileTxtBox.setText("");
        monthTxtBox.setText("MONTH");
        dateTxtBox.setText("DATE");
        yearTxtBox.setText("YEAR");
        emailTxtBox.setText("");
        passwordPwdBox.setText("");

        dateTxtBox.setForeground(new Color(153, 153, 153));
        monthTxtBox.setForeground(new Color(153, 153, 153));
        yearTxtBox.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_clearBtnActionPerformed

    private void viewChkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewChkBoxActionPerformed
        if (viewChkBox.isSelected()) {
            if (passwordPwdBox.getEchoChar() == '*') {

                passwordPwdBox.setEchoChar((char) 0);

            } else {
                passwordPwdBox.setEchoChar('*');

            }
        } else {
            if (passwordPwdBox.getEchoChar() == '*') {

                passwordPwdBox.setEchoChar((char) 0);

            } else {
                passwordPwdBox.setEchoChar('*');

            }
        }
    }//GEN-LAST:event_viewChkBoxActionPerformed

    private void directToLoginLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directToLoginLblMouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_directToLoginLblMouseClicked

    private void registerBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseEntered
        registerBtn.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_registerBtnMouseEntered

    private void registerBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseExited
        registerBtn.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_registerBtnMouseExited

    private void clearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseEntered
        clearBtn.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_clearBtnMouseEntered

    private void clearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseExited
        clearBtn.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_clearBtnMouseExited

    private void closeBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtn1MouseEntered
        closeBtn1.setBackground(Color.red);
    }//GEN-LAST:event_closeBtn1MouseEntered

    private void closeBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtn1MouseExited
        closeBtn1.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_closeBtn1MouseExited

    private void backBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseEntered
        backBtn.setBackground(Color.red);
    }//GEN-LAST:event_backBtnMouseEntered

    private void backBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseExited
        backBtn.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_backBtnMouseExited

    private void directToLoginLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directToLoginLblMouseEntered
        directToLoginLbl.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_directToLoginLblMouseEntered

    private void directToLoginLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directToLoginLblMouseExited
        directToLoginLbl.setForeground(Color.BLACK);
    }//GEN-LAST:event_directToLoginLblMouseExited

    private void yearTxtBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearTxtBoxMouseClicked
        if (yearTxtBox.getText().equals("YEAR")) {
            yearTxtBox.setText("");
            yearTxtBox.setForeground(Color.BLACK);
        } else {
            yearTxtBox.setText("YEAR");
            yearTxtBox.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_yearTxtBoxMouseClicked

    private void monthTxtBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthTxtBoxMouseClicked
        if (monthTxtBox.getText().equals("MONTH")) {
            monthTxtBox.setText("");
            monthTxtBox.setForeground(Color.BLACK);
        } else {
            monthTxtBox.setText("MONTH");
            monthTxtBox.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_monthTxtBoxMouseClicked

    private void dateTxtBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateTxtBoxMouseClicked
        if (dateTxtBox.getText().equals("DATE")) {
            dateTxtBox.setText("");
            dateTxtBox.setForeground(Color.BLACK);
        } else {
            dateTxtBox.setText("DATE");
            dateTxtBox.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_dateTxtBoxMouseClicked

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        if (nicTxtBox.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter The NIC");
            nicTxtBox.grabFocus();
        } else if (fullNameTxtBox.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Full Name");
            fullNameTxtBox.grabFocus();
        } else if (stdIDTxtBox.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Student ID");
            stdIDTxtBox.grabFocus();
        } else if (mobileTxtBox.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Mobile Number");
            mobileTxtBox.grabFocus();
        } else if (emailTxtBox.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Email");
            emailTxtBox.grabFocus();
        } else if (passwordPwdBox.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter a Password");
            passwordPwdBox.grabFocus();
        } else if (yearTxtBox.getText().trim().equals("YEAR")) {
            JOptionPane.showMessageDialog(null, "Please Enter Birth Year");
            yearTxtBox.grabFocus();
        } else if (monthTxtBox.getText().trim().equals("MONTH")) {
            JOptionPane.showMessageDialog(null, "Please Enter Birth Month");
            monthTxtBox.grabFocus();
        } else if (dateTxtBox.getText().trim().equals("DATE")) {
            JOptionPane.showMessageDialog(null, "Please Enter Birth Date");
            dateTxtBox.grabFocus();
        } else if (monthTxtBox.getText().trim().equals("MONTH")) {
            JOptionPane.showMessageDialog(null, "Please Enter Birth Month");
            monthTxtBox.grabFocus();
        } else if (!mobileValidChkBox1.isSelected()) {
            JOptionPane.showMessageDialog(null, "Incorrect Mobile Number");
            mobileTxtBox.setText("");
            mobileTxtBox.grabFocus();
        } else if (!nicValidChkBox.isSelected()) {
            JOptionPane.showMessageDialog(null, "Incorrect NIC Number");
            nicTxtBox.setText("");
            nicTxtBox.grabFocus();
        } else {
            try {
                JFrame f = new JFrame();
                if (JOptionPane.showConfirmDialog(f, "Are all the details correct") == JOptionPane.YES_NO_OPTION) {

                    String serach = "Select * from student";
                    ResultSet rs = MyConn.search(serach);

                    int intRs = 0;
                    if (rs.next()) {
                        intRs = 1;
                    } else {
                        intRs = 0;
                    }

                    if (intRs == 1) {
                        JOptionPane.showMessageDialog(null, "Already Registerd for the system");
                    } else {
                        
                        String birthDay = yearTxtBox.getText() + "." + monthTxtBox.getText() + "." + dateTxtBox.getText();
                        String registerStudent = "Insert into student (StudentID, Name, NIC, DOB, Mobile, Email, Password) values ('" + stdIDTxtBox.getText() + "', '" + fullNameTxtBox.getText() + "', '" + nicTxtBox.getText() + "', '" + birthDay + "', '" + mobileTxtBox.getText() + "', '" + emailTxtBox.getText() + "', '" + passwordPwdBox.getText() + "')";
                        MyConn.save(registerStudent);
                        JOptionPane.showMessageDialog(null, "SuccesFully Saved");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Save Unsuccessfull");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void nicTxtBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicTxtBoxKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9') && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Only numbers are accepted");
        }
    }//GEN-LAST:event_nicTxtBoxKeyTyped

    private void mobileTxtBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileTxtBoxKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9') && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Only numbers are accepted");
        }
    }//GEN-LAST:event_mobileTxtBoxKeyTyped

    private void nicTxtBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicTxtBoxKeyPressed
        String s = nicTxtBox.getText();
        int len = s.length();
        char c = evt.getKeyChar();

        if (c >= '0' && c <= '9') {
            if (len <= 12) {
                nicTxtBox.setEditable(true);
            } else {
                nicValidChkBox.setSelected(true);
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_nicTxtBoxKeyPressed

    private void mobileTxtBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileTxtBoxKeyPressed
        String s = mobileTxtBox.getText();
        int len = s.length();
        char c = evt.getKeyChar();

        if (c >= '0' && c <= '9') {
            if (len <= 10) {
                mobileTxtBox.setEditable(true);
            } else {
                mobileValidChkBox1.setSelected(true);
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_mobileTxtBoxKeyPressed

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
            java.util.logging.Logger.getLogger(StudentRegiter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegiter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegiter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegiter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegiter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn1;
    private javax.swing.JTextField dateTxtBox;
    private javax.swing.JLabel directToLoginLbl;
    private javax.swing.JTextField emailTxtBox;
    private javax.swing.JTextField fullNameTxtBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField mobileTxtBox;
    private javax.swing.JCheckBox mobileValidChkBox1;
    private javax.swing.JTextField monthTxtBox;
    private javax.swing.JTextField nicTxtBox;
    private javax.swing.JCheckBox nicValidChkBox;
    private javax.swing.JPasswordField passwordPwdBox;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField stdIDTxtBox;
    private javax.swing.JCheckBox viewChkBox;
    private javax.swing.JTextField yearTxtBox;
    // End of variables declaration//GEN-END:variables
}
