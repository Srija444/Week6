package studyopedia;
import java.util.*;
public class NameStuInfo {

	
	
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
    
    public void getStuInfobyName() {
    	System.out.println("enter name: ");
    	String name=s.next();
    	for(int i=0;i<stds.length;i++) {
    		if(name.equals(stds[i].getName())) {
    			
    			
    			System.out.println("name: "+stds[i].getName());
        		System.out.println("college name: "+stds[i].getCollegeName());
        		System.out.println("marks: "+stds[i].getMarks());
        		System.out.println("mobile: "+stds[i].getMobile());
    		}
    	
    	}
    }
    
    
    public static void main(String args[]) {
    	NameStuInfo info=new NameStuInfo();
    	info.setDetails();
    	info.getStuInfobyName();
    }
    
    }
