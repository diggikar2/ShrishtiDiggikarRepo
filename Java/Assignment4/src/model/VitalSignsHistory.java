/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author SHRISHTI
 */
public class VitalSignsHistory {
    private ArrayList<VitalSigns> history;
    
    public VitalSignsHistory(){
        history = new ArrayList<>();
    }
    
    public ArrayList<VitalSigns> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns createAndAddVitalSign() {
        VitalSigns vitalSigns = new VitalSigns();
        history.add(vitalSigns);
        return vitalSigns;
    }
    
    public void deleteVitalSign(VitalSigns vitalSign) {
        history.remove(vitalSign);
    }
}
