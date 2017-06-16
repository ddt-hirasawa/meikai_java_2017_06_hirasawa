/* 演習5-4 3つの整数値を読み込んで合計と平均を出すプログラムの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_05_04;

import java.util.Scanner;

public class e_05_04 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		int int_digits_1,int_digits_2,int_digits_3;	// 実数型の変数をまとめてて定義
		
		//整数を入力して 合計と平均を表示させます
		System.out.print("整数1を入力 : ");
		int_digits_1 = set_value.nextInt();					//整数1つ目を代入 値は特に制限なし
		
		//整数を入力して 合計と平均を表示させます
		System.out.print("整数2を入力 : ");
		int_digits_2 = set_value.nextInt();					//整数2つ目を代入 値は特に制限なし
		
		//整数を入力して 合計と平均を表示させます
		System.out.print("整数3を入力 : ");
		int_digits_3 = set_value.nextInt();					//整数3つ目を代入 値は特に制限なし
		
		//3値の合計を表示します
		System.out.println("合計 : " + (int_digits_1 + int_digits_2 + int_digits_3));
		
		double ave = ((int_digits_1 + int_digits_2 + int_digits_3) / 3);		//3値の平均を格納する変数を定義
		
		//3値の平均を表示します
		System.out.println("平均 : " + ave);
		
		//確保した領域を解放します
		set_value.close();
	}
}
