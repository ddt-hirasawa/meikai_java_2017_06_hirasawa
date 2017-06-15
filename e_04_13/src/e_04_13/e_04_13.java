/* 演習4-13 List4-10を書き換えfor文で表せ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_13;

import java.util.Scanner;

public class e_04_13 {

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
		for(int i=1; i <= request; i++) {
			
			result += i;									//返却する変数に加算を行っていく
		}

		//1～任意の数値までの合計値を表示する
		System.out.print("1～" + request + "までの合計値 : " + result);
		
		//確保している領域を解放
		set_value.close();
	}
}
