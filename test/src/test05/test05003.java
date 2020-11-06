package test05;

/**
 * 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 * @author MM
 *
 */
public class test05003 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		int avg = arr[0];
		for (int i = 0; i < arr.length ; i++) {
			sum = sum + arr[i];
			avg = avg * arr[i];

			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min);

			{
				arr[i] = min;
			}

				avg = avg * arr[i];
			}


		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(avg);
	}
}