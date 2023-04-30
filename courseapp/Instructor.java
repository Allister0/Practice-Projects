///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name: Allister Bell Jr
// Date: 4/25/23
// Class: CITP 190
// Abstract: Instructor class for instructor object
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.bella41.courseapp;
public class Instructor extends Person {
    private String title;
    private String department;
    
    // Default constructor
    public Instructor() {
        super(); // Call parent class (Person) default constructor
        title = "";
        department = "";
    }
    
    // Parameterized constructor
    public Instructor(String personId, String firstName, String lastName, String title, String department) {
        super(personId, firstName, lastName); // Call parent class (Person) parameterized constructor
        this.title = title;
        this.department = department;
    }
    
    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    // Override toString() method to return instructor information
    @Override
    public String toString() {
        return """
               Instructor:
                 Name: """ + getFirstName() + " " + getLastName() + "\t ID: " + getPersonId() + "\t" + " Title: " + title + "\t" +  "Department: " + department + "\n";
    }
}
