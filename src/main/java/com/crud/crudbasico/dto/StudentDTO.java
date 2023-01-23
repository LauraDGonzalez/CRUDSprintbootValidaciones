package com.crud.crudbasico.dto;

import com.crud.crudbasico.repository.entity.Course;
import com.crud.crudbasico.repository.entity.Student;

import java.time.LocalDate;

public class StudentDTO {

    private Integer id;
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private Integer age;
    private Course course;

    public StudentDTO() {

    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate  getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate  dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public StudentDTO(Student student){
        this.age = student.getId();
        this.name = student.getName();
        this.id = student.getId();
        this.lastName = student.getLastName();
        this.dateOfBirth = student.getDateOfBirth();



    }
}


