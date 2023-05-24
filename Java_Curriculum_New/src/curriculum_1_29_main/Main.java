package curriculum_1_29_main;

import java.util.Scanner;
import java.util.stream.Stream;

import curriculum_1_29.Inquiry;
import curriculum_1_29.Prefecture;
import curriculum_1_29.Sorting;

public class Main {

	public static void main(String[] args) {
		/*
		
		0, "北海道:札幌市:83424"
		1, "青森県:青森市:9646"
		2, "岩手県:盛岡市:15275"
		3, "宮城県:仙台市:7282"
		4, "秋田県:秋田市:11638"
		5, "山形県:山形市:9323"
		6, "福島県:福島市:13784"
		7, "茨城県:水戸市:6097"
		8, "栃木県:宇都宮市:6408"
		9, "群馬県:前橋市:6362"
		10, "埼玉県:さいたま市:3798"
		
		コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
		都道府県がソートされてコンソールに出力されるように作ってください
		※Packageを2つ作ってください
		※複数選択できるようにしてください
		
		例:
		8,5,9,.....
		と入力された場合（昇順）
		
		都道府県名：山形県
		県庁所在地：山形市
		面積：9323.0km2
		
		都道府県名：栃木県
		県庁所在地：宇都宮市
		面積：6408.0km2
		
		都道府県名：群馬県
		県庁所在地：前橋市
		面積：6362.0km2
		
		*/
		// 各インスタンスを生成
		Prefecture prf = new Prefecture();
		Inquiry inq = new Inquiry();
		Sorting srt = new Sorting();

		// 0~10の数字を入力(例) 0,10,1,9,0,5,.....
		String numberString = new Scanner(System.in).nextLine();

		// 空文字チェック
		if (numberString.isEmpty()) {
			throw new IllegalArgumentException("数字を入力してください(例) 0,10,1,9,0,5");
		}

		// 入力された文字を","で区切ってString型配列に格納
		String[] delimiter = numberString.split(",");

		// String型配列からint型配列に変換
		int[] intArray = Stream.of(delimiter).mapToInt(Integer::parseInt).toArray();

		System.out.print("と入力された場合 ");

		// 昇順 or 降順を入力する
		String sorting = new Scanner(System.in).nextLine();

		// 空文字チェック
		if (sorting.isEmpty()) {
			throw new IllegalArgumentException("昇順 or 降順を入力してください");
		}

		// 改行
		System.out.println("");

		// 入力した数字を昇順 or 降順に並べ替えるメソッド
		int[] sortArray = srt.sortNum(intArray, sorting);

		// 入力した数字と一致する都道府県が出力されるメソッド
		inq.inquiryDate(sortArray, prf);
	}
}