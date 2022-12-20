package com.spark.springbootworkshop.repositories;

import com.spark.springbootworkshop.entities.Classroom;
import com.spark.springbootworkshop.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom,Long> {
}
