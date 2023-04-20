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
 public class HierachialInheritance extends Animal{
	 public void human() {
		 System.out.println("humans shout a lot");
	 }
	 public static void main(String args[]) {
		 Dog obj=new Dog();
		 obj.bark();
		 obj.bites();
	 }
 }
 
