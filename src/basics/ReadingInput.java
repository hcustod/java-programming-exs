package basics;

import java.util.Scanner;

public class ReadingInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Name? ");
		String nameString = scan.nextLine();
		System.out.print("Age? ");
		int ageInt = scan.nextInt();
		System.out.printf(" Hi %s, next year you will be %d.%n", nameString, ageInt + 1);
		scan.close();
	}

}
