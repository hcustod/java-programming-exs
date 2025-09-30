package basics;

import java.util.*;

public class Lists {
	public static void main(String[] args) {
		
		// Dynamic collections - not fixed sized *** 
		
		List<String> colorsList = new ArrayList<>();
		colorsList.add("Red"); 
		colorsList.add("Green");
		colorsList.add("Blue");
		System.out.println(colorsList);
		
		
		colorsList.remove("green");
		System.out.println(colorsList.get(1)); // Now blue
		
		for (String c : colorsList) {
			System.out.println(c);
		}
		
		System.out.println(colorsList.contains("Red"));
		
		
	}

}
