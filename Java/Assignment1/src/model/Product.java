/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Date;

/**
 *
 * @author SHRISHTI
 */
public class Product {

    private String name;
    private String geographicData;
    private Date dob;
    private String licenceNo;
    private Long vehicleIdentifier;
    private Long deviceIdentifier;
    private String linkedIn;
    private String IPAddress;
    private BufferedImage photo;
    private BufferedImage biometricIden;
    private Long mobileNumber;
    private Long homeNumber;
    private Long faxNumber;
    private String email;
    private String SSN;
    private String medicalRecNum;
    private String hpBeneficiaryNo;
    private Long bankAccNo1;
    private Long bankAccNo2;
    private String uniqueIdentifier;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(Long homeNumber) {
        this.homeNumber = homeNumber;
    }
    

    public Long getBankAccNo1() {
        return bankAccNo1;
    }

    public void setBankAccNo1(Long bankAccNo1) {
        this.bankAccNo1 = bankAccNo1;
    }

    public Long getBankAccNo2() {
        return bankAccNo2;
    }

    public void setBankAccNo2(Long bankAccNo2) {
        this.bankAccNo2 = bankAccNo2;
    }
    

    public BufferedImage getBiometricIden() {
        return biometricIden;
    }

    public void setBiometricIden(BufferedImage biometricIden) {
        this.biometricIden = biometricIden;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(String geographicData) {
        this.geographicData = geographicData;
    }

    public Long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(Long faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getMedicalRecNum() {
        return medicalRecNum;
    }

    public void setMedicalRecNum(String medicalRecNum) {
        this.medicalRecNum = medicalRecNum;
    }

    public String getHpBeneficiaryNo() {
        return hpBeneficiaryNo;
    }

    public void setHpBeneficiaryNo(String hpBeneficiaryNo) {
        this.hpBeneficiaryNo = hpBeneficiaryNo;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public Long getVehicleIdentifier() {
        return vehicleIdentifier;
    }

    public void setVehicleIdentifier(Long vehicleIdentifier) {
        this.vehicleIdentifier = vehicleIdentifier;
    }

    public Long getDeviceIdentifier() {
        return deviceIdentifier;
    }

    public void setDeviceIdentifier(Long deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public BufferedImage getPhoto() {
        return photo;
    }

    public void setPhoto(BufferedImage photo) {
        this.photo = photo;
    }

    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public void setPhoto(Image imgFit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
