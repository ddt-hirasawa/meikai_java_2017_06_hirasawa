/* 演習6-18 List6-18 を拡張して行 列 各要素の値をキーボードから入力するように変更せよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_18;

import java.util.Scanner;

public class e_06_18 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		
		//キーボードから行数を決定
		System.out.print("行数を入力 : ");
		int i = set_value.nextInt();						//行の数をキーボードから入力
		
		//キーボードから列数を決定
		System.out.print("列数を入力 : ");
		int j = set_value.nextInt();						//行の数をキーボードから入力
		
		int[][] input_array = new int[i][j];				//入力された値から配列を作成
		
		//行を操作するループ処理
		for(int i_=0; i_ < i; i_++) {
			
			//列を操作するループ処理
			for(int j_=0; j_ < j; j_++) {
				
				System.out.print("配列[" + i_ + "][" + j_ + "] : ");
				
				input_array[i_][j_] = set_value.nextInt();	//すべての要素をキーボード入力で決定
			}
		}
		
		//行列の行分、操作し表示を行うためのループ
		for(int i_=0; i_ < i; i_++) {
			
			//行列の列分、操作し代入表示を行うためのループ
			for(int j_=0; j_ < j; j_++) {
				
				//配列の数値をわかりやすく表示
				System.out.printf("%3d", input_array[i_][j_]);
			}
			
			//列の表示が終わったならば次の行に移動
			System.out.println("\n");
		}
		
		// 数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
