package running;
import process.Cuisine;
import process.Greeting;
import process.nowTime;

public class Running {

	public static void main(String[] args) {
		/*
		 
		下記がコンソールに出力されるように作成してください
		
			こんにちは！ここは日本です！
			この寿司はうまい
			寿司は和食です
			今の現在日時は2023/03/09 10:23:39です
		
		【条件】
			・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
			・適切なファイルにフィールドで変数を必要な数作ってください。
			・thisを使って作成してください。
			・日時は今日の日付を取得してください。
			
		*/

		// 「こんにちは！ここは日本です！」を出力
		Greeting grt = new Greeting();
		// nullチェック
		if (grt != null) {
			grt.greet();
		}

		// 「この寿司はうまい」「寿司は和食です」を出力
		Cuisine csn = new Cuisine();
		// nullチェック
		if (csn != null) {
			csn.eat();
		}

		// 「今の現在日時はyyyy/MM/dd H:m:sです」の形で現在日時を出力
		nowTime nt = new nowTime();
		// nullチェック
		if (nt != null) {
			nt.date();
		}

	}

}
