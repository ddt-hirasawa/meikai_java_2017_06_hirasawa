/* 演習4-20 キーボードから入力された値の個数で正方形を描け
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_20;

import java.util.Scanner;

public class e_04_20 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); // 数値を入力するための領域を確保
		
		//正方形の1辺を入力するように促す
		System.out.print("正方形の1辺 : ");
		
		int square_integer = set_value.nextInt();  // 正方形の1辺を補完する変数

		//正方形の縦に該当するループ処理
		for(int i=0; i < square_integer; i++) {
			
			//正方形の横の該当するループ処理
			for(int j=0; j < square_integer; j++) {
				
				//*で正方形を構成していく
				System.out.print("*");
			}
			//横の長さの表示が終わったならば次の行に移る
			System.out.print("\n");
		}
		
		//確保していた領域を解放する
		set_value.close();
	}
}
