package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Student;

			//JPA Repository is mainly used for managing the data in a Spring Boot Application.
			//Jpa Repository contains the APIs for basic CRUD operations
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
				//Both are custom method that are defined by user
	public List<Student> findByid(int id);
	public List<Student> findByname(String name);

}
