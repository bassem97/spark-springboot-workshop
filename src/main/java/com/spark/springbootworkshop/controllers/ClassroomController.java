package com.spark.springbootworkshop.controllers;

import com.spark.springbootworkshop.entities.Classroom;
import com.spark.springbootworkshop.services.classroom.ClassroomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("classrooms")
//    http://localhost:8080/classrooms
public class ClassroomController {


    private final ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }


    @GetMapping("")     //    http://localhost:8080/classrooms
    public List<Classroom> findAllClassrooms() {
        return classroomService.findAll();
    }

    @PostMapping("")// POST   http://localhost:8080/classrooms
    public Classroom addClassroom (@RequestBody Classroom classroom) throws Exception {
        return classroomService.add(classroom);
    }

    @PutMapping("/{id}")// PUT    http://localhost:8080/classrooms
    public Classroom updateClassroom (@RequestBody Classroom classroom,@PathVariable("id") Long idClassroom) throws Exception {
        return classroomService.update(classroom,idClassroom);
    }

    @DeleteMapping("/{id}")
    public void deleteClassroom(@PathVariable("id") Long idClassroom){
        classroomService.delete(idClassroom);
    }



}
