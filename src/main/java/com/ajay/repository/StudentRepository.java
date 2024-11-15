package com.ajay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajay.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long > {

	
}
