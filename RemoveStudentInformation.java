package studyopedia;
import java.util.*;
public class RemoveStudentInformation {
	String name, collegeName;
    long mobile;
    int marks;

    Student stds[] = new Student[1];

    public void setDetails() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
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
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the student you want to select:");
        int index = scanner.nextInt();
        if (index >= 0 && index < stds.length) {
            Student selectedStudent = stds[index];
            System.out.println("Selected student details: ");
            System.out.println("Name: " + selectedStudent.getName());
            System.out.println("Mobile: " + selectedStudent.getMobile());
            System.out.println("Marks: " + selectedStudent.getMarks());
            System.out.println("College name: " + selectedStudent.getCollegeName());
        System.out.println("enter the index of infotmation u want to remove: ");
        System.out.println("0: name");
        System.out.println("1: mobile");
        System.out.println("2: marks");
        System.out.println("3:college name");

	int infoIndex=scanner.nextInt();
            
            if(infoIndex>=0 && infoIndex<4) {
            switch(infoIndex) {
            
            case 1:
            	selectedStudent.setName(null);
            	break;
            case 2:
            	selectedStudent.setMobile(0);
            	break;
            case 3:
            	selectedStudent.setMarks(0);
            	break;
            case 4:
            	selectedStudent.setCollegeName(null);
            	break;
            case 5:
            	System.out.println("invalid choice! ");
            	break;
            	
            
            }
            System.out.println("information removed");
            }else {
            	System.out.println("invalid info index!");
            }
        
           
            for (int i = 0; i < stds.length; i++) {
                System.out.println("-------------");
                System.out.println("Student " + (i + 1) + " details:");
                System.out.println("Name: " + stds[i].getName());
                System.out.println("Mobile: " + stds[i].getMobile());
                System.out.println("Marks: " + stds[i].getMarks());
                System.out.println("College name: " + stds[i].getCollegeName());
            }
        }
             else {
            	System.out.println("invalid index ! ");
            }
            	
            }
                   
}
