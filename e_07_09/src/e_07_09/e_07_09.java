/* 演習7-9 正の整数値を必ず返却するメソッドの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_07_09;

import java.util.Scanner;

public class e_07_09 {

	public static void main(String[] args) {
		
		int answer_int = read_plus_int();				//メソッドの呼び出しで初期化する
		
		//入力した値を確認し、正の整数であることを確認します
		System.out.print("正の整数 : " + answer_int);
	}
	
	//メソッド 正の整数を入力するまで繰り返すことで必ず正の整数を返却する
	//引数 無し
	//返却値 正の整数
	static int read_plus_int() {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		
		int answer_int;									//返却値
		
		do {
			
			//正の整数を入力させます
			System.out.print("正の整数 : ");
			
			answer_int = set_value.nextInt();
			
		}while(answer_int <= 0);
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
		
		return answer_int;
	}
}
