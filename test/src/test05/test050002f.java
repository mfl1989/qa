package test05;

/**
 * 設問２︓5の階乗を求める(for)。

 * @date 作成日:2020/10/12
 * @date 修正日:2020/10/12
 * @version 1.1
 * @author MM1
 */
public class test050002f {

	public static void main(String[] args) {

		int mcl = 1;//かけざん０がならない
		//変数loop
		for (int i = 5; i >= 1; i--) {
			mcl = mcl * i;//掛け算求める

		}

		//出力
		System.out.println(mcl);
	}

}
