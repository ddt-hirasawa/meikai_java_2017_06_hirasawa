/* 演習6-12 配列の値をシャッフルするプログラムの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_12;

import java.util.Random;
import java.util.Scanner;

public class e_06_12 {

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
		}

		//宣言 シャッフル前の表示を行い要素を表示させます
		System.out.println("シャッフル前");
		
		// 配列の表示を行う初めの部分
		System.out.print("{");

		// 配列の要素数分ループし、値を表示していく
		for (int i = 0; i < element - 1; i++) {

			// 配列の最後の値以外をループ処理で表示していく
			System.out.print(int_array[i] + " ,");
		}

		// 最後の値は , を表示したくないため ループ後に表示させる
		System.out.println(int_array[element - 1] + "}");
		
		// シャッフルするためのループ処理
		for (int i = 0; i < element; i++) {
			
			int shuffle = set_rand_value.nextInt(element);				//シャッフルするために基準となる値を補完
			int tmp = int_array[shuffle];								//シャッフルするために値を一時保管
			int_array[shuffle] = int_array[element - shuffle - 1];			//値を入れ替える
			int_array[element - shuffle - 1] = tmp;							//変更前の値を代入してシャッフル完了
		}
		
		//宣言 シャッフル後の表示を行い要素を表示させます
		System.out.println("シャッフル前");
		
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
