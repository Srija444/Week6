package studyopedia;
import java.util.*;
public class NumberOfSwiggy_Odering {

	String customerName,address,orderItem;
	long phoneNumber;
	int houseNo;
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	Swiggy arr[]=new Swiggy[n];
	public void customerSet() {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			Swiggy details=new Swiggy();
			System.out.println("enter name: ");
			details.setCustomerName(s.next());
			System.out.println("enter address: ");
			details.setAddress(s.next());
			System.out.println("enter orderItem: ");
			details.setOrderItem(s.next());
			System.out.println("enter phone number: ");
			details.setPhoneNumber(s.nextLong());
			System.out.println("enter house number: ");
			details.setHouseNo(s.nextInt());
			arr[i]=details;
		}
	}
	
	
	
public void customerget() {
	for(int i=0;i<arr.length;i++) {
		System.out.println("----------------");
		System.out.println("swiggy customer order "+(i+1)+" details");
		System.out.println("customer name: "+arr[i].getCustomerName());
		System.out.println("customer address: "+arr[i].getAddress());
		System.out.println("customer orderItem: "+arr[i].getOrderItem());
		System.out.println("customer phone number: "+arr[i].getPhoneNumber());
		System.out.println("customer house number: "+arr[i].getHouseNo());
	}
}


public static void main(String args[]) {
	NumberOfSwiggy_Odering order=new NumberOfSwiggy_Odering();
	order.customerSet();
	order.customerget();
}
	
	
	
	
	
}
