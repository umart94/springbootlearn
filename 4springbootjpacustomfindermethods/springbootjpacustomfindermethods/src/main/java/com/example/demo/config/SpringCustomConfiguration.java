package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Student;
import com.example.demo.model.University;

@Configuration
public class SpringCustomConfiguration {
	
	@Bean(name="studentBean")
	@Scope("prototype")
	public Student getStudentBean() {
		Student studentBean = new Student(getUniversityBean());
		return studentBean;
	}
	
	@Bean(name="universityBean")
	@Scope("prototype")
	public University getUniversityBean() {
		University universityBean = new University();
		return universityBean;
	}

}
