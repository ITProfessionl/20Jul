package renewal;

public class TwentyThirdone {

	String meth1(){
		return("This is method 1");
	}

	int meth2() {
		int a=2+3;
	return (a);
	}
	public static void main(String[] args) {
	TwentyThirdone A=new TwentyThirdone();
		System.out.println(A.meth1());
		System.out.println("=================");
		int C=A.meth2();
		System.out.println();
		TwentyThirdMarch B=new TwentyThirdMarch();
		System.out.println(B.add(C, C));
	}
}
