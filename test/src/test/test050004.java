package test;
/**
 * 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）
 * int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
 * @author MM
 *
 */
public class test050004 {

	public static void main(String[] args) {
			//配列の声明
		 int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		 //配列の出力
		 for(int i=0;i<arr.length;i++) {
			 //配列の他要素を出力　対比
			 for(int j=i+1;j<arr.length;j++) {
				 //同じ要素を探す
				 if(arr[i]==arr[j]) {

					 System.out.println(arr[i]);
				 }
			 }
		 }
	}

}
