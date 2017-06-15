/* 演習4-3 2値を読み込んで小さいほうから大きいほうまで順に表示する
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_03;

import java.util.Scanner;

public class e_04_03 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);	//整数を入力するための領域を確保
		int integer_tmp1,integer_tmp2;				//演習で使う2値をdo文の前で定義
		
		do {
		
		System.out.print("整数1 : ");
		integer_tmp1 = set_value.nextInt();				//キーボードから入力された値をint型として変数に代入
		System.out.print("整数2 : ");
		integer_tmp2 = set_value.nextInt();				//キーボードから入力された値をint型として変数に代入
		
		//整数1が整数2より大きいか等しい場合やり直し
		}while(integer_tmp1 >= integer_tmp2);
		
		do{
			//小さいほうの値を表示した後に加算する -> 繰り返し行っていく
			System.out.print(integer_tmp1++ + " ");
		
		//最大値に満たない場合繰り返される
		}while(integer_tmp2 >= integer_tmp1);
		
		//確保している領域を解放する
		set_value.close();
	}
}
