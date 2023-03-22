package com.example.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Service.StudentService;

	//This annotation used to process the HTTP request from client 
@RestController
public class StudentController {
	
		//this annotation used automatic dependency injection
	
	@Autowired
	StudentService studentService;
	
		//This annotation used to mapping the HTTP Post request with specific handler method
	
	@PostMapping("/student")
	public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student)
	
		//@RequestBody annotation used to indicate the method parameter should be bound to body of web request 
	{
		return new ResponseEntity<Student>( studentService.createStudent(student),HttpStatus.CREATED);
	}
	
		//This annotation used to mapping HTTP Get request with specific handler method
	@GetMapping("/student")
	public List<Student> findAllStudent()
	{
		return studentService.findAllStudent();
	}
	
		//This annotation used to mapping HTTP Delete request with specific handler method
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable int id)
	
			//@PathVariable is a Spring annotation which indicates that a method parameter should
			//be bound to a URI template variable
	
	{
		studentService.deleteStudent(id);
		return "Student deleted";
	}
	
	   //This annotation used to mapping HTTP Put request with specific handler method
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentService.updateStudent(student);
	}
	
	//This annotation used to mapping HTTP Get request with specific handler method
	
	@GetMapping("/student/id/{id}")
	public List<Student> findByid(@PathVariable int id)
	{
		return studentService.findByid(id);
	}
	
	//This annotation used to mapping HTTP Get request with specific handler method
	
	@GetMapping("/student/name/{name}")
	public List<Student> findByname(@PathVariable String name)
	{
		return studentService.findByname(name);
	}
}
