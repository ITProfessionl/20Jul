package practice;

import java.util.Scanner;

public class  ClassA implements Runnable

{
	Scanner sc=new Scanner(System.in);
	
	public void run()
	{
		print();
	}
	
	synchronized public void print()
	{
		String Name=Thread.currentThread().getName();
		System.out.println("How many times "+Name+" thread will be executed ?");
		
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.println(Name+" executed "+i+" time");
		}
		
		System.out.println(Name+" Execution Completed.");
		
	}
	
	public static void main(String[] args) {
		ClassA obj=new ClassA();
		Thread t1=new Thread (obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		Thread t4=new Thread(obj);
		t1.setName("First - Thread");
		t2.setName("Second - Thread");
		t3.setName("Third - Thread");
		t4.setName("Fourth - Thread");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

	
}





