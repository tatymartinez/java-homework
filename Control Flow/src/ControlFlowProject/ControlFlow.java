package ControlFlowProject;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
//		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		
		//Question 1
		System.out.print("Do you wish to continue to the interactive portion? Say yes or no: ");
		
		
		//Inputs
		String input = (String) scanner.next();
//		String car = scanner.nextLine();
//		int age = myObj.nextInt();
		
		while (input.equals("no")) {
			System.out.println("Okay, please return later to complete the survery.");
			break;
		}
		
		for (int i = 0; input.equals("yes"); i++) {
			System.out.println("Do you have a red car? (yes/no): ");
			scanner.next();
			System.out.println("What is the name of your favorite pet? ");
			scanner.next();
			System.out.println("What is the age of your favorite pet? ");
			scanner.nextInt();
			System.out.println("What is your lucky number? ");
			scanner.nextInt();
			System.out.println("Do you have a favorite quarterback? (yes/no): ");
			scanner.next();
			if (input.equals("yes")) {
				System.out.println("What is their jersey number? ");
				scanner.nextInt();
			} else {											// this is not showing up
				System.out.println("okie ");
				scanner.nextInt();
			}
			System.out.println("What is the 2-digit model year of your car? ");
			scanner.next();
			System.out.println("What is the first name of your favorite actor or actress? ");
			scanner.next();
			System.out.println("Enter a random number between 1 and 50: ");
			scanner.nextInt();			
			break;
			
		}
		
		

//		AsciiChars.printNumbers();
	}

public class AsciiChars {

	public static void printNumbers(){
	  // TODO: print valid numeric input
		int x = '0';
	  
		for (int i=0; i<10; i++) {
	  
		}
	}

	public static void printLowerCase(){
	  // TODO: print valid lowercase alphabetic input
		for (int i=0; i<10; i++) {
		  
		  
		}
	}

	public static void printUpperCase(){
		  // TODO: print valid uppercase alphabetic input
		for (int i=0; i<10; i++) {
			  
			  
		}
	  
	}
	  
}

}
