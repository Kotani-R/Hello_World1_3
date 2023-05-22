package curriculum_1_25;

public class Character {
	// 名前を宣言
	private String name;
	// HPを宣言 
	private int hp;
	// MPを宣言
	private int mp;
	// 攻撃力を宣言
	private int atk;
	// 素早さを宣言
	private int agi;
	// 防御力を宣言
	private int def;

	// getter(名前)
	public String getName() {
		return this.name;
	}

	// getter(HP)
	public int getHp() {
		return this.hp;
	}

	// getter(MP)
	public int getMp() {
		return this.mp;
	}

	// getter(攻撃力)
	public int getAtk() {
		return this.atk;
	}

	// getter(防御力)
	public int getDef() {
		return this.def;
	}

	// getter(素早さ)
	public int getAgi() {
		return this.agi;
	}

	// setter(名前)
	public void setName(String name) {
		// nullチェック
		if (name == null) {
			throw new IllegalArgumentException("nameの値がnullです");
		}
		this.name = name;
	}

	// setter(HP)
	public void setHp(int hp) {
		this.hp = hp;
	}

	// setter(MP)
	public void setMp(int mp) {
		this.mp = mp;
	}

	// setter(攻撃力)
	public void setAtk(int atk) {
		this.atk = atk;
	}

	// setter(防御力)
	public void setDef(int def) {
		this.def = def;
	}

	// setter(素早さ)
	public void setAgi(int agi) {
		this.agi = agi;
	}
}
