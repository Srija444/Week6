package projects;
public class TryCatch
{
public static void main(String[] args) {
  // five keywords to handle Exception 
//1. Try
//2. catch
//3. finally 
      //4. Throw 
//5. Throws

 int i=10;
int b=0;
 int c=0;
 try{
 c=i/b;
}
 catch(ArithmeticException e)
{
System.out.println(e);
}

//unchecked exception ->Those exceptions which are not checked during compilation
// checked exception ->which are checked during compilation, If found and It will ask 
 // the method to handle it or throw the exception to the calling method to handle it
System.out.println(c);

    }
}



