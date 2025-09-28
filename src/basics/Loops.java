package basics;

public class Loops {
	public static void main(String[] args) {
		
		// While - checking before each iteration 
		int i = 0;
		while (i < 3) {
			System.out.printf("Counting: %d", i);
			i++;
		}
		
		// Do - While - At least once
		int j = 0;
		do {
			System.out.printf("Do, then counting: %d", j);
			j++;
		} while (j < 3);
		
		// For - when you actually know the count or need an index
		for (int k = 0; k < 3; k++) {
			System.out.printf("Counting for loop: %d", k);
		}
		
		// For each - clean iteration when indexing is not needed
		int[] numsArr = {2, 3, 5};
		for (int n: numsArr) {
			System.out.printf("Counting for-each loop: %d", n);
		}
		
		// Break / continue
		for (int x = 1; x <= 5; x++) {
			if (x == 4) break;
			if (x % 2 == 0) continue;
			System.out.println("odd: " + x);
		}
	}
}
