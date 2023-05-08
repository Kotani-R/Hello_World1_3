package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	/*----------------------------------------------------
             生徒の成績を管理するプログラム									
   ------------------------------------------------------*/
	// N人の生徒の成績を管理するプログラムを下記条件で作成してください									
	// ・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください									
	// ・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください									
	// ・このプログラムの実行は必ず1回以上行われるようにしてください									
	// ・出力例を参考にプログラミングを作成してください									

	public static void main(String[] args) {
		String[] subject = new String[] { "英語", "数学", "理科", "社会" };// String型配列subjectを宣言、値を代入
		int number = 0;
		
		System.out.print("生徒の人数を入力してください(2以上) :");
		Scanner sc = new Scanner(System.in);// Scannerクラスを作成
		String number_String = sc.nextLine();// 生徒の人数を入力
		
		// 数字以外を入力したら繰り返し
		 while(!number_String.matches("^[0-9]*$")){
			System.out.println("数字のみを入力してください");
			System.out.print("生徒の人数を入力してください(2以上) :");
			number_String = sc.nextLine();//  コンソールに生徒の人数を入力
		};
		
		 number = Integer.parseInt(number_String);// 入力された数字をString型からint型に変換
		double[][] students_Scores = new double[number][4];// 多次元型配列students_Scoresを宣言

		for (int i = 0; i < students_Scores.length; i++) {// int型変数iが生徒の人数未満の場合true
			System.out.print(
					(i + 1) + "人目の『英語』の点数を入力してください :"
					);
			students_Scores[i][0] = new java.util.Scanner(System.in).nextDouble();// コンソールに英語の点数を入力
			System.out.print(
					(i + 1) + "人目の『数学』の点数を入力してください :"
					);
			students_Scores[i][1] = new java.util.Scanner(System.in).nextDouble();// コンソールに数学の点数を入力
			System.out.print(
					(i + 1) + "人目の『理科』の点数を入力してください :"
					);
			students_Scores[i][2] = new java.util.Scanner(System.in).nextDouble();// コンソールに理科の点数を入力
			System.out.print(
					(i + 1) + "人目の『社会』の点数を入力してください :"
					);
			students_Scores[i][3] = new java.util.Scanner(System.in).nextDouble();// コンソールに社会の点数を入力
			System.out.println("");// 改行
		}
		
        // 各生徒ごとの平均点を表示
		for (int j = 0; j < number; j++) {// int型変数jが生徒の人数未満の場合true
			double sum_Student = 0;// double型変数sum_Studentを初期化
			double avg_Student = 0;// double型変数avg_Studentを初期化
			for (int k = 0; k < 4; k++) {// int型変数kが4(科目数)未満の場合true
				sum_Student += students_Scores[j][k];// 生徒1人のテストの合計点
			}
			avg_Student = sum_Student / 4.0;// // 生徒1人のテストの平均点
			System.out.println(
					// コンソール出力(生徒1人の平均点)2桁表示
					(j + 1) + "人目の平均点は" + String.format("%.2f", avg_Student) + "点です"
					);
		}
		    System.out.println("");// 改行
        
		// 科目ごとの平均点を表示
		for (int m = 0; m < subject.length; m++) {// int型変数mが4(科目数)未満の場合true
			double sum_Subject = 0;// double型変数sum_Subjectを初期化
			double avg_Subject = 0;// double型変数avg_Subjectを初期化
			for (int n = 0; n < number; n++) {// int型変数nが生徒の人数未満の場合true
				sum_Subject += students_Scores[n][m];// 各科目の合計点
			}
			avg_Subject = sum_Subject / number;// 各科目の平均点
			System.out.println(
					// コンソール出力(各科目ごとの平均点)2桁表示
					subject[m]+"の平均点は" + String.format("%.2f", avg_Subject) + "点です"
					);

		}
		
		// 全体の科目平均点を表示
		double sum_All = 0;// double型変数sum_Allを初期化
		for (double[] scores: students_Scores) {// students_Scoreをscoresに格納して配列を回す
			for(double score: scores) {// scoresをscoreに格納して配列を回す
				 sum_All += score ; // 全体の科目合計点を計算
			}
		}
		double avg_All = sum_All / ( number * 4 );// 全体の科目平均点を計算
		System.out.println(
				// コンソール出力(全体の科目平均点)2桁表示
				"全体の平均点は"+ String.format("%.2f", avg_All) +"点です"
				);

	}

}
