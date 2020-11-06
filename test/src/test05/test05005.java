package test05;
/**
 * 質問５︓質問３の配列に値「７」のインデックスを求む。
 * int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
 * @author MM
 *
 */
public class test05005 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int index=arr[7];
		for(int i=0;i<arr.length;i++) {
		arr[i]=index;

			}
		System.out.println(index);
		}

	}


