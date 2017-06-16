/* 演習5-2 float型とdouble型の変数に値を代入し表示させよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_05_02;

import java.util.Scanner;

public class e_05_02 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    	// 数値を入力するための領域を確保する
		
		//実数を入力して float double で値がどう変わるか確認すること
		System.out.print("正の実数を入力 : ");
		
		float float_real_number = set_value.nextFloat();		// 実数を入力させ、変数に補完する 同じ値で確認
		
		//実数を入力して float double で値がどう変わるか確認すること
		System.out.print("正の実数を入力 : ");
		
		double double_real_number = set_value.nextDouble();	// 実数を入力させ、変数に補完する 同じ値で確認
		
		//float型の値を表示させ、入力した値と同じか確認する
		System.out.println(" float : " + float_real_number);
		
		//double型の値を表示させ、入力した値と同じか確認する
		System.out.println("double : " + double_real_number);
		
		// 数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
