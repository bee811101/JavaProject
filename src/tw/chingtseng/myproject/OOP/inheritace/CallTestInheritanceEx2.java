package tw.chingtseng.myproject.OOP.inheritace;

//extends Object 為預設
class Parent extends Object {
	String name = "judy";

	public Parent() {
		// super();是預設的
		super();
	}

	public Parent(String name) {
		super();
		this.name = name;
	}

	public void sayHello() {
		System.out.println("hello," + name);
	}
}

class Child extends Parent {
	public Child() {
		super("johnny");
	}

	public void callSuper() {
		super.name = "kitty";
		super.sayHello();
	}

}

public class CallTestInheritanceEx2 {

	public static void main(String[] args) {
		Child child1 = new Child();
		child1.sayHello();
		child1.callSuper();

	}

}
