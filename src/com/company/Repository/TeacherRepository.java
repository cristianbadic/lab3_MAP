package com.company.Repository;

import com.company.Model.Teacher;

import java.util.Objects;

public class TeacherRepository extends InMemoryRepository<Teacher> {
    public TeacherRepository() {
        super();
    }

    /**
     *updates the firstName and lastName of a teacher in the repoList with the attributes of a teacher given as parameter
     * @param object
     * @return updated teacher
     */
    @Override
    public Teacher update(Teacher object) {
        Teacher teacherToUpdate = this.repoList.stream()
                .filter(teacher -> Objects.equals(teacher.getFirstName(), object.getFirstName()) ||
                        Objects.equals(teacher.getLastName(), object.getLastName()))
                .findFirst()
                .orElseThrow();
        teacherToUpdate.setFirstName(object.getFirstName());
        teacherToUpdate.setFirstName(object.getLastName());
        return teacherToUpdate;
    }
}