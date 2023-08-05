package Prc;

public class met {
	int a = 1, b = 5, c, d = 0;

	public met() {
		System.out.println(a);

		try {
			int e = a / d;
			System.out.println(e);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}

	public int add() {
		a = 19;
		c = a + b;
		return c;
	}

	public static void main(String[] args) {
		met m = new met();
		System.out.println(m.add());
		System.out.println(m.a);
	}
}
