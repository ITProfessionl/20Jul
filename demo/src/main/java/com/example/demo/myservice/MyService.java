package com.example.demo.myservice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.User;

@Service
public class MyService {
	
	List<User>list;
	
	
	public MyService()
	{
		list=new ArrayList<>();
		list.add(new User("Minhaj"));
		list.add(new User("Minnu"));
	}
	
	public List<User> allUsers()
	{	
		return list;
	}
	
	
	public User addUser(User user)
	{
		list.add(user);
		return user;
		
	}
	
	public User deleteUser(String name)
	{
		Iterator<User>iterator=list.iterator();
		while(iterator.hasNext())
		{
			User user=iterator.next();
			if(user.getName().equalsIgnoreCase(name))
			{
				iterator.remove();
				return user;
			}
		}
		return null;
		
	}

	public User updateUser(String name, User updatedUser) {
		
		for(User user:list) 
		{
			if(user.getName().equalsIgnoreCase(name))
			{
				user.setName(updatedUser.getName());
				return user;
			}
		}
		
		return null;
	}


}
