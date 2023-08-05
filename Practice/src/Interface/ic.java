package Interface;

public class ic implements i, i2 {

	public void a() {
		int c = 10;
		System.out.println(c);
	}

	public void b() {
		int d = 13;
		System.out.println(d);
	}

	public void i33() {
		System.out.println("Hii");
	}

	public static void main(String[] args) {
		ic g = new ic();
		g.a();
		g.b();
		g.i33();
		System.out.println(g.a);
	}

}
