package projects;

class A{
	public void m1() {
		System.out.println("m1 method of class A");
	}
}
class B extends A{
	public void m1() {
		System.out.println("m1 method of class B");
	}
}
public class C extends B{
	public void m1() {
		System.out.println("m1 method of class c");
	}
	public static void main(String args[]) {
		B obj=new A();
		obj.m1();
	}
}

