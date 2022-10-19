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
		//User user1 = userRepo.save(user);
		//System.out.println(user1);
		
User user2 = new User();
		
		user2.setName("Talha Tariq");
		user2.setCity("California");
		//List.of(user1,user2); //list.of method is in jdk 9+
		//ArrayList arraylist = new ArrayList();
		List<User> users = Arrays.asList(user1,user2);
		Iterable<User> result = userRepo.saveAll(users);
		result.forEach(user -> {
		//	System.out.println(user);
		});
		
		Optional<User> optionalUser = userRepo.findById(2);
		User optionalUserReturnedfromDatabase = optionalUser.get();
		optionalUserReturnedfromDatabase.setStatus("Chief Information Security Officer");
		
		
		Optional<User> optionalUser2 = userRepo.findById(1);
		User optionalUserReturnedfromDatabase2 = optionalUser2.get();
		optionalUserReturnedfromDatabase2.setStatus("Associate Software Engineer");
		
		User resultUser1 = userRepo.save(optionalUserReturnedfromDatabase);
		User resultUser2 = userRepo.save(optionalUserReturnedfromDatabase2);
		//System.out.println(resultUser1);
		//System.out.println(resultUser2);
		
		
		Iterable<User> itr = userRepo.findAll();
		/*Iterator<User> iterator = itr.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			System.out.println(user);
		}*/
		
		itr.forEach(new Consumer<User>() {

			@Override
			public void accept(User t) {
				// TODO Auto-generated method stub
				//System.out.println(t);
			}
			
		});
		
		itr.forEach(user->{
			//System.out.println(user);
		});
		
		
		userRepo.deleteAll(itr);
		
		Iterable<User> itr2 = userRepo.findAll();
		
		itr2.forEach(new Consumer<User>() {

			@Override
			public void accept(User t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
		
	}

	
}
