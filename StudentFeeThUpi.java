package projects;
import java.util.*;
public class StudentFeeThUpi {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	StudentFeeDetails fee[]=new StudentFeeDetails[n];
	
	public void setdetails() {
		
		for(int i=0;i<fee.length;i++) {
			StudentFeeDetails details=new StudentFeeDetails();
			System.out.println("------------------");
			System.out.println("enter student name: ");
			details.setStudent_name(s.next());
			System.out.println("enter branch: ");
			details.setBranch(s.next());
			System.out.println("enter year: ");
			details.setYear(s.nextInt());
			System.out.println("enter tuition fee: ");
			details.setTution_fee(s.nextLong());
			System.out.println("enter mba fee: ");
			details.setMba_fee(s.nextLong());
			System.out.println("enter bus fee: ");
			details.setBus_fee(s.nextLong());
			System.out.println("enter hostel fee: ");
			details.setHostel_fee(s.nextLong());
			fee[i]=details;
		}
	}
	
	
	public void feethrough() {
		System.out.println("enter payment options: ");
		System.out.println("1.credit card");
		System.out.println("2. debit card");
		int option=s.nextInt();
		System.out.println("enter name to update: ");
		String name=s.next();
		System.out.println("enter fee to update");
		long money=s.nextLong();
		for(int i=0;i<fee.length;i++) {
			if(name.equals(fee[i].getStudent_name())) {
		if(option==1) {
			
			fee[i].setBus_fee(money);
			
		}else if(option==2) {
			
			fee[i].setBus_fee(money);
		}
		}
		}
	}
	
	
	public void display() {
		for(int i=0;i<fee.length;i++) {
			System.out.println("------------------");
			System.out.println("student "+(i+1)+" details");
			System.out.println("student name: "+fee[i].getStudent_name());
			System.out.println("branch: "+fee[i].getBranch());
			System.out.println("year: "+fee[i].getYear());
			System.out.println("tuition fee: "+fee[i].getTution_fee());
			System.out.println("mba fee: "+fee[i].getMba_fee());
			System.out.println("bus fee: "+fee[i].getBus_fee());
			System.out.println("hostel fee: "+fee[i].getHostel_fee());
		}
	}
	
	public static void main(String args[]) {
		StudentFeeThUpi upi=new StudentFeeThUpi();
		upi.setdetails();
		upi.feethrough();
		upi.display();
	}
}
