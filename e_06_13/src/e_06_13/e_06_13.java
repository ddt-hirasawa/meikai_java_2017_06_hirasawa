/* 演習6-13 配列の全要素を逆順にコピーするプログラムの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_13;

import java.util.Random;
import java.util.Scanner;

public class e_06_13 {

	public static void main(String[] args) {

		Random set_rand_value = new Random(); 						// 乱数の種を生成
		Scanner set_value = new Scanner(System.in); 					// 数値を入力する領域を確保

		// 配列の要素数をキーボードから入力した値で決定
		System.out.print("要素数 : ");
		int element = set_value.nextInt();								 // 配列の要素数を決定する変数
		int[] int_array = new int[element]; 							// 入力された値で要素数を決定
		int[] copy_array = new int[element]; 						// 入力された値で要素数を決定 コピー配列

		// 配列の要素数分ループし乱数を代入していく
		for (int i = 0; i < element; i++) {

			int_array[i] = 1 + set_rand_value.nextInt(10); 				// 1～10の乱数を発生させ代入していく
		}
		
		// 配列の要素数分ループしコピーしていく
		for (int i = 0; i < element; i++) {

			copy_array[i] = int_array[element - i - 1]; 				// コピー配列の先頭から逆順にコピー
		}

		//宣言 コピーする配列を表示させます
		System.out.println("コピーする配列");
		
		// 配列の表示を行う初めの部分
		System.out.print("{");

		// 配列の要素数分ループし、値を表示していく
		for (int i = 0; i < element - 1; i++) {

			// 配列の最後の値以外をループ処理で表示していく
			System.out.print(int_array[i] + " ,");
		}

		// 最後の値は , を表示したくないため ループ後に表示させる
		System.out.println(int_array[element - 1] + "}");
		
		//宣言 コピーした配列の要素を表示させます
		System.out.println("コピーした配列（逆順）");
		
		// 配列の表示を行う初めの部分
		System.out.print("{");

		// 配列の要素数分ループし、値を表示していく
		for (int i = 0; i < element - 1; i++) {

			// 配列の最後の値以外をループ処理で表示していく
			System.out.print(copy_array[i] + " ,");
		}

		// 最後の値は , を表示したくないため ループ後に表示させる
		System.out.println(copy_array[element - 1] + "}");

		// 確保していた領域を解放
		set_value.close();
	}
}
