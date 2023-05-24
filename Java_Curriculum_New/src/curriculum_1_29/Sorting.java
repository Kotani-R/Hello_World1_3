package curriculum_1_29;

import java.util.Arrays;

public class Sorting {
	// 入力した値を昇順or降順に並べ替えるメソッド
	public int[] sortNum(int[] intArray, String sorting) {
		switch (sorting) {
		// 昇順に並べ替える
		case "昇順":
			Arrays.sort(intArray);
			break;

		// 降順に並べ替える
		case "降順":
			// 昇順に並び替えた後
			// 前後の値を入れ替えて降順に並び替える
			Arrays.sort(intArray);
			for (int f = 0, l = intArray.length - 1; f < l; f++, l--) {
				int temp = intArray[f];
				intArray[f] = intArray[l];
				intArray[l] = temp;
			}
			break;
		}
		// 並べ替えた値を戻す
		return intArray;
	}
}