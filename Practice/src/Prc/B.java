package Prc;

public class B extends A {
	
	public void methc() {
		a=70;
		System.out.println(a);
	}

	public static void main(String[] args) {
		B ba = new B();
		System.out.println(ba.a);
		ba.metha();
		ba.methb();
		ba.methc();
		System.out.println();
		A Aa = new A();
		System.out.println(Aa.a);
		Aa.metha();
		Aa.methb();
	}

}
