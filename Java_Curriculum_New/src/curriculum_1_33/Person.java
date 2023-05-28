package curriculum_1_33;

public class Person {
	// ファーストネームを宣言(インスタンスフィールド)
	public String firstName;
	// ラストネームを宣言(インスタンスフィールド)
	public String lastName;
	// 年齢を宣言(インスタンスフィールド)
	public int age;
	//身長,体重を宣言(インスタンスフィールド)
	public double height, weight;
	// 人数を宣言(クラスフィールド)
	public static int count = 0;

	// コンストラクタ
	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// ファーストネームとラストネームを合わせて
	// フルネームにするインスタンスメソッド
	public String fullName() {
		return this.firstName + this.lastName;
	}

	//「フルネーム」、「年齢」を出力するインスタンスメソッド
	public void print() {
		//「名前は〇〇です」
		System.out.println("名前は" + this.fullName() + "です");
		//「年は〇〇才です」
		System.out.println("年は" + this.age + "です");
	}

	// BMIを計算してdouble型で戻すインスタンスメソッド
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	//「合計人数」を出力するクラスメソッド
	public static void printCount() {
		// 「合計〇人です」
		System.out.println("合計" + Person.count + "人です");
	}
}
