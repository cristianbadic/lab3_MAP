package com.company.Model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private List<Course> courses;

    public Teacher(String firstName, String lastName){
        super(firstName, lastName);
        this.courses = new ArrayList<>();
    }


    public List<Course> getCourses() {
        return courses;
    }

    /**
     * adds a new course to the list courses
     * @param course an element of type course
     */
    public void addCourses(Course course){
        courses.add(course);
    }

    /**
     * removes a course from the list  courses
     * @param course an element of type course
     */
    public void removeCourses(Course course){
        courses.remove(course);
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName=" + this.getFirstName() +
                "lastName=" + this.getLastName() +
                "courses=" + courses +
                '}';
    }
}
