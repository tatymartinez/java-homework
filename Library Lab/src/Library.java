
public class Library {
    // Add the missing implementation to this class
	String address;
	Book[] bookCollection;
	int numberOfBooks;
	
	// LIBRARY CONSTRUCTOR
	public Library(String libraryAddress) {
		this.address = libraryAddress;
		bookCollection = new Book[50];
		numberOfBooks = 0;
	}
	
	// adds book to bookCollection[] & increases numberOfBooks in [] by 1
	public void addBook(Book newBook) {
		bookCollection[numberOfBooks] = newBook;
		numberOfBooks++;
	}
	
	// prints openingHours; static so that it can be accessed without creating an object
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9 am to 5pm");
	}
	
	// prints library address of Library instance; void because it NEEDS to have address printed to console.. a return value can't do that
	public void printAddress() {
		System.out.println(address);
	}
	
	public void borrowBook(String title) {
		for(int i=0; i<numberOfBooks; i++) {
			if (bookCollection[i].getTitle().equals(title)) {
				if (bookCollection[i].isBorrowed() == true) {
					System.out.println("Sorry, this book is already borrowed.");
				} else {
					System.out.println("You successfully " + title);
					bookCollection[i].borrowed();
					bookCollection[i].borrowed = true;
					return;
				}
			} else {
				System.out.println("Sorry, this book is not in our catalog");
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
        System.out.println();

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

//        // Print the titles of all available books from both libraries
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
//        System.out.println();
//        System.out.println("Books available in the second library:");
//        secondLibrary.printAvailableBooks();
//        System.out.println();
//
//        // Return The Lords of the Rings to the first library
//        System.out.println("Returning The Lord of the Rings:");
//        firstLibrary.returnBook("The Lord of the Rings");
//        System.out.println();
//
//        // Print the titles of available from the first library
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
    }
} 
