/* 演習3-9 2値を読み込んで大きいほうを表示するプログラム
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_09;

import java.util.Scanner;

public class e_03_09 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 		// 数値を入力するための領域を確保する

		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数1を入力 : ");
		int check_integer1 = set_value.nextInt(); 		// キーボードから入力された値を変数に保管しておく
		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数2を入力 : ");
		int check_integer2 = set_value.nextInt(); 		// キーボードから入力された値を変数に保管しておく
		
		//条件演算子により大きいほうの値を表示し、仮に2値が等しい場合等しいことを宣言する
		System.out.println(check_integer1 == check_integer2 ? "等しいです" : 		
			("大きい値は " + (check_integer1 > check_integer2 ? check_integer1 : check_integer2)));
		
		//数値を読み込みために確保して置いた領域を解放
		set_value.close();
	}
}
