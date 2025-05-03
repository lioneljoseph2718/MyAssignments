package wwek1.day2;

public class LibraryManagement {
	
	public static void main(String[] args) {
		Library lib = new Library();
		String name = lib.addBook("DatastructureandAlgorithm");
		System.out.println("Added Book Is: " +name);
		lib.issueBook();
	}

}
