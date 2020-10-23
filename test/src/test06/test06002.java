package test06;

/**
 *   start = 1, length = 2
//
 * @param array
 * @param startIndex
 * @param length
 * @return
 * @version1.0
 * @date 2020/10/19
 */

public class test06002 {

	public static void main(String[] args) {
		//始まるのインデックスと配列の長さ定義する
		int startIndex = 3;
		int length = 5;
		//配列を定義する
		int[] array = new int[] { 1, 2, 3, 4, 5, 22, 33, 55, 66 };
		//メソッドを呼び出す
		int[] newsub = subArray(array, startIndex, length);
		printArray(newsub);
	}
	//　　返却値型　　関数名　　引数　　　引数       引数

	public static int[] subArray(int[] array, int startIndex, int length) {
		//新しい配列を定義する
		int[] newsub = new int[length];
		//loop

		for (int i = 0; i < length; i++) {
			newsub[i] = array[startIndex + i];

		}
		//戻り値
		return newsub;
	}

	//同上　　返却値型違い
	public static char[] subArray(char[] array, int startIndex, int length) {
		char[] newsub = new char[length];

		for (int i = 0; i < length; i++) {
			newsub[i] = array[startIndex + i];

		}
		return newsub;
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
