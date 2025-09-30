package basics;

public class Strings {
	public static void main(String[] args) {
		
		// Remember that strings are immutable in Java *** 
		
		String string = "Java Basics";
		
		System.out.println(string.length());
		System.out.println(string.toUpperCase());
		System.out.println(string.substring(5));
		System.out.println(string.startsWith("Ja"));
		System.out.println(string.contains("Base"));
		System.out.println(" trim ".trim());
		System.out.println(String.join("-", "A", "B", "C"));
		System.out.println("abc".equals("ABC".toLowerCase()));
	}

}
