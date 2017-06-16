/* 演習7-4 1 ～ 指定した整数までの和を返却するメソッドの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_07_04;

import java.util.Scanner;

public class e_07_04 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		
		//正の整数を入力しメソッドに使います
		System.out.print("正の整数 : ");
		int set_int = set_value.nextInt();					//正の整数を入力し1からの和を求めるのに使います
		
		//メソッド呼び出し部分
		System.out.print("1 ～ " + set_int + " までの和 : " + sumUp(set_int));
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
	
	//メソッド 引数として与えられた値までの値の和を返却する
	//引数 整数の最大値
	//返却値 指定した値までの整数の和
	static int sumUp(int tmp) {
		
		int sum = 0;										//返却する合計値を０で初期化
		
		//引数として与えられた値までの整数を加算するためにループします
		for(int i=1; i <= tmp; i++) {
			
			sum += i;										//返却用の変数に加算します
		}
		return sum;
	}
}
