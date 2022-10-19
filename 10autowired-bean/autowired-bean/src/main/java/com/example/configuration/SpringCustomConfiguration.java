package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.component.Student;
import com.example.component.University;

@Configuration
public class SpringCustomConfiguration {
	
	@Bean
	@Scope("prototype")
	public Student getStudentBean() {
		Student studentBean = new Student(getUniversityBean());
		return studentBean;
	}
	
	@Bean
	@Scope("prototype")
	public University getUniversityBean() {
		University universityBean = new University();
		return universityBean;
	}

}
