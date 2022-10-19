package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.config.SpringCustomConfiguration;
import com.example.demo.model.Student;
import com.example.demo.model.University;


@SpringBootApplication(scanBasePackages= {"com.example.demo"})
@ComponentScan(basePackages= "com.example.demo")
@EnableAutoConfiguration
public class SpringbootdemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringCustomConfiguration.class);
		University universityBean = context.getBean("universityBean",University.class);
		universityBean.setUniversityName("Bahria University Karachi Campus");
		Student studentBean = context.getBean("studentBean",Student.class);
		studentBean.setStudentId(0);
		studentBean.setStudentName("Muhammad Umar Tariq");
		studentBean.setStudentCity("Karachi");
		
		System.out.println(studentBean.getStudentUniversity().hashCode());
		System.out.println(studentBean.getStudentUniversity());
		studentBean.setStudentUniversity(universityBean);
		System.out.println(studentBean.getStudentUniversity().hashCode());
		System.out.println(studentBean.getStudentUniversity());
	}

}
