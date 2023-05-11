package basicClass;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog d = new Dog(5);// インスタンスDogを生成
		String name = d.animalName;// Dog型変数dのanimalName「犬」をnameに代入
		System.out.println(name);//name「犬」を出力
		System.out.println("");//  改行

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		int number = d.animalNum;// Dog型変数dのanimalNum「5」をnumberに代入
		System.out.println(number);// number「5」を出力
		System.out.println("");//  改行

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		  Date date = new Date();   // 日付を取得
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s"); // パターンを指定
	        System.out.println(dateFormat.format(date)); // 日付をフォーマットし出力
	}

}
