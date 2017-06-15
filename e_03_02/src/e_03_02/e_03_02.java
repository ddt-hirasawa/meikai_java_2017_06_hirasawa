/* 演習3-2 整数を2つ読み込んで A は B の約数かどうか表示するプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_02;

import java.util.Scanner;

public class e_03_02 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);			//整数を読み込むための領域を確保する
		
		//約数を含むかどうか判別する値の入力を促す
		System.out.print("任意の整数の入力 : ");
		int check_integer1 = set_value.nextInt();				//どの値でも構わないが後に入力する値より小さいとNG
		
		//約数かどうか判別する値の入力を促す
		System.out.print("任意の整数の入力 : ");
		int check_integer2 = set_value.nextInt();				//どの値でも構わないが先に入力した値より大きいとNG
		
		int result = check_integer1 % check_integer2;			//変数に2値の除算結果の余りを補完する
		
		//余りが0 -> 約数であるのでif文で実装
		if(0 == result) {
			
			//約数であることを表示する
			System.out.println("約数です");
		} else {
			
			//約数ではないことを表示する
			System.out.println("約数ではありません");
		}
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
