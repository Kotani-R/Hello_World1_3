package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		System.out.println("課題5");// 
		System.out.println("");// 改行
		System.out.println("");// 改行
			for(int i = 1; i < 10; i++) {// iが10未満の場合繰り返し
				for(int j= 1; j < 21;j++) {// jが21未満の場合繰り返し
					System.out.print(
							// コンソール出力( "j * i = (j*i)" ) 3桁表示
							String.format("%03d",j )+" * "+String.format("%03d", i)+" = "+String.format("%03d",i*j )
							);
					if(j < 20) {// jが20未満の場合true
					System.out.print(" || ");
					}
				}
				System.out.println("");// 改行
				System.out.println("");// 改行
			}
	}

}
