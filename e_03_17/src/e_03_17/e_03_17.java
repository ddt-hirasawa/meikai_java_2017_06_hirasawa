/* 演習3-17 0～2の乱数を生成して、じゃんけんの手を表示させよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_17;

import java.util.Random;

public class e_03_17 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();			//乱数の種を生成
		int hand = set_rand_value.nextInt(3);			//乱数の範囲を指定して 0 ～ 2 の整数を変数に代入する
		
		//じゃんけんの手を表示するためにswitch文で分岐させる
		switch(hand) {
		
		// hand == 0 の時 CPUはグーを出す
		case 0 : System.out.println("グー"); break;
		// hand == 1 の時 CPUはチョキを出す
		case 1 : System.out.println("チョキ"); break;
		// hand == 2 の時 CPUはパーを出す
		case 2 : System.out.println("パー");
		}
	}
}
