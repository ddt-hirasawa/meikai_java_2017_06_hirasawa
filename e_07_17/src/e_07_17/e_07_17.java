/* 演習7-17 最も末尾にある指定した要素を返却するメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_17;

import java.util.Random;
import java.util.Scanner;

public class e_07_17 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in);					//数値を入力する領域を確保
		Random set_rand_value = new Random();							//乱数の種を生成
		
		int[] array_sum_test = new int[20];							//合計を求めるメソッド用の配列を定義

		//メソッドに使う配列の中身を表示
		System.out.println("配列を表示");
		
		//配列の全要素に値を代入する
		for(int i=0; i < 20 ; i++) {
			
			array_sum_test[i] = set_rand_value.nextInt(50);			 	//配列の中身は1から50までの乱数
			//配列の中身を1つ表示
			System.out.println("配列[" + (i) + "] = " + array_sum_test[i]);
		}
		System.out.println();
		
		//メソッドに使う探す値を表示
		System.out.print("探す値 : ");
		int search = set_value.nextInt();								//キーボードから入力して探す値を決定
		int num = LinearSearch_array(array_sum_test,search);		//メソッドの呼び出し
		
		//返却値 -1 は見つからないことの証明
		if(num != -1) {
			
			//見つかった場合、配列の番号を表示して確認する
			System.out.println(num + "番目で発見しました");
		
		} else {
			
			//発見できませんでした
			System.out.println("探索失敗");
		}
		
		//数値を入力する為に確保していた領域を解放
		set_value.close();
	}
	
	//メソッド 配列から指定した値を探し出す
	//引数 探す配列
	//返却値 あるかないか
	static int LinearSearch_array(int[] array,int search){
		
		int search_array = -1;										//返却する変数を -1 で初期化しておく
		
		//メンバ関数により配列の要素数を出し、1つ1つ探していく
		for(int i= 0; i < array.length; i++) {
			
			//更新する条件 最小値に設定した値より小さい
			if(array[i] == search) {
				
				search_array = i;										//返却値を配列の番号で更新する
																		//演習課題 break文を削除することで配列の末尾まで走査
																		//することになり 更新されていく
			}
		}
		return search_array;
	}
}
