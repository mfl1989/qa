package test06;

import java.util.Arrays;

/**
 * バブルソート⽤メソッドを作成してください。
 * メソッド名︓bubbleSort
 * 引数１︓intの配列
 * 戻り値︓ソート済みの配列
 * 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ い。
 * @author MM
 *@date 2020/10/19
 */

public class test06004 {

	public static void main(String[] args) {
		int[] array = new int[] { 33, 2, 66, 222, 666, 44, 226, 857 };
		int[] arr = bubbleSort(array);
		System.out.print(Arrays.toString(arr));
	}

	public static int[] bubbleSort(int[] arr) {
		int t = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}

			}
		}

		return arr;
	}

}
