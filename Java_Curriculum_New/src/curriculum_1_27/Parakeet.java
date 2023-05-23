package curriculum_1_27;

public class Parakeet extends Animal {
	// コンストラクタ
	public Parakeet(String name, double length, int speed) {
		this.setName(name);// 「インコ」を代入
		this.setLength(length);// 「0.1」を代入
		this.setSpeed(speed);// 「50」を代入

		// スーパークラスのoutputメソッドを呼び出す
		// 「動物名、体長、速度」をコンソールに出力
		super.output();
		//「学名：不明」
		System.out.println("学名：不明");
	}
}