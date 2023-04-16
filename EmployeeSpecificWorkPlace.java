package studyopedia;
import java.util.*;
public class EmployeeSpecificWorkPlace {

	
	String name,job,place;
	long id;
	int salary;
	   
	
	 Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
		
		Employee_Details[] arr=new Employee_Details[n];
		
		
		
		public void empdetails() {
			Scanner s=new Scanner(System.in);
	
			for(int i=0;i<arr.length;i++) {
				Employee_Details details=new Employee_Details();
				System.out.println("enter employee name: ");
				details.setName(s.next());
				System.out.println("enter employee job: ");
				details.setJob(s.next());
				System.out.println("enter employee workplace: ");
				details.setWorkPlace(s.next());
				System.out.println("enter employee id number: ");
				details.setIdNumber(s.nextLong());
				System.out.println("enter employee salary: ");
				details.setSalary(s.nextInt());
				arr[i]=details;
			}
		}
	
	
	public void deleteSpecificWP() {
		System.out.println("enter employee work place: ");
		String place=s.next();
		for(int i=0;i<arr.length;i++) {
		if(place.equals(arr[i].getWorkPlace())) {
			
			System.out.println("--------------");
			System.out.println("employee name: "+arr[i].getName());
			System.out.println("employee job role: "+arr[i].getJob());
			System.out.println("employee work_place: "+arr[i].getWorkPlace());
			System.out.println("employee id number: "+arr[i].getIdNumber());
			System.out.println("employee salary: "+arr[i].getSalary());
			
		}
		}
	}
	
	
	public static void main(String args[]) {
		EmployeeSpecificWorkPlace place=new EmployeeSpecificWorkPlace();
		place.empdetails();
		place.deleteSpecificWP();
	}
	
}
