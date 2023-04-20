package projects;

import java.util.*;

 abstract class BankAbs{
	public abstract void bank();

}

class Pin extends BankAbs{
	public void bank() {
		Scanner s = new Scanner(System.in);

		System.out.println("enter u r pin number: ");
		int n = s.nextInt();
		if (n >= 4) {
			System.out.println("the pin number is: " + n);
		} else {
			System.out.println("invalid pin can u please enter valid pin");
		}

	}
}

class Withdraw extends BankAbs{
	public void bank() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the amount: ");

		int amount = s.nextInt();
		if (amount % 100 != 0) {
			System.out.println("Entered Amount must be multiples of 100");
		} else {
			int notes_500 = amount / 500;
			amount = amount % 500;

			int notes_200 = amount / 200;
			amount = amount % 200;

			int notes_100 = amount / 100;

			int total_notes = notes_500 + notes_200 + notes_100;
			System.out.println(total_notes);
		}
	}
}

class Checkbalance extends BankAbs {
	public void bank() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter balance: ");
		int n = s.nextInt();
		if (n > 250000) {
			System.out.println("the balance is: " + n);
		}

	}
}

public class BankAbsClass{
	public static void main(String[] args) {
		BankAbs abs = new Pin();
		BankAbs abs1 = new Withdraw();
		BankAbs abs2 = new Checkbalance();
		Scanner s = new Scanner(System.in);
		do {
		System.out.println("1. enter pin: ");
		System.out.println("2. enter withdraw amount: ");
		System.out.println("3. check balance to enter: ");
		int n = s.nextInt();
		if (n == 1) {
			abs.bank();

		} else if (n == 2) {
			abs1.bank();
		} else {
			abs2.bank();
		}
		
		}while(4!=0);
	}
}
