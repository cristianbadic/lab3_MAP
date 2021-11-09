package com.company.Repository;

import com.company.Model.Student;

import java.util.Objects;

public class StudentRepository extends InMemoryRepository<Student>{
    public StudentRepository(){
        super();
    }

    /**
     *updates the firstName and lastName of a student in the repoList with the attributes of a student given as parameter
     * @param object
     * @return updated student
     */
    @Override
    public Student update(Student object){
        Student studentToUpdate = this.repoList.stream()
                .filter(student -> student.getStudentId() == object.getStudentId())
                .findFirst()
                .orElseThrow();
        studentToUpdate.setFirstName(object.getFirstName());
        studentToUpdate.setLastName(object.getLastName());

        return studentToUpdate;
    }
}
