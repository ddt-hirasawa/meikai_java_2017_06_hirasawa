/* 演習3-15 2値を読み込んで 大きい順にソートして表示せよ。また、値が等しい場合の処理も行うこと
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_15;

import java.util.Scanner;

public class e_03_15 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 		// 数値を入力するための領域を確保する

		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数1を入力 : ");
		int sort_integer1 = set_value.nextInt(); 			// キーボードから入力された値を変数に保管しておく
		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数2を入力 : ");
		int sort_integer2 = set_value.nextInt(); 			// キーボードから入力された値を変数に保管しておく
		
		//整数2が整数1より大きい場合、入れ替える必要が出てくる
		if(sort_integer2 > sort_integer1) {
			
			int tmp = sort_integer1;						//一時的に整数1の値を補完する
			sort_integer1 = sort_integer2;					//整数1の値を整数2に更新する
			sort_integer2 = tmp;							//整数2に更新前の整数1の値を代入する
		}
		
		//ソート後の値を表示する 必ず sort_integer1 が sort_integer2 より大きくなる
		System.out.println("大きいほうの値は " + sort_integer1 + "\n小さいほうの値は " + sort_integer2);
		
		//整数を入力するために確保していた領域を解放する
		set_value.close();
	}
}
