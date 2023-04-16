package studyopedia;
import java.util.*;
public class BasedOnEmail {

	String name, collegeName;
    long mobile;
    int marks;

    Student stds[] = new Student[2];
    Scanner s = new Scanner(System.in);
    public void setDetails() {
        
        for (int i = 0; i < 2; i++) {
            Student std = new Student();
            System.out.println("Enter name: ");
            std.setName(s.next());
            System.out.println("Enter marks: ");
            std.setMarks(s.nextInt());
            System.out.println("Enter mobile number: ");
            std.setMobile(s.nextLong());
            System.out.println("Enter college name: ");
            std.setCollegeName(s.next());
            stds[i] = std;
        }
    }
	
	
    
    public void getStuInfobyMobile() {
    	System.out.println("enter mobile number: ");
    	long mobile=s.nextLong();
    	for(int i=0;i<stds.length;i++) {
    		if(mobile==stds[i].getMobile()){
    			
    			System.out.println("name: "+stds[i].getName());
        		System.out.println("college name: "+stds[i].getCollegeName());
        		System.out.println("marks: "+stds[i].getMarks());
        		System.out.println("mobile: "+stds[i].getMobile());
    		}
    	}
    }
    
    public void display() {
    	for(int i=0;i<2;i++) {
    		System.out.println("name: "+stds[i].getName());
    		System.out.println("college name: "+stds[i].getCollegeName());
    		System.out.println("marks: "+stds[i].getMarks());
    		System.out.println("mobile: "+stds[i].getMobile());
    	}
    }
    
    
	
	 public static void main(String args[]) {
		BasedOnEmail email=new BasedOnEmail();
		email.setDetails();
		email.getStuInfobyMobile();
	 }
	
	
}
