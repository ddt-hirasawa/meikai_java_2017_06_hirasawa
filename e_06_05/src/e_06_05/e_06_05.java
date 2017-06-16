/* 演習6-5 要素数を指定して配列に値を読み込ませ (1,2,3) のように表示させよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_05;

import java.util.Scanner;

public class e_06_05 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	// 数値を入力するための領域を確保する
		
		//配列の要素数をキーボードから入力した値で決定
		System.out.print("要素数 : ");
		int element = set_value.nextInt();				//配列の要素数を決定する変数
		int[] int_array = new int[element];			//入力された値で要素数を決定
		
		//配列の要素数分ループしキーボードから入力していく
		for(int i=0; i < element; i++) {
			
			//int型なので整数の入力のみ有効
			System.out.print("整数 : ");
			int_array[i] = set_value.nextInt();			//キーボードから入力した値を配列に代入していく
		}
		
		//配列の表示を行う初めの部分
		System.out.print("配列 = {");
		
		//配列の要素数分ループし、値を表示していく
		for(int i=0; i < element - 1; i++) {
			
			//配列の最後の値以外をループ処理で表示していく
			System.out.print(int_array[i] + " ,");
		}
		
		//最後の値は , を表示したくないため ループ後に表示させる
		System.out.print(int_array[element - 1] + "}");
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
