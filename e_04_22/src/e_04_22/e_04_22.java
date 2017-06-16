/* 演習4-22 ピラミッドを表示するプログラムの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_04_22;

import java.util.Scanner;

public class e_04_22 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); // 数値を入力するための領域を確保
		
		//ピラミッドの段数を入力するように促す
		System.out.print("段数 : ");
		
		int pyramid_integer = set_value.nextInt();  // ピラミッドの段数を補完する変数

		//ピラミッドを表示
		System.out.println("ピラミッド");
		
		//ピラミッドの段数に該当するループ処理
		for(int i=1; i <= pyramid_integer; i++) {
			
			//左上直角2等辺三角形を空白で構築していく
			for(int j=1; j <= pyramid_integer - i; j++) {
				
				//空白で*を押し出していく
				System.out.print(" ");
			}
			
			//ピラミッドの段でいくつ表示するかに該当するループ処理
			for(int j=1; j <= 2*(i-1) + 1; j++) {
				
				//*でピラミッドを構成していく
				System.out.print("*");
			}
			//横の長さの表示が終わったならば次の行に移る
			System.out.print("\n");
		}
		
		//確保していた領域を解放する
		set_value.close();
	}
}
