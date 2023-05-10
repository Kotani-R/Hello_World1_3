package curriculun_18;

public class Curriculum_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	//コンソールに「Hello JavaSE 11」と出力するメソッド
	public static void Hello(String hello, int num) {// 受け取った値をString型変数helloとint型変数xに格納
		System.out.println(hello + num);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// 引数同士で乗算しコンソールの出力するメソッド
	public static void calculation(int x, int y) {// 受け取った値をint型変数xに格納
		System.out.println(x * y);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// 受け取った配列の値を順番にコンソールに出力するメソッド
	public static void array(int[] array) {// 受け取った参照値をint型配列arrayに格納
		for (int new_Array : array) {// 拡張for文で配列を回す
			System.out.println(new_Array);// コンソール出力
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	// 引数の値同士で和算しコンソールの出力するメソッド
	public static void calculation(double x, double y) {// 受け取った値をdouble型変数x,yに格納
		System.out.println(x + y);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// 引数の値の数だけ要素を持つ配列に乱数を格納してコンソールに出力するメソッド
	public static int[] random(int x) {// 受け取った値をint型変数xに格納,int型配列で値を返す
		int[] array = new int[x]; // int型配列arrayを宣言；

		for (int i = 0; i < x; i++) {
			array[i] = new java.util.Random().nextInt(101) + 1;// 1~100の乱数をarray[]に格納
			System.out.println(array[i]);
		}
		return array;// 戻り値(int型配列array)
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	// Q5から受け取った戻り値の要素の平均値をコンソールに出力するメソッド
	public static double average(int[]array) {// double型変数で値を返す
		double sum_Array = 0;
		for (int i = 0; i < array.length; i++) {
			double array_Double = (double) array[i];// int型配列の各要素をdouble型変数に変換して代入
			sum_Array += array_Double;// 配列の要素の合計値を計算
		}
		double avg_Array = sum_Array / array.length;// 配列の要素の平均値を計算
		System.out.println(avg_Array);
		return avg_Array;// 戻り値(int型変数avg_Array)
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	// 戻り値の値が50以上か評価するメソッド
	public static void evaluation(double eval_Array) {
		System.out.println(
				eval_Array >= 50 ? "true" : "false");// eval_Arrayが50以上ならtrue
	}

	public static void main(String[] args) {
		String hello = "Hello JavaSE ";
		int num = 11;
		Hello(hello, num); // Q1 Helloメソッドに引数を渡して呼び出す
		System.out.println("");// 改行

		calculation(10, 13);// Q2 calculationメソッドに引数を渡して呼び出す
		System.out.println("");// 改行

		int[] array_Int = new int[] { 1, 2, 3, 4, 5, 6 };// Q3 int型配列を宣言、値を代入
		array(array_Int);// Q3 arrayメソッドに引数を渡して呼び出す
		System.out.println("");// 改行

		calculation(10.1, 12.3);// Q4 calculationメソッドに引数を渡して呼び出す
		System.out.println("");// 改行

		int[] array = random(4);// Q5 randomメソッドに引数を渡して呼び出し、戻り値を受け取る
		System.out.println("");// 改行

		double eval_Array=average(array);// Q6 averagaメソッドに引数を渡して呼び出し、戻り値を受け取る
		System.out.println("");// 改行
		
		evaluation(eval_Array);// Q7 evaluationメソッドに引数を渡して呼び出す

	}

}
