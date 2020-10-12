package test;

/**
 * LV10のパスカルの三⾓形を出⼒してください
 * @author MM
 *
 */
public class test050008 {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];

		for (int i = 0; i < arr.length; i++) {
			//三角形の計算方法
			arr[i][0] = 1;//両側１なる
			arr[i][i] = 1;
		}
				//第三行列から計算方法
			for(int i=2;i<arr.length;i++) {
				for (int j = 1; j < arr[i].length; j++) {
					arr[i][j] = arr[i - 1][j] + arr[j - 1][i - 1];
				}
			}

		//出力の方法
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(arr[i][j]+"\t");

				}
				System.out.println();
			}

		}
	}

