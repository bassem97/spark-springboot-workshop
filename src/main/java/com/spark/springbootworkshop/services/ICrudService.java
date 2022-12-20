package com.spark.springbootworkshop.services;

import com.spark.springbootworkshop.entities.Student;

import java.util.List;

public interface ICrudService<Class,TypeId> {

    List<Class> findAll();
    Class add(Class class1) throws Exception;

    void delete(TypeId id);

    Class update(Class Class1, TypeId id) throws Exception;
}
