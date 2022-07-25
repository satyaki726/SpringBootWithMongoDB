package com.cts.mongo.service;

import java.util.List;

import com.cts.mongo.entities.Student;

public interface StudentService {

	Student createStudent(Student student);

	Student getStudentById(String id);

	List<Student> getAllStudents();

	Student updateStudent(Student student);

	String deleteById(String id);

}
