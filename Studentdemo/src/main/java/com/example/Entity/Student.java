package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

		

	//This annotation indicates that class has table
@Entity

	//This annotation used to give name to table
@Table(name="Anudip_Student")

	//This is POJO class(Plain old java object)
public class Student {
	
		//This is non_parameterized constructor
	public Student() {
		super();
		
	}
	
		//This is parameterized constructor
	public Student(int id, String name, String email, String contactno, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactno = contactno;
		this.address = address;
		this.age = age;
	}
	
			//generate getter and setter methods of all private variable of class
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
				
	@Id		                                           //this annotation indicate id has primary key
	@GeneratedValue(strategy=GenerationType.AUTO)		//this annotation used to auto generate id
	private int id;
	
			//This annotation used to provide validation to name field
	@NotNull(message="name is required")
	private String name;
	
			//This annotation used to provide validation to email field
	@Email(message="Enter valid email")
	private String email;
	
			//This annotation used to provide validation to contactno field
	@NotBlank(message="contact no is required")
	private String contactno;
	
	
	private String address;
	private int age;

}
