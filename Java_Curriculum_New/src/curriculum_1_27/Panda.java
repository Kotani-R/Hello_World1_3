package curriculum_1_27;

public class Panda extends Animal {
	// コンストラクタ
	public Panda(String name, double length, int speed) {
		this.setName(name);//「パンダ」を代入
		this.setLength(length);//「1.9」を代入
		this.setSpeed(speed);//「30」を代入

		// スーパークラスのoutputメソッドを呼び出す
		// 「動物名、体長、速度」をコンソールに出力
		super.output();
		//「学名：アイルロポダ・メラノレウカ」
		System.out.println("学名：アイルロポダ・メラノレウカ");
	}
}