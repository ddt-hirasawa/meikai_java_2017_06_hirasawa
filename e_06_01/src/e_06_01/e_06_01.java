/* 演習6-1 double型の配列を要素数5で定義しその全要素を表示させよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_01;

public class e_06_01 {

	public static void main(String[] args) {

		double[] double_array = new double[5];		//要素数5の配列を定義
		
		//配列の全要素を表示させるためのループ処理
		for(int i=0; i < 5; i++) {
			
			//全要素を表示 クラスのコンストラクタで初期化が行われている？
			System.out.println("配列[" + i + "] = " + double_array[i]);
		}
	}
}
