///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name: Allister Bell Jr
// Date: 4/25/23
// Class: CITP 190
// Abstract: Instructor class for Student object
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.bella41.courseapp;
public class Student extends Person {
    private String major;
    private double gpa;
    //Default constructor
    public Student(){
        super();
        major = " ";
        gpa = 0;
    }
    // constructed with parameters for student object 
    public Student(String personId, String lastName, String firstName, String major, double gpa) {
        super(personId, lastName, firstName);
        this.major = major;
        this.gpa = gpa;
    }
    // getters and setters for instances
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    // converts arguments passed to String
    @Override
    public String toString() {
        return "" + getPersonId() + "\t" + getLastName() + "\t" + getFirstName() + "\t" + major + "\t" + gpa;
    }
}

