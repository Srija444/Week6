package projects;
import java.util.*;
public class DeleteHostelFee {

	
	
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
	
	public void deletefee() {
		for(int i=0;i<fee.length;i++) {
			System.out.println("enter the hostel fee: ");
			long hostel=s.nextLong();
			if(hostel==fee[i].getHostel_fee()) {
				for(int j=i;j<fee.length;j++) {
					fee[j]=fee[j+1];
				}
			}
			fee[fee.length-1]=null;
			break;
		}
	}
	
	public void display() {
		for(int i=0;i<fee.length;i++) {
			if(fee[i]!=null) {
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
	}
	
	public static void main(String args[]) {
		DeleteHostelFee fee=new DeleteHostelFee();
		fee.setdetails();
		fee.deletefee();
		fee.display();
	}
	
}
