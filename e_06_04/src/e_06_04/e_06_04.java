/* 演習6-4 List6-5を書き換えて縦グラフを作れ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_04;

import java.util.Random;
import java.util.Scanner;

public class e_06_04 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();			//乱数の種を生成
		Scanner set_value = new Scanner(System.in);	//数値を入力する領域を確保
		
		//配列の要素数をキーボードから入力した値で決定
		System.out.print("要素数 : ");
		int element = set_value.nextInt();				//配列の要素数を決定する変数
		int[] int_array = new int[element];			//入力された値で要素数を決定
		
		//配列の要素数分ループし乱数を代入していく
		for(int i=0; i < element; i++) {
			
			int_array[i] = set_rand_value.nextInt(10);	//0～9の乱数を発生させ代入していく
		}
		
		//上から * を表示していきます 最大 10 の範囲
		for(int i=10 ; 0 <= i; i--) {
			
			//配列の全要素について値を確認します
			for(int j=0; j < element; j++) {
				
				//入力されている値が 縦軸の値以下ならば
				if(i < int_array[j]) {
					
					//* を表示します
					System.out.print(" * ");
					
				//縦軸の値に満たないならば
				} else {
					
					//代わりに空白を表示させます
					System.out.print("   ");
				}
			}
			
			//配列の全要素について確認が終わったならば 下の縦軸に向かいます
			System.out.println();
		}
		
		//要素数分 --- を表示して区切ります
		for(int i=0; i < element; i++) {
			
			// * と 数値を区切ります
			System.out.print("---");
		}
		//改行
		System.out.println();
		
		//要素数分剰余を下に表示させます
		for(int i=0; i < element; i++) {
			
			//インデックスを10で割った剰余を表示します
			System.out.print(" " + i % 10 + " ");
		}
		
		//確保していた領域を解放
		set_value.close();
	}
}
