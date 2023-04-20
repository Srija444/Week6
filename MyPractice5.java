package projects;
class magic{
	public void method() {
		System.out.println("what about you?");
	}
}



public class MyPractice5 extends magic {
public void method() {
	System.out.println("ohh noo!");
}
public static void main(String args[]) {
	MyPractice5 my=new MyPractice5();
	my.method();
}
}
