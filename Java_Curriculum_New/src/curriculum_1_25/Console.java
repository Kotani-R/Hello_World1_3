package curriculum_1_25;

public class Console {
	public void output(Hero h) {
		// コンソール出力
		// こんにちは 「 名前 」 さん
		System.out.println("こんにちは「 " + h.getName() + " 」さん");
		// ステータス
		System.out.println("ステータス");
		// HP：〇〇〇
		System.out.println("HP：" + h.getHp());
		// MP：〇〇〇
		System.out.println("MP：" + h.getMp());
		// 攻撃力：〇〇〇
		System.out.println("攻撃力：" + h.getAtk());
		// 素早さ：〇〇〇
		System.out.println("素早さ：" + h.getAgi());
		// 防御力：〇〇〇
		System.out.println("防御力：" + h.getDef());
		// 改行
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
	}

}
