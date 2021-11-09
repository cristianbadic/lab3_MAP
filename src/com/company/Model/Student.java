package com.company.Model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private long studentId;
    private int totalCredits;
    private List<Course> enrolledCourses;

    public Student(String firstName, String lastName, long studentId ){
        super(firstName, lastName);
        this.studentId = studentId;
        this.totalCredits = 0;
        this.enrolledCourses = new ArrayList<>();
    }

    public long getStudentId() {
        return studentId;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }


    /**
     * adds a new course to the list enrolledCourses
     * @param course an element of type course
     */
    public void addCourses(Course course){
            this.enrolledCourses.add(course);
            this.totalCredits += course.getCredits();
    }

    /**
     * removes a course from the list  enrolledCourses
     * @param course an element of type course
     */
    public void removeCourses(Course course){
        this.enrolledCourses.remove(course);
        this.totalCredits -= course.getCredits();
    }

    /**
     * updates the number of credits of a specific course, given as parameter, if the nrw value added to the other values
     * doesn't exceed 30, else the course is removed from the list of courses
     * @param course  the course to be updated
     * @param newCredit the new number of credits
     */
    public void updateCourses(Course course, int newCredit){
        if (this.totalCredits - course.getCredits() + newCredit > 30){
            removeCourses(course);
        }
        else{
            this.totalCredits = this.totalCredits - course.getCredits() + newCredit;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                "firstName=" + this.getFirstName() +
                "lastName=" + this.getLastName() +
                ", totalCredits=" + totalCredits +
                '}';
    }
}
