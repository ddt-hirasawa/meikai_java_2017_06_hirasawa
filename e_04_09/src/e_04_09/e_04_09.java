/* 演習4-9 正の整数を読み込み 1 ～ 読み込んだ値までの全整数で積算を行え
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_09;

import java.util.Scanner;

public class e_04_09 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);		//数値を入力する領域を確保する
		int i = 1,result = 1;								//積算に使う変数をまとめて定義
		int request;										//積算する最大値を決定する変数
		
		do{
			//正の整数値を入力するように促す
			System.out.print("正の整数値 : ");
			
			request = set_value.nextInt();					//積算する最大値を決定する
		
		//0か負の値ならばやり直し
		}while(request <= 0);
		
		//入力された値まで積算したならばループ終了
		while(i <= request) {
			
			result *= i++;									//返却する変数に積算を行っていく
		}

		//1～任意の数値までの階乗値を表示する
		System.out.print("1～" + request + "までの階乗値 : " + result);
		
		//確保している領域を解放
		set_value.close();
	}
}
