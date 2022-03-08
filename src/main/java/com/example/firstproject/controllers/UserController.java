// Endpoints: receiving and answering the user's requests

package com.example.firstproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstproject.entities.User;
import com.example.firstproject.repositories.UserRepository;

@RestController

// Setting the pathway the endpoints shall answer
@RequestMapping(value = "/users")
public class UserController {
	
	// Dependency injection mechanism (so we don't have to instance the object) 
	@Autowired
	private UserRepository repository;

	
	@GetMapping
	public List<User> findAllPpl(){
		List<User> listPpl = repository.findAll();
		return listPpl;
		}
	
	@GetMapping(value = "/{id}")
	public User findUserById(@PathVariable Long id){
		User myTarget = repository.findById(id).get();
		return myTarget;
		}
	
	// Use JSON
	@PostMapping
	public User addUser(@RequestBody User user){
		User inserted = repository.save(user);
		return inserted;
		}
	
}
