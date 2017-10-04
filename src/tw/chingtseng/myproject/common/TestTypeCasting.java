package tw.chingtseng.myproject.common;

public class TestTypeCasting {

	public static void main(String[] args) {
		
		// byte=-128~127，超過會有溢位的情況
		byte b1 = 1, b2 = 127, b3;
		b3 = (byte) (b1 + b2);
		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		System.out.println("b3=" + b3);
	}

}
