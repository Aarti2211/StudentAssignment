package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Student;

//This annotation used to indicate that this interface provide services also we define business logic here
@Service
public interface StudentService {
		//define abstract method
	public Student createStudent(Student student);
	public List<Student> findAllStudent();
	public void deleteStudent(int id);
	public Student updateStudent(Student student);
	public List<Student> findByid(int id);
	public List<Student> findByname(String name);

}
