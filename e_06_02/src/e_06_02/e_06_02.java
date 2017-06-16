/* 演習6-2 int型の配列を定義して先頭から 5 ～ 1の値を代入し表示せよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_02;

public class e_06_02 {

	public static void main(String[] args) {
		
		int[] int_array = new int[5];			//要素数5の配列を定義
		
		//配列の全要素を表示させるためのループ処理
		for(int i=0; i < 5; i++) {
			
			int_array[i] += (5 - i);				//先頭から 5 ～ 1 の数値を代入していく
			
			//全要素を表示 先頭からカウントダウンした値が代入されている
			System.out.println("配列[" + i + "] = " + int_array[i]);
		}
	}
}
