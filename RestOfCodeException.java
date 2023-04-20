package projects;

public class RestOfCodeException {
public static void main(String[] args) {
	try {
		int[] arr=new int[5];
		String str=null;
		System.out.println(str.length());
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	System.out.println("rest of code");
}
}
