package tw.chingtseng.myproject.OOP;

class calculator {

	public void add(int x1, int y1) {
		System.out.println("x1+y1=" + (x1 + y1));
	}

	public void minus(int x2, int y2) {
		System.out.println("x2-y2=" + (x2 - y2));
	}

	public void multiply(int x3, int y3) {
		System.out.println("x3*y3=" + (x3 * y3));
	}

	public void divide(int x4, int y4) {
		System.out.println("x4*y4=" + (x4 / y4));
	}

}

public class methodEx3 {

	public static void main(String[] args) {
		calculator casio = new calculator();
		casio.add(10, 2);
		casio.minus(10, 2);
		casio.multiply(10, 2);
		casio.divide(10, 2);
	}

}
