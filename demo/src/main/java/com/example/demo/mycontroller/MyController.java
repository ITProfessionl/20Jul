package com.example.demo.mycontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.myservice.MyService;

@RestController
public class MyController {
	
	@Autowired
	private  MyService myservice;
	
	
	//getting all user
	@GetMapping ("/users")
	public List<User> allUser()
	{
		return this.myservice.allUsers();
	}
	
	//add user
	@PostMapping("/users")
	public User addUser(@RequestBody User user)
	{
		return this.myservice.addUser(user);
	}
	
	// delete particular user
	@DeleteMapping("/users/{name}")
	public User deleteUser(@PathVariable String name)
	{
		return this.myservice.deleteUser(name);
	}
	
	
	//Update in user name
	@PutMapping("/users/{name}")
	public User updateUser(@PathVariable String name, @RequestBody User updatedUser)
	{
		return this.myservice.updateUser(name,updatedUser);
	}

}
