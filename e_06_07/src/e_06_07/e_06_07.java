/* 演習6-7 List6-9を拡張してキーと同じ値を複数見つけたとき末尾を返すように変更せよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_07;

import java.util.Random;
import java.util.Scanner;

public class e_06_07 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();			//乱数の種を生成
		Scanner set_value = new Scanner(System.in);	//数値を入力する領域を確保
		
		//配列の要素数をキーボードから入力した値で決定
		System.out.print("要素数 : ");
		int element = set_value.nextInt();				//配列の要素数を決定する変数
		int[] int_array = new int[element];			//入力された値で要素数を決定
		
		//配列の要素数分ループし乱数を代入していく
		for(int i=0; i < element; i++) {
			
			int_array[i] = set_rand_value.nextInt(10);	//0～9の乱数を発生させ代入していく
		}
		
		//配列の表示を行う初めの部分
		System.out.print("{");
		
		//配列の要素数分ループし、値を表示していく
		for(int i=0; i < element - 1; i++) {
			
			//配列の最後の値以外をループ処理で表示していく
			System.out.print(int_array[i] + " ,");
		}
		
		//最後の値は , を表示したくないため ループ後に表示させる
		System.out.println(int_array[element - 1] + "}");
		
		//キーボードから探す値を入力する
		System.out.print("探す値 : ");
		int key = set_value.nextInt();					//キーボードから入力した値をキーとして保管
		int storage = -1;								//探索用の変数 -1 は探索失敗の証明
		
		//配列の全要素について探索を行う
		//演習課題 末尾を返すために末尾から探索を行います
		for(int i=element - 1; i >= 0; i--) {
			
			//探索成功 数値を発見しました
			if(int_array[i] == key) {
				
				storage = i;							//発見した配列の要素の添字を補完する
				
				//発見したのでループを強制終了
				break;
			}
		}
		
		//失敗したか成功したか判別します
		if(storage == -1) {
			
			//探索失敗
			System.out.print("値はありません");
		
		//探索成功
		} else {
			
			//発見した場合、どの位置にあるか表示します
			System.out.print("その要素は" + storage + "番目にあります");
		}
		
		//確保していた領域を解放
		set_value.close();
	}
}
