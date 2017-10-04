package tw.chingtseng.myproject.OOP;

class Home {
	String address = "Earth";

	public void showMsg() {
		System.out.println("adress:" + address);
	}

}

public class TestEqualsEx1 {

	public static void main(String[] args) {
		Home myHome1 = new Home(); // myHome1: 0x1234
		Home myHome2 = new Home(); // myHome2: 0x2345 -> 0x1234

		// equals 比較物件是不是同一個，== 比住址有沒有相同 EX.0x1234
		System.out.println("(myHome1==myHome2):" + (myHome1 == myHome2));
		System.out.println("myHome1.equals(myHome2):" + (myHome1.equals(myHome2)));

		myHome2 = myHome1;
		System.out.println("(myHome1==myHome2):" + (myHome1 == myHome2));
		System.out.println("myHome1.equals(myHome2):" + (myHome1.equals(myHome2)));

	}

}
