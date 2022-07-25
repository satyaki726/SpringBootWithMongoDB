package com.cts.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.mongo.entities.Student;
import com.cts.mongo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(String id) {

		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public String deleteById(String id) {
		studentRepository.deleteById(id);
		return "Document deleted";
	}

}
