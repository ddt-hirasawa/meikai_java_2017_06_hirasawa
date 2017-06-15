/* 演習4-10 List4-11を書き換え 入力された値が1未満ならば改行しないように変更せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_10;

import java.util.Scanner;

public class e_04_10 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);			//数値を入力するためのりょういきを確保
		
		//* を表示する個数を入力するように促す
		System.out.print("* を何個表示しますか? : ");
		int asterisk = set_value.nextInt();					//正の整数値を入力しなければならない
		
		//要求された回数分 * を表示するためにループ処理を行う
		for(int i=0; i < asterisk; i++) {
			
			// * を1個表示
			System.out.print("*");
		}
		
		//演習課題 改行文字の表示にif文でブロックを追加します
		if(0 < asterisk) {
			//改行
			System.out.print("\n");
		}
		
		//確保した領域を解放する
		set_value.close();
	}
}
