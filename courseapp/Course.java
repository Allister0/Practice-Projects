///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name: Allister Bell Jr
// Date: 4/25/23
// Class: CITP 190
// Abstract: Course class containing a default constructor and a parameter constructor, getters setters and string builders to helpwith displaying course values 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.bella41.courseapp;
import java.util.*;
public class Course {
    //instances created
    private String courseId;
    private String courseName;
    private String courseCode;
    private Instructor instructor;
    private final List<Student> roster;
    
    //Default constructor
    public Course(){
        this.roster = new ArrayList<Student>();
        
    }
    //  Parameter constructor
    public Course(String courseId, String courseName, String courseCode, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.roster = new ArrayList<>();
    }
    // creating getters and setters for the instances
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Student> getRoster() {
        return roster;
    }
    // method for adding students to the roster
    public void addStudent(Student student) {
        roster.add(student);
        Collections.sort(roster);
    }
    // methods for removing students from roster
    public void removeStudent(String personId) {
        for (Iterator<Student> iterator = roster.iterator(); iterator.hasNext();) {
            Student student = iterator.next();
            if (student.getPersonId().equals(personId)) {
                iterator.remove();
                break;
            }
        }
    }
    //string builder method for presenting roster in string format
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course ID: ")
          .append(courseId).append("\n")
          .append("Course Name: ")
          .append(courseName).append("\n")
          .append("Course Code: ")
          .append(courseCode).append("\n\n")
          .append("Instructor\n")
          .append("-------------------------\n")
          .append(instructor.toString()).append("\n\n")
          .append("Student Roster\n")
          .append("-------------------------\n");
        for (Student student : roster) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }
}