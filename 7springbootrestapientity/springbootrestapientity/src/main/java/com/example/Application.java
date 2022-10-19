package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages= {"com.example"})
@ComponentScan(basePackages= "com.example")
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
		
	}

}
