package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		System.out.println("課題4");// 
		System.out.println("");// 改行
		System.out.println("");// 改行
		for(int i = 1; i < 10; i++) {// iが10未満の場合繰り返し
			for(int j= 1; j < 10;j++) {// jが10未満の場合繰り返し
				System.out.print(
						// コンソール出力( "i * j = (i*j)" ) 2桁表示
						String.format("%02d",i )+" * "+String.format("%02d", j)+" = "+String.format("%02d",i*j )
						);
				if(j < 9) {// jが9未満の場合true
				System.out.print(" || ");
				}
			}
			System.out.println("");// 改行
			System.out.println("");// 改行
		}
	

	}

}
