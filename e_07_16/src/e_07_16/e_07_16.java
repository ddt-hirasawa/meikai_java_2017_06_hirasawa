/* 演習7-16 配列の最小値を求めるメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_16;

import java.util.Random;

public class e_07_16 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();							//乱数の種を生成
		
		int[] array_sum_test = new int[10];							//合計を求めるメソッド用の配列を定義

		//メソッドに使う配列の中身を表示
		System.out.println("最小値を求める配列を表示");
		
		//配列の全要素に値を代入する
		for(int i=1; i <= 10; i++) {
			
			array_sum_test[i - 1] = set_rand_value.nextInt(100);		//配列の中身は1から100までの乱数
			//配列の中身を1つ表示
			System.out.println("配列[" + (i - 1) + "] = " + array_sum_test[i - 1]);
		}
		System.out.println();
		
		//メソッドに使った配列の最小値を表示
		System.out.print("最小値 : " + minOf(array_sum_test));
	}
	
	//メソッド 配列の最小値を返却する
	//引数 最小値を出したい配列
	//返却値 配列の中身の最小値
	static int minOf(int[] array){
		
		int min_array = array[0];										//返却する変数を 先頭の要素 で初期化しておく
		
		//メンバ関数により配列の要素数を出し、最小値を更新していく
		//配列の先頭の次の要素からスタート
		for(int i= 1; i < array.length; i++) {
			
			//更新する条件 最小値に設定した値より小さい
			if(array[i] < min_array) {
				min_array = array[i];									//最小値を配列の値で更新する
			}
		}
		return min_array;
	}
}
