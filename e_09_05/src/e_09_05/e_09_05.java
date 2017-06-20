/* 演習9-5 日付クラスを使い 開始日 終了日から成り立つ期間クラスを作れ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_09_05;

import java.util.Scanner;

public class e_09_05 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		int year,month,day;										//誕生日を決定する変数
		
		//開始日を項目ごとにキーボードから入力して決定
		System.out.println("開始日はいつですか?");
		
		//不正値を弾くために再入力を要求する
		do{
			
			System.out.print("西暦 : ");
			year = set_value.nextInt();							//キーボードから入力して西暦を決定
		
		} while(year <= 0);
		
		//不正値を弾くために再入力を要求する
		do {
		System.out.print("月 : ");
		month = set_value.nextInt();							//キーボードから入力して月を決定
		
		} while(month <= 0 || 12 < month);
		
		//不正値を弾くために再入力を要求する
		do {
		System.out.print("日 : ");
		day = set_value.nextInt();								//キーボードから入力して日を決定
		
		} while(day <= 0 || 31 < day);
		
		Date start_date = new Date(year,month,day);			//開始日オブジェクトを生成
		
		//終了日を項目ごとにキーボードから入力して決定
		System.out.println("終了日はいつですか?");
		
		//不正値を弾くために再入力を要求する
		do{
			
			System.out.print("西暦 : ");
			year = set_value.nextInt();							//キーボードから入力して西暦を決定
		
		} while(year <= 0);
		
		//不正値を弾くために再入力を要求する
		do {
		System.out.print("月 : ");
		month = set_value.nextInt();							//キーボードから入力して月を決定
		
		} while(month <= 0 || 12 < month);
		
		//不正値を弾くために再入力を要求する
		do {
		System.out.print("日 : ");
		day = set_value.nextInt();								//キーボードから入力して日を決定
		
		} while(day <= 0 || 31 < day);
		
		Date finish_date = new Date(year,month,day);			//終了日オブジェクトを生成
		
		Period dead_line = new Period(start_date,finish_date);//期限オブジェクトを 開始日と終了日で決定
		
		dead_line.open_dead_line();								//開始日と終了日の表示
		
		System.out.println("期間は " + dead_line.diff_dead_line());
		
		//数値を入力する為に確保していた領域を解放
		set_value.close();
	}
}
