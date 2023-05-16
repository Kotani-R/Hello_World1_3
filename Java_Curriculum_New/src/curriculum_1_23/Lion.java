package curriculum_1_23;

public class Lion {
	private String name; //"ライオン"
	private double length; // 2.1m
	private int speed; // 80km

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

	// setter(ライオン)
	public void setName(String name) {
		// nullチェック
		if (name == null) {
			throw new IllegalArgumentException("設定されようとしている名前がnullです");
		}
		this.name = name;
	}

	// setter(2.1m)
	public void setLength(double length) {
		this.length = length;
	}

	// setter(80km/h)
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// コンストラクタ
	public Lion(String name, double length, int speed) {
		this.setName(name);// 「ライオン」を代入
		this.setLength(length);// 「2.1」を代入
		this.setSpeed(speed);// 「80」を代入
	}

}
