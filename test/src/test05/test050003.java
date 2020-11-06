package test05;

/**
 * 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。

 *@date 作成日:2020/10/12
 *@date 修正日:2020/10/12
 *@version 1.1
 * @author MM1
 */
public class test050003 {

	public static void main(String[] args) {
		int []array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		//初期値設定
		int max = array[0];
		int min = array[0];
		int sum = 0;
		float avg = 1;
		//配列のloop

		for (int i = 0; i < array.length; i++) {

			//各値を求める
			sum=sum+array[i];
			avg=sum/array.length;
			if (max< array[i]) {
				max = array[i];
				if(min>array[i]) {
					min=array[i];
				}

			}
		}
		//出力
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(avg);
	}
}
