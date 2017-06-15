/* 演習3-7 読み込んだ整数3で割り切れるか判別し余りも表示させるプログラム。正の値以外が入力されたときの処理も行う
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_07;

import java.util.Scanner;

public class e_03_07 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in); // 数値を入力するための領域を確保する

		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数を入力 : ");
		int answer = set_value.nextInt(); // キーボードから入力された値を変数に保管しておく

		//最初に正の値かどうかの確認を行う
		if (answer <= 0) {

			//正の値ではない以上ここで処理を終了する
			System.out.println("正の整数以外の値が入力されました");
			
		//3で割り切れる場合、倍数であることがわかる
		} else if (0 == answer % 3) {

			// 条件を満たしたから、3の倍数だと確認できました
			System.out.println("3で割り切れます");

		// 余りがある以上、倍数ではないことになります
		} else {

			// 条件を満たしたから、3の倍数ではないと確認できました
			System.out.println("余りは " + answer % 3 + " です");
		}

		// 数値を入力するために確保していた領域を解放する
		set_value.close();
	}

}
