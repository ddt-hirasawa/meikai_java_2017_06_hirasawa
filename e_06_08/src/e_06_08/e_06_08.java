/* 演習6-8 double型の要素数とその値をキーボードから入力し、合計と平均を表示せよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_08;

import java.util.Scanner;

public class e_06_08 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);		//数値を入力する領域を確保
		
		//配列の要素数をキーボードから入力した値で決定
		System.out.print("要素数 : ");
		int element = set_value.nextInt();					//配列の要素数を決定する変数
		double[] double_array = new double[element];	//入力された値で要素数を決定
		double sum = 0;									//合計を表示するための変数
		
		//配列の要素数分ループし入力していく
		for(int i=0; i < element; i++) {
			
			//double型なので実数の入力が必要
			System.out.print("実数 : ");
			double_array[i] = set_value.nextDouble();		//キーボードから入力した値を配列の要素に代入
			
			sum += double_array[i];							//合計を加算 実数なので制限は特になし
		}
		
		//配列の要素数分ループし表示していく
		for(int i=0; i < element; i++) {
			
			//double型なので実数の入力が必要
			System.out.print("配列[" + i + "] = " + double_array[i] + "\n");
		}
		
		//合計と平均を表示させる double型なので精度はかなり良い
		System.out.print("合計 : " + sum + " 平均 : " + (sum / element));
		
		//確保していた領域を解放
		set_value.close();
	}
}
