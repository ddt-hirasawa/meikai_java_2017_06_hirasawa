/* 演習15-3 文字列を読み込んで、一致する部分まで空白で押し出して表示するプログラムの作成
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_15_03;

import java.util.Scanner;

public class e_15_03 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);				//変数を入力する領域を確保
		
		//文字列の入力 特に制限なし
		System.out.print("文字列の入力 : ");
		String test = set_value.next();								//文字列を変数に代入
		//一致する文字列の入力 表示するときに先頭の文字を合わせる
		System.out.print("一致する文字列の入力 : ");
		String search = set_value.next();							//文字列を変数に代入
		
		//素になる文字列を表示
		System.out.println("文字列 : " + test);	
		
		//そろえる前の文字列を表示
		System.out.print("文字列 : ");
		
		int len = test.indexOf(search);							//何番目に一致する文字列があるか整数に代入します
		
		//一致する部分まで空白文字で押し出します
		for(int i=0; i < len; i++) {
			
			//一文字分押し出します
			System.out.print(" ");
		}
		
		//探していた文字列を表示
		System.out.println(search);	
		
		//確保した領域を解放
		set_value.close();
	}
}
