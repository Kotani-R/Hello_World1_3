package curriculum_1_29;

public class Prefecture {
	// 都道府県名を宣言
	private String prefName;
	// 県庁所在地を宣言
	private String cityName;
	// 面積を宣言
	private int area;

	// 入力された数字と一致した都道府県をフィールドにセットするメソッド
	public void separate(String matchDate) {
		// matchDateを":"で区切ってString型配列に格納
		String[] delimiter = matchDate.split(":");

		// prefNameに都道府県名を代入
		setPrefName(delimiter[0]);
		// cityNameに県庁所在地を代入
		setCityName(delimiter[1]);
		// int型変数に変換して
		// areaに代入
		int areaInt = Integer.parseInt(delimiter[2]);
		setArea(areaInt);

		//「都道府県名、県庁所在地、面積」をコンソールに出力する
		this.output();
	}

	//「都道府県名、県庁所在地、面積」を出力するメソッド
	public void output() {
		// 都道府県名：〇〇〇
		System.out.println("都道府県名：" + this.getPrefName());
		// 県庁所在地：〇〇〇
		System.out.println("県庁所在地：" + this.getCityName());
		// 面積：〇〇〇.0km2
		System.out.println("面積：" + this.getArea() + ".0km2");
		// 改行
		System.out.println("");
	}

	// getter(都道府県)
	public String getPrefName() {
		return this.prefName;
	}

	// getter(県庁所在地)
	public String getCityName() {
		return this.cityName;
	}

	// getter(面積)
	public int getArea() {
		return this.area;
	}

	// setter(都道府県)
	public void setPrefName(String prefName) {
		// nullチェック
		if (prefName == null) {
			throw new IllegalArgumentException("設定されようとしている値がnullです");
		}
		this.prefName = prefName;
	}

	// setter(県庁所在地)
	public void setCityName(String cityName) {
		// nullチェック
		if (prefName == null) {
			throw new IllegalArgumentException("設定されようとしている値がnullです");
		}
		this.cityName = cityName;
	}

	// setter(面積)
	public void setArea(int area) {
		this.area = area;
	}
}