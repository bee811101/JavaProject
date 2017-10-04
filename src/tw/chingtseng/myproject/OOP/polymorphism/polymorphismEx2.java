package tw.chingtseng.myproject.OOP.polymorphism;

public class polymorphismEx2 {

	public static void main(String[] args) {

		// 簡化
		Animal e;
		e= new Tiger();
		e.eat();

		e = new Cat();
		e.eat();

	}

}
