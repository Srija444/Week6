//abstract class
package projects;

abstract class Jungle{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("when bird slepping it sounds like: Zzzzzzzz");
	}
}


class Bird extends Jungle{
	public void animalSound() {
		System.out.println("the bird says: wawaawaaa");
	}
}

 class AbstractionProblems {
public static void main(String args[]) {
	Bird myBird=new Bird();
	myBird.animalSound();
	myBird.sleep();
}
}
