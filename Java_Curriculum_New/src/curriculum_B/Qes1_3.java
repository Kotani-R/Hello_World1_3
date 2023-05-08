package curriculum_B;

public class Qes1_3 {
	/*----------------------------------------------------
     ユーザー名を登録後、じゃんけんをするシステム									
   ------------------------------------------------------*/
	public static void main(String[] args) {

		// 1										
		// ログイン時の入力チェックシステムを下記条件で作成してください									
		// ・コンソールにユーザー名を入力できるようにしてください									
		// ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください									
		// ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください									
		// ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください									
		// 2										
		// ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください									
		String name;// String型変数nameを宣言
		while (true) {
			name = new java.util.Scanner(System.in).nextLine();// コンソールにユーザー名を入力
			if (!name.matches("^[0-9a-zA-Z_]*$")) {// 半角英数字以外の場合true
				System.out.println("半角英数字のみで名前を入力してください");
				System.out.println("");// 改行
			} else if (name.length() > 10) {//　文字数が10文字未満の場合true
				System.out.println("名前を10文字以内にしてください");
				System.out.println("");// 改行
			} else if (name.length() <= 0 || name == null) {// 文字数が0文字以下もしくはnullの場合true
				System.out.println("名前を入力してください");
				System.out.println("");// 改行
			} else {
				System.out.println("ユーザー名「" + name + "」を登録しました");
				break;// ループ終了
			}

		}
		System.out.println("");// 改行
		
		// 3 
		// じゃんけんのシステムを下記の条件で作成してください									
		// ・「0はグー、1：チョキ、2：パー」とすること									
		// ・じゃんけんに勝つまでループすること									
		//・一回ごとに自分の手と相手の手を下記の通り出力してください									
		// ユーザー名「name」を登録しました								
		//nameの手は「パー」								
		// 相手の手は「グー」								
		System.out.println("ユーザー名「" + name + "」を登録しました");// コンソール出力(ユーザーの名前)
		String [] rps = new String [] {"グー","チョキ","パー"};// String型配列変数に「グー,チョキ,パー」を代入
		int count = 0;// int型変数countを宣言
		int win = 0;// int型変数winを宣言
		while (win < 1) {// int型変数winが1より小さいとき繰り返し
	    count++;// countに+1をする
		int user = new java.util.Random().nextInt(3);// int型変数userに乱数0~2を代入
		int you = new java.util.Random().nextInt(3);// int型変数youに乱数0~2を代入
		System.out.println(name+"の手は「"+rps[user]+"」");// コンソール出力(自分の手)
		System.out.println("相手の手は「"+rps[you]+"」");// コンソール出力(相手の手)
	    System.out.println("");// 改行
		
		// じゃんけんに勝った場合 true
		if((user==0 && you == 1) || (user==1 && you == 2) || (user==2 && you == 0)) { 
			System.out.println("やるやん");
			System.out.println("次は俺にリベンジさせて");
			System.out.println("");// 改行
			win++;// winに+1をする
			
		// じゃんけんに負けた場合true
		} else if((user==0 && you == 2) || (user==1 && you == 0) || (user==2 && you == 1)){
		switch (you) { 
		case 0:// グーに負けた場合
			System.out.println("俺の勝ち!");
			System.out.println("負けは次につながるチャンスです!");
			System.out.println("ネバ―ギブアップ!");
			System.out.println("");// 改行
			break;
		case 1:// パーに負けた場合
			System.out.println("俺の勝ち!");
			System.out.println("たかがじゃんけん、そう思ってないですか?");
			System.out.println("それやったら次も、俺が勝ちますよ");
			System.out.println("");// 改行
			break;
		case 2:// チョキに負けた場合
			System.out.println("俺の勝ち!");
			System.out.println("なんで負けたか、明日まで考えといてください。");
			System.out.println("そしたら何かが見えてくるはずです");
			System.out.println("");// 改行
			break;
		}
		}else { // あいこの場合
			System.out.println("DRAW あいこ もう一回しましょう!");
			System.out.println("");// 改行
		}
		}
		System.out.println("勝つまでにかかった合計回数は"+count+"回です");// コンソール出力(じゃんけんをした回数)
	}
}
