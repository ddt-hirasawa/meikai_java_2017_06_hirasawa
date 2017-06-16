/* 演習6-15 日本語で曜日を表示して英単語の曜日を答える学習プログラムの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_15;

import java.util.Random;
import java.util.Scanner;

public class e_06_15 {

	public static void main(String[] args) {

		Random set_rand_value = new Random(); 						// 乱数の種を生成
		Scanner set_value = new Scanner(System.in); 					// 数値を入力する領域を確保
		int retry;														// 継続するかを判別する変数
		int week;														// 曜日をランダムに表示する変数
		int past = 0;													// 前に表示した曜日を記憶しておく
		String answer;													// 英単語を入力する変数を定義
		
		//曜日の英単語を文字列として格納
		String[] English_week = {
				//日曜日から土曜日
				"sunday", "monday", "tuesday", "wednesday", "thrusday", "friday","saturday"
		};
		
		//曜日の日本語を文字列として格納
		String[] Japanese_week = {
				//日曜日から土曜日
				"日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"
		};
		
		//問題の概要を説明している部分
		System.out.println("英語の曜日を入力してください");
		System.out.println("なお、先頭は小文字です");
		
		
		do {
			
			week = set_rand_value.nextInt(7);							//0 ～ 6の乱数を生成し、曜日に割り当てる
			
			//前と同じ曜日の場合を拾います
			if(past == week) {
				
				do {
					week = 1 + set_rand_value.nextInt(12);				//0 ～ 6の乱数を生成し、曜日に割り当てる
					
				//重複を排除
				}while(past == week);
			}
			
			past = week;												//曜日を記憶
		
			do{	
				//英単語を入力する曜日を表示
				System.out.print(Japanese_week[week] + " : ");
		
				answer = set_value.next();								//キーボードから答えを入力

				//文字列の比較を行います
				if(!answer.equals(English_week[week])) {
				
					//継続して、英単語の入力を行います
					System.out.println("違います");
				
				//入力した文字が一致しました
				} else {
				
					//英単語の入力終了
					System.out.println("正解です");
				}
		
			//文字列として格納している曜日名と一致したならば終了
			}while(!answer.equals(English_week[week]));
			
			System.out.println("継続 - > 0 以外 終了 -> 0");
			
			retry = set_value.nextInt();								//キーボードから入力した値で継続するか判別します 
		
		//0が入力されたならば終了
		}while(retry != 0);
		
		// 確保していた領域を解放
		set_value.close();
	}
}
