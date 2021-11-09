package com.company.Repository;

import com.company.Model.Course;

import java.util.Objects;

public class CourseRepository extends InMemoryRepository<Course>{
    public CourseRepository(){
        super();
    }

    /**
     *updates the name, teacher, number of Credits and maximum enrollment from a course
     * with the attributes of a course given as parameter
     * @param object
     * @return updated course
     */
    @Override
    public Course update(Course object){
        Course courseToUpdate = this.repoList.stream()
                .filter(course -> Objects.equals(course.getName(), object.getName()))
                .findFirst()
                .orElseThrow();
        courseToUpdate.setName(object.getName());
        courseToUpdate.setTeacher(object.getTeacher());
        courseToUpdate.setCredits(object.getCredits());
        courseToUpdate.setMaxEnrollment(object.getMaxEnrollment());

        return courseToUpdate;
    }
}
