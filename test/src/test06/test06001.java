package test06;

/**
 * 以下メソッドの実施結果を教えてください。
 * public class Kicker {
 private static void sayHello(String y) {
 y = "Hello world";
 }
 public static void main(String args[]) {
 String x = null;
 sayHello(x);
  System.out.println(x);
 }
}

 * @param args
 */

public class test06001 {
	public static void main(String[] args) {
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		int[] newArray = megerArray(left, right);
		//System.out.println(Arrays.toString(newArray));
		printArray(newArray);

	}

	public static int[] megerArray(int[] left, int[] right) {

		int[] newArray = new int[left.length + right.length];
		for (int i = 0; i < left.length; i++) {
			newArray[i] = left[i];
		}

		for (int j = 0; j < right.length; j++) {
			newArray[left.length + j] = right[j];

		}

		return newArray;
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
