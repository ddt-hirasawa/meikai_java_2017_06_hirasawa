/* 演習3-16 3つの値を読み込み、小さい順にソートせよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_16;

import java.util.Scanner;

public class e_03_16 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 		// 数値を入力するための領域を確保する

		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数1を入力 : ");
		int check_integer1 = set_value.nextInt(); 		// キーボードから入力された値を変数に保管しておく
		// 整数であれば負の値でも入力するには構わない
		System.out.print("整数2を入力 : ");
		int check_integer2 = set_value.nextInt(); 		// キーボードから入力された値を変数に保管しておく
		System.out.print("整数3を入力 : ");
		int check_integer3 = set_value.nextInt(); 		// キーボードから入力された値を変数に保管しておく
		
		
		//入力された整数1が最小値ではない場合
		if(check_integer2 < check_integer1 || check_integer3 < check_integer1) {
			
			int tmp = check_integer1;						//一時的に整数1を補完する
			
			//整数1の値を整数2と3で小さいほうに更新する
			check_integer1 = check_integer2 < check_integer3 ? check_integer2 : check_integer3;	
			
			//更新元の変数に整数１の更新前の値を代入するためのif文
			if(check_integer2 < check_integer3) {
				
				check_integer2 = tmp;						//整数1に更新されている整数2を変更する
			
			//更新した値が整数3の場合
			} else {
				
				check_integer3 = tmp;						//整数1に更新されている整数3を変更する
			}
		}
		//整数3の値が整数2より小さい場合 更新する必要がある
		if(check_integer3 < check_integer2) {
			
			int tmp = check_integer2;						//一時的に整数2を補完する
			check_integer2 = check_integer3;				//整数2の値を整数3に更新する
			check_integer3 = tmp;							//整数3の値を変更前の整数2の値に更新する
		}
		
		//if文により整数1が最も小さくなるように更新されました
		System.out.println("最小値は : " + check_integer1);
		
		//if文により整数2が中央値になるように更新されました
		System.out.println("中央値は : " + check_integer2);
		
		//if文により整数3が最も大きくなるように更新されました
		System.out.println("最大値は : " + check_integer3);
		
		//整数を入力するために確保していた領域を解放する
		set_value.close();
	}
}
