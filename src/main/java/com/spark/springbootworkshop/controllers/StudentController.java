package com.spark.springbootworkshop.controllers;

import com.spark.springbootworkshop.entities.Student;
import com.spark.springbootworkshop.services.student.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
//    http://localhost:8080/students
public class StudentController {


    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }



    @GetMapping("")     //    http://localhost:8080/students
    public List<Student> findAllStudents() {
        return studentService.findAll();
    }

    @PostMapping("")// POST   http://localhost:8080/students
    public Student addStudent (@RequestBody Student student) throws Exception {
        return studentService.add(student);
    }

    @PutMapping("/{id}")// PUT    http://localhost:8080/students
    public Student updateStudent (@RequestBody Student student,@PathVariable("id") Long idStudent) throws Exception {
        return studentService.update(student,idStudent);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Long idStudent){
        studentService.delete(idStudent);
    }



}
