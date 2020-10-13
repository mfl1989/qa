package test;

/**
 * 処理内容：LV10のパスカルの三⾓形を出⼒してください

 * @date 作成日:2020/10/12
 * @date 修正日:2020/10/12
 * @version 1.1
 * @author MM
 */
public class test050008 {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];

		for (int i = 0; i < arr.length; i++) {
			//三角形の計算方法
			arr[i][0] = 1;//両側１なる
			arr[i][i] = 1;//最後の両側も1になる
		}
		//第三行列ら中間要素の計算
		for (int i = 2; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {

				arr[i][j] = arr[i - 1][j ] + arr[i - 1][j-1];
			}
		}

		//配列　loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				//出力要素＋tab
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();//出力改行
		}

	}
}
