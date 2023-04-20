package projects;

abstract class BankABC {
public  abstract void  getbalance();
}

class BankA extends BankABC{
	
		private int balance=100;
		
		
	public void getbalance() {
			return balance;
		}
		
	}


class BankB extends BankABC{
	
		private int balance=150;
		
		int getbalance() {
			return balance;
	}
}



class BankC extends BankABC{
	
		private int balance=200;
		int getbalance() {
			return balance;
	}
}


public class BankABC{
	public static void main(String args[]) {
		BankA banka=new BankA();
		BankB bankb=new BankB();
		BankC bankc=new BankC();
		System.out.println("balance in bank A is: "+banka.getbalance);
		System.out.println("balance in bank B is: "+bankb.getbalance);
		System.out.println("balance in bank C is: "+bankc.getbalance);
		
		
	}
}