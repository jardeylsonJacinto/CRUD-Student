package com.test.CRUDStudent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.CRUDStudent.model.Student;
import com.test.CRUDStudent.repository.StudentRepository;

//defining the business logic
@Service
public class StudentService {
  @Autowired
  StudentRepository studentRepository;

  // getting all student records
  public List<Student> getAllStudent() {
    List<Student> students = new ArrayList<Student>();
    studentRepository.findAll().forEach(student -> students.add(student));
    return students;
  }

  // getting a specific record
  public Student getStudentById(int id) {
    return studentRepository.findById(id).get();
  }

  public void saveOrUpdate(Student student) {
    studentRepository.save(student);
  }

  // deleting a specific record
  public void delete(int id) {
    studentRepository.deleteById(id);
  }
}
