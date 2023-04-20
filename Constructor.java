package projects;

public class Constructor {
//it is best use for object initialisation
	//constructor is also same as method,but method name same as class
	//it will not have any return type not even void
	int id;
	String name;
	
	Constructor(){
		
	}
	Constructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	//setter
	//getter
	public static void main(String args[]) {
		Constructor obj=new Constructor(10,"srija");
		Constructor obj1=new Constructor(11,"magic");
		
		
		System.out.println(obj.id);
		System.out.println(obj1.name);
	}
	
}
