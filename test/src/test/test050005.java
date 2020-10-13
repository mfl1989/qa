package test;

/**
 *  質問５︓質問３の配列に値「７」のインデックスを求む。
 * int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1116,1122 };

 *@date 作成日:2020/10/12
 *@date 修正日:2020/10/12
 *@version 1.1
 *@author MM
 */
public class test050005 {

	public static void main(String[] args) {
		//配列作成
		int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1116, 1122 };
		//配列loop
		int index =0;
		for (int i = 0; i < arr.length; i++) {
			//配列の要素を指定
			if (arr[i] ==7) {
				index=i;
			}
			}
		System.out.println(index);

	}

}
