package studyopedia;
import java.util.*;
public class AllInOneEmployee {

	
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
	
		public void employee_get_details() {
			for(int i=0;i<arr.length;i++) {
				System.out.println("--------------");
				System.out.println("employee "+(i+1)+" details: ");
				System.out.println("employee name: "+arr[i].getName());
			System.out.println("employee job role: "+arr[i].getJob());
			System.out.println("employee work_place: "+arr[i].getWorkPlace());
			System.out.println("employee id number: "+arr[i].getIdNumber());
			System.out.println("employee salary: "+arr[i].getSalary());
			}
		}
		
		public void specificjob() {
			System.out.println("enter job role: ");
			String job=s.next();
			for(int i=0;i<arr.length;i++) {
				if(job.equals(arr[i].getJob())) {
					System.out.println("--------------");
					System.out.println("employee name: "+arr[i].getName());
					System.out.println("employee job role: "+arr[i].getJob());
					System.out.println("employee work_place: "+arr[i].getWorkPlace());
					System.out.println("employee id number: "+arr[i].getIdNumber());
					System.out.println("employee salary: "+arr[i].getSalary());
				}
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
		
		
		
		
		public  void display1() {
			for(int i=0;i<arr.length;i++) {
				if (arr[i]!= null) {
					System.out.println("-------------");
					System.out.println("employee name: "+arr[i].getName());
					System.out.println("employee job role: "+arr[i].getJob());
					System.out.println("employee work_place: "+arr[i].getWorkPlace());
					System.out.println("employee id number: "+arr[i].getIdNumber());
					System.out.println("employee salary: "+arr[i].getSalary());
				}
			}
		} 
		
		
		

		
		
		
		
		public void EmployeeSalary() {
			System.out.println("enter salary is in bet above 25000 to below 1 lakh: ");
			int salary=s.nextInt();
			
			   if(salary>=25000 && salary<=100000) {
				   for(int i=0;i<arr.length;i++) {
				      if(salary==arr[i].getSalary()) {
				System.out.println("--------------");
				System.out.println("employee name: "+arr[i].getName());
				System.out.println("employee job role: "+arr[i].getJob());
				System.out.println("employee work_place: "+arr[i].getWorkPlace());
				System.out.println("employee id number: "+arr[i].getIdNumber());
				System.out.println("employee salary: "+arr[i].getSalary());
				 }
			}
		}else {
			System.out.println("Invalid Input salary");
		}
}  
		
		
		
		
		
		public void updateEmploInfo() {
			System.out.println("--------------");
			System.out.println("enter name update to record: ");
			String name=s.next();
			System.out.println("--------------");
			System.out.println("enter salary to update: ");
			int salary=s.nextInt();
			
			for(int i=0;i<arr.length;i++) {
				if(name.equals(arr[i].getName())) {
					arr[i].setSalary(salary);
				}
			}
			
		}
		
		
		
		public void getEmployeeId() {
			System.out.println("enter employee id: ");
			long id=s.nextLong();
			for(int i=0;i<arr.length;i++) {
				if(id==arr[i].getIdNumber()) {
					System.out.println("-------------");
					System.out.println("employee name: "+arr[i].getName());
					System.out.println("employee job role: "+arr[i].getJob());
					System.out.println("employee work_place: "+arr[i].getWorkPlace());
					System.out.println("employee id number: "+arr[i].getIdNumber());
					System.out.println("employee salary: "+arr[i].getSalary());
				}
			}
		}
		
		
		
		
		public void deleteEmployeeId() {
			Scanner s=new Scanner(System.in);
			System.out.println("enter employee id to delete: ");
			long id=s.nextLong();
			
			for(int i=0;i<arr.length;i++) {
				if(id==arr[i].getIdNumber()) {
					for(int j=i;j<arr.length-1;j++) {
						arr[j]=arr[j+1];   
					}
				    arr[arr.length-1]=null;
					break;
				}
			}
		}
		
		
		public  void display() {
			for(int i=0;i<arr.length;i++) {
				if (arr[i]!= null) {
					System.out.println("-------------");
					System.out.println("employee name: "+arr[i].getName());
					System.out.println("employee job role: "+arr[i].getJob());
					System.out.println("employee work_place: "+arr[i].getWorkPlace());
					System.out.println("employee id number: "+arr[i].getIdNumber());
					System.out.println("employee salary: "+arr[i].getSalary());
				}
			}
		} 
			
	public static void main(String args[]) {
		AllInOneEmployee employee =new AllInOneEmployee();
		employee.empdetails();
		employee.employee_get_details();
		employee.specificjob();
		
		
		
		System.out.println("employee detils:----------");
		employee.employee_get_details();
		
		
		employee.EmployeeSalary();
		System.out.println("employee detils:----------");
		employee.employee_get_details();
		
		employee.updateEmploInfo();
		System.out.println("employee detils:----------");
		employee.employee_get_details();
		employee.getEmployeeId();
		System.out.println("employee detils:----------");
		employee.employee_get_details();
		employee.deleteSpecificWP();
		System.out.println("employee detils:----------");
		employee.employee_get_details();
		employee.deleteEmployeeId();
		employee.display();
		
	}
	
}
