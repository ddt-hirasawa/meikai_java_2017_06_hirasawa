/* 演習7-7 List7-7 を変更しメソッドの中でメソッドを呼び出すようにせよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_07_07;

import java.util.Scanner;

public class e_07_07 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		
		//正の整数を入力しメソッドに使います
		System.out.print("三角形の1辺 : ");
		int set_int = set_value.nextInt();					//正の整数を入力します 1 ～ 12 で季節を表示
		
		//三角形の縦1辺を操作するループ
		for(int i=1; i <= set_int; i++) {
			
			//メソッド呼び出し部分
			print_count('*',i);
			
			//改行
			System.out.println();
		}
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
	
	//メソッド 任意の文字を要求された個数分表示する
	//引数 表示する個数
	//返却値 無し
	static void print_count(char set,int tmp) {
		
		//引数分メソッドを呼び出すためのループ
		for(int i=0; i< tmp; i++) {
			
			//メソッド呼び出し
			print_char(set);
		}
	}
	
	//メソッド 任意の文字を表示する
	//引数 表示する文字
	//返却値 無し
	static void print_char(char tmp) {
		
		System.out.print(tmp);
	}
}
