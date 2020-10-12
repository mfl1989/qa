package test;

/**
 *
 * 質問６︓任意⾏列（２次元配列）の積を求める。
 * @author MM
 *
 */
public class test050006 {
	public static void main(String[] args) {
		//二次元配列を設置
		int[][] arr = new int[][] { { 1, 25, 72, 57, 32, 222 },
				{ 12234, 43, 3442, 124, 333 }
		};
		int avg=1;//初期値０にならない
		//拡張	for　各要素を出力
		for(int[]i:arr) {
			for(int j:i){
				//積を求める
				avg=avg*j;
				System.out.println(avg);
			}
		}
	}

}
