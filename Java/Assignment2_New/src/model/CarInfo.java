/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author SHRISHTI
 */
public class CarInfo {
    
    
    String company;
    int model;
    int manufactureYear;
    int noOfSeats;
    String serialNo;  
    int availability;
    String availabilityStatus;
    String status;
    String city;
    Date createdOn;
    int certificateExpirationDate;

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    
    public int getCertificateExpirationDate() {
        return certificateExpirationDate;
    }

    public void setCertificateExpirationDate(int certificateExpirationDate) {
        this.certificateExpirationDate = certificateExpirationDate;
    }

    public CarInfo() {
        this.status = "Created";
        this.createdOn = new Date();
        System.out.print(this.createdOn);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    
    
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    
    @Override
    public String toString(){
        return company;
    }
}
