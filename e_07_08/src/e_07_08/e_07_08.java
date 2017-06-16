/* 演習7-8 a以上b未満の乱数を生成するメソッドの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_07_08;

import java.util.Random;
import java.util.Scanner;

public class e_07_08 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		
		//正の整数を入力しメソッドに使います
		System.out.print("最小値 : ");
		int set_int_min = set_value.nextInt();			//正の整数を入力します 乱数の最小値
		
		//正の整数を入力しメソッドに使います
		System.out.print("最大値 : ");
		int set_int_max = set_value.nextInt();			//正の整数を入力します 乱数の最大値
		
		//メソッドの呼び出し
		System.out.print(set_int_min + " ～ " + set_int_max + "の範囲の乱数 : " + random(set_int_min,set_int_max));
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
	
	//メソッド 指定した範囲の乱数を返却する
	//引数 最小値と最大値
	//返却値 範囲内の乱数
	static int random(int min,int max) {
		
		Random set_rand_value = new Random();				//乱数の種を生成
		
		int answer = min;									//デフォルトの返却値
		
		//指定した範囲の最大値が小さいか同じ場合、乱数は発生させない
		//最大値が大きい場合、乱数を発生させる
		if(min <= max) {
			
			//範囲内の乱数を発生
			answer = min + set_rand_value.nextInt(max - min + 1);
		}
		
		return answer;
	}
}
