package tw.chingtseng.myproject.OOP;

public class TestEqualsEx2 {

	public static void main(String[] args) {

		String str1 = new String("hello"); // 0x3456
		String str2 = new String("hello"); // 0x4567
		// ns "hello": 0x6789
		System.out.println("(str1==str2)=" + (str1 == str2));
		System.out.println("(str1.equals(str2))=" + (str1.equals(str2)));

		String str3 = "Hello"; // ns "Hello": 0x7788
		String str4 = "Hello"; // ns "Hello": 0x7788
		System.out.println("(str3==str4)=" + (str3 == str4));
		System.out.println("(str3.equals(str4))=" + (str3.equals(str4)));

	}

}
