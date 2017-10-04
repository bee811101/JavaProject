package tw.chingtseng.myproject.OOP.override;

class fish {
	public void swim() {
		System.out.println("i can swim.");
	}
}

// 覆寫
class shark extends fish {

	// Annotation 標註 @XXX功能名稱
	@Override
	public void swim() {
		System.out.println("swim very fast.");
	}
}

public class CallTestOverrideEx1 {

	public static void main(String[] args) {

		shark grayShark = new shark();
		grayShark.swim();

	}

}
