package basics;

public class BasicCalc {
	public static void main(String[] args) {
		int a = 7, b = 3;
		System.out.println(a + b);
		System.out.println(a / b);
		System.out.println(a / 3.0);
		double tax = 0.13;
		double total = 100 * (1 + tax);
		System.out.printf("Total: %.2f%n", total);
	}
}
