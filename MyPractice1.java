package projects;
import java.util.*;
public class MyPractice1{
	String name;
	long mobileno;
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	MyPractice[] arr=new MyPractice[n];
	
	public void details() {
		for(int i=0;i<arr.length;i++) {
			MyPractice my=new MyPractice();
			System.out.println("enter name: ");
			my.setName(s.next());
			System.out.println("enter mobile number: ");
			my.setMobileno(s.nextLong());
			arr[i]=my;
		}
	}
	
	public void name() {
		for(int i=0;i<arr.length;i++) {
		System.out.println("details are"+(i+1));
		System.out.println("name is: "+arr[i].getName());
		System.out.println("mobile number is: "+arr[i].getMobileno());
		}
	}
	
	public static void main(String args[]) {
		MyPractice1 my=new MyPractice1();
		my.details();
		my.name();
	}
	
	
}