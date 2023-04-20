package projects;

public class Staticmethods {
	//static method without any return type and without any parameter
	public static void add() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("this is static method"+sum);
	}
	
	//static method with return type and without any parameter
	public static int multiplication() {
		int a=10;
		int b=20;
		int c=a*b;
		return c;
	}
	
	//static method with return type and with parameter
	public static int division(int a,int b) {
		int c=a/b;
		return c;
	}
	
	public static void sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String args[]) {
		//static methods
		//you don't have to create an object and call that method
		
		 Staticmethods.add();
		 int multi= Staticmethods.multiplication();
		 System.out.println(multi);
		 int divi=division(20,5);
		 System.out.println(divi);
		 Staticmethods.sub(20, 30);
	}
}
