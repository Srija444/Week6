package projects;

abstract class name{
	public abstract void hi();
}

class name1 extends name{
	public void hi() {
		System.out.println("hello srija");
	}
}

class name2 extends name{
	public void hi() {
		System.out.println("good afternoon");
	}
}

public class MyPractice2{
	public static void main(String args[]) {
		name ee=new name1();
		name ee1=new name2();
		ee.hi();
		ee1.hi();
	}
}