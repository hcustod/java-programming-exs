package basics;

import java.util.Scanner;

public class Conditionals {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide an integer: ");
		int n = scan.nextInt();
		if (n > 0) {
			System.out.println("positive");
		}
		else if (n < 0) {
			System.out.println("negative");
		}
		else {
			System.out.println("zero");
		}
		
		String parityString = (n % 2 == 0) ? "even" : "odd";
		System.out.println(parityString);
		
		switch (parityString) {
		case "even" -> System.out.println("divisible by 2");
		case "odd" -> System.out.println("not divisble by 2");
		}
		
		scan.close();
	}

}
