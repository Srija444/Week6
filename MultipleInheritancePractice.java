package projects;
class message{
	void m1() {
		System.out.println("haaa");
	}
}

class message1 extends message{
	public void m2() {
		System.out.println("hello");
	}
}

class message2 extends message{
	public void m3() {
		System.out.println("hi");
	}
}

public class MultipleInheritancePractice{
	public static void main(String args[]) {
		message m=new message();
		m.m1();
		                                                                              
	}
}