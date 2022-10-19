package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;


@SpringBootApplication(scanBasePackages= {"com.example.demo"})
@ComponentScan(basePackages= "com.example.demo")
@EnableAutoConfiguration
public class SpringbootdemoApplication{

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		User user1 = new User();
		
		user1.setName("Muhammad Umar Tariq");
		user1.setCity("Karachi");
		user1.setStatus("bachelor of cs");
		User user2 = new User();
		user2.setName("Muhammad Umar Tariq");
		user2.setCity("Islamabad");
		user2.setStatus("associate software engineer");
		List<User> usersListwithNameUmar = Arrays.asList(user1,user2);
		Iterable<User> result = userRepo.saveAll(usersListwithNameUmar);
		result.forEach(user -> {
			//System.out.println(user);
		});
		List<User> usersListWithNameUmarFromDatabase = userRepo.findByNameAndCity("Muhammad Umar Tariq","Islamabad");
		usersListWithNameUmarFromDatabase.forEach(e->{
			//System.out.println(e);
			});

		List<User> getAllUsersFromDatabase = userRepo.getAllUsers();
		//System.out.println(getAllUsersFromDatabase);
	
		
		
		//List<User> getUserByName = userRepo.getUserByName("Muhammad Umar Tariq");
		//System.out.println(getUserByName);
		
		
		List<User> getUsers = userRepo.getUsersNativeQuery();
		System.out.println(getUsers);
		
		
		
		
	}
	
	
}
