package test07;

public class test07001 {
	public static void main(String []agrs) {
		int[] array = new int[] { 33, 2, 66, 222, 666, 44, 226, 857 };
		int max = max(array);
		int min = min(array);
		int avg= avg(array);
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
	}

	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	public static int avg(int[] array) {
		int avg = 0;
		for (int i = 0; i < array.length; i++) {
			avg += array[i];
			avg = avg / array.length;
		}
		return avg;
	}
}
