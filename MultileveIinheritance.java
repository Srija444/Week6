package projects;

 class Animal {
public void bark() {
	System.out.println("animals bark");
}
}
 class Dog extends Animal{
	 public void bites() {
		 System.out.println("dogs bite");
	 }
 }
 public class MultileveIinheritance extends Dog{
	 public void human() {
		 System.out.println("humans shout a lot");
	 }
	 public static void main(String args[]) {
		 MultileveIinheritance obj=new MultileveIinheritance();
		 obj.bark();
		 obj.bites();
		 obj.human();
	 }
 }
