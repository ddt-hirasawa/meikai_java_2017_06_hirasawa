/* 演習4-6 List4-7を書き換え 読み込んだ値が1未満ならば改行しないように変更せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_06_01;

import java.util.Scanner;

public class e_04_06_01 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);			//数値を補完する領域を確保する
		
		//何個 * を表示するのかユーザーに問います
		System.out.print("*を何個表示しますか? : ");
		int asterisk = set_value.nextInt();					//変数に * を表示する個数を補完します
		int i = 0;												//whileループの終了条件で使う変数を定義
		
		//入力した値に満たない場合、繰り返される
		while(i < asterisk) {
			
			//＊を1つ表示する
			System.out.print('*');
			
			i++;												//*を表示した回数をカウントする
		}
		
		//入力された値が1未満ならば改行させないように if文でブロック
		if(1 <= asterisk) {
			//改行文字
			System.out.println("");
		}
		
		//確保している領域を解放する
		set_value.close();
	}
}
