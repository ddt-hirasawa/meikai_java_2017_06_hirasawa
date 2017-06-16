/* 演習4-25 List4-18 を拡張し平均を出すように変更せよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_04_25_02;

import java.util.Scanner;

public class e_04_25_02 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); // 数値を入力するための領域を確保
		int input_number;							  // 入力する個数を補完する変数
		int sum = 0;								  // 合計を意味する変数
		int add;									  // 加算する変数
		int count = 0;								  // 加算した回数をカウントし平均を出すのに使用
		
		do {
		//正の整数をを入力するように促す
		System.out.print("正の整数 : ");
		
		input_number= set_value.nextInt(); 	  	  	  // キーボードから入力された値を補完する
		
		//1以上の時のみループから脱却
		} while(input_number <= 0);
		
		for(int i=0; i < input_number; i++) {
			
			//整数をを入力するように促す 0 で終了
			System.out.print("整数 （1000以上は加算しません）: ");
			
			add= set_value.nextInt(); 	  	 		  // キーボードから入力された値を補完する
			
			// 入力した値が1000以上の時、終了
			if(1000 <= add) {
				
				//1000以上の値が入力されたため、強制終了
				System.out.print("1000以上は加算しません");
				
				break;								  // ループ脱却
			}
			
			count++;								  // 加算した回数をカウント
			sum += add;								  // 合計を加算
		}
		
		//合計と平均を表示する 加算する回数ではなく加算した回数で平均を出す
		System.out.print("合計 : " + sum + " 平均 : " + (sum /= count));
		
		//確保していた領域を解放する
		set_value.close();
	}
}
