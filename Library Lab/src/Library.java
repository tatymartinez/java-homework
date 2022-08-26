import java.util.ArrayList;

public class Library {
    // Add the missing implementation to this class
	// INSTANCE VARIABLES
	String address;
	ArrayList<Book> list; 
	
	// CONSTRUCTOR
	public Library(String address) {
		this.address = address;
		this.list = new ArrayList<Book>(); // array<Book> means initializing a Book collection in arrayList; () holds empty argument
	}
	
	// SET METHOD
	public void addBook(Book book) {
		this.list.add(book);
	}

	// GET METHOD
	// static because no new obj needs to be made to use it; void since something specific doesn't need to be returned
	public static void printOpeningHours() { 
		System.out.println("Libraries are open daily from 9 am to 5pm.");
	}
	
	// GET METHOD
	public void printAddress() {	// empty () because nothing needs to be input; not static because there is an object it needs to act on
		System.out.println(this.address);
	}
	
	// GET METHOD
	public void borrowBook(String title) {
		for (Book book: this.list) {
			if (title.equals(book.getTitle())) {
				if(book.isBorrowed()) {
					System.out.println("Sorry, this book is already borrowed");
					return;
				} else {
					book.borrowed();
					System.out.println("You successfully borrowed " + book.getTitle());
					return;
				}
			}
		}
	}
	
	// GET METHOD
	public void printAvailableBooks() {
		if (this.list.isEmpty()) {
			System.out.println("This book isn't available in the catalog");
		}
		
		for (Book book: this.list) {
			System.out.println(book.getTitle());
			if (book.isBorrowed()) {
				System.out.println(book.getTitle() + " is not available");
			}
		}
	}
	
	public void returnBook(String title) {
		for (Book book: this.list) {
			if(title.equals(book.getTitle())) {
				book.returned();
				System.out.println("You successfully returned " + book.getTitle());
			}
		}
	}
	
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();										// prints new line

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 
