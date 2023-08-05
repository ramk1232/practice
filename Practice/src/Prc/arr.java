package Prc;

import java.util.Arrays;

public class arr {

	public static void main(String[] args) {

		int a[] = { 2, 1, 31, 422, 432, 34, 23, 43 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		Arrays.sort(a);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
	}

}
