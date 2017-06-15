/* 演習3-5 正の整数を読み込み 5で割り切れるかどうか 正の値以外が入力された場合の処理を含めてプログラムを作れ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_05;

import java.util.Scanner;

public class e_03_05 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in); // 数値を入力するための領域を確保する

		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数を入力 : ");
		int answer = set_value.nextInt(); // キーボードから入力された値を変数に保管しておく

		//最初に正の値かどうかの確認を行う
		if (answer <= 0) {

			//正の値ではない以上ここで処理を終了する
			System.out.println("正の整数以外の値が入力されました");
			
		//5で割り切れる場合、約数であることがわかる
		} else if (0 == answer % 5) {

			// 条件を満たしたから、約数だと確認できました
			System.out.println("5で割り切れました");

		// 5で割り切れない以上約数ではないことになります
		} else {

			// 条件を満たしたから、約数でないことがわかる
			System.out.println("5で割り切れません");
		}

		// 数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
