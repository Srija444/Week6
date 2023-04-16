package studyopedia;
import java.util.*;
public class DeleteEmployeeOnId {

	String name,job,place;
	long id;
	int salary;
	   
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	 Employee_Details[] arr=new Employee_Details[n];
	 
	 
	 
		public void empdetails() {
			
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("-------------");
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
	
	public void deleteEmployeeId() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter employee id: ");
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
		DeleteEmployeeOnId info = new DeleteEmployeeOnId();
		info.empdetails();
		info.deleteEmployeeId();
		info.display();
	}	
		
	
	
}
