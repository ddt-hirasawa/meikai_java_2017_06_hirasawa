/* 演習3-13 キーボードから読み込んだ値から中央値を表示するプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_13;

import java.util.Scanner;

public class e_03_13 {

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
		
		int integer_medium = check_integer1;				// 中央値を最初に入力した値に仮設定
		
		// 入力した値で 初期化したmedium が一番小さく check_integer3が一番大きいとき
		if(integer_medium <= check_integer2 && check_integer2 <= check_integer3) {
			
			//中央値を check_integer2 としてif文を抜ける
			integer_medium = check_integer2;
			
		// 入力した値で 初期化したmedium が一番小さく check_integer2が一番大きいとき
		} else if(integer_medium <= check_integer3 && check_integer3 <= check_integer2) {
			
		//中央値を check_integer3 としてif文を抜ける
			integer_medium = check_integer3;
		// 入力した値で 初期化したmedium が一番大きく check_integer3が一番小さいとき
		} else if(check_integer3 <= check_integer2 && check_integer2 <= integer_medium) {
			
			//中央値を check_integer2 としてif文を抜ける
			integer_medium = check_integer2;
			
		// 入力した値で 初期化したmedium が一番大きく check_integer2が一番小さいとき
		} else if(check_integer2 <= check_integer3 && check_integer3 <= integer_medium) {
			
			//中央値を check_integer3 としてif文を抜ける
			integer_medium = check_integer3;
		}
		
		//if文により中央値の変数が更新されたため3値の中での中央値が代入されている
		System.out.println("最小値は : " + integer_medium + " です");
		
		//整数を入力するために確保していた領域を解放する
		set_value.close();
	}
}
