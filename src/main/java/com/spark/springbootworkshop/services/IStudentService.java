package com.spark.springbootworkshop.services;

import com.spark.springbootworkshop.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAllStudents();
    Student addStudent(Student student) throws Exception;

    void deleteStudent(Long idStudent);

    Student updateStudent(Student student, Long idStudent) throws Exception;
}
