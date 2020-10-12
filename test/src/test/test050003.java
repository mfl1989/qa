package test;

/**
 * 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 * @author MM
 *
 */
public class test050003 {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		//初期値設定
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		int avg = 1;
		//配列の出力
		for (int i = 0; i < arr.length; i++) {
			/*for(int j=0;j<arr.length;j++) {
			 if(arr[i]<arr[j]) {
				 arr[j]=arr[i];
				 System.out.println(arr[i]);
			 }*/
			//各値を求める
			sum=sum+arr[i];
			avg=avg*arr[i];
			if (max< arr[i]) {
				max = arr[i];
				if(min>arr[i]) {
					min=arr[i];
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
