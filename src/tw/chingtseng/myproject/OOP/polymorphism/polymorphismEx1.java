package tw.chingtseng.myproject.OOP.polymorphism;

//Animal e1=new Tiger();
//利用多型，若子類別有Override，會以子為主
class Animal {
	public void eat() {
		System.out.println("i can eat.");
	}
}

class Tiger extends Animal {

	@Override
	public void eat() {
		System.out.println("i wanna eat human.");
	}

	public void jump() {
		System.out.println("jump.");
	}
}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("i wanna eat fish.");
	}

	public void paly() {
		System.out.println("play.");
	}

}

public class polymorphismEx1 {

	public static void main(String[] args) {

		Animal e1 = new Tiger();
		e1.eat();

		Animal e2 = new Cat();
		e2.eat();

		// 先判斷當初是誰，恢復到原來的型別 強制轉型，即可使用原本的
		if (e1 instanceof Tiger) {
			Tiger t1 = (Tiger) e1;
			t1.jump();
		}

		if (e2 instanceof Cat) {
			Cat c1 = (Cat) e2;
			c1.paly();
		}

	}

}
