package studyopedia;
import java.util.Scanner;

public class SeperateApp {
String name,collegeName;
long mobile;
int marks;
Student std=new Student();



public void acceptStudentDetails() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter name: ");
	name=s.next();
	
	System.out.println("enter marks: ");
	marks=s.nextInt();
	
	System.out.println("enter mobile: ");
	mobile=s.nextLong();
	
	System.out.println("enter college name: ");
	collegeName=s.next();
}
	

public void setDetails() {
	std.setName(collegeName);
	std.setMarks(marks);
	std.setMobile(mobile);
	std.setCollegeName(collegeName);
	
}


public void getDetails() {
	System.out.println("name: "+std.getName());
	System.out.println("mobile: "+std.getMobile());
	System.out.println("marks: "+std.getMarks());
	System.out.println("college name is: "+std.getCollegeName());
}

}
