package LoopMapExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LoopMapExercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.print("Give me 5 numbers and then say done: ");
		int sum = 0;
		int product = 1;
		int min = 0;
		
		while (sc.hasNextInt()) {
			arr.add(sc.nextInt());
			System.out.println(arr);
		}
		
		for (int i=0; i<arr.size(); i++) {
			sum += i;
			System.out.println("This is the sum: " + sum);
		}
		
		for (int i=1; i<=arr.size(); i++) {
			product *= i;
			System.out.println("This is the product: " + product);
		}

		for (int i=0; i<arr.size(); i++) {
			System.out.println("This is the minimum: " + Collections.min(arr));
			break;
		}
		
		for (int i=0; i<arr.size(); i++) {
			System.out.println("This is the maximum: " + Collections.max(arr));
			break;
		}

	}

}
