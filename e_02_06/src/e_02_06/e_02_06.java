/* 演習2-6 三角形の底辺と高さを入力し面積を表示するプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_02_06;

import java.util.Scanner;

public class e_02_06 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);		//三角形の底辺と高さを入力するための領域を確保する
		
		//三角形の面積を求めることを告げる
		System.out.println("三角形の面積を求めます");
		
		//三角形の底辺を入力するように促す
		System.out.print("三角形の底辺 : ");
		
		double tri_base = set_value.nextDouble();			//double型の変数に確保した領域から値を代入する
		
		//三角形の高さを入力するように促す
		System.out.print("三角形の高さ : ");
		
		double tri_height = set_value.nextDouble();		//double型の変数に確保した領域から値を代入する
		
		//三角形の面積を公式から算出し表示する
		System.out.println("三角形の面積 : " + (tri_base * tri_height) / 2 + " です");
		
		//確保している領域を解放する
		set_value.close();
	}
}
