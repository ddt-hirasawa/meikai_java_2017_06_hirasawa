/* 演習6-3 double型の配列に先頭から 1.1 2.2 3.3 4.4 5.5 を代入していって表示を行え
 * 
 * 作成日 2017年6月16日
 *
 * 作成者 平澤敬介
 */

package e_06_03;

public class e_06_03 {

	public static void main(String[] args) {
		
		double[] double_array = new double[5];			//要素数5の配列を定義
		
		//配列の全要素を表示させるためのループ処理
		for(int i=0; i < 5; i++) {
			
			double_array[i] += 1.1 * (i + 1);				//先頭から 1.1 2.2 3.3 4.4 5.5 が代入されていることになる
			
			//全要素を表示 先頭から順に1.1を加算していき表現します
			System.out.printf("配列[" + i + "] = " + "%2f",double_array[i]);
			
			//改行文字
			System.out.println();
		}
	}
}
