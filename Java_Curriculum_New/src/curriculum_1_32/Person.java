package curriculum_1_32;

public class Person {
	// 名前を宣言(インスタンスフィールド)
	public String name;
	// 年齢を宣言(インスタンスフィールド)
	public int age;
	//身長を宣言(インスタンスフィールド)
	public double height;
	// 体重を宣言(インスタンスフィールド)
	public double weight;
	// 人数を宣言(クラスフィールド)
	public static int count = 0;

	// コンストラクタ
	Person(String name, int age, double height, double weight) {
		// 名前を代入
		this.name = name;
		// 年齢を代入
		this.age = age;
		// 身長を代入
		this.height = height;
		// 体重を代入
		this.weight = weight;
		count++;
	}

	// BMIを計算してdouble型で戻すインスタンスメソッド
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	//「名前」、「年齢」を出力するインスタンスメソッド
	public void print() {
		//「名前は〇〇です」
		System.out.println("名前は" + this.name + "です");
		//「年は〇〇才です」
		System.out.println("年は" + this.age + "です");
	}

	//「合計人数」を出力するクラスメソッド
	public static void printCount() {
		// 「合計〇人です」
		System.out.println("合計" + Person.count + "人です");
	}
}