/* 演習10-4 日付クラスを拡張し、デフォルトコンストラクタを現在日時を返却するようにし、また、不正値に対応させよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_10_04;

import java.util.Scanner;

public class e_10_04 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in); 	// 数値を入力する領域を確保
		
		Date today = new Date();						//デフォルトコンストラクタを現在日時を格納するように変更
		
		//現在日時を表示
		System.out.println(today.toString());
		
		//これ以降 コンストラクタをテストします
		//行っていることは同じなので 3値の入力が行われた場合のみテストします
		System.out.println("コンストラクタをテストします");
		
		//西暦を決定します 不正の条件は 0か負の値
		System.out.print("西暦 : ");
		int year = set_value.nextInt();
		
		//月を決定します 不正の条件は 0もしくは負の値 13以上の値
		System.out.print("月 : ");
		int month = set_value.nextInt();
		
		//日を決定します 不正の条件は 0もしくは負の値 その月の末日を超える入力
		System.out.print("日 : ");
		int day = set_value.nextInt();
		
		Date select= new Date(year,month,day);			//コンストラクタに不正値が入った場合のテスト
		
		//入力した日時を表示 不正値は弾かれる
		System.out.println(select.toString());
		
		//確保していた領域を解放
		set_value.close();
	}
}
