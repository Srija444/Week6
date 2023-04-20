//is-a relationship(very less used)
//Single level inheritance
package projects;

 class Animal {
public void bark() {
	System.out.println("animals bark");
}
}
 public class Inheritance_Is_A_Relationship extends Animal{
	public static void main(String args[]) {
		Inheritance_Is_A_Relationship obj=new Inheritance_Is_A_Relationship();
		obj.bark();
	}
 }
