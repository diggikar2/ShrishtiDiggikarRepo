/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SHRISHTI
 */
public class VitalSigns {
    private double temperature;
    private int pulseRate;
    private int respirationRate;
    private int bloodPressure;
    private double weight;
    private Date date; 
    
    

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(date);
    }
}
