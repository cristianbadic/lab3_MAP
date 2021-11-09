package com.company.Model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Person teacher;
    private int maxEnrollment;
    private int credits;
    private List<Student> studentsEnrolled;

    public Course(String name, Person teacher, int maxEnrollment, int credits){
        this.name = name;
        this.teacher = teacher;
        this.maxEnrollment = maxEnrollment;
        this.credits = credits;
        this.studentsEnrolled = new ArrayList<>();
    }

    public int getCredits() {
        return credits;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public String getName() {
        return name;
    }

    public Person getTeacher() {
        return teacher;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    /**
     *when the nr. of credits of a course is updated, we need to check if the credits of the curse can be updatet
     * in the EnrolledCourses list of the students that are enrolled to this course, that's why the ypdateCourses method is used
     * for each student
     * @param newCredits the new number of credits
     */
    public void setCredits(int newCredits) {
        for (Student student : this.studentsEnrolled)
            student.updateCourses(this, newCredits);

        this.credits = newCredits;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void addStudents(Student student){
            this.studentsEnrolled.add(student);
    }

    /**
     * removes a student from the list studentEnrolled
     * @param student an element of type Student
     */
    public void removeStudents(Student student){
        this.studentsEnrolled.remove(student);
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", person=" + teacher +
                ", maxEnrollment=" + maxEnrollment +
                ", credits=" + credits +
                '}';
    }
}
