package practice;

import java.util.ArrayList;

public class ClassD {

	void meth1()
	{
		System.out.println("Implementing Array List : ");

		ArrayList <Object> al=new <Object>ArrayList();
		al.add("Minnu");//Heterogenous value are allowed in Array List
		al.add(1);//
		al.add(null);//Null values are allowed in Array List
		al.add(1);//Duplicate value are allowed in Array List
		al.add(2,3);
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.size());
		//al.get(0);

		System.out.println("Reteriving the data from Array List by using For each Loop:");

		for(Object i:al)
		{
			System.out.println(al.get((int) i));
		}
	}

public static void main(String[] args) {
	ClassD dobj=new ClassD();
	dobj.meth1();
}

}
