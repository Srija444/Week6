package projects;

interface M1{
    void show();//showing only functionality. Hiding implementation
}
interface M2{
    void display();
}
public class Interface2 implements M1,M2{
   
  public void show(){
      System.out.println("This is my SHOW implementation");
  }
    public void display(){
      System.out.println("This is my DISPLAY implementation");
  }
  
    
    public static void main(String args[]) {
        Interface2 obj=new Interface2();
        obj.show();
        obj.display();
 
    }
}