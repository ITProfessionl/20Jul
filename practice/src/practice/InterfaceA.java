package practice;

public interface InterfaceA
{

	static void  meth2()
	{
		System.out.println("Interface A static meth2 called.");

	}

	default void meth3()
	{
		meth2();
		System.out.println("I am default method of Interface A.");
		this.meth4();
	}

	private void meth4()
	{
		System.out.println("I am private method of Interface A.");
	}
}