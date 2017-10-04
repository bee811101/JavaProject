package tw.chingtseng.myproject.OOP;

public class OverloadingEx1 {

	public void add(int x, int y) {
		System.out.println(x + "+" + y + "=" + (x + y));

	}

	public void add(double x, double y) {
		System.out.println("x+y= " + (x + y));

	}

	public static void main(String[] args) {
		OverloadingEx1 overloadTest = new OverloadingEx1();
		overloadTest.add(1, 5);
		overloadTest.add(1.5, 5.2);
		overloadTest.add('A', 'a');
		overloadTest.add(1, 5.0);
	}

}
