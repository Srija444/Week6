package studyopedia;
import java.util.*;
public class NumberOfBankAccountFields {

	String branch_name,account_holder_name,address;
	long account_number,savings,IFSC_number,pho_no;
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	BankAccountPrivateFields arr[]=new BankAccountPrivateFields[n];
	
	public void fieldsenter() {
		for(int i=0;i<arr.length;i++) {
			BankAccountPrivateFields fields=new BankAccountPrivateFields();
			System.out.println("---------------------");
			
			System.out.println("enter branch name: ");
			fields.setBranch_name(s.next());
			System.out.println("enter account holder name: ");
			fields.setAccount_holder_name(s.next());
			System.out.println("enter address: ");
			fields.setAddress(s.next());
			System.out.println("enter account_number: ");
			fields.setAccount_number(s.nextLong());
			System.out.println("enter savings: ");
			fields.setSavings(s.nextLong());
			System.out.println("enter phone number: ");
			fields.setPho_no(s.nextLong());
			System.out.println("enter ifsc number: ");
			fields.setIFSC_number(s.nextLong());
			arr[i]=fields;
			
		}
	}
	
	
	public void getfields() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("---------------------");
			System.out.println("bank holder "+(i+1)+" details: ");
			System.out.println("branch name: "+arr[i].getBranch_name());
			System.out.println("holder name: "+arr[i].getAccount_holder_name());
			System.out.println("address: "+arr[i].getAddress());
			System.out.println("account number: "+arr[i].getAccount_number());
			System.out.println("savings: "+arr[i].getSavings());
			System.out.println("phone number: "+arr[i].getPho_no());
			System.out.println("ifsc number: "+arr[i].getIFSC_number());
		}
	}
	
	public static void main(String args[]) {
		NumberOfBankAccountFields account=new NumberOfBankAccountFields();
		account.fieldsenter();
		account.getfields();
	}
	
}
