/* 演習9-5 日付クラスを使い 開始日 終了日から成り立つ期間クラスを作れ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_09_05;

public class Period {

	private Date start_date;											//何らかの開始日
	private Date finish_date;											//何らかの終了日
	
	//コンストラクタ
	Period(Date start_date , Date finish_date) {
		
		this.start_date = new Date(start_date);						//開始日 終了日を仮決定
		this.finish_date = new Date(finish_date);						//開始日が過ぎているなどの不正値は省く
		
		//開始日が適切が判別します
		if(!start_date.judgment_date(finish_date)) {
			
			this.start_date = new Date(finish_date);					//開始日 終了日を仮決定
			this.finish_date = new Date(start_date);					//開始日が過ぎているなどの不正値は省く
		
		}
	}
	
	//メソッド 開始日と終了日を同時に表示
	void open_dead_line() {
		
		//開始日と終了日の期限を表示
		System.out.println("開始日 : " + this.start_date.toString());
		System.out.println("終了日 : " + this.finish_date.toString());
	}
	
	//メソッド 開始日と終了日の差分を求めます
	String diff_dead_line() {
		
		int year = finish_date.get_year() - start_date.get_year();		//差分を変数に保管 西暦
		int month = finish_date.get_month() - start_date.get_month();	//差分を変数に保管 月
		int day = finish_date.get_day() - start_date.get_day();		//差分を変数に保管 日
		
		//月を跨いでしまった場合
		if(day < 0) {
			
			month--;													//月を前の月に戻す
			day += 31;													//末日分 戻す必要があるがすべて31日を末日と仮定する
		}
		
		//年を跨いでしまった場合
		if(month < 0) {
			
			year--;														//西暦を去年に戻す
			month += 12;												//月分 戻す必要がある
		}
		//数値を状態に合わせて変更したのち表示する
		return String.format("%04d年%02d月%02d日",year,month,day);
	}
}
