/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiPatient;

import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.MyStringVerifier;
import model.Patient;

/**
 *
 * @author SHRISHTI
 */
public class ViewUpdatePatientDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdatePatientDetailsJPanel
     */
    private Patient patient;
    private JPanel userProcessContainer;
    private Boolean isEdit = Boolean.FALSE;
    
    public ViewUpdatePatientDetailsJPanel(JPanel upc, Patient patient, Boolean isEdit) {
        initComponents();
        this.userProcessContainer = upc;
        this.patient = patient;
        this.isEdit = isEdit;
        addVerifiers();
        populatePatientDetails();
        modifyTextFields(this.isEdit);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPharmacy = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        patientIDJLabel = new javax.swing.JLabel();
        primaryDocNameJLabel = new javax.swing.JLabel();
        prefferedPharmacyJLabel = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 0, 204));

        txtPharmacy.setBackground(new java.awt.Color(255, 255, 255));
        txtPharmacy.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        txtPharmacy.setForeground(new java.awt.Color(255, 51, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Details");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 204));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 0, 204));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 0, 204));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        patientIDJLabel.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        patientIDJLabel.setForeground(new java.awt.Color(255, 0, 204));
        patientIDJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        patientIDJLabel.setText("Patient ID :");

        primaryDocNameJLabel.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        primaryDocNameJLabel.setForeground(new java.awt.Color(255, 0, 204));
        primaryDocNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        primaryDocNameJLabel.setText("Primary Doctor Name :");

        prefferedPharmacyJLabel.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        prefferedPharmacyJLabel.setForeground(new java.awt.Color(255, 0, 204));
        prefferedPharmacyJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        prefferedPharmacyJLabel.setText("Preffered Pharmacy :");

        txtPatientID.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientID.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N

        txtDoctorName.setBackground(new java.awt.Color(255, 255, 255));
        txtDoctorName.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1041, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(461, 461, 461))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(patientIDJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(primaryDocNameJLabel)
                                    .addComponent(prefferedPharmacyJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(402, 402, 402))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientIDJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primaryDocNameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prefferedPharmacyJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnEdit)
                    .addComponent(btnSave))
                .addContainerGap(875, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        modifyTextFields(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        if (checkBlankInput()) {
            patient.setPatientID(txtPatientID.getText());
            patient.setDoctor(txtDoctorName.getText());
            patient.setPharmacy(txtPharmacy.getText());
            JOptionPane.showMessageDialog(this, "Patient updated!!", "Update",
                JOptionPane.INFORMATION_MESSAGE);
            modifyTextFields(false);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter correct values",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientIDJLabel;
    private javax.swing.JLabel prefferedPharmacyJLabel;
    private javax.swing.JLabel primaryDocNameJLabel;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPharmacy;
    // End of variables declaration//GEN-END:variables

    private void addVerifiers() {
        InputVerifier stringVerifier = new MyStringVerifier();
        txtDoctorName.setInputVerifier(stringVerifier);
        txtPharmacy.setInputVerifier(stringVerifier);
    }

    private void populatePatientDetails() {
        txtPatientID.setText(patient.getPatientID());
        txtDoctorName.setText(patient.getDoctor());
        txtPharmacy.setText(patient.getPharmacy());
    }

        private void modifyTextFields(Boolean isEdit) {
        if (isEdit) {
            txtPatientID.setEnabled(true);
            txtDoctorName.setEnabled(true);
            txtPharmacy.setEnabled(true);
        } else {
            txtPatientID.setEnabled(false);
            txtDoctorName.setEnabled(false);
            txtPharmacy.setEnabled(false);
        }
    }

    private boolean checkBlankInput() {
        if (txtPatientID.getText().length()==0
                || txtDoctorName.getText().length() == 0
                || txtPharmacy.getText().length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
