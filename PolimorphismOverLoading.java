package projects;

 public class PolimorphismOverLoading  {
// compile time polymorphism(or)static polymorphism(or)method overloading
	 //runtime polymorphism(or)Dynamic polymorphism(or)method overriding
	 
	 //method overloading
	 //1. method should have same name.
	 //2. method should have diff parameters
	 //3. methods should be in same class
	 public void show() {
		 System.out.println("iam first method");
	 }
	 public void show(String name) {
		 System.out.println("i am second method");
	 }
	 public static void main(String args[]) {
		 PolimorphismOverLoading obj=new PolimorphismOverLoading();
		 obj.show();
		 obj.show("srija");
	 }
	 
}
