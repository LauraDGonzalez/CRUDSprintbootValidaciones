package com.crud.crudbasico.dto;

import com.crud.crudbasico.repository.entity.Course;
import com.crud.crudbasico.repository.entity.Student;
import com.crud.crudbasico.repository.entity.Teacher;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
//import org.owasp.esapi.validation.SafeHtml;


import java.util.List;


public class CourseDTO {

    private Integer id; // Este es el id de la materia, no lo dice en el texto

    private Teacher teacher; // TODO esta es la relacion, debe ser una lista

   // @NotNull
   // @Size(min = 11, max = 14, message = "El formato de horario debe tener entre 11 y 14 caracteres")
   // @Pattern(regexp = "([01][0-9]|2[0-3]):[0-5][0-9]-([01][0-9]|2[0-3]):[0-5][0-9]", message = "El formato válido de horario es HH:MM-HH:MM")
    //@ValidTime
    private Integer schedule; // Este es el horario del curso
    @NotNull
    @Size(max = 200, message = "El tema no puede superar los 200 caracteres")
    @Pattern(regexp = "[a-zA-Z0-9 ]*", message = "El tema solo puede contener letras y números")
    //@SafeHtml
    private String topic;  // Este es el tema del curso

    List<Student> studentList;
    public CourseDTO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Integer getSchedule() {
        return schedule;
    }

    public void setSchedule(Integer schedule) {
        this.schedule = schedule;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public CourseDTO(Course course){

        this.id = course.getId();
        this.schedule = course.getSchedule();
        this.teacher = course.getTeacher();
        this.topic = course.getTopic();
       this.studentList = course.getStudentList();


    }
}
