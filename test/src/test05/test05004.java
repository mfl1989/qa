package test05;
/**
 *
 * 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）
 * int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
 * @author MM
 *package homework2;

public class Homework04 {

	public static void main(String[] args) {
		int[] i = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
		for(int s = 0; s < i.length-1; s++) {
			for(int t = s+1; t < i.length; t++) {
				if((i[s] == i[t]) && (s != t)) {
					System.out.println(i[t]);

				}
			}
		}
	}

}
 */
public class test05004 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };

	     for(int i=0;i<arr.length;i++) {

	    	 for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i]==arr[j]) {
	    			System.out.println(arr[j]);

	    		}
	    	 }

	     }

	}

}
