
package projects;
import java.util.Scanner;
abstract class Parent{
	public abstract void message();
}

class FirstSubclass extends Parent{
	public void message() {
		System.out.println("this is the first sub class");
	}
}

class SecondSubclass extends Parent{
	public void message() {
		System.out.println("this is the second sub class");
	}
}
public class ParentAbsclassScanner {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1 for firstsub class and 2 for secondsub class");
		int n=s.nextInt();
		if(n==1) {
			Parent firstsub=new FirstSubclass();
			firstsub.message();
			

		}else {
			Parent secondsub=new SecondSubclass();
			
			secondsub.message();

		}
		
		
	}
	
}
