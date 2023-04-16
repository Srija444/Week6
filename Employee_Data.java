package studyopedia;
import java.util.*;

public class Employee_Data {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter employee name: ");
		String name=s.next();
		
		System.out.println("enter his/her job: ");
		String job=s.next();
		
		System.out.println("enter workplace: ");
		String place=s.next();
		
		System.out.println("enter employee id_number: ");
		long id=s.nextLong();
		
		System.out.println("enter employee salary: ");
		int salary=s.nextInt();
		
		
		//set creation
		Employee_Details data=new Employee_Details();
		data.setName(name);
		data.setJob(job);
		data.setWorkPlace(place);
		data.setSalary(salary);
		data.setIdNumber(id);
		
		//get creation
		System.out.println("the employee name is: "+data.getName());
		System.out.println("------------------------------");
		System.out.println("the employee job is: "+data.getJob());
		System.out.println("------------------------------");
		System.out.println("the workplace is: "+data.getWorkPlace());
		System.out.println("------------------------------");
		System.out.println("the employee salary is: "+data.getSalary());
		System.out.println("------------------------------");
		System.out.println("the employee id number is: "+data.getIdNumber());
		
	
		
		
		
	}

}
