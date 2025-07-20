package practice;

import java.util.Scanner;

public class ClassE implements Runnable {
	
	
	
	public void run()
	{
		String Name=Thread.currentThread().getName();
		System.out.println(Name+" is stopped");
		add();
		sub();
		
	}
	
	synchronized public void add()
	{
		System.out.println("Please enter two number Addition:");
		Scanner sc=new Scanner(System.in);
		int firstNumber=sc.nextInt();
		int secondNumber=sc.nextInt();
		//String Name=Thread.currentThread().getName();
		//System.out.println(Name+" is executing.");
		int sum=firstNumber+secondNumber;
		System.out.println(sum);
	}
	


	
	synchronized public void sub()
	{
		System.out.println("Please enter two number for Substration:");
		Scanner sc=new Scanner(System.in);
		int firstNumber=sc.nextInt();
		int secondNumber=sc.nextInt();
		//String Name=Thread.currentThread().getName();
		//System.out.println(Name +" is executing.");
		int sub=firstNumber-secondNumber;
		System.out.println(sub);
	}
	
	public static void main(String[] args) {
		
		ClassE obj=new ClassE();
		Thread t1= new Thread(obj);
		Thread t2= new Thread(obj);
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t1.start();
		t2.start();
	}
	
}
