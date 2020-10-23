package test06;

/**
 * 以下メソッドの実施結果を教えてください。
 * @param args
 * @date 2020/10/19
 * @version1.0
 */

public class test06001 {
	public static void main(String[] args) {
		//配列を定義する
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		//メソッドを呼び出す
		int[] newArray = megerArray(left, right);
		//System.out.println(Arrays.toString(newArray));
		printArray(newArray);

	}

	//メソッドを作ります　
	//　　　　　　返却値型　　関数名　　引数　　　引数
	public static int[] megerArray(int[] left, int[] right) {
		//新しい配列を定義する

		int[] newArray = new int[left.length + right.length];
		//配列をloop
		for (int i = 0; i < left.length; i++) {
			//新しい配列に元素をつける
			newArray[i] = left[i];
		}
		//同上
		for (int j = 0; j < right.length; j++) {
			newArray[left.length + j] = right[j];

		}
		//戻り値

		return newArray;
	}
	//6.0のメソッド

	public static void printArray(int[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
