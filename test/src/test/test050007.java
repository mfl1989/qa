package test;

import java.util.Arrays;

/**
 * 質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
	 * int[] arr = new int[]{15, 22, 6, 227, 339, 63, 2, 155};
 * @author MM
 *
 */
public class test050007 {

	public static void main(String[] args) {
		//配列の説明
		int[] arr = new int[] { 15, 22, 6, 227, 339, 63, 2, 155 };
		int temp = 0;
		//二つfor使て各要素を出力
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				//かくようそをたいひする
				if (arr[i] < arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}
			}
			//出力
			System.out.println(Arrays.toString(arr));
		}

	}

}
