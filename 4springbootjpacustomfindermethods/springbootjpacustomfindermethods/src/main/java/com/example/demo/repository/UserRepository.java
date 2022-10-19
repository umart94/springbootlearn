package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
public List<User> findByName(String name);
public List<User> findByNameAndCity(String name,String city);

@Query("select u FROM User u")
public List<User> getAllUsers();

@Query("select u from User u where u.name =:n")//no space before parameter and after : 
public List<User> getUserByName(@Param("n") String name);

@Query(value="select * from user",nativeQuery=true)
public List<User> getUsersNativeQuery();
}
