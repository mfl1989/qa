package test;

import java.util.Arrays;

/**
 * 質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
	 * int[] arr = new int[]{15, 22, 6, 227, 339, 63, 2, 155};
 *@date 作成日:2020/10/12
 *@date 修正日:2020/10/12
 *@version 1.1
 *@author MM1
 */
public class test050007 {

	public static void main(String[] args) {
		//配列の作成
		int[] arr = new int[] { 15, 22, 6, 227, 339, 63, 2, 155 };

		//for使てループする
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				//各要素を比較する
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[ j] = temp;

				}

			}

		}
		//出力
		System.out.println(Arrays.toString(arr));
	}

}
