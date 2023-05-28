package curriculum_1_33;

public class Main {
	// 問題1：インスタンスフィールドに「lastName」を追加しましょう
	// 問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
	// ※順番はfirstNameの次
	// 問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
	public static void main(String[] args) {
		// Personインスタンスperson1を生成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		
		//「名前」、「年齢」を出力するインスタンスメソッド
		person1.print();
		
		// Personインスタンスperson2を生成
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		
		//「名前」、「年齢」を出力するインスタンスメソッド
		person2.print();
		
		// 改行
		System.out.println("");
		
		//「合計人数」を出力するクラスメソッド 
		Person.printCount();
	}

}