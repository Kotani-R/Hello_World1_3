package curriculum_1_27;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 
		コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
		ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
		
		コンソール出力結果
		
		コンソールに文字を入力してください
		動物名：ライオン
		体長：2.1m
		速度：80km/h
		学名：パンテラ レオ
		
		動物名：ゾウ
		体長：3.2m
		速度：40km/h
		学名：ロキソドンタ・サイクロティス
		
		動物名：パンダ
		体長：1.9m
		速度：30km/h
		学名：アイルロポダ・メラノレウカ
		
		動物名：チンパンジー
		体長：0.94m
		速度：25km/h
		学名：パン・トゥログロディテス
		
		動物名：シマウマ
		体長：2.4m
		速度：65km/h
		学名：チャップマンシマウマ
		
		動物名：インコ
		体長：0.1m
		速度：50km/h
		学名：不明
		*/
		
		System.out.println("コンソールに文字を入力してください");

		// コンソールに「動物名:体長:速度」の順で入力
		String animal = new Scanner(System.in).nextLine();

		// 入力された文字を","で区切って配列に格納
		String[] delimiterAnimal = animal.split(",");

		// String[] delimiterAnimalの各要素と一致する動物名があれば
		// その動物名のインスタンスを生成
		for (int i = 0; i < delimiterAnimal.length; i++) {
			// 各要素を":"で区切って配列に格納
			String[] delimiter = delimiterAnimal[i].split(":");
			
			//「動物名」を代入
			String name = delimiter[0];
			// double型に変換してlengthに「体長」を代入
			double length = Double.parseDouble(delimiter[1]);
			// int型に変換してspeedに「速度」を代入
			int speed = Integer.parseInt(delimiter[2]);

			if (delimiterAnimal[i].matches(".*ライオン.*")) {
				// ライオンインスタンスを生成
				Lion lion = new Lion(name, length, speed);
				System.out.println("");// 改行

			} else if (delimiterAnimal[i].matches(".*ゾウ.*")) {
				// ゾウインスタンスを生成
				Elephant elephant = new Elephant(name, length, speed);
				System.out.println("");// 改行

			} else if (delimiterAnimal[i].matches(".*パンダ.*")) {
				//パンダインスタンスを生成
				Panda panda = new Panda(name, length, speed);
				System.out.println("");// 改行

			} else if (delimiterAnimal[i].matches(".*チンパンジー.*")) {
				// チンパンジーインスタンスを生成
				Chimpanzee chimpanzee = new Chimpanzee(name, length, speed);
				System.out.println("");// 改行

			} else if (delimiterAnimal[i].matches(".*シマウマ.*")) {
				// シマウマインスタンスを生成
				Zebra zebra = new Zebra(name, length, speed);
				System.out.println("");// 改行

			} else if (delimiterAnimal[i].matches(".*インコ.*")) {
				// インコインスタンスを生成
				Parakeet parakeet = new Parakeet(name, length, speed);
				System.out.println("");// 改行
			}
		}
	}
}