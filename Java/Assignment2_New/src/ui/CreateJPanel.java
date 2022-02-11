/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.CarInfo;
import model.CarInfoCatalog;

/**
 *
 * @author SHRISHTI
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    private JPanel userProcessContainer;
    private CarInfoCatalog catalog;
    private CarInfo carInfo;
    
    public CreateJPanel(JPanel userProcessContainer, CarInfoCatalog catalog, CarInfo carInfo) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.catalog = catalog;
        this.carInfo = carInfo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCompanyName = new javax.swing.JLabel();
        lblModelName = new javax.swing.JLabel();
        lblManufactureYear = new javax.swing.JLabel();
        lblNoOfSeats = new javax.swing.JLabel();
        lblSerialNo = new javax.swing.JLabel();
        txtModelName = new javax.swing.JTextField();
        txtCompanyName = new javax.swing.JTextField();
        txtNoOfSeats = new javax.swing.JTextField();
        txtSerialNo = new javax.swing.JTextField();
        txtManufactureYear = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblAVailability = new javax.swing.JLabel();
        lblAVailability1 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblSerialNo1 = new javax.swing.JLabel();
        txtCertificateExpirationDate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        rb_yes = new javax.swing.JRadioButton();
        rb_no = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter New Car Details");

        lblCompanyName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCompanyName.setText("Company Name : *");

        lblModelName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblModelName.setText("Model Number : *");

        lblManufactureYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblManufactureYear.setText("Manufacture Year : *");

        lblNoOfSeats.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNoOfSeats.setText("No. of Seats : *");

        lblSerialNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSerialNo.setText("Serial Number : *");

        txtModelName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtModelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNameActionPerformed(evt);
            }
        });

        txtCompanyName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyNameActionPerformed(evt);
            }
        });

        txtNoOfSeats.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNoOfSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfSeatsActionPerformed(evt);
            }
        });

        txtSerialNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSerialNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNoActionPerformed(evt);
            }
        });

        txtManufactureYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtManufactureYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufactureYearActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 153, 204));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Add Car");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblAVailability.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAVailability.setText("Availability : *");

        lblAVailability1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAVailability1.setText("City : *");

        txtCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblSerialNo1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSerialNo1.setText("Certificate Expiration Date : *");

        txtCertificateExpirationDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCertificateExpirationDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCertificateExpirationDateActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_yes);
        rb_yes.setText("Yes");
        rb_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_yesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_no);
        rb_no.setText("No");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setText("* indicates mandatory fields");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Add files.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblCompanyName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblModelName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblManufactureYear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblNoOfSeats))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblSerialNo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblAVailability))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(lblAVailability1))
                    .addComponent(lblSerialNo1))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtModelName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(rb_yes)
                        .addGap(66, 66, 66)
                        .addComponent(rb_no))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtCertificateExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4))
                    .addComponent(btnSave))
                .addGap(68, 68, 68)
                .addComponent(jLabel5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblCompanyName)
                        .addGap(28, 28, 28)
                        .addComponent(lblModelName)
                        .addGap(28, 28, 28)
                        .addComponent(lblManufactureYear)
                        .addGap(28, 28, 28)
                        .addComponent(lblNoOfSeats)
                        .addGap(28, 28, 28)
                        .addComponent(lblSerialNo)
                        .addGap(28, 28, 28)
                        .addComponent(lblAVailability)
                        .addGap(28, 28, 28)
                        .addComponent(lblAVailability1)
                        .addGap(23, 23, 23)
                        .addComponent(lblSerialNo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtModelName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_no)
                            .addComponent(rb_yes))
                        .addGap(27, 27, 27)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCertificateExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addComponent(btnSave))
                    .addComponent(jLabel5)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNameActionPerformed

    private void txtCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyNameActionPerformed

    private void txtNoOfSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfSeatsActionPerformed

    private void txtSerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNoActionPerformed

    private void txtManufactureYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufactureYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufactureYearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txtCompanyName.getText().isBlank() || txtModelName.getText().isBlank() || txtManufactureYear.getText().isEmpty() || txtNoOfSeats.getText().isEmpty() ||
                txtSerialNo.getText().isBlank()  || txtCity.getText().isEmpty() || txtCertificateExpirationDate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mandatory fields cannot be blank!!");
        } else if (!Pattern.matches("\\d{5}", txtModelName.getText())){
            JOptionPane.showMessageDialog(this, "Model Number should be numeric and 5 digit only!");
        } else if (!Pattern.matches("[0-9]{4}", txtManufactureYear.getText())){
            JOptionPane.showMessageDialog(this, "Year of manufacture should be 4 digits only!");
        } else if (!Pattern.matches("[0-9]{1}", txtNoOfSeats.getText())){
            JOptionPane.showMessageDialog(this, "Number of seats should be numeric and cannot be greater than 9!");
        } else if (!Pattern.matches("[a-zA-Z{2}0-9]{6}", txtSerialNo.getText())){
            JOptionPane.showMessageDialog(this, "Serial Number is in incorrect format!");
        } else if (!Pattern.matches("([a-zA-Z',.-]+( [a-zA-Z',.-]+)*){2,30}", txtCity.getText())){
            JOptionPane.showMessageDialog(this, "City should be aplhabetic only");
        } else if (!Pattern.matches("[0-9]{4}", txtManufactureYear.getText())) {
            JOptionPane.showMessageDialog(this, "Year of certificate expiration should be 4 digits only!");
        }
        else {    
            String company = txtCompanyName.getText();
            int model = Integer.parseInt(txtModelName.getText());
            int manufactureYear = Integer.parseInt(txtManufactureYear.getText());
            int noOfSeats = Integer.parseInt(txtNoOfSeats.getText());
            String serialNo = txtSerialNo.getText();
            String city = txtCity.getText();
            int certificateExpirationDate = Integer.parseInt(txtCertificateExpirationDate.getText());

            CarInfo ci = catalog.addNewCar();

            ci.setCompany(company);
            ci.setModel(model);
            ci.setNoOfSeats(noOfSeats);
            ci.setSerialNo(serialNo);
            ci.setManufactureYear(manufactureYear);
//            ci.setAvailability(availability);
            ci.setCity(city);
            ci.setCertificateExpirationDate(certificateExpirationDate);
            if(rb_yes.isSelected()) {
                ci.setAvailabilityStatus("Yes");
            } else if (rb_no.isSelected()){
                ci.setAvailabilityStatus("No");
            }
            JOptionPane.showMessageDialog(this, "New Car Added to Catalog!");

            txtCompanyName.setText("");
            txtModelName.setText("");
            txtManufactureYear.setText("");
            txtNoOfSeats.setText("");
            txtSerialNo.setText("");
//            txtAvailability.setText("");
            txtCity.setText("");
            txtCertificateExpirationDate.setText("");
            buttonGroup1.clearSelection();
        
        } 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCertificateExpirationDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCertificateExpirationDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCertificateExpirationDateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rb_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_yesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_yesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAVailability;
    private javax.swing.JLabel lblAVailability1;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblManufactureYear;
    private javax.swing.JLabel lblModelName;
    private javax.swing.JLabel lblNoOfSeats;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JLabel lblSerialNo1;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_yes;
    private javax.swing.JTextField txtCertificateExpirationDate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtModelName;
    private javax.swing.JTextField txtNoOfSeats;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables
}