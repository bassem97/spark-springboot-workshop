package com.spark.springbootworkshop.repositories;

import com.spark.springbootworkshop.entities.Classroom;
import com.spark.springbootworkshop.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom,Long> {
}
