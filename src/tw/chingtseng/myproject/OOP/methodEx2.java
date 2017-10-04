package tw.chingtseng.myproject.OOP;

class Person {
	public void sayHello() {
		System.out.println("HELLO");
		sayGoodbye();
	}

	public void sayGoodbye() {
		System.out.println("BYE");
	}
}

public class methodEx2 {
	public static void main(String[] args) {
		Person mike = new Person();
		mike.sayHello();
		//mike.sayGoodbye();
		System.out.println("FINISHED");
	}
}
