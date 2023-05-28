package curriculum_1_30;

public class Person {
	// 名前を宣言
	public String name;
	// 年齢を宣言
	int age;
	//身長を宣言
	double height;
	// 体重を宣言
	double weight;
	// 人数を宣言
	int count = 0;

	// コンストラクタ
	public Person(String name, int age, double height, double weight) {
		// 名前を代入
		this.name = name;
		// 年齢を代入
		this.age = age;
		// 身長を代入
		this.height = height;
		// 体重を代入
		this.weight = weight;
		this.count++;
	}

	// BMIを計算してdouble型で戻すメソッド
	public double bmi() {
		// BMIを計算(int型)
		int BMI = (int) (weight / (height * height));
		return BMI;
	}

	public void print() {
		//「名前は〇〇です」
		System.out.println("名前は" + this.name + "です");
		//「年は〇〇才です」
		System.out.println("年は" + this.age + "才です");
		//「BMIは○○です」
		System.out.println("BMIは" + this.bmi() + "です");
		//「合計〇人です」
		System.out.println("合計" + this.count + "人です");
	}
}