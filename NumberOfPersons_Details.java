package studyopedia;
import java.util.*;
public class NumberOfPersons_Details {
String name,email;
int age;

Scanner s=new Scanner(System.in);
int n=s.nextInt();
Person arr[]=new Person[n];

public void setPersonsDetails() {
	Scanner s=new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		Person details=new Person();
		System.out.println("enter person name: ");
		details.setName(s.next());
		boolean b=true;
			while(b) {
				System.out.println("enter person age: ");
				int age=s.nextInt();
				if(age<=0) {
					System.out.println("Invalid input---enter age positive only");
					continue;
				}else {
					details.setAge(age);
					
					b=false;
				}
			}
			b=true;
		while(b) {
			System.out.println("enter person email: ");
			String email=s.next();
			if(!(email.contains("@") && email.contains(".com"))) {
				System.out.println("Inavalid email---");
				continue;
			}else {
				details.setEmail(email);
				
				b=false;
			}
		}
		arr[i]=details;
	}
	
}
	

public void getPersonsDetails() {
	for(int i=0;i<arr.length;i++) {
		System.out.println("---------------");
		System.out.println("persons "+(i+1)+" details");
		System.out.println("person name: "+arr[i].getName());
		System.out.println("person age: "+arr[i].getAge());
			System.out.println("Person email: "+arr[i].getEmail());
			
		}
		}
	
	
	

public static void main(String args[]) {
	NumberOfPersons_Details persons=new NumberOfPersons_Details();
	persons.setPersonsDetails();
	persons.getPersonsDetails();
}
	
	
}