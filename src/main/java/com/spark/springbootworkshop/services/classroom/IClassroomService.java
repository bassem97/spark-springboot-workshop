package com.spark.springbootworkshop.services.classroom;

import com.spark.springbootworkshop.entities.Classroom;

import java.util.List;

public interface IClassroomService {
    List<Classroom> findAllClassrooms();
    Classroom addClassroom(Classroom classroom) throws Exception;

    void deleteClassroom(Long idClassroom);

    Classroom updateClassroom(Classroom classroom, Long idClassroom) throws Exception;
}
