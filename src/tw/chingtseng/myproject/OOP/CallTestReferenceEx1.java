package tw.chingtseng.myproject.OOP;

class Shirt {
	// 預設值
	int price = 2000;
	char size = 'L';

	public void showMsg() {
		System.out.println("price:" + price);
		System.out.println("size:" + size);
	}
}

public class CallTestReferenceEx1 {

	public static void main(String[] args) {

		Shirt myShirt = new Shirt();
		Shirt yourShirt = new Shirt();
		myShirt.price = 5000;
		myShirt.size = 'M';

		yourShirt.price = 3000;
		yourShirt.size = 'S';

		// 記憶體位置
		System.out.println("myShirt:" + myShirt);
		System.out.println("yourShirt:" + yourShirt);

		System.out.println("myShirt.price= " + myShirt.price);
		System.out.println("myShirt.size= " + myShirt.size);
		System.out.println("yourShirt.price= " + yourShirt.price);
		System.out.println("yourShirt.size= " + yourShirt.size);

		// 共享 將myShirt給yourShirt，yourShirt的記憶體釋放
		yourShirt = myShirt;
		yourShirt.size = 'X';
		System.out.println("myShirt_1:" + myShirt);
		System.out.println("yourShirt_1:" + yourShirt);
		System.out.println("myShirt.price_1= " + myShirt.price);
		System.out.println("myShirt.size_1= " + myShirt.size);
		System.out.println("yourShirt.price_1= " + yourShirt.price);
		System.out.println("yourShirt.size_1= " + yourShirt.size);
	}

}
