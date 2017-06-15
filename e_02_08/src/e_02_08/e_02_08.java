/* 演習2-8 キーボードから入力された値に±5を演算した値を表示せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_02_08;

import java.util.Random;
import java.util.Scanner;

public class e_02_08 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);			//任意の値を入力する領域を確保
		Random set_rand_value = new Random();					//乱数の種を生成
		
		//整数値から ±5の値を演算するため整数の入力を促す
		System.out.print("整数値を入力してください : ");
		int integer_tmp = set_value.nextInt();				//int型で指定して変数を補完する
		
		int random_value = set_rand_value.nextInt(11) - 5;	//-5 ～ 5 の範囲の乱数を補完する
		
		//生成した乱数を加算することで指定した範囲の値を表示します
		System.out.println("±5の値を表示します : " + (integer_tmp + random_value));
	
		//入力するために確保していた領域を解放する
		set_value.close();
	}
}
