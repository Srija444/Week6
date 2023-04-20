package projects;
interface planet1{
	public void human();
	public void nature();
	public void animals();
	
}

interface planet2{
	public void magic();
	public void stars();
	public void peace();
}

public class MyPractice4 implements planet1,planet2{
	public void human() {
		System.out.println("humans are selfish");
	}
	public void nature() {
		System.out.println("mom and dad are nature");
	}
	public void animals() {
		System.out.println("animals are innocent");
	}
	public void magic() {
		System.out.println("u r the magic in my life");
	}
	public void stars() {
	System.out.println("i wanna see magical stars");
	}
	public void peace() {
		System.out.println("i want eternal peace");
	}
	public static void main(String args[]) {
		MyPractice4 my=new MyPractice4();
		my.stars();
	}
}
