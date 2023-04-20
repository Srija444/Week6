package projects;

public class NumberOfCatchBlocks {
public static void main(String args[]) {
	try {
		int[] arr=new int[5];
		arr[10]=15/0;
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	catch(Exception e) {
		System.out.println("Super class exception");
		
	}
	System.out.println("rest of code");
}
}
