package process;

public class Cuisine {
	//フィールド変数に代入
	String food = "寿司";
	String meal = "和食";

	/*------------------------------------------------------
		「この寿司はうまい」
		「 寿司は和食です」を出力するメソッド
		 -------------------------------------------------------*/
	public void eat() {
		System.out.println("この" + this.food + "はうまい");
		System.out.println(this.food + "は" + this.meal + "です");
	}

}
