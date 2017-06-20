package e_10_04;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class Date {

	private int year = 1; // 西暦
	private int month = 1; // 月
	private int day = 1; // 日 のデータメンバ
	//その月の月末を格納している うるう年未対応
	static int[] month_last = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	// コンストラクタ 群
	// デフォルトコンストラクタ
	public Date() {

		//演習課題 現在日時でオブジェクトを生成
		GregorianCalendar today = new GregorianCalendar();
		
		this.year = today.get(YEAR);			//現在日時の西暦部分をメンバとして保管
		this.month = today.get(MONTH) + 1;		//現在日時の月部分をメンバとして保管
		this.day = today.get(DATE);			//現在日時の日部分をメンバとして保管
	}

	// コンストラクタ 西暦のみ初期化
	public Date(int year) {

		this.year = year; // 西暦のみ 引数を受け取る 1月1日がデフォルト
		
		//演習課題 不正値をはじきます
		this.check_pass();
	}

	// コンストラクタ 西暦、月を初期化
	public Date(int year, int month) {

		this.year = year; // 西暦を引数として受け取る
		this.month = month; // 月を引数として受け取る 1日がデフォルト
		
		//演習課題 不正値をはじきます
		this.check_pass();
	}

	// コンストラクタ すべてを初期化
	public Date(int year, int month, int day) {

		this.year = year; // 西暦を引数として受け取る
		this.month = month; // 月を引数として受け取る
		this.day = day; // 日を引数として受け取る
		
		//演習課題 不正値をはじきます
		this.check_pass();
	}

	// コピーコンストラクタ
	public Date(Date copy) {

		// コピー元と同じデータメンバでオブジェクトを生成
		this(copy.year, copy.month, copy.day);
	}

	// メソッド 西暦を返却
	public int get_year() {

		return year;
	}

	// メソッド 月を返却
	public int get_month() {

		return month;
	}

	// メソッド 日を返却
	public int get_day() {

		return day;
	}

	// メソッド 西暦を設定
	public void set_year(int year) {

		this.year = year;
	}

	// メソッド 月を設定
	public void set_month(int month) {

		this.month = month;
	}

	// メソッド 日を設定
	public void set_day(int day) {

		this.day = day;
	}

	// メソッド 曜日をツェラーの公式で求める
	public int day_of_weak() {

		int weak_set_year = year; // 月によっては、
		int weak_set_month = month; // 演算を行うため、変数に西暦、月を補完します

		// 1月 2月は 例外とします
		if (weak_set_month == 1 || weak_set_month == 2) {

			weak_set_year--; // 去年に戻し
			weak_set_month += 12; // その分、月に西暦分反映させます
		}
		// ツェラーの公式による返却値 0 ～ 6 の値が月に相当する
		return (weak_set_year + (weak_set_year / 4) - (weak_set_year / 100) + (weak_set_year / 400)
				+ ((13 * weak_set_month + 8) / 5) + day) % 7;
	}

	// メソッド 日付が等しいかの判別
	public boolean judgment(Date tmp) {

		// 西暦 月 日 すべて比較して すべて同じ場合 true を返却する
		return (this.year == tmp.year) && (this.month == tmp.day) && (this.day == tmp.day);
	}

	// メソッド 曜日を 文字列で表現する ツェラーの公式で得た値を 曜日表現する
	public String toString() {

		String[] set_weak = { "日", "月", "火", "水", "木", "金", "土" };

		// Stringクラスで提供されている文字列表現用のメソッドを使い文字列表現を返却
		return String.format("%04d年%02d月%02d日(%s))", year, month, day, set_weak[day_of_weak()]);
	}
	
	/*      演習課題 不正値に対処する     */
	//メソッド 不正値の部分を書き換える
	public void check_pass() {
		
		//西暦のチェック 負の値の場合のみ不正とする
		if(this.year < 0) {
			
			this.year = 1;				//西暦を元年に変更
		}
		
		//月の入力 負の値,もしくは 0 の場合 1月とします
		if(this.month <= 0) {
			
			this.month = 1;
			
		// 13以上の値が入力された場合 12月とします
		} else if(12 < this.month) {
			
			this.month = 12;
		}
		
		//日の入力 負の値,もしくは 0 の場合 1日とします
		if(this.day <= 0) {
			
			this.day = 1;
			
		//末日以上の値が入力された場合 その月の末日を設定します
		} else if(month_last[this.month - 1] < this.day) {
			
			this.day = month_last[this.month - 1];
		}
	}
}
