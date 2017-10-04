package tw.chingtseng.myproject.OOP;

public class ThisEx2 {

	public ThisEx2() {
		this(7); // this 建構子之間呼叫，只能放在第一行
		System.out.println("ThisEx2()");
	}

	public ThisEx2(int x) {
		System.out.println("ThisEx2(int number)");
	}

	public static void main(String[] args) {
		ThisEx2 test2 = new ThisEx2();
		System.out.println("finished");
	}

}
