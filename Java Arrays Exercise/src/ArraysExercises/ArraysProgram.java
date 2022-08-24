package ArraysExercises;

import java.util.ArrayList;

public class ArraysProgram {

	public static void main(String[] args) {
		// PROBLEM 1
		Integer[] myArray = {1, 2, 3, 4};
		int sum = 0;

		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}
		
		System.out.println("The sum of these numbers is: " + sum);
		
		//PROBLEM 2
		double[] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){
             if (exampleArray[i] > maximum) {
                  maximum = exampleArray[i];
                  index = i;
             }
             
             
        }
        
        System.out.println(index);
        
        toPower(4, 2);

	}
	
	//PROBLEM 3
	//The method should return an array of size "size" with each array index raised 
	//	to the value of "power." So, for example, if we passed in "size = 4" and "power = 2" 
	//	to the "toPower," the method should return the following result: [0,1,4,9].
	public static void toPower(int size, int power) {
		ArrayList<Integer> powerArray = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			powerArray.add((int) Math.pow(i, power));
			
		}
		
		System.out.println(powerArray);
		
	}

}
