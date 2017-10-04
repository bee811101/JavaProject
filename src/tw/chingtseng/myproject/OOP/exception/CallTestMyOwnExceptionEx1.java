package tw.chingtseng.myproject.OOP.exception;

//自訂例外
//必須繼承 Exception類別
class MyOwnException extends Exception {

	private String server;
	private int port;
	private String errMsg;

	// 利用工具 滑鼠直接建立 private String server;...
	// 建立建構子
	public MyOwnException(String server, int port, String errMsg) {
		this.server = server;
		this.port = port;
		this.errMsg = errMsg;
	}

	public void showInfo() {
		System.out.println("server:" + server);
		System.out.println("port:" + port);
		System.out.println("errMsg:" + errMsg);
	}
}

public class CallTestMyOwnExceptionEx1 {

	public static void main(String[] args) {

		int code = 102;
		if (code % 2 == 0) {
			try {
				throw new MyOwnException("blade", 80, "System Error: WannaCry2");
			} catch (MyOwnException e) {

				e.printStackTrace();
				e.showInfo();
			}
		}
	}

}
