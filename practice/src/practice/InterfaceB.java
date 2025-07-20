package practice;

public interface InterfaceB extends InterfaceA
{
	static void meth5()
	{
		 InterfaceA.meth2();
		 System.out.println("This is meth5 of interface B");
	}

	public static void main(String[] args) {
		meth5();
	}
}
