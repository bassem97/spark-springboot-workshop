package com.spark.springbootworkshop.services;

import com.spark.springbootworkshop.entities.Student;
import com.spark.springbootworkshop.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService implements IStudentService {


    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) throws Exception {
        if(studentRepository.existsByEmail(student.getEmail()))
            throw new Exception("student already exists !");
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long idStudent) {
         studentRepository.deleteById(idStudent);
    }

    @Override
    public Student updateStudent(Student student, Long idStudent) throws Exception {
        if(studentRepository.findById(idStudent).isPresent()){

            Student studentToUpdate = studentRepository.findById(idStudent).get();
            studentToUpdate.setEmail(student.getEmail());
            studentToUpdate.setFirstName(student.getFirstName());
            studentToUpdate.setLastName(student.getLastName());
            studentToUpdate.setGender(student.getGender());
            studentToUpdate.setClassroom(student.getClassroom());

            return studentRepository.save(studentToUpdate);
        }
        throw new Exception("student does not exist !");
    }
}
