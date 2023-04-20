package projects;

public class Instatncemethod {
//instance method without any return type and without any parameter
	
	public void add() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("this instance method "+sum);
	}
	
	//instance method with return type and without any parameter
	public int multiplication() {
		int a=10;
		int b=20;
		int c=a*b;
		return c;
	}
	
	//instance method with return type and with parameter
	public static int division(int a,int b) {
		int c=a/b;
		return c;
	}
	
	public void sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String args[]) {
		Instatncemethod method=new Instatncemethod();
		method.add();
	int multi=method.multiplication();
	System.out.println(multi);
	int div=method.division(20,10);
	System.out.println(div);
	method.sub(20,30);
	}
}
