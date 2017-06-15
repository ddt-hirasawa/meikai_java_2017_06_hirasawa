/* 演習3-6 入力された値が10の倍数かを判別するプログラム。正の値いがいが入力されたときの処理も行う
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_06;

import java.util.Scanner;

public class e_03_06 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); // 数値を入力するための領域を確保する

		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数を入力 : ");
		int answer = set_value.nextInt(); // キーボードから入力された値を変数に保管しておく

		//最初に正の値かどうかの確認を行う
		if (answer <= 0) {

			//正の値ではない以上ここで処理を終了する
			System.out.println("正の整数以外の値が入力されました");
			
		//10で割り切れる場合、倍数であることがわかる
		} else if (0 == answer % 10) {

			// 条件を満たしたから、10の倍数だと確認できました
			System.out.println("10の倍数です");

		// 余りがある以上、倍数ではないことになります
		} else {

			// 条件を満たしたから、10の倍数ではないと確認できました
			System.out.println("10の倍数ではありません");
		}

		// 数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
