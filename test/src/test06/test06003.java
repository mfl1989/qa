package test06;

/**

＊ 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
＊@author MM
*@deta 2020/10/19
*@version1.0
 */

public class test06003 {

	public static void main(String[] args) {
		//配列を作成
		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
		//メソッドを呼び出す
		char[] outPut = trim(input);
		//配列loop
		for (char e : outPut) {
			//出力
			System.out.print(e);
		}
	}

	//メソッドを作る
	public static char[] trim(char[] inPut) {
		//インデックス初期値設定
		int startIndex = 0;
		int endIndex = 0;
		//頭からのインデックスを求める
		for (int i = 0; i < inPut.length - 1; i++) {
			if (inPut[i] != ' ') {
				startIndex = i;
				//探してあたっら　停止
				break;
			}
		}
		//後ろのインデックスを求める
		for (int j = inPut.length - 1; j >= 0; j--) {

			if (inPut[j] != ' ') {
				endIndex = j - 1;
				break;
			}
		}
		//メソッドを呼び出す
		char[] newsub = test06002.subArray(inPut, startIndex, endIndex);
		//戻り値
		return newsub;
	}
}
