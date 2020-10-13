package test;

/**
 * 設問１︓1から100までの偶数の和を求める(for + if)。
 *@date 作成日:2020/10/12
 * @date 修正日:2020/10/12
 * @version 1.1
 * @author MM
 */
public class test050001 {
	public static void main(String[] args) {
		//偶数初期値設定
		int sum = 0;
		//変数　loop
		for (int i = 0; i <= 100; i++) {
			//偶数判断
			if (i % 2 == 0) {
				sum = sum + i;//和を求める

			}
		}

		System.out.println(sum);
	}
}
