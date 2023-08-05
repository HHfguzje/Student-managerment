package com.sm.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sm.edu.entity.Student;
import com.sm.edu.repository.StudentRepository;

@SpringBootApplication
public class StudentManagermentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagermentApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}
	
	
}
