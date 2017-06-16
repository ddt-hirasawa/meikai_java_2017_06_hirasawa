/* 演習7-6 引数として 1 ～ 12の値を提供し、その月の季節を表示するメソッドの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_07_06;

import java.util.Scanner;

public class e_07_06 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		
		//正の整数を入力しメソッドに使います
		System.out.print("月 : ");
		int set_int = set_value.nextInt();					//正の整数を入力します 1 ～ 12 で季節を表示
		
		//1～12以外の整数の入力を拒否します
		if(0 < set_int && set_int < 13) {
			//メソッド呼び出し部分
			print_season(set_int);
		}
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
	
	//メソッド 引数として与えられた値で季節を表示
	//引数 整数
	//返却値 無し
	static void print_season(int tmp) {
		
		//引数として与えた値で季節を表示させます
		switch(tmp) {
		
		//春ケース
		case 3 :
		case 4 :
		case 5 : System.out.print("春です"); break;
		
		//夏ケース
		case 6 :
		case 7 :
		case 8 : System.out.print("夏です"); break;
		
		//秋ケース
		case 9 :
		case 10:
		case 11: System.out.print("秋です"); break;
		
		//冬ケース
		default : System.out.print("冬です ");
		}
	}
}
