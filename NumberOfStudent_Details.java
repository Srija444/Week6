package studyopedia;
import java.util.*;

public class NumberOfStudent_Details {

	
		String name,collegeName;
		long mobile;
		int marks;
		
		Student stds[]=new Student[2];
		
		public void setDetails() {
			Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			Student std=new Student();
			System.out.println("enter name: ");
			std.setName(s.next());
			System.out.println("enter marks: ");
			std.setMarks(s.nextInt());
			System.out.println("enter mobile number: ");
			std.setMobile(s.nextLong());
			System.out.println("enter college name: ");
			std.setCollegeName(s.next());
			stds[i]=std;
			
		}
	}
		
		
		public void getDetails() {
			for(int i=0;i<stds.length;i++) {
				System.out.println("-------------");
				System.out.println("student "+(i+1)+" details: ");
				System.out.println("name: "+stds[i].getName());
				System.out.println("mobile: "+stds[i].getMobile());
				System.out.println("marks: "+stds[i].getMarks());
				System.out.println("college name: "+stds[i].getCollegeName());
			}
			System.out.println("-------------");
		}
		

		public static void main(String args[]) {
			NumberOfStudent_Details details=new NumberOfStudent_Details();
			details.setDetails();
			details.getDetails();
		}
		
}
