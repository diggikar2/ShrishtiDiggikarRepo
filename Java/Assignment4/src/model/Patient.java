/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SHRISHTI
 */
public class Patient {
    
    private String patientID;
    private String doctor;
    private String pharmacy;
    private VitalSignsHistory vitalSignsHistory;

    public Patient() {
        this.vitalSignsHistory = new VitalSignsHistory();
    }
    
    public VitalSignsHistory getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(VitalSignsHistory vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    }
}
