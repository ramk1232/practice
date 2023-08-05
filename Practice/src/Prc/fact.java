package Prc;

public class fact {

	public static void main(String[] args) {

		int a = 0, b = 1;
		System.out.print(a + " " + b);
		int d;
		for (int i = 2; i < 10; i++) {
			d = a + b;
			System.out.print(" " + d);
			
			a = b;
			b = d;
		}
	}

}
