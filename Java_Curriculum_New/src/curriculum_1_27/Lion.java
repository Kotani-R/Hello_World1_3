package curriculum_1_27;

public class Lion extends Animal {
	// コンストラクタ
	public Lion(String name, double length, int speed) {
		//「ライオン」を代入
		this.setName(name);
		//「2.1」を代入
		this.setLength(length);
		//「80」を代入
		this.setSpeed(speed);

		// スーパークラスのoutputメソッドを呼び出す
		// 「動物名、体長、速度」をコンソールに出力
		super.output();
		//「学名：パンテラ レオ」
		System.out.println("学名：パンテラ レオ");
	}
}