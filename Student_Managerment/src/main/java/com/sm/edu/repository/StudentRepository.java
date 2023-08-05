package com.sm.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.edu.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{


}
