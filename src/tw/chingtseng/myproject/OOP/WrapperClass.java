package tw.chingtseng.myproject.OOP;

public class WrapperClass {

	public static void main(String[] args) {
		int num = 6;

		// 建立物件
		Integer i1 = new Integer(num);

		// 將物件取回 int值
		int value = i1.intValue();

		String data = "123456";
		System.out.println("data+1=" + (data + 1));

		//把字串轉為數字
		int value2 = Integer.parseInt(data);
		value2++;
		System.out.println("value2=" + value2);
	}

}
