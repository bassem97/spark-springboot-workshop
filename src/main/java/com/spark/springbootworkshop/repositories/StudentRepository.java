package com.spark.springbootworkshop.repositories;

import com.spark.springbootworkshop.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
