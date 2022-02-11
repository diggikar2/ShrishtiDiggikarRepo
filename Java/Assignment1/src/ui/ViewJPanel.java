/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.DateFormatter;
import model.Product;

/**
 *
 * @author SHRISHTI
 */
public class ViewJPanel extends javax.swing.JPanel {
    Product product;
    
    public ViewJPanel(Product product) {
        initComponents();
        this.product = product;
        validateValues();
        displayProduct();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblGeographicData = new javax.swing.JLabel();
        lblMobileNum = new javax.swing.JLabel();
        txtGeographicData = new javax.swing.JTextField();
        txtMobileNum = new javax.swing.JTextField();
        txtVehicleIden = new javax.swing.JTextField();
        lblHomeNumber = new javax.swing.JLabel();
        txtHomeNum = new javax.swing.JTextField();
        lblFaxNumber = new javax.swing.JLabel();
        txtFaxNumber = new javax.swing.JTextField();
        lblEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblMedicalRecordNumber = new javax.swing.JLabel();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        lblHPBN = new javax.swing.JLabel();
        txtHPBN = new javax.swing.JTextField();
        lblBankAccNum = new javax.swing.JLabel();
        txtBankAccNum1 = new javax.swing.JTextField();
        lblBankAccNum2 = new javax.swing.JLabel();
        txtBankAccNum2 = new javax.swing.JTextField();
        lblCertNum = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLicenceNum = new javax.swing.JTextField();
        lblVehicleIden = new javax.swing.JLabel();
        txtDeviceIden = new javax.swing.JTextField();
        lblDeviceIden = new javax.swing.JLabel();
        lblLinkdedIn = new javax.swing.JLabel();
        txtLinkedIn = new javax.swing.JTextField();
        txtIPAddr = new javax.swing.JTextField();
        lblIPAddr = new javax.swing.JLabel();
        lblIPAddr1 = new javax.swing.JLabel();
        lblUploadPic = new javax.swing.JLabel();
        txtUniqueIden = new javax.swing.JTextField();
        lblUploadPic1 = new javax.swing.JLabel();
        lblBankAccNUm2 = new javax.swing.JLabel();
        lblUploadPicc = new javax.swing.JLabel();
        lblUploadPicc1 = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        lblBiometricIden = new javax.swing.JLabel();
        lblUploadPicc2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Product");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Profile");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-910, 10, 2872, 39));

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name :");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 60, 30));

        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDOB.setText("Date of Birth :");
        jPanel1.add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 79, 30));

        lblGeographicData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGeographicData.setText("Geographic Data :");
        jPanel1.add(lblGeographicData, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 109, 30));

        lblMobileNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMobileNum.setText("Mobile Number :");
        jPanel1.add(lblMobileNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 89, 30));

        txtGeographicData.setEditable(false);
        jPanel1.add(txtGeographicData, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 194, 30));

        txtMobileNum.setEditable(false);
        txtMobileNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNumActionPerformed(evt);
            }
        });
        jPanel1.add(txtMobileNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 194, 30));

        txtVehicleIden.setEditable(false);
        txtVehicleIden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleIdenActionPerformed(evt);
            }
        });
        jPanel1.add(txtVehicleIden, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 194, 30));

        lblHomeNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHomeNumber.setText("Home Number :");
        jPanel1.add(lblHomeNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 89, 30));

        txtHomeNum.setEditable(false);
        jPanel1.add(txtHomeNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 194, 30));

        lblFaxNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFaxNumber.setText("Fax Number :");
        jPanel1.add(lblFaxNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 89, 30));

        txtFaxNumber.setEditable(false);
        txtFaxNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtFaxNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 194, 30));

        lblEmailID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmailID.setText("Email ID :");
        jPanel1.add(lblEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 89, 30));

        txtEmailID.setEditable(false);
        jPanel1.add(txtEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 194, 30));

        lblSSN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSSN.setText("SSN :");
        jPanel1.add(lblSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 98, 30));

        txtSSN.setEditable(false);
        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });
        jPanel1.add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 194, 30));

        lblMedicalRecordNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedicalRecordNumber.setText("Medical Record Number :");
        jPanel1.add(lblMedicalRecordNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 139, 30));

        txtMedicalRecordNumber.setEditable(false);
        txtMedicalRecordNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicalRecordNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtMedicalRecordNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 194, 30));

        lblHPBN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHPBN.setText("Health Plan Beneficiary Number :");
        jPanel1.add(lblHPBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 181, 30));

        txtHPBN.setEditable(false);
        txtHPBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHPBNActionPerformed(evt);
            }
        });
        jPanel1.add(txtHPBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 194, 30));

        lblBankAccNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBankAccNum.setText("Checking Account Number :");
        jPanel1.add(lblBankAccNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 181, 30));

        txtBankAccNum1.setEditable(false);
        txtBankAccNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankAccNum1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtBankAccNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 194, 30));

        lblBankAccNum2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBankAccNum2.setText("Bank Account Number 2 :");
        jPanel1.add(lblBankAccNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1660, 540, 181, 30));

        txtBankAccNum2.setEditable(false);
        txtBankAccNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankAccNum2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtBankAccNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 194, 30));

        lblCertNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCertNum.setText("Certificate/Licence Number :");
        jPanel1.add(lblCertNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 164, 30));

        txtName.setEditable(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 194, 30));

        txtLicenceNum.setEditable(false);
        txtLicenceNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenceNumActionPerformed(evt);
            }
        });
        jPanel1.add(txtLicenceNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 194, 30));

        lblVehicleIden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehicleIden.setText("Vehicle Identifier :");
        jPanel1.add(lblVehicleIden, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 164, 30));

        txtDeviceIden.setEditable(false);
        txtDeviceIden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeviceIdenActionPerformed(evt);
            }
        });
        jPanel1.add(txtDeviceIden, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 194, 30));

        lblDeviceIden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeviceIden.setText("Device Identifier :");
        jPanel1.add(lblDeviceIden, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 164, 30));

        lblLinkdedIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLinkdedIn.setText("LinkedIn :");
        jPanel1.add(lblLinkdedIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 120, 30));

        txtLinkedIn.setEditable(false);
        txtLinkedIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedInActionPerformed(evt);
            }
        });
        jPanel1.add(txtLinkedIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 194, 30));

        txtIPAddr.setEditable(false);
        txtIPAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIPAddrActionPerformed(evt);
            }
        });
        jPanel1.add(txtIPAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 194, 30));

        lblIPAddr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIPAddr.setText("Internet Protocol Address :");
        jPanel1.add(lblIPAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 164, 30));

        lblIPAddr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIPAddr1.setText("Biometric Identifier ");
        jPanel1.add(lblIPAddr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 164, 30));

        lblUploadPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUploadPic.setText("Uploaded Photo ");
        jPanel1.add(lblUploadPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 164, 30));

        txtUniqueIden.setEditable(false);
        txtUniqueIden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniqueIdenActionPerformed(evt);
            }
        });
        jPanel1.add(txtUniqueIden, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 194, 30));

        lblUploadPic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUploadPic1.setText("Unique Identifier :");
        jPanel1.add(lblUploadPic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 150, 30));

        lblBankAccNUm2.setText("Savings Account Number : ");
        jPanel1.add(lblBankAccNUm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 140, 30));
        jPanel1.add(lblUploadPicc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 160, 150));
        jPanel1.add(lblUploadPicc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 180, 160));

        txtDob.setEditable(false);
        jPanel1.add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 190, 30));
        jPanel1.add(lblBiometricIden, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 150, 150));
        jPanel1.add(lblUploadPicc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 140, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2872, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2896, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(614, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMobileNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNumActionPerformed

    private void txtVehicleIdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleIdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleIdenActionPerformed

    private void txtFaxNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNumberActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtMedicalRecordNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicalRecordNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecordNumberActionPerformed

    private void txtHPBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHPBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHPBNActionPerformed

    private void txtBankAccNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankAccNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankAccNum1ActionPerformed

    private void txtBankAccNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankAccNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankAccNum2ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtLicenceNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenceNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenceNumActionPerformed

    private void txtDeviceIdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceIdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceIdenActionPerformed

    private void txtLinkedInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedInActionPerformed

    private void txtIPAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIPAddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIPAddrActionPerformed

    private void txtUniqueIdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniqueIdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniqueIdenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBankAccNUm2;
    private javax.swing.JLabel lblBankAccNum;
    private javax.swing.JLabel lblBankAccNum2;
    private javax.swing.JLabel lblBiometricIden;
    private javax.swing.JLabel lblCertNum;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDeviceIden;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblFaxNumber;
    private javax.swing.JLabel lblGeographicData;
    private javax.swing.JLabel lblHPBN;
    private javax.swing.JLabel lblHomeNumber;
    private javax.swing.JLabel lblIPAddr;
    private javax.swing.JLabel lblIPAddr1;
    private javax.swing.JLabel lblLinkdedIn;
    private javax.swing.JLabel lblMedicalRecordNumber;
    private javax.swing.JLabel lblMobileNum;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUploadPic;
    private javax.swing.JLabel lblUploadPic1;
    private javax.swing.JLabel lblUploadPicc;
    private javax.swing.JLabel lblUploadPicc1;
    private javax.swing.JLabel lblUploadPicc2;
    private javax.swing.JLabel lblVehicleIden;
    private javax.swing.JTextField txtBankAccNum1;
    private javax.swing.JTextField txtBankAccNum2;
    private javax.swing.JTextField txtDeviceIden;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFaxNumber;
    private javax.swing.JTextField txtGeographicData;
    private javax.swing.JTextField txtHPBN;
    private javax.swing.JTextField txtHomeNum;
    private javax.swing.JTextField txtIPAddr;
    private javax.swing.JTextField txtLicenceNum;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedicalRecordNumber;
    private javax.swing.JTextField txtMobileNum;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtUniqueIden;
    private javax.swing.JTextField txtVehicleIden;
    // End of variables declaration//GEN-END:variables

    private void displayProduct() {
        
        txtName.setText(product.getName());
        txtGeographicData.setText(product.getGeographicData());
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String d1=sdf.format(product.getDob());      
        System.out.println("********************************"+product.getDob());
        txtDob.setText(d1);
        txtMobileNum.setText(String.valueOf(product.getMobileNumber()));
        txtHomeNum.setText(String.valueOf(product.getHomeNumber()));
        txtFaxNumber.setText(String.valueOf(product.getFaxNumber()));
        txtEmailID.setText(product.getEmail());
        txtSSN.setText(product.getSSN());
        txtMedicalRecordNumber.setText(product.getMedicalRecNum());
        txtHPBN.setText(product.getHpBeneficiaryNo());
        txtBankAccNum1.setText(String.valueOf(product.getBankAccNo1()));
        txtBankAccNum2.setText(String.valueOf(product.getBankAccNo2()));
        txtLicenceNum.setText(product.getLicenceNo());
        txtVehicleIden.setText(String.valueOf(product.getVehicleIdentifier()));
        txtDeviceIden.setText(String.valueOf(product.getDeviceIdentifier()));
        txtLinkedIn.setText(product.getLinkedIn());
        txtIPAddr.setText(product.getIPAddress());
        txtUniqueIden.setText(product.getUniqueIdentifier());
      
        Image uploadPic = product.getPhoto().getScaledInstance(500, 400, Image.SCALE_SMOOTH);
        BufferedImage resizedImage = new BufferedImage(500,400,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(uploadPic,0,0,null);
        g2d.dispose();
        ImageIcon icon = new ImageIcon(resizedImage);
        lblUploadPicc.setIcon(icon);
        
        Image biometricPic = product.getBiometricIden().getScaledInstance(500, 400, Image.SCALE_SMOOTH);
        BufferedImage resizedImage1 = new BufferedImage(500,400,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d1 = resizedImage1.createGraphics();
        g2d1.drawImage(biometricPic,0,0,null);
        g2d1.dispose();
        ImageIcon icon1 = new ImageIcon(resizedImage1);
        lblBiometricIden.setIcon(icon1);
    }

    private void validateValues() {
        if(product.getPhoto() == null | product.getBiometricIden() == null | product.getBankAccNo1() == null | 
                product.getBankAccNo2() == null | product.getDeviceIdentifier() == null | product.getFaxNumber() == null | product.getHomeNumber() == null | 
                product.getDob() == null | product.getEmail() == null | product.getGeographicData() == null | product.getHpBeneficiaryNo() == null |
                product.getIPAddress() == null | product.getLicenceNo() == null | product.getLinkedIn() == null | product.getMedicalRecNum() == null | 
                product.getName() == null | product.getSSN() == null | product.getUniqueIdentifier() == null | product.getVehicleIdentifier() == null) {
        JOptionPane.showMessageDialog(this, "Please fill the form first! :)");
        }
    }
}
