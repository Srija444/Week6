
//Abstraction : Showing only required information and hiding unnessary data
// Two ways to achieve abstration :
// 1.By abstract classes (0% - 100%) 
//2. By interfaces  (100%)
//abstarct classes must be declared abstarct 
//abstract classes will contain only abstract method.
 
abstract class Vehicle{
    int wheel_no;
    abstract void start(); //your vechile will start. This will be shown to the client
}
class Car extends Vehicle{
   void start(){
       System.out.println("I will start the car key");
   }  
}
class Scooter extends Vehicle{
    void start(){
       System.out.println("I will start the scooter by pushing");
   } 
}
 
public class AbstractionInheritance extends Vehicle{
   
   void start(){
       System.out.println("I will start the main just with wish");
   } 
   
   
    
    public static void main(String[] args) {
    	AbstractionInheritance obj=new AbstractionInheritance();
        obj.start();
    
    Car obj1=new Car();
    obj1.start();
    
    Scooter obj2=new Scooter();
    obj2.start();
    
    }
}