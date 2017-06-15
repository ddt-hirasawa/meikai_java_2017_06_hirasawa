/* 演習4-7 * と + を交互に表示するプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_07;

import java.util.Scanner;

public class e_04_07 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in); // 数値を補完する領域を確保する

		// 何個 * を表示するのかユーザーに問います
		System.out.print("* と +を何個表示しますか? : ");
		int asterisk = set_value.nextInt(); // 変数に * を表示する個数を補完します
		int i = 0; // whileループの終了条件で使う変数を定義

		// 入力した値に満たない場合、繰り返される
		while (i < asterisk) {

			//表示した回数が偶数の時は * を表示する
			if (i % 2 == 0) {
				// ＊を1つ表示する
				System.out.print('*');
			
			//表示した回数が奇数の時は + を表示する
			} else {
				// ＊を1つ表示する
				System.out.print('+');
			}
			i++; // *を表示した回数をカウントする
		}

		// 確保している領域を解放する
		set_value.close();
	}
}
