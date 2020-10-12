package test;

/**
 * 設問１︓1から100までの偶数の和を求める(for + if)。
 * @author MM
 *
 */
public class test050001 {
	public static void main(String[] args) {
		int l = 0;//設置初期値変数
		//配列の要素を出力する
		for (int i = 0; i <= 100; i++) {
			//偶数を求める
			if (i % 2 == 0) {
				l = l + i;//和を求める

			}
		}

		System.out.println(l);
	}
}
