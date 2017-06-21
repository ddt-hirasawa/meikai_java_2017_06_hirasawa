/* 演習15-8 コマンドライン引数で与えられた月のカレンダーを表示するプログラムの作成
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_15_08;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class e_15_08 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in); 	// 数値を入力する領域を確保
		
		int[] month_last = {31,28,31,30,31,30,31,31,30,31,30,31};		//各月の末日を設定します
		
		GregorianCalendar today = new GregorianCalendar();
		
		int now_month = today.get(MONTH) + 1;							//現在日時の月部分を保管
		
		int len = month_last[(int)(Double.parseDouble(args[1]))];	//月の末日を変数に設定
		
		//コマンドライン引数で与える項目の設定
		System.out.print("年数と月を与える -> 0 年のみを与える -> 1 何も与えない -> それ以外 : ");
		int select = set_value.nextInt();								//選択した項目を数値で保管
		
		switch(select) {
		
		//コマンドライン引数で与えられた月のカレンダーを表示する
		case 0 : 
			//月の表示
			System.out.println(args[1] + "月");
			//カレンダーを表示する
			print_calendar(len); break;
			
		//1月から12月のカレンダーを表示する
		case 1 :
			
			for(int i=1; i <= 12; i++) {
				
				System.out.println(i + "月");
				//カレンダーを表示する
				print_calendar(month_last[i - 1]);
				
				System.out.println();
				
			}
			break;
		default :
			
			print_calendar(now_month);
		}
		
		//確保していた領域を解放
		set_value.close();

	}
	
	//メソッド カレンダーを表示する
	static void print_calendar(int len) {
		
		int count = 0;													//カレンダー表記するために使います
		
		//その月の表示を行います 1日から末日まで7日おきに表示します
		for(int i=1; i <= len; i++) {
			
			System.out.printf("%2d",i);
			System.out.print(" ");
			count++;
			
			if(count >= 7) {
				
				count = 0;
				System.out.println();
			}
		}
	}
}
