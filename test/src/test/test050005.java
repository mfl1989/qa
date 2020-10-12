package test;
/**
 *  質問５︓質問３の配列に値「７」のインデックスを求む。
 * int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1116,1122 };
 * @author MM
 *
 */
public class test050005 {

	public static void main(String[] args) {
		//声明配列
		int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1116 ,1122};
		//配列出力
		for(int i=0;i<arr.length;i++) {
			//配列の要素を指定
			if(i==7) {
				System.out.println(arr[i]);
			}
		}



	}

}
