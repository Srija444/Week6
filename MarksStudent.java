package studyopedia;
import java.util.*;
public class MarksStudent {
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
    
    public void getStudentbyMarks() {
    	System.out.println("enter marks:");
    	int marks=s.nextInt();
    	for(int i=0;i<stds.length;i++) {
    		if(marks>30 && marks<=70) {
    			System.out.println("name:"+stds[i].getName());
    			System.out.println("marks: "+stds[i].getMarks());
    			System.out.println("mobile: "+stds[i].getMobile());
    			System.out.println("college name: "+stds[i].getCollegeName());
    		}
    	}
    	
    }
    
    
    
    
    
    
    
    
    
    public void getDetails() {
        for (int i = 0; i < stds.length; i++) {
            System.out.println("-------------");
            System.out.println("Student " + (i + 1) + " details:");
            System.out.println("Name: " + stds[i].getName());
            System.out.println("Mobile: " + stds[i].getMobile());
            System.out.println("Marks: " + stds[i].getMarks());
            System.out.println("College name: " + stds[i].getCollegeName());
        }
        System.out.println("-------------");
        
      
    }
        
        public static void main(String args[]) {
            MarksStudent details = new MarksStudent();
             details.setDetails();
            
             details.getStudentbyMarks();
         }
}
    
