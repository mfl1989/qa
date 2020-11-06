package test05;

/**
 * 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）
 * int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };

 * @date 作成日:2020/10/12
 * @date 修正日:2020/10/12
 * @version 1.1
 * @author MM
 */
public class test050004 {

	public static void main(String[] args) {
		//配列の作成
		int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		//配列のループ
		for (int i = 0; i < arr.length; i++) {
			//配列のループ　比較
			for (int j = 0; j < arr.length; j++) {
				//同じ要素を探す
				if (arr[i] == arr[j] && i != j) {

					System.out.println(arr[i]);//出力
				}

			}

		}
	}

}
