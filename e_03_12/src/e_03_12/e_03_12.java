/* 演習3-12 キーボードから3つの値を読み込み最小値を表示せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_12;

import java.util.Scanner;

public class e_03_12 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 		// 数値を入力するための領域を確保する

		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数1を入力 : ");
		int check_integer1 = set_value.nextInt(); 		// キーボードから入力された値を変数に保管しておく
		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数2を入力 : ");
		int check_integer2 = set_value.nextInt(); 		// キーボードから入力された値を変数に保管しておく
		System.out.print("整数3を入力 : ");
		int check_integer3 = set_value.nextInt(); 		// キーボードから入力された値を変数に保管しておく
		
		int integer_min = check_integer1;					// 最小値を最初に入力した値に仮設定
		
		//次に入力した値を比較し、整数2の方が小さい場合処理が実行される
		if(check_integer2 < integer_min) {
			
			integer_min = check_integer2;					//最小値を整数2に更新する
		}
		
		//次に入力した値を比較し、整数3の方が小さい場合処理が実行される
		if(check_integer3 < integer_min) {
			
			integer_min = check_integer3;					//最小値を整数3に更新する
		}
		
		//if文により最小値の変数が更新されていくため3値の中での最小値が代入されている
		System.out.println("最小値は : " + integer_min + " です");
		
		//整数を入力するために確保していた領域を解放する
		set_value.close();
	}
}
