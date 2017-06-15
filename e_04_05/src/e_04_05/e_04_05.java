/* 演習4-5 List4-5 前述演算子と後述演算子でどのような出力が得られるか確認せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_05;

public class e_04_05 {

	public static void main(String[] args) {
		
		int mentioned = 10;						//確認用のため、前述演算子用の変数
		int described_later = 10;				//確認用のため、後述演算子用の変数
		
		//両方が0になるまでループが続く
		while(0 <= mentioned && 0 <= described_later) {
			
			//前述演算子の場合、表示がされる前に値が引かれる
			System.out.print("前述演算子 : " + --mentioned);
			//後述演算子の場合、表示がされた後に値が引かれる
			System.out.print(" 後述演算子 : " + described_later-- + "\n");
		}
	}
}
/*
演算子は使い分ける必要があるが、値を表示させたいときは表示した後に演算が行われる後述演算子の方が簡潔だと思います

*/