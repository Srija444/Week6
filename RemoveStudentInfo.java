package studyopedia;
import java.util.Scanner;
public class RemoveStudentInfo {

	String name, collegeName;
    long mobile;
    int marks;

    Student stds[] = new Student[3];
    Scanner s = new Scanner(System.in);
    public void setDetails() {
        
        for (int i = 0; i < 3; i++) {
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
    
    
    public void deleteStubyMobile() {
    	System.out.println("enter mobile number");
    	long mobile=s.nextLong();
    	for(int i=0;i<stds.length;i++) {
    		if(mobile==stds[i].getMobile()) {
    			for(int j=i;j<stds.length-1;j++) {
    				stds[j]=stds[j+1];
    			}
    			break;
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
    	RemoveStudentInfo info=new RemoveStudentInfo();
    	info.setDetails();
    	info.deleteStubyMobile();
    	info.display();
    }
    
    
    
}
