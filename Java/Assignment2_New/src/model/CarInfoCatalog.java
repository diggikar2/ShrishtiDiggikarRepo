/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SHRISHTI
 */
public class CarInfoCatalog {
    private ArrayList<CarInfo> catalog;

    public ArrayList<CarInfo> getCatalog() {
        return catalog;
    }

    public CarInfoCatalog() {
        this.catalog = new ArrayList<>();
    }

    public void setCatalog(ArrayList<CarInfo> catalog) {
        this.catalog = catalog;
    }
    
    public void carObject(){
//        System.out.println("In car object!");
       CarInfo car1 = new CarInfo();
        LocalDate date = LocalDate.now();
        car1.setCompany("Tesla");
        car1.setModel(34567);
        car1.setManufactureYear(2013);
        car1.setNoOfSeats(4);
        car1.setAvailability(1);
        car1.setSerialNo("BH4671");
        car1.setCertificateExpirationDate(2025);
        car1.setCity("Boston");
        System.out.println("set!!");
        car1.setAvailabilityStatus("Yes");
        catalog.add(car1);

        
        
        
        CarInfo car2 = new CarInfo();
        car2.setCompany("Ferrari");
        car2.setModel(16781);
        car2.setManufactureYear(2009);
        car2.setNoOfSeats(2);
        car2.setAvailability(11);
        car2.setSerialNo("NW1234");
        car2.setCertificateExpirationDate(2013);
        car2.setCity("Boston");
        car2.setAvailabilityStatus("Yes");
        
        
        CarInfo car3 = new CarInfo();
        car3.setCompany("BMW");
        car3.setModel(76511);
        car3.setManufactureYear(2018);
        car3.setNoOfSeats(6);
        car3.setAvailability(22);
        car3.setSerialNo("QR456U");
        car3.setCertificateExpirationDate(2022);
        car3.setCity("Washington DC");
        car3.setAvailabilityStatus("Yes");
        
        
        CarInfo car4 = new CarInfo();
        car4.setCompany("Mercedes Benz");
        car4.setModel(56985);
       car4.setManufactureYear(2019);
        car4.setNoOfSeats(8);
        car4.setAvailability(22);
        car4.setSerialNo("HZ5317");
        car4.setCertificateExpirationDate(2017);
        car4.setCity("Boston");
        car4.setAvailabilityStatus("Yes");
        
        
        CarInfo car5 = new CarInfo();
        car5.setCompany("Lamborgini");
        car5.setModel(80684);
        car5.setManufactureYear(2021);
        car5.setNoOfSeats(6);
        car5.setAvailability(30);
        car5.setSerialNo("TQ7246");
        car5.setCertificateExpirationDate(2029);
        car5.setCity("Boston");
        car5.setAvailabilityStatus("Yes");
      
        CarInfo car6 = new CarInfo();
        car6.setCompany("Vokswagen");
        car6.setModel(76516);
        car6.setManufactureYear(2017);
        car6.setNoOfSeats(6);
        car6.setAvailability(25);
        car6.setSerialNo("JS6260");
        car6.setCertificateExpirationDate(2027);
        car6.setCity("New York");
        car6.setAvailabilityStatus("No");
        
        CarInfo car7 = new CarInfo();
        car7.setCompany("Nissan");
        car7.setModel(78203);
        car7.setManufactureYear(2015);
        car7.setNoOfSeats(5);
        car7.setAvailability(22);
        car7.setSerialNo("QP2758");
        car7.setCertificateExpirationDate(2030);
        car7.setCity("New York");
        car7.setAvailabilityStatus("No");
        
        CarInfo car8 = new CarInfo();
        car8.setCompany("Tesla");
        car8.setModel(89548);
        car8.setManufactureYear(2018);
        car8.setNoOfSeats(4);
        car8.setAvailability(12);
        car8.setSerialNo("QR4317");
        car8.setCertificateExpirationDate(2028);
        car8.setCity("Seattle");
        car8.setAvailabilityStatus("No");
        
        CarInfo car9 = new CarInfo();
        car9.setCompany("Volkwagen");
        car9.setModel(67125);
        car9.setManufactureYear(2020);
        car9.setNoOfSeats(12);
        car9.setAvailability(1);
        car9.setSerialNo("FH4567");
        car9.setCertificateExpirationDate(2030);
        car9.setCity("Seattle");
        car9.setAvailabilityStatus("No");
       
        CarInfo car10 = new CarInfo();
        car10.setCompany("Mercedez Benz");
        car10.setModel(67232);
        car10.setManufactureYear(2004);
        car10.setNoOfSeats(6);
        car10.setAvailability(4);
        car10.setSerialNo("RH3459");
        car10.setCertificateExpirationDate(2014);
       car10.setCity("Washington DC");
        car10.setAvailabilityStatus("No");
        
          System.out.println(car1.getModel());
        
        catalog.add(car2);
        catalog.add(car3);
        catalog.add(car4);
        catalog.add(car5);
        catalog.add(car6);
        catalog.add(car7);
        catalog.add(car8);
        catalog.add(car9);
        catalog.add(car10);
    }
    
    public CarInfo addNewCar(CarInfo car){
        catalog.add(car);
        return car;
    }
    
    public CarInfo addNewCar(){
        CarInfo newCar = new CarInfo();
        catalog.add(newCar);
        return newCar;
    }
    
    public void deleteCar(CarInfo ci){
        catalog.remove(ci);
    }
    
    public void updateCar(CarInfo ci, CarInfo newCI) {
        deleteCar(ci);
        catalog.add(newCI);
    }
    
    public CarInfo firstAvailableCar(){
        return catalog.get(0);
    }
    
    
    public CarInfo searchCarByYear(int year){
        for(CarInfo cars: catalog){
            if(cars.getManufactureYear()==(year)){
                return cars;
            }
        }
        return null;
    }
    
    public CarInfo searchCarBySerialNumber(String serialNo){
        for(CarInfo cars: catalog){
            if(cars.getSerialNo().equals(serialNo)){
                return cars;
            }
        }
        return null;
    }
    
    public CarInfo searchBySeatNumber(int min, int max){
        for(CarInfo cars : catalog){
            if(cars.getNoOfSeats() >= min && cars.getNoOfSeats() <= max){
                return cars;
            }
        }
        return null;
    }
    
    public CarInfo ExpiredCertificate(){
        for(CarInfo cars : catalog){
            if(cars.getCertificateExpirationDate() >= 2021){
                return cars;
            }
        }
        return null;
    }
    
    public CarInfo searchByCompanyName(String s){
        for(CarInfo cars : catalog){
            if(cars.getCompany().equalsIgnoreCase(s)){
                return cars;
            }
        }
        return null;
    }
    
    public CarInfo searchByModel(int model){
        for(CarInfo cars : catalog){
            if(cars.getModel() == model){
                return cars;
            }
        }
        return null;
    }
    
    public CarInfo searchBySerialNo(String s){
        for(CarInfo cars : catalog){
            if(cars.getSerialNo().equalsIgnoreCase(s)){
                return cars;
            }
        }
        return null;
    }
    
    public CarInfo searchByCity(String s){
        for(CarInfo cars : catalog){
            if(cars.getCity().equalsIgnoreCase(s)){
                return cars;
            }
        }
        return null;
    }
    
    public CarInfo allAvailableCars(){
        for(CarInfo cars : catalog){
            if(cars.getAvailability()>0){
                return cars;
            }
        }
        return null;
    }
    
}
