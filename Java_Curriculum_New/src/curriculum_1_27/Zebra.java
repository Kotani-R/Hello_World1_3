package curriculum_1_27;

public class Zebra extends Animal {
	// コンストラクタ
	public Zebra(String name, double length, int speed) {
		//「シマウマ」を代入
		this.setName(name);
		//「2.4」を代入
		this.setLength(length);
		//「65」を代入
		this.setSpeed(speed);

		// スーパークラスのoutputメソッドを呼び出す
		// 「動物名、体長、速度」をコンソールに出力
		super.output();
		//「学名：チャップマンシマウマ」
		System.out.println("学名：チャップマンシマウマ");
	}
}