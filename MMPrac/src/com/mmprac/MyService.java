package com.mmprac;

import java.util.ArrayList;
import java.util.List;

public class MyService {
	
List<User>list;
	
	public List<User> allUsers()
	{
		list=new ArrayList<>();
		list.add(new User("Minhaj"));
		list.add(new User("Minnu"));
		return list;
	}

}
