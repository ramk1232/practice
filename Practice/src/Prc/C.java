package Prc;

public class C extends A {

	String x = "ac";

	public void AA() {
		String x = "acc";
		x = "aa";
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.a);
	}

	public static void main(String[] args) throws InterruptedException {
		C aa = new C();
		aa.AA();
		System.out.println(aa.x);

	}

}
