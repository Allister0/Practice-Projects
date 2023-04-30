///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name: Allister Bell Jr
// Date: 4/25/23
// Class: CITP 190
// Abstract: This class implements the Comparator interface with the Course type parameter, and overrides the compare method to compare two 
//           Course objects by their names. Then we can use it to sort the courses ArrayList by name in the printCourses method
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.bella41.courseapp;

import java.util.Comparator;

public class CourseNameComparator implements Comparator<Course> {

    @Override
    public int compare(Course course1, Course course2) {
        return course1.getCourseName().compareTo(course2.getCourseName());
    }

}

