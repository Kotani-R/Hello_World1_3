package process;

public class Greeting {
	//フィールド変数に代入
	String hello = "こんにちは!";
	String japan = "日本";

	/*------------------------------------------------------
	  「こんにちは！ここは日本です！」を出力するメソッド
	 -------------------------------------------------------*/
	public void greet() {
		System.out.print(this.hello);
		System.out.println("ここは" + this.japan + "です!");
	}

}
