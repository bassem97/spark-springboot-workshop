package com.spark.springbootworkshop.repositories;

import com.spark.springbootworkshop.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    boolean existsByEmail(String email);




}
