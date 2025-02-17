package com.test.CRUDStudent.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.CRUDStudent.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
