/* 演習2-9 実数値でテキストで指定する範囲の値を表示せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */
package e_02_09;

import java.util.Random;

public class e_02_09 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();								//乱数の種を生成する
		
		double request1 = set_rand_value.nextDouble();					//要求されている範囲は 0.0 ～ 0.9
		double request2 = set_rand_value.nextDouble() * 10;				//要求されている範囲は 0.0 ～ 9.9
		double request3 = set_rand_value.nextDouble() * 2 - 1.0;			//要求されている範囲は -1.0 ～ 0.9
		
		//double型の場合 0.0 ～ 0.9 がデフォルト 最大値は1.0未満
		System.out.println(" 0.0 ～ 0.9999の範囲の乱数 : "+ request1);
		
		//double型の場合 0.0 ～ 0.9 がデフォルトなので10倍すれば範囲の乱数になる
		System.out.println(" 0.0 ～ 9.9999の範囲の乱数 : "+ request2);
		
		//範囲の乱数を生成するために最大値の2倍までで乱数を生成し、最大値分引く
		System.out.println("-1.0 ～ 0.9999の範囲の乱数 : "+ request3);
	}
}
