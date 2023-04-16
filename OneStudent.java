
package studyopedia;

import java.util.Scanner;

public class OneStudent {

    String name, collegeName;
    long mobile;
    int marks;

    Student stds[] = new Student[2];

    public void setDetails() {
        Scanner s = new Scanner(System.in);
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
            System.out.println("-------------");
            System.out.println("Selected student details: ");
            System.out.println("Name: " + selectedStudent.getName());
            System.out.println("Mobile: " + selectedStudent.getMobile());
            System.out.println("Marks: " + selectedStudent.getMarks());
            System.out.println("College name: " + selectedStudent.getCollegeName());
        } else {
            System.out.println("Invalid index!");
        }
    }

    public static void main(String args[]) {
       OneStudent details = new OneStudent();
        details.setDetails();
        details.getDetails();
    }

}

