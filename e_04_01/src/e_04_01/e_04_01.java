/* 演習4-1 符号を判別するプログラムを好きなだけ繰り返せるプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_01;

import java.util.Scanner;

public class e_04_01 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	  // 数値を入力するための領域を確保する
		
		int integer_retry;							  // 繰り返しを抜けるための変数
		
		do{
			
		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数を入力 : ");
		int answer = set_value.nextInt(); // キーボードから入力された値を変数に保管しておく

		//最初に正の値かどうかの確認を行う
		if (0 < answer) {

			//正の値である確認が取れました
			System.out.println("正の整数です");
			
		//次に負の値かどうかの確認を行う
		} else if (answer < 0) {

			//負の値である確認が取れました
			System.out.println("負の値です");

		//正負いずれでもないとなると
		} else {

			// 0以外ありえません
			System.out.println("0です");
		}
		
		System.out.print("継続 -> 0以外 終了 -> 0 を入力 :");
		integer_retry = set_value.nextInt();				//0が入力された場合終了となる
		
		}while(integer_retry != 0);
		// 数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
