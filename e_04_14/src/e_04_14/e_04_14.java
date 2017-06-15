/* 演習4-14 前問を拡張して加算する値を並べて表示せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_14;

import java.util.Scanner;

public class e_04_14 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);		//数値を入力する領域を確保する
		int result = 0;									//加算に使う変数を定義
		int request;										//加算する最大値を決定する変数
		
		do{
			//正の整数値を入力するように促す
			System.out.print("正の整数値 : ");
			
			request = set_value.nextInt();					//加算する最大値を決定する
		
		//0か負の値ならばやり直し
		}while(request <= 0);
		
		//入力された値まで加算したならばループ終了
		for(int i=1; i < request; i++) {
			
			//加算されていく過程を表示していく
			System.out.print(i + " + ");
			result += i;									//返却する変数に加算を行っていく
		}
		
		result += request;									//過程を表示するためfor文の外で加算を行う
		
		//1～任意の数値までの合計値を表示する
		System.out.print(request + " = " + result);
		
		//確保している領域を解放
		set_value.close();
	}
}
