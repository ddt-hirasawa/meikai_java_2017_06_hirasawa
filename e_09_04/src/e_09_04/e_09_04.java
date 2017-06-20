/* 演習9-4 人間クラスを拡張して、誕生日の項目を追加せよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_09_04;

import java.util.Scanner;

public class e_09_04 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		int year,month,day;										//誕生日を決定する変数
		
		//誕生日を項目ごとにキーボードから入力して決定
		System.out.println("誕生日はいつですか??");
		
		//不正値を弾くために再入力を要求する
		do{
			
			System.out.print("西暦 : ");
			year = set_value.nextInt();							//キーボードから入力して西暦を決定
		
		} while(year <= 0);
		
		//不正値を弾くために再入力を要求する
		do {
		System.out.print("月 : ");
		month = set_value.nextInt();							//キーボードから入力して西暦を決定
		
		} while(month <= 0 || 12 < month);
		
		//不正値を弾くために再入力を要求する
		do {
		System.out.print("日 : ");
		day = set_value.nextInt();								//キーボードから入力して西暦を決定
		
		} while(day <= 0 || 31 < day);
		
		//人間クラスオブジェクト 生成 演習課題の誕生日を追加
		Human Hirasawa_keisuke = new Human("平澤敬介",64.5,173.5,new Date(year,month,day));
		
		//メソッドで情報公開
		Hirasawa_keisuke.information();
		
		//数値を入力する為に確保していた領域を解放
		set_value.close();
	}
}
