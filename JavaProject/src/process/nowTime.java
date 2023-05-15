package process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class nowTime {
	// 日付を取得
	Date date = new Date();
	// パターンを指定
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd H:m:s");

	/*------------------------------------------------------
	 日付をフォーマットし出力するメソッド
	-------------------------------------------------------*/
	public void date() {
		System.out.println(
				"今の現在日時は" + this.dateFormat.format(this.date) + "です");
	}
}