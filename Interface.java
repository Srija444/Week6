package projects;
interface M1{
	void show();//showing only funtionality. hiding implementation
}
public class Interface implements M1 {
public void show() {
	System.out.println("this is my own implementation");
}
public static void main(String args[]) {
	Interface obj=new Interface();
	obj.show();
}
}
