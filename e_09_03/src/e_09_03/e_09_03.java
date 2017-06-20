/* 演習9-3 銀行クラスに口座開設日を追加し、必要となるメソッド、フィールドを追加せよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_09_03;

import java.util.Scanner;

public class e_09_03 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		int year,month,day;										//口座開設日を決定する変数
		
		//開設日を項目ごとにキーボードから入力して決定
		System.out.println("いつ口座を開設しましたか?");
		
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
		
		//銀行クラスオブジェクト 生成 演習課題の開設日を追加
		Account Hirasawa_keisuke = new Account("平澤敬介","1234567890" ,10000,new Date(year,month,day));
		
		//メソッドで情報公開
		Hirasawa_keisuke.information();
		
		//数値を入力する為に確保していた領域を解放
		set_value.close();
	}
}
