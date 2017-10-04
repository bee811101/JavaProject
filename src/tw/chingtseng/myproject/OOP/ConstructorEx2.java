package tw.chingtseng.myproject.OOP;

public class ConstructorEx2 {

	public void play() {
		System.out.println("HAVE FUN");
	}

	public ConstructorEx2(int i) {
		System.out.println("建構子 :" + i);

	}

	public static void main(String[] args) {
		// 建構子呼叫方式 此方法效率較好
		ConstructorEx2 construct = new ConstructorEx2(3);
		construct.play();
		System.out.println("FINISHED!!");

		// Anonymous Object 匿名物件
		new ConstructorEx2(4).play();
		new ConstructorEx2(5).play();
		System.out.println("FINISHED!!");
	}

}
