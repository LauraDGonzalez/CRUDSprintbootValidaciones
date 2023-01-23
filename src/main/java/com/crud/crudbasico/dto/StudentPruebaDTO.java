package com.crud.crudbasico.dto;

import com.crud.crudbasico.repository.entity.Course;
import com.crud.crudbasico.repository.entity.Student;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class StudentPruebaDTO {

    private Integer id;
    private String name;
    private String lastName;
    @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate dateOfBirth;
    private Integer age;
    private Course course;

    public StudentPruebaDTO() {

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


    public StudentPruebaDTO(Student student){
        this.age = student.getId();
        this.name = student.getName();
        this.id = student.getId();
        this.lastName = student.getLastName();
        this.dateOfBirth = student.getDateOfBirth();
      this.course = student.getCourse();
        System.out.println("Este es el curso: "+ student.getCourse());


    }
}
