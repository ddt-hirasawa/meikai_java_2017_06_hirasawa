/* 演習4-16 *を任意の数表示するプログラムを拡張して5個ごとに改行するようにせよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_16;

import java.util.Scanner;

public class e_04_16 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);			//数値を入力する際の領域を確保
		
		//何個*を表示させるのか聞きます
		System.out.print("何個 * を表示させますか? : ");
		
		int asterisk = set_value.nextInt();					//表示させる個数を変数に保管
		
		//入力された個数分 * を表示させるためループします
		for(int i=1; i <= asterisk; i++) {
			
			//*を表示する 特に変更なし
			System.out.print("*");
			
			//表示した回数 5回ごとに改行させるため if文を設ける
			if(5 <= i && i % 5 == 0) {
				
				//改行文字
				System.out.print("\n");
			}
		}
		
		//確保していた領域を解放
		set_value.close();
	}
}
