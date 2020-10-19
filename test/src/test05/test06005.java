package test05;

import java.util.Arrays;

import test06.test06001;
import test06.test06004;

/**
 * 質問９︓メソッドの呼び出す練習。
 *1. 質問６-１を⽤い、２つ配列をマージします。
 *2. 質問８を⽤い、ステップ１のマージした配列をソートする。
 *3. 注意︓コードを１⾏にしてください。
 * @author MM
 *@date 2020/10/19
 *@version 1.0
 */

public class test06005 {
	public static void main(String[] args) {

		int[] le = new int[] { 1, 22, 3, 4 };
		int[] rig = new int[] { 7, 8, 99, 0 };
		int[] arr = test06001.megerArray(le, rig);
		int[] arr1 = test06004.bubbleSort(arr);

		System.out.print(Arrays.toString(arr1));

	}
}
