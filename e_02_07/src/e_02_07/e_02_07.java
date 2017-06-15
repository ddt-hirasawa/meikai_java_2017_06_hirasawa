/* 演習2-7 テキストで指定する範囲の乱数値を生成しそれぞれ表示せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */
package e_02_07;

import java.util.Random;

public class e_02_07 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();					//乱数の種を生成する

		int request1 = 1 + set_rand_value.nextInt(9);			//要求されているのは 1 ～ 9 の整数
		
		int request2 = -1 - set_rand_value.nextInt(9);			//要求されているのは -9 ～ -1 の整数
		
		int request3 = 10 + set_rand_value.nextInt(90);		//要求されているのは 10 ～ 99 の整数
		
		//演習で要求されている範囲 1 ～ 9 の範囲の乱数を表示
		System.out.println(" 1から 9の乱数 : " + request1);
		
		//演習で要求されている範囲 -9 ～ -1 の範囲の乱数を表示
		System.out.println("-9から-1の乱数 : " + request2);
		
		//演習で要求されている範囲 10 ～ 99 の範囲の乱数を表示
		System.out.println("10から99の乱数 : " + request3);
	}

}
