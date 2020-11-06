package test05;
/**
 * 設問１︓1から100までの偶数の和を求める(for + if)。
 * @author MM
 *
 */
public class test05001 {
	public static void main(String[] args) {
		int o =0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				o=o+i;

			}
		}
		System.out.println(o);
	}

}
