/* 演習2-4 キーボード入力で得た値に 10 加減算した値を表示せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */
package e_02_04;

import java.util.Scanner;

public class e_02_04 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);		//型を指定しないで値を補完する領域を確保する
		
		//キーボード入力で整数値を読み込みたいので促します
		System.out.print("整数値を入力してください : ");
		
		int Integer_tmp = set_value.nextInt();			//int型として整数値を変数に代入します
		
		//10加算した値を見たいので表示します
		System.out.println("10を加算した値は : " + (10 + Integer_tmp) + " です");
		
		//10減算した値を見たいので表示します
		System.out.println("10を減算した値は : " + (-10 + Integer_tmp) + " です");
		
		//値を補完するために確保していた領域を解放します
		set_value.close();
	}
}
