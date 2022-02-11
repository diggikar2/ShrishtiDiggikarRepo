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
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory() {
        personDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonHistory() {
        return personDirectory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personDirectory = personHistory;
    }
    
    public Person addPerson(){
        Person newPerson = new Person();
        personDirectory.add(newPerson);
        return newPerson;
    }
    
    public void deletePerson(Person person) {
        personDirectory.remove(person);
    }
    
    public ArrayList<Person> searchPatient(String key)
    {
        ArrayList<Person> searchPatientDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getFirstName().toLowerCase().startsWith(key.toLowerCase()) || person.getLastName().startsWith(key.toLowerCase()))
            {
                if(person.getPatient()!=null)
                {
                    searchPatientDirectory.add(person);
                }
            }
        }
        return searchPatientDirectory;
    }
    
    public ArrayList<Person> searchPerson(String key)
    {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getFirstName().toLowerCase().startsWith(key.toLowerCase()) || person.getLastName().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
}
