/* 演習4-21 直下が様々な場所にある三角形を描け
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_21;

import java.util.Scanner;

public class e_04_21 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); // 数値を入力するための領域を確保
		
		//三角形の1辺を入力するように促す
		System.out.print("三角形の1辺 : ");
		
		int triangle_integer = set_value.nextInt();  // 三角形の1辺を補完する変数

		//三角形の種類を表示
		System.out.println("左下直角2等辺三角形");
		
		//三角形の縦に該当するループ処理
		for(int i=1; i <= triangle_integer; i++) {
			
			//三角形の横の該当するループ処理
			for(int j=1; j <= i; j++) {
				
				//*で三角形を構成していく
				System.out.print("*");
			}
			//横の長さの表示が終わったならば次の行に移る
			System.out.print("\n");
		}
		
		//三角形の種類を表示
		System.out.println("左上直角2等辺三角形");
		
		//三角形の縦に該当するループ処理
		for(int i=1; i <= triangle_integer; i++) {
			
			//三角形の横の該当するループ処理
			for(int j=triangle_integer; j >= i; j--) {
				
				//*で三角形を構成していく
				System.out.print("*");
			}
			//横の長さの表示が終わったならば次の行に移る
			System.out.print("\n");
		}
		
		//三角形の種類を表示
		System.out.println("右下直角2等辺三角形");
		
		//三角形の縦に該当するループ処理
		for(int i=1; i <= triangle_integer; i++) {
			
			//三角形の横の該当するループ処理
			for(int j=triangle_integer; j > i; j--) {
				
				//空白で * を押し出していく
				System.out.print(" ");
			}
			
			//三角形の横の該当するループ処理
			for(int j=1; j <= i; j++) {
				
				//*で三角形を構成していく
				System.out.print("*");
			}
			//横の長さの表示が終わったならば次の行に移る
			System.out.print("\n");
		}
		//三角形の種類を表示
		System.out.println("右上直角2等辺三角形");
		
		//三角形の縦に該当するループ処理
		for(int i=1; i <= triangle_integer; i++) {
			
			//三角形の横の該当するループ処理
			for(int j=1; j < i; j++) {
				
				//空白で * を押し出していく
				System.out.print(" ");
			}
			
			//三角形の横の該当するループ処理
			for(int j=triangle_integer; j >= i; j--) {
				
				//*で三角形を構成していく
				System.out.print("*");
			}
			//横の長さの表示が終わったならば次の行に移る
			System.out.print("\n");
		}
		
		//確保していた領域を解放する
		set_value.close();
	}
}
