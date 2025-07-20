package practice;


public class ClassC  {

	void meth1()
	{
		System.out.println("meth1() called [CLASSC]");
	}

	public static void main(String[] args) {

		ClassC cobj=new ClassC();
		cobj.meth1();
	}

}
