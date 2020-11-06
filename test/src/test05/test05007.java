package test05;

import java.util.Arrays;

public class test05007 {

	/**
	 * 質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
	 * int[] arr = new int[]{15, 22, 6, 227, 339, 63, 2, 155};
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 222, 22, 69999, 227, 339, 63, 2, 155 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				temp = arr[i];
				if (arr[i] > arr[j]) {

					arr[i] = arr[j];

					arr[j] = temp;

				}

			}
		}
		System.out.println(Arrays.toString(arr));
	}
}