///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name: Allister Bell Jr
// Date: 4/25/23
// Class: CITP 190
// Abstract: Alternative interecive CourseApp that recieves imput from user. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.bella41.courseapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InteractiveCourseApp {
    String personId;
    String lastName;
    String firstName;
    String title;
    String department;
    // Create a new ArrayList of Course objects to store all of the courses
    private static ArrayList<Course> courses = new ArrayList<Course>();

    public static void main(String[] args) {
        // Use a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Loop to allow the user to input multiple commands
        while (true) {
            System.out.print("Enter a command (add, remove, print, quit): ");
            String command = scanner.nextLine();

            // Check which command the user entered
            if (command.equals("add")) {
                // Call the addCourse method to add a new course to the ArrayList
                addCourse(scanner);
            } else if (command.equals("remove")) {
                // Call the removeCourse method to remove a course from the ArrayList
                removeCourse(scanner);
            } else if (command.equals("print")) {
                // Call the printCourses method to print out all of the courses in the ArrayList
                printCourses();
            } else if (command.equals("quit")) {
                // End the loop and exit the program
                break;
            } else {
                // If the user enters an invalid command, print an error message
                System.out.println("Invalid command.");
            }
        }

        // Close the Scanner object
        scanner.close();
    }

    private static void addCourse(Scanner scanner) {
        // Create a new Course object with default values
        Course course = new Course();

        // Get input from the user for each instance variable of the Course object
        System.out.print("Enter the course ID: ");
        course.setCourseId(scanner.nextLine());

        System.out.print("Enter the course name: ");
        course.setCourseName(scanner.nextLine());

        System.out.print("Enter the course code: ");
        course.setCourseCode(scanner.nextLine());

        // Get input from the user to create a new Instructor object for the course
        Instructor instructor = new Instructor();

        System.out.print("Enter the instructor ID: ");
        instructor.setPersonId(scanner.nextLine());

        System.out.print("Enter the instructor's last name: ");
        instructor.setLastName(scanner.nextLine());

        System.out.print("Enter the instructor's first name: ");
        instructor.setFirstName(scanner.nextLine());

        System.out.print("Enter the instructor's title: ");
        instructor.setTitle(scanner.nextLine());

        System.out.print("Enter the instructor's department: ");
        instructor.setDepartment(scanner.nextLine());

        // Set the Instructor object for the Course object
        course.setInstructor(instructor);

        // Loop to allow the user to add multiple students to the course
        while (true) {
            System.out.print("Add a student (y/n)? ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                // Create a new Student object with default values
                Student student = new Student(); 
                // Get input from the user for each instance variable of the Student object
                System.out.print("Enter the student ID: ");
                student.setPersonId(scanner.nextLine());

                System.out.print("Enter the student's last name: ");
                student.setLastName(scanner.nextLine());

                System.out.print("Enter the student's first name: ");
                student.setFirstName(scanner.nextLine());

                System.out.print("Enter the student's major: ");
                student.setMajor(scanner.nextLine());

                System.out.print("Enter the student's GPA: ");
                student.setGpa(Double.parseDouble(scanner.nextLine()));

                // Add the Student object to the Course object's roster
                course.addStudent(student);
            }  else if (answer.equalsIgnoreCase("n")) {
            // End the loop for adding students
            break;
        } else {
                // If the user enters an invalid answer, print an error message
           System.out.println("Invalid answer.");
}    // Add the Course object to the ArrayList of courses
    courses.add(course);

    // Print a message to confirm that the course was added successfully
    System.out.println("Course added successfully.");
}
    }
private static void removeCourse(Scanner scanner) {
    // Get input from the user for the course ID of the course to be removed
    System.out.print("Enter the course ID: ");
    String courseId = scanner.nextLine();

    // Loop through the ArrayList of courses to find the course with the matching ID
    for (Course course : courses) {
        if (course.getCourseId().equals(courseId)) {
            // If a matching course is found, remove it from the ArrayList and print a message
            courses.remove(course);
            System.out.println("Course removed successfully.");
            return;
        }
    }

    // If no matching course is found, print an error message
    System.out.println("Course not found.");
}

private static void printCourses() {
    // Check if there are any courses in the ArrayList
    if (courses.isEmpty()) {
        // If there are no courses, print a message
        System.out.println("No courses found.");
        return;
    }

    // Sort the ArrayList of courses by course name using the Collections.sort() method
    Collections.sort(courses, new CourseNameComparator());

    // Loop through the sorted ArrayList and print out each course
    for (Course course : courses) {
        System.out.println(course);
    }
}

        }
    
    
