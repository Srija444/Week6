//is-1 relationship(very less used)
//multilevel inheritance
package projects;

 class Animal{
public void bark() {
	System.out.println("animals bark");
}
}
 class Dog extends Animal{
	public void bites() {
		System.out.println("dogs bite");
	}
 }
 public class MultilevelInheritance extends Dog{
	 public static void main(String args[]) {
		 Dog obj=new Dog();
		 obj.bark();
		 obj.bites();
	 }
 }
