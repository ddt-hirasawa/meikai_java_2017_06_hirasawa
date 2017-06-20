/* 演習11-1 List10-12のクラス Date_Idをパッケージ class_idに所属させるように変更せよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package class_id;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class Date_Id {

	public static int counter;				//識別番号を与えた回数をカウント
	private int id;							//識別番号そのもの
	
	//静的初期化子
	static {
		
		//現在日時を取得
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(YEAR);			//西暦を変数に保管
		int month = today.get(MONTH) + 1;		//月を変数に保管
		int day = today.get(DATE);				//日を変数に保管
		
		//現在日時を確認したいのでコンソールに表示する
		System.out.printf("今日は%04d年%02d月%02d日です\n",year,month,day);
		
		//識別番号は西暦、月、日の値に依存して決定する
		counter = year * 1000 + month + 100 + 10 * day;
	}
	
	//コンストラスタ
	public Date_Id() {
		
		id = ++counter;						//識別番号を設定 重複はしない
	}
	
	//メソッド 識別番号を取得
	public int get_number() {
		
		return id;								//識別番号をmainに渡す
	}
}
