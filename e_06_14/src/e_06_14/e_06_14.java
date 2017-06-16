/* 演習6-14 月を使った英単語簡易学習プログラムの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_14;

import java.util.Random;
import java.util.Scanner;

public class e_06_14 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random(); 						// 乱数の種を生成
		Scanner set_value = new Scanner(System.in); 					// 数値を入力する領域を確保
		int retry;														// 継続するかを判別する変数
		int month;														// 月をランダムに表示する変数
		int past = 0;													// 前に表示した月を記憶しておく
		String answer;													// 英単語を入力する変数を定義
		
		//月の英単語を文字列として格納
		String[] Month = {
				//1月 ～ 6月
				"January", "February", "March", "April", "May", "June",
				//7月 ～ 12月
				"July", "August", "September", "October", "November", "December"
		};
		
		//問題の概要を説明している部分
		System.out.println("英語の月名を入力してください");
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字です");
		
		
		do {
			
			month = 1 + set_rand_value.nextInt(12);						//1～12の乱数を生成し、月に割り当てる
			
			//前と同じ月の場合を拾います
			if(past == month) {
				
				do {
					month = 1 + set_rand_value.nextInt(12);				//1～12の乱数を生成し、月に割り当てる
					
				//重複を排除
				}while(past == month);
			}
			
			past = month;												//月を記憶
		
			do{	
				//英単語を入力する月を表示
				System.out.print(month + "月 : ");
		
				answer = set_value.next();							//キーボードから答えを入力

				//文字列の比較を行います
				if(!answer.equals(Month[month - 1])) {
				
					//継続して、英単語の入力を行います
					System.out.println("違います");
				
				//入力した文字が一致しました
				} else {
				
					//英単語の入力終了
					System.out.println("正解です");
				}
		
			//文字列として格納している月名と一致したならば終了
			}while(!answer.equals(Month[month - 1]));
			
			System.out.println("継続 - > 0 以外 終了 -> 0");
			
			retry = set_value.nextInt();								//キーボードから入力した値で継続するか判別します 
		
		//0が入力されたならば終了
		}while(retry != 0);
		
		// 確保していた領域を解放
		set_value.close();
	}
}
