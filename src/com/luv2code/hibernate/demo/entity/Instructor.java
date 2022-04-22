package com.luv2code.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {

	//annotate the class as an entity and map to db table
	
	
		//define the fields 
		
		
		//annotate the fields with db column names
		
		//** set up mapping to InstructorDetail entity
		//create constructors
		
		
		//generate getter/setter methods
		
		
		//generate toString() method
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="first_name")
		private String firstName;
		
		@Column(name="last_name")
		private String lastName;
		
		@Column(name="email")
		private String email;
	
}
