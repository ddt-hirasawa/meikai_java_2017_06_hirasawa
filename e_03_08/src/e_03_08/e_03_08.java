/* 演習3-8 キーボードからの入力で優 良 可 不可 の判別を行え
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_08;

import java.util.Scanner;

public class e_03_08 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); // 数値を入力するための領域を確保する

		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数を入力 : ");
		int answer = set_value.nextInt(); // キーボードから入力された値を変数に保管しておく

		//最初に不可どうかの確認を行う
		if (0 <= answer && answer < 60) {
			
			//試験結果は不可です 再テスト対象者
			System.out.println("不可です");
		
		//次に 可 の範囲 60点以上70点未満の確認を行う
		} else if(60 <= answer && answer < 70) {
			
			//試験結果は可です
			System.out.println("可です");
		
		//次に 良 の範囲 70点以上80点未満の確認を行う
		} else if(70 <= answer && answer < 80) {
			
			//試験結果は良です
			System.out.println("良です");
		
		//次に 優 の範囲 80点以上～満点の確認を行う
		} else if(80 <= answer && answer <= 100) {
			
			//試験結果は優です
			System.out.println("優です");
		
		//テストは100点満点なのでその範囲内に数値が無い場合
		} else {
			
			//入力ミス
			System.out.println("入力をやり直してください");
		}

		// 数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
