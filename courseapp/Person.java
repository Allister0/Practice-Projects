///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name: Allister Bell Jr
// Date: 4/25/23
// Class: CITP 190
// Abstract: 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.bella41.courseapp;
public abstract class Person implements Comparable <Person> {
    private String personId;
    private String lastName;
    private String firstName;
  
     // Default constructor
    public Person() {
    }

    // Constructor with parameters
    public Person(String personId, String lastName, String firstName) {
        this.personId = personId;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    //getters and setters for each instance 
    public String getPersonId()
    {
        return personId;
    }
    public void setPersonId(String personId) 
    {
        this.personId = personId;  
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    } 
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }  
    
// Override toString method to return the person's information separated by tabs 
  
public String tostring(){
         return String.format("{Person id#: %s\tLast Name: %s\tFirst Name: %s}", personId, lastName, firstName);
}  

 // Override compareTo method to compare Person objects by last name and then first name
@Override
public int compareTo(Person other){
    int lastNameCmp = this.lastName.compareTo(other.getLastName());
    if (lastNameCmp != 0) {
        return lastNameCmp;
    }
    return this.firstName.compareTo(other.getFirstName());
}
}
