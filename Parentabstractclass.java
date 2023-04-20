package projects;
abstract class Parent{
	public abstract void message();
}


class FirstSubClass extends Parent{
	public void message() {
		System.out.println("this is the first sub class");
	}
}

class SecondSubClass extends Parent{
	public void message() {
		System.out.println("this is the second sub class");
	}
}

public class Parentabstractclass{
	public static void main(String args[]) {
		Parent firstsub=new FirstSubClass();
		Parent secondsub=new SecondSubClass();
		
		firstsub.message();
		secondsub.message();
	}
}