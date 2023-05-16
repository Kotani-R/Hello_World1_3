package curriculum_1_23;

public class Main {

	public static void main(String[] args) {
		/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */
		// lionインスタンスを生成
		Lion lion = new Lion("ライオン", 2.1 , 80);
		
		// コンソール出力
		//「動物名：ライオン」
		System.out.println("動物名："+ lion.getName());
		//「体長：2.1m」
		System.out.println("体長："+ lion.getLength()+"m");
		//「速度：80km/h」
		System.out.println("速度："+ lion.getSpeed()+"km/h");
	}

}
