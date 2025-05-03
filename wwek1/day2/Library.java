package wwek1.day2;

public class Library {
	public String addBook(String bookTitle) {
		
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book Issued Successfully");
	}
public static void main(String[] args) {
	Library lb = new Library();
	String name = lb.addBook("DatastructureandAlgorithm");
	System.out.println("Added Book Is: " +name);
	lb.issueBook();
 		
}
}
