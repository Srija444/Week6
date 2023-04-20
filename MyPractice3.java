package projects;
class Srija{
	public void hi() {
		System.out.println("hi...man how are you!");
	}
}

class Srija1 extends Srija{
	public void hi1() {
		System.out.println("tataa");
	}
}


public class MyPractice3 {
	public static void main(String args[]) {
	Srija guru=new Srija();
	Srija1 guru1=new Srija1();
	guru.hi();
	guru1.hi1();
	}
	

}
