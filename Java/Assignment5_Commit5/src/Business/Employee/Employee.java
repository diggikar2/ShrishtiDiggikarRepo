/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class Employee {
    private static int temp=0;
    private String name;
    private String empId;
    private static int count = 1;
    private UserAccount userAccount;

    public Employee() {
        temp++;
        this.empId= "E"+String.valueOf(temp);
    
    }

    public static int getTemp() {
        return temp;
    }

    public static void setTemp(int temp) {
        Employee.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
