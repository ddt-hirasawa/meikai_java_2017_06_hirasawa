/* 演習15-1 文字列を読み込んで逆順に表示するプログラムの作成
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_15_01;

import java.util.Scanner;

public class e_15_01 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);				//変数を入力する領域を確保
		
		//逆順に表示する文字列の入力 特に制限なし
		System.out.print("文字列の入力 : ");
		String test = set_value.next();							//文字列を変数に代入
		
		//逆に表示する前の文字列を表示
		System.out.println("文字列 : " + test);
		
		System.out.println("逆順");
		
		//StringBuffer クラスで入力された文字列のコピーを作る
		StringBuffer reverce = new StringBuffer(test);
		//入力した文字列を反転させた文字列に更新
		//メソッド reverce() が反転させるコマンド
		test = reverce.reverse().toString();

		//反転した文字列を表示
		System.out.println("文字列 : " + test);
		
		//確保した領域を解放
		set_value.close();
	}
}
