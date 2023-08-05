package Prc;

public class cconstructor2 extends constructor {
	
	cconstructor2(int i, int j) {
		super(i, j);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		cconstructor2 thisclss = new cconstructor2(90, 90);
		thisclss.add();
		constructor.mul();
		
		constructor prevClss = new constructor(90,20);
		prevClss.add();
		constructor.mul();
	}
}
