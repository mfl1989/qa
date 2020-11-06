package test05;

/**
 * 質問６︓任意⾏列（２次元配列）の積を求める。
 * @author MM
 *
 */
public class test05006 {

	public static void main(String[] args) {
		int[][] arr = new int[][] {
				{ 1, 2, 3, 4 },
				{ 21, 22, 23, 24 } };

		for (int i =0; i < arr[0].length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				int a = arr[0][i];
				int b = arr[1][j];
				int c = a*b;

				System.out.println(c);
			}

		/*	int[][] i = new int[][] {    // 积相乘
				{1,2,},
				{1,2,3}};

				int sum = 1;
				for(int[] s: i) {
					for(int u : s) {
						sum *= u;
					}
				}
			System.out.println(sum);
		}*/
		}

	}

}
