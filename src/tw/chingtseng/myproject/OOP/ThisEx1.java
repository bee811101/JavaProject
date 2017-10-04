package tw.chingtseng.myproject.OOP;

public class ThisEx1 {
	int x = 6;

	public void setValue(int x) {
		this.x = x; //this.x 使用外層x
		
		//位置
		System.out.println("this:" + this);
	}

	public static void main(String[] args) {

		ThisEx1 test1 = new ThisEx1();
		test1.setValue(15);
		//位置
		System.out.println(test1);
		
		//值
		System.out.println("test1.x:" + test1.x);
	}

}
