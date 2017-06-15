/* 演習4-8 入力された正の整数の桁数を表示するプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_08;

import java.util.Scanner;

public class e_04_08 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);			//数値を入力する領域を確保する
		
		int positive_integer;								//正の値を補完する変数を定義
		int count = 0;											//桁数を数える変数
		
		do{
			//正の値を入力するように促す
			System.out.print("正の整数を入力 : ");
			
			positive_integer = set_value.nextInt();				//整数値をキーボードから入力
			
		//負の値の時入力のやり直し
		}while(positive_integer < 0);
		
		//入力した値が0にならない限り継続
		while(0 < positive_integer) {
			
			positive_integer /= 10;								//桁を数え終わるまで10で割り次に備えていく
			count++;											//10で割った回数を数えていく
		}
		
		//カウントした値 -> 変数の桁を表示する
		System.out.print("桁 : " + count);
		
		//確保している領域を解放する
		set_value.close();
	}
}
