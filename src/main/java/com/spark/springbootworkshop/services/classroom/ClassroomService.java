package com.spark.springbootworkshop.services.classroom;

import com.spark.springbootworkshop.entities.Classroom;
import com.spark.springbootworkshop.repositories.ClassroomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService {


    private final ClassroomRepository classroomRepository;

    public ClassroomService(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    @Override
    public List<Classroom> findAllClassrooms() {
        return classroomRepository.findAll();
    }

    @Override
    public Classroom addClassroom(Classroom classroom) throws Exception {
        if(classroomRepository.existsByName(classroom.getName()))
            throw new Exception("classroom already exists !");
        return classroomRepository.save(classroom);
    }

    @Override
    public void deleteClassroom(Long idClassroom) {
        classroomRepository.deleteById(idClassroom);
    }

    @Override
    public Classroom updateClassroom(Classroom classroom, Long idClassroom) throws Exception {
        if(classroomRepository.findById(idClassroom).isPresent()){

            Classroom classroomToUpdate = classroomRepository.findById(idClassroom).get();
            classroomToUpdate.setName(classroom.getName());

            return classroomRepository.save(classroomToUpdate);
        }
        throw new Exception("classroom does not exist !");
    }
}
