/* 演習4-26 List4-19 を拡張して平均を出すように変更せよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_04_26;

import java.util.Scanner;

public class e_04_26 {

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
			
			//整数をを入力するように促す 負の値は加算対象になりません
			System.out.print("整数 （負の値は加算しません）: ");
			
			add= set_value.nextInt(); 	  	 		  // キーボードから入力された値を補完する
			
			// 入力した値が負の時、加算しません
			if(add < 0) {
				
				//負の値の時、加算対象としません
				System.out.println("負の値が入力されました");
				
				continue;								  // ループ継続
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
