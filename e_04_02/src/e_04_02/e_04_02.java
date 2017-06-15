/* 演習4-2 数当てゲームの作成 範囲は 10 ～ 99
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_02;

import java.util.Random;
import java.util.Scanner;

public class e_04_02 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();			  // 乱数の種を生成
		Scanner set_value = new Scanner(System.in); 	  // 数値を入力するための領域を確保する
		
		System.out.println("数当てゲーム開始");
		
		int answer = 10 + set_rand_value.nextInt(90);			  // 乱数を生成し変数に保管 これがゲームの解答
		int response;									  // プレイヤーが入力に使う変数
		
		do{
			
		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数を入力 : ");
		response = set_value.nextInt(); // キーボードから入力された値を変数に保管しておく

		//入力した値が小さい場合プレイヤーに教える
		if (response < answer) {

			//比較して小さい値を入力してしまいました
			System.out.println("もっと大きいです");
			
		//入力した値が大きいためプレイヤーに教える
		} else if (response > answer) {

			//比較して大きい値を入力してしまいました
			System.out.println("もっと小さいです");
		}
		//正解しない限りループは続く
		}while(answer != response);
		
		//ループを抜ける条件は正解するのみ
		System.out.println("正解です");
		
		// 数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
