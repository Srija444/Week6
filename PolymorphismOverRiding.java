package projects;

 class Test {
public void show() {
	System.out.println("iam first method");
	//logic of sending and marketing message
}
}
 public class PolymorphismOverRiding extends Test{
	 //method overriding
	 //1.method should have same name
	 //2. methods should hava same no.of parameters
	 //3. methods should be in differnt class.
	 //4. they should follow inheritance
	 public void show() {
		 System.out.println("iam second method");
		 //logic of sending and marketing messege and also turnig marks into blue ticks
	 }
	 public static void main(String args[]) {
		 PolymorphismOverRiding obj=new PolymorphismOverRiding();
		 obj.show();
	 }
 }
