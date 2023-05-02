package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// 下記9個をローカル変数として宣言のみしてください			
		// ・バイト型・短整数型・整数型・長整数型			
		// ・単精度浮動小数点数型・倍精度浮動小数点数型			
		// ・文字型・文字列型			
		// ・ブーリアン型	

		byte by; // バイト型変数を宣言
		short sh; // 短整数型変数を宣言
		int in; // 整数型変数を宣言
		long lo; // 長整数型変数を宣言
		float fl; // 単精度浮動小数点数型変数を宣言
		double pi; // 倍精度浮動小数点数型変数を宣言
		char ch; // 文字型変数を宣言
		String st; // 文字列型変数を宣言
		boolean bo; // ブーリアン型変数を宣言

		// 2				
		// それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください	

		by = 0;// バイト型変数を初期化
		sh = 0;// 短整数型変数を初期化
		in = 0;// 整数型変数を初期化
		lo = 0L;// 長整数型変数を初期化
		fl = 0.0f;// 単精度浮動小数点数型変数を初期化
		pi = 0.0d;// 倍精度浮動小数点数型変数を初期化
		ch = '\u0000';// 文字型変数を初期化
		st = null;// 文字列型変数を初期化
		bo = false;// ブーリアン型変数を初期化

		// 3				
		// 初期化をしたそれぞれの変数に下記の値を代入してください			
		// ・バイト型		10	
		// ・短整数型		100	
		// ・整数型		    1000	
		// ・長整数型		10000	
		// ・単精度浮動小数点数型		9.5	
		// ・倍精度浮動小数点数型		10.5	
		// ・文字型		    a	
		// ・文字列型		ハロー	
		// ・ブーリアン型		true	
		by = 10;// バイト型変数を代入
		sh = 100;// 短整数型変数をを代入
		in = 1000;// 整数型変数を代入
		lo = 10000;// 長整数型変数を代入
		fl = 9.5f;// 単精度浮動小数点数型変数を代入
		pi = 10.5;// 倍精度浮動小数点数型変数を代入
		ch = 'a';// 文字型変数を代入
		st = "ハロー";// 文字列型変数を代入
		bo = true;// ブーリアン型変数を代入

		// 4				
		// 下記の通りにコンソール出力されるようにしてください			
		// 上記で作成した変数を必ず使用すること			
		// 11110			
		// 20			
		// a ハロー true			
		// 11130			数字を全て足す
		// 	10000000000			小数点以外の数字を全てかける
		// 	0.105			10.5割る100をする
		// -90			10引く100をする
		System.out.println(by + in + lo + sh);// コンソール出力(バイト型変数,短整数型変数,整数型変数,長整数型変数の加算)
		System.out.println(by + by);// コンソール出力(小数点を出力しないようにするため)
		System.out.println(ch + st + bo);// コンソール出力(文字型,文字列型,ブーリアン型)
		System.out.println // コンソール出力(数字を全て足して小数点以下を消す)
		(String.format("%.0f", (by + in + lo + sh + fl + pi)));
		System.out.println(by * sh * in * lo);// コンソール出力(バイト型変数,短整数型変数,整数型変数,長整数型変数の乗算)
		System.out.println(pi / sh);// コンソール出力 (倍精度浮動小数点数型変数と単精度浮動小数点数型変数の除算)
		System.out.println(by - sh);// コンソール出力(バイト型変数と短整数型変数の減算)
		System.out.println();// 改行			
		// 5				
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。			
		// 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。			
		//  String num="20";			
		// int num1=23;			
		// System.out.println("ハローJAVA"+(num+num1));			
		int num = 20; //int型変数を宣言
		int num1 = 23;// int型変数を宣言
		System.out.println("ハローJAVA" + (num + num1));// コンソール出力(Strin型,int型) 
		System.out.println();// 改行

		//6				
		//『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください			
		//ローカル変数に代入し○○に入れてください			
		//『山田太郎 18歳 170.5cm 62.2kg 寿司』		

		//↓↓format↓↓			
		//「初めまして○○です」			
		//「年齢は○○歳です」			
		//「身長は○○cmです」			
		//「体重は○○kgです」			
		//「好きな食べ物は○○です」

		String name; // String型変数を宣言
		name = "山田太郎";// 変数に値を代入
		System.out.println("初めまして" + name + "です");// コンソール出力(名前)
		short age;// short型変数を宣言
		age = 18;// 変数に値を代入
		System.out.println("年齢は" + age + "歳です");// コンソール出力(年齢)
		double height;// double型変数を宣言
		height = 170.5;// 変数に値を代入
		System.out.println("身長は" + height + "cmです");// コンソール出力(身長)
		double weight;// double型変数を宣言
		weight = 62.2;// 変数に値を代入
		System.out.println("体重は" + weight + "kgです");// コンソール出力(体重)
		String food;// String型変数を宣言
		food = "寿司";// 変数に値を代入
		System.out.println("好きな食べ物は" + food + "です");// コンソール出力(食べ物)
		System.out.println();// 改行

		//7				
		//6で作成した自己紹介に続いてBMIが出力されるようにしてください			
		//「BMIは○○です」			
		//ただし計算は数値を直書きせず、全て変数を使ってすること		
		double bmi = weight / ((height / 100) * (height / 100));// double型変数を宣言
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");// コンソール出力(BMI)
		System.out.println();// 改行

		//8
		// 6で宣言した変数に再代入し、下記の通りコンソールに出力してください
		// 初めまして鈴木一郎です
		// 年齢は24歳です
		// 身長168.5cmです
		// 体重は64.2kgです
		// 好きな食べ物はオムライスです
		// BMIは22.6です

		name = "鈴木一郎";// 変数に値を再代入
		System.out.println("初めまして" + name + "です");// コンソール出力(名前)
		age = 24;// 変数に値を再代入
		System.out.println("年齢は" + age + "歳です");// コンソール出力(年齢)
		height = 168.5;// 変数に値を再代入
		System.out.println("身長は" + height + "cmです");// コンソール出力(身長)
		weight = 64.2;// 変数に値を再代入
		System.out.println("体重は" + weight + "kgです");// コンソール出力(体重)
		food = "オムライス";// 変数に値を再代入
		System.out.println("好きな食べ物は" + food + "です");// コンソール出力(食べ物)
		double bmi_2 = weight / ((height / 100) * (height / 100));// double型変数を宣言
		System.out.println("BMIは" + String.format("%.1f", bmi_2) + "です");// コンソール出力(BMI)
		System.out.println();// 改行
		test(name, age, height, weight, food);// 引数
		test_2(name, age, height, weight, food); // 引数
	}

	public static void test(String name, short age, double height, double weight, String food) { // testメソッドの呼び出し

		//9				
		//8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください			
		//初めまして鈴木一郎です			
		//年齢は48歳です			
		//身長337.0cmです			
		//体重は128.4kgです			
		//好きな食べ物はオムライスです			
		//BMIは11.31です	

		System.out.println("初めまして" + name + "です");// コンソール出力(名前)
		System.out.println("年齢は" + (age *= 2) + "歳です");// コンソール出力(年齢)
		System.out.println("身長は" + (height *= 2) + "cmです");// コンソール出力(身長)
		System.out.println("体重は" + (weight *= 2) + "kgです");// コンソール出力(体重)
		System.out.println("好きな食べ物は" + food + "です");// コンソール出力(食べ物)
		double bmi_3 = weight / ((height / 100) * (height / 100));// double型変数を宣言
		System.out.println("BMIは" + String.format("%.2f", bmi_3) + "です");// コンソール出力(BMI)
		System.out.println();// 改行
	}

	public static void test_2(String name, short age, double height, double weight, String food) { // test_2メソッドの呼び出し
		// 10				
		// 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません		

		System.out.println(age >= 25 ? true : false); // コンソール出力(条件演算子)
		System.out.println();// 改行

		//11				
		//8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください	
		String age_String = String.valueOf(age); // int型をString型に変換
		String height_String = String.valueOf(height); // int型をString型に変換
		String weight_String = String.valueOf(weight); // int型をString型に変換
		System.out.println(age_String + height_String + weight_String); //コンソール出力
		System.out.println();// 改行

		//12				
		//11で変換した【年齢・身長】を整数型に変換して出力してください			
		int age_Int = Integer.parseInt(age_String); // String型をint型に変換
		double height_Double = Double.parseDouble(height_String); // String型をdouble型に変換
		int height_Int = (int) height_Double;// double型をint型に変換
		System.out.println(age_Int); //コンソール出力(int型)
		System.out.println(height_Int); //コンソール出力(int型)
		System.out.println();// 改行

		//13				
		//12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください			
		//ただしif文は使わないでください	

		System.out.println(age_Int == 25 || height_Int >= 160 ? true : false); // コンソール出力(条件演算子)

	}
}
