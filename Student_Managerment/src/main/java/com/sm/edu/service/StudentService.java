package com.sm.edu.service;

import java.util.List;

import com.sm.edu.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(Long id);

	Student updateStudent(Student student);
	
	void deleteStudent(Long id);
}
