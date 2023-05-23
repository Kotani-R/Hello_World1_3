package curriculum_1_27;

public class Lion extends Animal {
	// コンストラクタ
	public Lion(String name, double length, int speed) {
		this.setName(name);// 「ライオン」を代入
		this.setLength(length);// 「2.1」を代入
		this.setSpeed(speed);// 「80」を代入

		// スーパークラスのoutputメソッドを呼び出す
		// 「動物名、体長、速度」をコンソールに出力
		super.output();
		//「学名：パンテラ レオ」
		System.out.println("学名：パンテラ レオ");
	}
}