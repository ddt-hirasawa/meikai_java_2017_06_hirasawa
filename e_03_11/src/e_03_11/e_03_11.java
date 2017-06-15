/* 演習3-11 2値を読み込んでその差が10以上か10以下か表示するプログラム
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_11;

import java.util.Scanner;

public class e_03_11 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 		// 数値を入力するための領域を確保する

		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数1を入力 : ");
		int check_integer1 = set_value.nextInt(); 		// キーボードから入力された値を変数に保管しておく
		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数2を入力 : ");
		int check_integer2 = set_value.nextInt(); 		// キーボードから入力された値を変数に保管しておく
		
		//条件演算子により大きい値から小さい値を引くようにし差を判断する
		System.out.println(
				
			//整数1と整数2の値をひかくし、大きい値から小さい値を引くようにする
			("2値の差は " + (check_integer1 > check_integer2 ? 
					
					//整数1の方が大きい場合 整数1から整数2を引くようにする/
					(check_integer1 - check_integer2 >= 11 ? "11以上です" : "10以下です") : 
						
						//整数2の方が大きい場合 整数2から整数1を引くようにする/
						(check_integer2 - check_integer1 >= 11 ? "11以上です" : "10以下です"))));
		
		//数値を読み込みために確保して置いた領域を解放
		set_value.close();
	}
}
