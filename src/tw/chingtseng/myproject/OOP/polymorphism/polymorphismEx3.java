package tw.chingtseng.myproject.OOP.polymorphism;

public class polymorphismEx3 {
	
	class bird extends Animal{

		@Override
		public void eat() {
			System.out.println("i can fly.");
		}
		
	}

	public void action(Animal e) {
		e.eat();
	}

	public static void main(String[] args) {

		polymorphismEx3 poly1 = new polymorphismEx3();

		// 兩種方式 NEW一個CAT 叫kitty
		Cat kitty = new Cat();
		poly1.action(kitty);

		// 最快的方式 直接呼叫 new Tiger()
		poly1.action(new Tiger());
		
		//poly1.action(new bird());
		
		if (kitty instanceof Cat) {
			Cat c1 = (Cat) kitty;
			c1.paly();
		}

	}

}
