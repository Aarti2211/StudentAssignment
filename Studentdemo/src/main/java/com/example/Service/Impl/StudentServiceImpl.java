package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Student;
import com.example.Repository.StudentRepository;
import com.example.Service.StudentService;

	// Repository annotation used to indicate that the class provides the mechanism for storage, 
	//retrieval, update, delete and search operation on objects
@Repository
public class StudentServiceImpl implements StudentService{
	
		//this annotation used to automatic dependency injection
	@Autowired
	StudentRepository studentRepository;
	
		//This method use to create student 
	@Override
	public Student createStudent(Student student) {
		
		return studentRepository.save(student) ;
	}

		//This method used to find student or get student
	@Override
	public List<Student> findAllStudent() {
		
		return studentRepository.findAll();
	}
	
	
		//this method used to delete student
	@Override
	public void deleteStudent(int id) {
		
		studentRepository.deleteById(id);
	}
	
		//this method used to update student record 

	@Override
	public Student updateStudent(Student student) {
		Student _student=studentRepository.findById(student.getId()).get();
		_student.setName(student.getName());
		_student.setEmail(student.getEmail());
		_student.setContactno(student.getContactno());
		_student.setAge(student.getAge());
		_student.setAddress(student.getAddress());
		return studentRepository.save(_student);
	}

		//this method used to find student by it's id
	@Override
	public List<Student> findByid(int id) {
		
		return studentRepository.findByid(id);
	}
			//this method used to find student by it's name
	@Override
	public List<Student> findByname(String name) {
		
		return studentRepository.findByname(name);
	}

}
