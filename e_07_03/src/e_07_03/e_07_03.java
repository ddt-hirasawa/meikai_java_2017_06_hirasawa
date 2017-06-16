/* 演習7-3 3つの値を読み込み、中央値を返却するメソッドの制作
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
*/
package e_07_03;

import java.util.Scanner;

public class e_07_03 {

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
		System.out.print("中央値 : " + medium(tmp_int[0], tmp_int[1], tmp_int[2]));
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
	
	//メソッド 引数として与えられた値から中央値を返却する
	//引数 mainからの整数 3つ
	//返却値 整数の中での中央値
	static int medium(int tmp1,int tmp2,int tmp3) {
		
		int med = tmp1;		//中央値を引数の初めの値で仮決定
		
		// 入力した値で 初期化したmed が一番小さく tmp3が一番大きいとき
		if(med <= tmp2 && tmp2 <= tmp3) {
			
			//中央値を check_integer2 としてif文を抜ける
			med = tmp2;
			
		// 入力した値で 初期化したmed が一番小さく tmp2が一番大きいとき
		} else if(med <= tmp3 && tmp3 <= tmp2) {
			
		//中央値を tmp3 としてif文を抜ける
			med = tmp3;
		// 入力した値で 初期化したmed が一番大きく tmp3が一番小さいとき
		} else if(tmp3 <= tmp2 && tmp2 <= med) {
			
			//中央値を tmp2 としてif文を抜ける
			med = tmp2;
			
		// 入力した値で 初期化したmed が一番大きく tmp2が一番小さいとき
		} else if(tmp2 <= tmp3 && tmp3 <= med) {
			
			//中央値を tmp3 としてif文を抜ける
			med = tmp3;
		}
		
		return med;
	}
}
