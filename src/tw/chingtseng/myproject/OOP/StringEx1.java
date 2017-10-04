package tw.chingtseng.myproject.OOP;

public class StringEx1 {

	public static void main(String[] args) {
		String data = "abcdefghij";
		char at = data.charAt(5);
		System.out.println("at=" + at);

		int length = data.length();
		System.out.println("length=" + length);

		String sataSub = data.substring(3, 6);
		System.out.println("sataSub=" + sataSub);

		int myIndex = data.indexOf("cde");
		System.out.println("myIndex=" + myIndex);

		String myData = data.toUpperCase();
		System.out.println("myData=" + myData);

		boolean start = data.startsWith("abc");
		System.out.println("start=" + start);
	}

}
