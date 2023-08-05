package Prc;

public class constructor {

	static int a, b;

	 constructor(int i, int j) {
		a = i;
		b = j;
	}

	public void add() {
		int c = a + b;
		System.out.println(c);
	}
	public static void mul() {
		int c = a * b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		constructor cn = new constructor(10,20);
		cn.add();
		
		constructor cn1 = new constructor(101,20);
		cn1.add();
		
		constructor.mul();
	}
}
