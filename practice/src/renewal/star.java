package renewal;

public class star {

	void start(int a) {
		for(int i=0;i<a;i++) {
			System.out.println("X");
		}
	}

	void meth1()
	{
		/*System.out.println(10);
		System.out.println(64);
		System.out.println("End");*/

		int a=90;
		int b=100;
		int c=b-a;
		System.out.println('c');
		System.out.println(c);
		System.out.println("c value:"+c);
	}

	int meth2(int a,int b,int c)
	{
		System.out.println(a);
		star obj=new star();
		String s=obj.meth5(100,"Java is awesome");
		System.out.println(s);
		return a-b;
	}

	String meth3(String s,int b,int d) {
		System.out.println(b+d);
		return s;
	}

	int meth4(int c,int k) {
		System.out.println(k);
		star obj=new star();
		int result=obj.meth2(50, 50, 50);
		System.out.println(result);
		return k+10;
	}

	String meth5(int a ,String L)
	{
		System.out.println(a+a);
		return "minnu";
	}

	public static void main(String[] args) {
		star s=new star();
		s.meth1();
		/*System.out.println("Please enter a number");
		/Scanner scan=new Scanner(System.in);
		int a = scan.nextInt();
		s.start(a);
		scan.close();*/
	}

}
