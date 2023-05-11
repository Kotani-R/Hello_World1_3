package basicClass;

public class Dog {

	// Q1：フィールドに動物の名前の変数を定義してください。
	String animalName; // 名前を宣言
	
	// Q2：フィールドに動物の数の変数を定義してください。
	int animalNum;// 数を宣言

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// インスタンスが生成された直後に実行される処理
	public Dog(int animalNum) {
		this.animalName = "犬";// 「犬」でanimalNameフィールドを初期化

		// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		this.animalNum = animalNum;// 引数の値でanimalNumフィールドを初期化
	}

}
