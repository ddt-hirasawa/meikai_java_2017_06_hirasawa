/* 演習3-18 キーボードから1～12の値を読み込み対応する季節を表示するプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_18;

import java.util.Scanner;

public class e_03_18 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in); // 数値を入力するための領域を確保
		int select_season; // 月を入力する変数をdo文の前で定義

		System.out.print("月を入力してください : ");
		
		do {

			select_season = set_value.nextInt(); // キーボードから入力された値を変数に代入

			// 月の範囲である1～12以外が入力された場合、やり直し
		} while (select_season <= 0 || 12 < select_season);

		// 月の表示を行い正しい季節を返しているか確認します
		System.out.print(select_season + "月は");

		switch (select_season) {
		
		//春ケース
		case 3:
		case 4:
		case 5:
			//季節は春ですと表示しswitch文を脱却
			System.out.println("春です");
			break;
		//夏ケース
		case 6:
		case 7:
		case 8:
			//季節は夏ですと表示しswitch文を脱却
			System.out.println("夏です");
			break;
		//秋ケース
		case 9:
		case 10:
		case 11:
			//季節は秋ですと表示しswitch文を脱却
			System.out.println("秋です");
			break;
		//冬ケース 不正値が入ってこないからOK
		default:
			//季節は冬ですと表示しswitch文を脱却
			System.out.println("冬です");
			break;
		}
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
