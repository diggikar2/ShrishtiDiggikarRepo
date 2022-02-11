package Business;

import Business.Customer.Address;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Restaurant.Item;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import com.github.javafaker.Faker;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Faker faker = new Faker();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole());
        
        //Dummy Customer
      UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("dummycust", "123", new CustomerRole());
        Customer nc = system.getCustomerDirectory().newCustomer();
        nc.setCustomerAccount(ua1);
        nc.setFirstName("Dummy");
        nc.setLastName("Surname");
        nc.setEmailId("dummy@email.com");
        nc.setPhoneNo("9870591112");
        nc.getAddress().setStreetAddress("Street 786");
        nc.getAddress().setCity("Lahore");
        nc.getAddress().setState("Lahore");
        nc.getAddress().setCountry("Pakistan");
        nc.getAddress().setZipCode("00000");
        
        //Dummy Delivery Man
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("dummydm", "123", new DeliverManRole());
        DeliveryMan ndm= system.getDeliveryManDirectory().newDeliveryMan();
        ndm.setDeliveryManAccount(ua2);
        Address ad= new Address();
        ndm.setFirstName("Logan");
        ndm.setLastName("Paul");
        ndm.setEmailId("logan@email.com");
        ndm.setPhoneNo("7977147283");
        ad.setStreetAddress("Street 655");
        ad.setCity("Miami");
        ad.setState("MA");
        ad.setCountry("USA");
        ad.setZipCode("02012");
        ndm.setAddress(ad);
        
        UserAccount ua6 = system.getUserAccountDirectory().createUserAccount("dummydm2", "123", new DeliverManRole());
        DeliveryMan ndm1= system.getDeliveryManDirectory().newDeliveryMan();
        ndm1.setDeliveryManAccount(ua6);
        Address ad3= new Address();
        ndm1.setFirstName("Sumit");
        ndm1.setLastName("Shah");
        ndm1.setEmailId("shah@email.com");
        ndm1.setPhoneNo("9632587410");
        ad3.setStreetAddress("Street 786");
        ad3.setCity("California");
        ad3.setState("CA");
        ad3.setCountry("USA");
        ad3.setZipCode("02012");
        ndm1.setAddress(ad);
        
        //Dummy Rest Admin
        Employee e2=system.getEmployeeDirectory().createEmployee("Disha");
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("disha", "disha", new AdminRole());
        e2.setUserAccount(ua4);
        
        
        Employee e=system.getEmployeeDirectory().createEmployee("Allen");
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("dummyrest", "admin", new AdminRole());
        e.setUserAccount(ua3);
        
        Restaurant r=system.getRestaurantDirectory().newRestaurant(ua3);
        r.setRestName("Bawarchi");
        r.setContactNo("7045564766");
        Address ad2= new Address();
        ad2.setStreetAddress("Tremont Street");
        ad2.setCity("Boston");
        ad2.setState("MA");
        ad2.setCountry("USA");
        ad2.setZipCode("02115");
        r.setAddress(ad2);
        for(int j=1;j<=20;j++){
            Item i=r.getItemList().addNewItem();
            i.setItemName(faker.food().dish());
            i.setItemPrice(faker.number().numberBetween(5, 50));
        }
       
        Restaurant r2=system.getRestaurantDirectory().newRestaurant(ua4);
        r2.setRestName("Direction");
        r2.setContactNo("7738861071");
        Address ad4= new Address();
        ad4.setStreetAddress("Belmont Street");
        ad4.setCity("Boston");
        ad4.setState("MA");
        ad4.setCountry("USA");
        ad4.setZipCode("02115");
        r2.setAddress(ad3);
        for(int j=1;j<=20;j++){
            Item i=r2.getItemList().addNewItem();
            i.setItemName(faker.food().dish());
            i.setItemPrice(faker.number().numberBetween(5, 50));
        }
//        
        return system;
    }
    
}
