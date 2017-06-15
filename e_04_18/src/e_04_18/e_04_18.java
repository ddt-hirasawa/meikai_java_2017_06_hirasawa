/* 演習4-18 1から指定した値までの2乗値を表示させよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_18;

import java.util.Scanner;

public class e_04_18 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in);			//数値を入力する際の領域を確保
		
		//ここで入力される整数値まで2乗値を表示していくことになる
		System.out.print("整数 : ");
		
		int square_number = set_value.nextInt();				//2乗値を表示する最大値を補完
		
		//入力された値分 2乗値を表示していく
		for(int i=1; i <= square_number; i++) {
			
			//2乗する値とその2乗値を並べて表示していく
			System.out.println(i + " の2乗値は " + i * i);
		}
		
		//確保していた領域を解放
		set_value.close();
	}
}
