package curriculum_1_27;

public class Elephant extends Animal {
	// コンストラクタ
	public Elephant(String name, double length, int speed) {
		this.setName(name);// 「ゾウ」を代入
		this.setLength(length);// 「3.2」を代入
		this.setSpeed(speed);// 「40」を代入

		// スーパークラスのoutputメソッドを呼び出す
		// 「動物名、体長、速度」をコンソールに出力
		super.output();
		//「学名：ロキソドンタ・サイクロティス」
		System.out.println("学名：ロキソドンタ・サイクロティス");
	}
}