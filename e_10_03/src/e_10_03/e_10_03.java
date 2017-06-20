/* 演習10-3 2値 3値の最小値を求めるメソッド、最大値を求めるメソッドを集めたユーティリティクラスを作成せよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_10_03;

import java.util.Random;

public class e_10_03 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();						//乱数の種を生成
		
		int[] min_max_search_array = new int[20];				//配列を定義しユーティリティクラスのメソッドを使うために乱数を代入する
		
		//配列の全要素に乱数を発生させ、最小値と最大値を求める
		for(int i=0; i < min_max_search_array.length; i++) {
			
			min_max_search_array[i] = set_rand_value.nextInt(100);	// 0 ～ 100の乱数を生成
			
			
			System.out.println("配列[" + i + "] = " + min_max_search_array[i]);
		}
		//先頭と末端の比較を行う
		System.out.println("配列[" + 0 + " ] と " + "配列[" + (min_max_search_array.length - 1) + "] の比較");
		//ユーティリティクラスのメソッドを使い最小値を表示する
		System.out.println("最小値 : " + MinMax.min(min_max_search_array[0],min_max_search_array[min_max_search_array.length - 1]));
		
		//ユーティリティクラスのメソッドを使い最大値を表示する
		System.out.println("最大値 : " + MinMax.max(min_max_search_array[0],min_max_search_array[min_max_search_array.length - 1]));
		
		//先頭と中間と末端の比較を行う
		System.out.println("配列[" + 0 + " ] と " + "配列[" + (min_max_search_array.length / 2) + "] と" + "配列[" + (min_max_search_array.length - 1) + "] の比較");
		//ユーティリティクラスのメソッドを使い最小値を表示する
		System.out.println("最小値 : " + MinMax.min(min_max_search_array[0],min_max_search_array[min_max_search_array.length / 2],
				min_max_search_array[min_max_search_array.length - 1]));
		
		//ユーティリティクラスのメソッドを使い最大値を表示する
		System.out.println("最大値 : " + MinMax.max(min_max_search_array[0],min_max_search_array[min_max_search_array.length / 2],
				min_max_search_array[min_max_search_array.length - 1]));
		
		//配列全体の比較を行う
		System.out.println("配列全体の比較");
		//ユーティリティクラスのメソッドを使い最小値を表示する
		System.out.println("最小値 : " + MinMax.min(min_max_search_array));
		
		//ユーティリティクラスのメソッドを使い最大値を表示する
		System.out.println("最大値 : " + MinMax.max(min_max_search_array));
	}
}
