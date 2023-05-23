package curriculum_1_27;

public abstract class Animal {
	// 動物名を宣言
	private String name; 
	// 体長を宣言
	private double length; 
	// 速度を宣言
	private int speed; 

	// 「動物名、体長、速度」をコンソールに出力するメソッド
	public void output() {
		// 動物名：〇〇〇
		System.out.println("動物名：" + this.getName());
		// 体長：〇〇〇m
		System.out.println("体長：" + this.getLength() + "m");
		// 速度：〇〇〇km/h
		System.out.println("速度：" + this.getSpeed() + "km/h");
	}

	// getter(動物名)
	public String getName() {
		return this.name;
	}

	// getter(体長)
	public double getLength() {
		return this.length;
	}

	// getter(速度)
	public int getSpeed() {
		return this.speed;
	}

	// setter(動物名)
	public void setName(String name) {
		// nullチェック
		if (name == null) {
			throw new IllegalArgumentException("設定されようとしている値がnullです");
		}
		this.name = name;
	}

	// setter(体長)
	public void setLength(double length) {
		this.length = length;
	}

	// setter(速度)
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}