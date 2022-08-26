
public class calculator {
	int number1;
	int number2;
	
//	// CONSTRUCTORS
//	public calculator() { //int num1, int num2
////		this.number1 = num1;
////		this.number2 = num2;
//	}

	// GETTERS
	public int number1() {
		return number1;
	}
	
	public int number2() {
		return number2;
	}
	// SETTERS
	public void number1(int num1) {
		this.number1 = num1;
	}
	
	public void number2(int num2) {
		this.number2 = num2;
	}
	
	// ADD METHOD
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// SUBTRACTION METHOD
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	// MULTIPLACATION METHOD
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	// DIVISION METHOD
	public int divide(int num1, int num2) {
		return num1/num2;
	}
	
	// SQUARE METHOD
	public int square(int num1) {
		return num1 * num1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring new variable calculation
		calculator calculation = new calculator();
		
		// math
		System.out.println(calculation.add(20, 10));
		System.out.println(calculation.subtract(20,10));
		System.out.println(calculation.multiply(20,10));
		System.out.println(calculation.divide(20,10));
		System.out.println(calculation.square(20));
	}

}
