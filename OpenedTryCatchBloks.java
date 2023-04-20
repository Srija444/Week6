package projects;

public class OpenedTryCatchBloks {
	public static void main(String[] args) {
		
	
	int a=10;
	int b=0;
	try{
		int c=a/b; //ArithmeticException
		System.out.println(c);
		//try to have transaction with server
	
	}
	catch(NullPointerException e){ //that exception is not handled here
		System.out.println(e);
	}
	finally{
		System.out.println("finally block is always excuted");
		//closing connection code will be kept
		
	}
	System.out.println("Rest of code");
	
	}
	
}


