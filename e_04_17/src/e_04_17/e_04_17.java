/* 演習4-17 読み込んだ値の約数を表示していき個数も表示せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_17;

import java.util.Scanner;

public class e_04_17 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);			//数値を入力する際の領域を確保
		int count = 0;											//探し出した約数を数えます
		
		//約数を探す整数を入力するように促す
		System.out.print("整数 : ");
		
		int search_divisor = set_value.nextInt();				//約数の個数を探す変数に値を補完
		
		//入力された値分 約数を探すためループします
		for(int i=1; i <= search_divisor; i++) {
			
			//1から加算していった値で割り切れる値があるならば実行
			if(search_divisor % i == 0) {

				//約数を表示させる
				System.out.println(i);
				count++;										//約数の数を数える
			}
		}
		
		System.out.println("約数は " + count + " 個です");
		
		//確保していた領域を解放
		set_value.close();
	}
}
