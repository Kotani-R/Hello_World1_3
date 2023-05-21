package curriculum_1_25;
// Heroクラス( Characterのサブクラス)
public class Hero extends Character {
	// 1~999の乱数をint型変数として戻す
	public int Random() {
		int random = new java.util.Random().nextInt(999) + 1;
		return random;
	}

	// コンストラクタ
	public Hero(String name) {
		// 入力した名前を代入
		this.setName(name);

		// Randomメソッドの戻り値を各フィールドに代入する
		this.setHp(this.Random());
		this.setMp(this.Random());
		this.setAtk(this.Random());
		this.setAgi(this.Random());
		this.setDef(this.Random());

	}
}
