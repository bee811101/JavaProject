package tw.chingtseng.myproject.OOP.exception;

public class TestAssertionEx1 {

	public static void main(String[] args) {
		int x = 6; 
		int y = 0;
		assert y!=0:"y="+y;
		
		System.out.println("x/y=" + (x/y));

	}

}
