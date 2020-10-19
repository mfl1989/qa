package test06;

/**
 *   start = 1, length = 2
//
 * @param array
 * @param startIndex
 * @param length
 * @return
 */

public class test06002 {

	public static void main(String[] args) {
		int startIndex =3;
		int length = 5;
		int[] array = new int[] { 1, 2, 3, 4, 5, 22, 33, 55, 66 };
		int[] newsub = subArray(array, startIndex, length);
		printArray(newsub);
	}

	public static int[] subArray(int[] array, int startIndex, int length) {
		int[] newsub = new int[length];

		for (int i = 0; i < length; i++) {
			newsub[i] = array[startIndex + i];

		}
		return newsub;
	}
	public static char[] subArray(char[] array, int startIndex, int length) {
		char[] newsub = new char[length];

		for (int i = 0; i < length; i++) {
			newsub[i] = array[startIndex + i];

		}
		return newsub;
	}
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
