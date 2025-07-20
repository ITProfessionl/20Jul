package com.mmprac;

import java.util.ArrayList;
import java.util.List;

public class Mukhy {
	public static void main(String[] args) {
	List<User> list=new ArrayList<User>(); 
		list=new MyService().allUsers();
		 System.out.println(list);
		 
		 /*for(int i=0;i<list.size();i++)
		 {
			 System.out.println(list.get(i));
		 }*/
	}

}
