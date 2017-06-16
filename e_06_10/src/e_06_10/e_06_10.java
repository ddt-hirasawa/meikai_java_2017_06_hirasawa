/* 演習6-10 前問を拡張して、数値の前後で重複を無くせ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_10;

import java.util.Random;
import java.util.Scanner;

public class e_06_10 {

	public static void main(String[] args) {

		Random set_rand_value = new Random(); 						// 乱数の種を生成
		Scanner set_value = new Scanner(System.in); 					// 数値を入力する領域を確保

		// 配列の要素数をキーボードから入力した値で決定
		System.out.print("要素数 : ");
		int element = set_value.nextInt();								 // 配列の要素数を決定する変数
		int[] int_array = new int[element]; 							// 入力された値で要素数を決定

		// 配列の要素数分ループし乱数を代入していく
		for (int i = 0; i < element; i++) {

			int_array[i] = 1 + set_rand_value.nextInt(10); 				// 1～10の乱数を発生させ代入していく

			//先頭の要素は例外として処理を行いません
			if (0 < i) {
				// ひとつ前の要素と値が同じ場合、再度乱数を発生させる
				if (int_array[i] == int_array[i - 1]) {

					// 値が異なる限り乱数を発生させ続ける
					for (; int_array[i] == int_array[i - 1];) {

						int_array[i] = 1 + set_rand_value.nextInt(10); // 1～10の乱数を発生させ代入していく
					}
				}
			}
		}

		// 配列の表示を行う初めの部分
		System.out.print("{");

		// 配列の要素数分ループし、値を表示していく
		for (int i = 0; i < element - 1; i++) {

			// 配列の最後の値以外をループ処理で表示していく
			System.out.print(int_array[i] + " ,");
		}

		// 最後の値は , を表示したくないため ループ後に表示させる
		System.out.println(int_array[element - 1] + "}");

		// 確保していた領域を解放
		set_value.close();
	}
}
