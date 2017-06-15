/* 演習4-15 身長と標準体重の表を表示せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_15;

import java.util.Scanner;

public class e_04_15 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);		//数値を入力する領域を確保する
		double height_min,height_max;					//最低身長と最高身長の変数
		int rup;											//身長を何cmごとに表示するのか決める変数
		
		//最低身長を入力するように促す
		System.out.print("最低身長 : ");
		height_min = set_value.nextDouble();				//最低身長を変数に保管
		
		//最高身長を入力するように促す
		System.out.print("最高身長 : ");
		height_max = set_value.nextDouble();				//最高身長を変数に保管
		
		//増分の身長を入力するように促す
		System.out.print("何cm毎 : ");
		rup = set_value.nextInt();							//増分の身長を変数に保管
		
		//表示する表の概要を説明
		System.out.println("身長と標準体重の表");

		//最低身長～最高身長までの標準体重を表示
		for(;height_min <= height_max ; height_min += rup) {
			
			//表示する際に式を埋め込みループごとに身長と標準体重の表示を行う
			System.out.println(height_min + "cm " + (height_min - 100) * 0.9 + "kg");
		}
		
		//確保している領域を解放
		set_value.close();
	}
}
