package studyopedia;
import java.util.*;
public class DeleteIsbnOfBook {

	
	
	String book_title,author,publisher;
	int edition;
	long isbn_number;
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	TextBookData arr[]=new TextBookData[n];
	
	public void setmethods() {
		
		for(int i=0;i<arr.length;i++) {
			TextBookData data=new TextBookData();
			System.out.println("-----------------");
			System.out.println("enter book title: ");
			data.setBook_title(s.next());
			System.out.println("enter book author: ");
			data.setAuthor(s.next());
			System.out.println("enter publisher: ");
			data.setPublisher(s.next());
			System.out.println("enter edition: ");
			data.setEdition(s.nextInt());
			System.out.println("enter ISBN number: ");
			data.setIsbn_number(s.nextLong());
			arr[i]=data;
		}
	}
	
	
	
	public void deleteisbn() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter isbn number: ");
			long number=s.nextLong();
			if(number==arr[i].getIsbn_number()) {
			for(int j=i;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			}
			arr[arr.length-1]=null;
			break;
		}
		
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				System.out.println("book "+(i+1)+" details: ");
				System.out.println("---------------");
			System.out.println("book title: "+arr[i].getBook_title());
			System.out.println("author: "+arr[i].getAuthor());
			System.out.println("publisher: "+arr[i].getPublisher());
			System.out.println("edition: "+arr[i].getEdition());
			System.out.println(" ISBN Number: "+arr[i].getIsbn_number());
			}
		}
	}
	
	public static void main(String args[]) {
		 DeleteIsbnOfBook book=new  DeleteIsbnOfBook();
		 book.setmethods();
		 book.deleteisbn();
		 book.display();
	}
	
}
