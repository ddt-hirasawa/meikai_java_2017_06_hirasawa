/* 演習7-2 3つの値を読み込み、最小値を返却するメソッドの制作
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_07_02;

import java.util.Scanner;

public class e_07_02 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		
		int[] tmp_int = new int[3];						//配列として整数の入力を行います
		
		//3つの値を読み込むためループ
		for(int i=0; i < 3; i++) {
			
			//キーボードから整数を入力します
			System.out.print("整数 : ");
			tmp_int[i] = set_value.nextInt();				//3回連続で値を読み込みます
		}
		
		//メソッド呼び出し部分
		System.out.print("最初値 : " + min(tmp_int[0], tmp_int[1], tmp_int[2]));
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
	
	//メソッド 引数として与えられた値から最小値を返却する
	//引数 mainからの整数 3つ
	//返却値 整数の中で一番小さい値
	static int min(int tmp1,int tmp2,int tmp3) {
		
		int min = tmp1;		//最小値を引数の初めの値で仮決定
		
		//次に与えられた値がより小さければ
		if(tmp2 < min) {
			
			min = tmp2;			//最小値を引数2つ目に更新
		}
		//最後に与えられた値がより小さければ
		if(tmp3 < min) {
			
			min = tmp3;			//最小値を引数3つ目に更新
		}
		
		return min;
	}
}
