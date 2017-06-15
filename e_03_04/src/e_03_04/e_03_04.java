/* 演習3-4 2値を読み込んで大小関係を表示するプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_04;

import java.util.Scanner;

public class e_03_04 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);	//数値を入力するための領域を確保する
		
		//整数であればどの値でも入力するには構わない
		System.out.print("integer_tmp1を入力 : ");
		int integer_tmp1 = set_value.nextInt();				//キーボードから入力された値を変数に保管しておく
		
		//整数であればどの値でも入力するには構わない
		System.out.print("integer_tmp2を入力 : ");
		int integer_tmp2 = set_value.nextInt();				//キーボードから入力された値を変数に保管しておく
		
		//比較して integer_tmp1 の方が大きい場合 if文内のコードが実行される
		if(integer_tmp2 < integer_tmp1) {
			
			//条件を満たしたから、Integer_tmp1のほうが大きいと確認できました
			System.out.println("Integer_tmp1のほうが大きいです");
		
		//初めのif文の条件を満たさなければ次にInteger_tmp2のほうが大きいか判断される
		} else if(integer_tmp1 < integer_tmp2) {
			
			//条件を満たしたから、Integer_tmp2のほうが大きいと確認できました
			System.out.println("Integer_tmp2のほうが大きいです");
		
		// 2値が等しい場合
		} else {
			
			//条件を満たしたから、等しいと確認できました
			System.out.println("2値は等しいです");
		}
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
