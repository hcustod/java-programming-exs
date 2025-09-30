package basics;

public class Methods {
	static int add(int a, int b) {
		return a + b;
	}
	
	static double area(double r) {
		return Math.PI * r * r;
	}
	
	static String greetingString(String nameString) {
		return "Hi " + nameString;
	}
	
	static String greetString() {
		return "Hello there!";
	}
	
	public static void main(String[] argStrings) {
		System.out.println(add(2, 3));
		System.out.println(area(4));
		System.out.println(greetingString("Rick"));
		System.out.println(greetString());
	}
}
