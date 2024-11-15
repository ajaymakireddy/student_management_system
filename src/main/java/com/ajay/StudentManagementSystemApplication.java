package com.ajay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ajay.entity.Student;
import com.ajay.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Student student1 = new Student("Ajay","Kumar","ajay@gmail.com");
		 * 
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Kumar","Makireddi","kumar@gmail.com");
		 * 
		 * studentRepository.save(student2);
		 */
	}

}
