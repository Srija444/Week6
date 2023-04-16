package studyopedia;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter name: ");
String name=s.next();

System.out.println("enter marks: ");
int marks=s.nextInt();

System.out.println("enter the mobile number: ");
long mobile=s.nextLong();

System.out.println("enter college name: ");
String collegeName=s.next();

//set student details to student class
Student std=new Student();
std.setName(name);
std.setMarks(marks);
std.setMobile(mobile);
std.setCollegeName(collegeName);



//display student details on console

System.out.println("the student name is: "+std.getName());
System.out.println("the student marks is: "+std.getMarks());
System.out.println("the student mobile number is: "+std.getMobile());
System.out.println("the student college name is: "+std.getCollegeName());

	}

}
