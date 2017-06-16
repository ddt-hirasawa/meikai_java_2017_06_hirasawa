/* 演習6-6 テストの合計、平均、最低点、最高点を表示するプログラムの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_06;

import java.util.Scanner;

public class e_06_06 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 		//数値を入力するための領域を確保する
		
		//配列の要素数をキーボードから入力した値で決定 生徒の人数
		System.out.print("人数 : ");
		int element = set_value.nextInt();					//配列の要素数を決定する変数
		int[] int_test_array = new int[element];			//生徒の人数で配列の要素数を決定
		
		int max,min,sum = 0;								//最高点、最低点、合計を意味する変数を定義
		
		max = 0;											//最高点 を   0点で初期化
		min = 100;											//最低点 を 100点で初期化
		
		//配列の要素数分ループしキーボードから入力していく
		for(int i=0; i < element; i++) {
			
			//テストの点数なので0 ～ 100 の整数が該当する
			System.out.print("生徒" + (i + 1) + "点数 : ");
			int_test_array[i] = set_value.nextInt();		//キーボードから点数を配列に代入していく
			
			//設定されている最低点を比較して更新させる
			if(int_test_array[i] < min) {
				
				min = int_test_array[i];					//最低点を更新
			
			//設定されている最高点を比較して更新させる
			} else if(max < int_test_array[i]) {
				
				max = int_test_array[i];					//最低点を更新
			}
			
			sum += int_test_array[i];						//合計点に加算する
		}
		
		//生徒の合計点と平均点を並べて表示させる キャスト変換で変数の定義を1つ減らす
		System.out.println("生徒" + element + "人の合計点 : " + sum + "点 平均点 : " + (double)(sum / element) + "点");
		
		//最高点と最低点を表示させる
		System.out.println("生徒" + element + "人の最高点 :  " + max + "点 最低点 : " + min + "点");
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
