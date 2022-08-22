package LoopMapExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoopMapExercise2 {

	public static void main(String[] args) {
		// You are a car dealer. Create a hash map of vehicles.
		//		The model is the Key, the make is the Value.
		//		Ask the customer what car (model) they are looking for. Use the Hash Map to determine 
		//		if you have that vehicle, and what make it is.
		//		(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
	
		System.out.println("What car model are you looking for?");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		Map<String, String> m = new HashMap();
		m.put("camry", "toyota");
		m.put("i3", "bmw");
		m.put("civic", "honda");
		
		System.out.println(m);
		
        System.out.println("What car model are you looking for?");
        String key = sc.nextLine();
        String value = m.get(key);
        
        System.out.println("Oh, you're looking for a " + key + "? Our " + value + " selection is right over here.");
		
		
	}

}
