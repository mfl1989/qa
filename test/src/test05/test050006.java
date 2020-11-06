package test05;

/**
 *
 * 質問６︓任意⾏列（２次元配列）の積を求める。

 *@date 作成日:2020/10/12
 *@date 修正日:2020/10/12
 *@version 1.1
 *@author MM1
 */
public class test050006 {
	public static void main(String[] args) {
		//二次元配列を作成
		int[][] arr = new int[][] { { 1, 25, 7, 5, 32, 2 },
				{ 4, 43, 3, 14, 33 }
		};
		int mcl = 1;//総的積作成　初期値０にならない
		//拡張	for　各要素をループ
		for (int[] i : arr) {
			for (int j : i) {
				//積を求める
				mcl = mcl * j;
			}
		}
		System.out.println(mcl);
	}

}
