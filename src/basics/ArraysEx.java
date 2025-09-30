package basics;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		
		// Arrays are fixed sized in Java ***
		
		int[] a = new int[4];
		int[] b = {1,3,9,4,0,6};
		
		a[0] = 42;
		System.out.println(a[0]);
		System.out.println(a[1]);
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}

}
