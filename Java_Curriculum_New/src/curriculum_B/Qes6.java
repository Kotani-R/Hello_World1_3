package curriculum_B;

public class Qes6 {
/*----------------------------------------------------
     	        入力した商品の残り台数が出力されるシステム									
               ------------------------------------------------------*/
	// 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください									
	// ・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可									
	// ・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください									
	// ・例：テレビorディスプレイと受け取った場合〇〇に受け取った値が入る→「〇〇の残り台数は9台です」									
	// ・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません									
	// ・入力された値は「、」区切りで指定してください									
	// ・そのほかの値が入力された場合下記を出力されるようにしてください								
	//	『受け取った値』は指定の商品ではありません								
	// ・残り台数は0〜11までのランダムな値が出力されるようにしてください									

	public static void main(String[] args) {
		String[] product = new String[] { // String型配列productを宣言、値を代入
				//   0          1         2         3         4         5           6
				"パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ"
		};
		String stock = new java.util.Scanner(System.in).nextLine();// コンソールにテキストを入力
		String[] delimiter = stock.split("、");// 入力されたテキストを「、」で区切る
		int i;// int型変数iを宣言

		for (String product_2 : delimiter) {// product_2にdelimiterの要素を格納しながら配列を回す
			i = 0;// indexに使用
			// iが7より小さいかつproduct_2がproduct[i]と等しくないときtrue
			for (; i < product.length && !(product_2.equals(product[i]));) {
				i++;// iに+1をする
			}

			int stock_Num = new java.util.Random().nextInt(12);// int型変数stock_Numに乱数0~11を代入

			switch (i) {
			case 0:// コンソールに「パソコン」と入力した場合
				System.out.println("パソコンの残り台数は" + stock_Num + "台です");
				System.out.println("");// 改行
				break;
			case 1:// コンソールに「冷蔵庫」と入力した場合
				System.out.println("冷蔵庫の残り台数は" + stock_Num + "台です");
				System.out.println("");// 改行
				break;
			case 2:// コンソールに「扇風機」と入力した場合
				System.out.println("扇風機の残り台数は" + stock_Num + "台です");
				System.out.println("");// 改行
				break;
			case 3:// コンソールに「洗濯機」と入力した場合
				System.out.println("洗濯機の残り台数は" + stock_Num + "台です");
				System.out.println("");// 改行
				break;
			case 4:// コンソールに「加湿器」と入力した場合
				System.out.println("加湿器の残り台数は" + stock_Num + "台です");
				System.out.println("");// 改行
				break;
			case 5:// コンソールに「テレビ」と入力した場合
			case 6:// コンソールに「ディスプレイ」と入力した場合
				String resulut = product_2.equals("テレビ") ? "テレビ" : "ディスプレイ";
				System.out.println(resulut + "の残り台数は" + stock_Num + "台です");
				System.out.println("");// 改行
				break;
			default://上記以外を入力した場合
				System.out.println("『"+ product_2 +"』は指定の商品ではありません");
				break;

			}
		}

	}

}
