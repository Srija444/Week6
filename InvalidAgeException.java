package projects;
class InvalidAgeException extends Exception{
}

public class InvalidAgeException {
public static void main(String[] args) {
	try{
		throw new InvalidAgeException();
		        }
		        catch(InvalidAgeException e){
		System.out.println(e);
		        }
}
}
