package studyopedia;
import java.util.*;
public class OneEmployee {

	
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
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index of the employee you want: ");
		int index=sc.nextInt();
		if(index >= 0 && index < arr.length) {
			Employee_Details details=arr[index];
			System.out.println("------------");
			System.out.println("selected employee details: ");
			System.out.println("name: "+details.getName());
			System.out.println("job_role: "+details.getJob());
			System.out.println("work_place: "+details.getWorkPlace());
			System.out.println("id_number: "+details.getIdNumber());
			System.out.println("salary: "+details.getSalary());
			
		}else {
			System.out.println("invalid index!");
		}
		}
		public static void main(String args[]) {
			OneEmployee one=new OneEmployee();
			one.empdetails();
			one.employee_get_details();
		}
}
