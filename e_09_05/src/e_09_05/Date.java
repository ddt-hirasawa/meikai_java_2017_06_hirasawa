/* 演習9-5 日付クラスを使い 開始日 終了日から成り立つ期間クラスを作れ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_09_05;

public class Date {

	private int year = 1;		//西暦
	private int month = 1;		//月
	private int day = 1;		//日 のデータメンバ デフォルトは 西暦1年1月1日
	
	//コンストラクタ 群
	//デフォルトコンストラクタ
	public Date() {
		
	}
	
	//コンストラクタ 西暦のみ初期化
	public Date(int year) {
		
		this.year = year;		//西暦のみ 引数を受け取る 1月1日がデフォルト
	}
	
	//コンストラクタ 西暦、月を初期化
	public Date(int year,int month) {
		
		this.year = year;		//西暦を引数として受け取る
		this.month = month;		//月を引数として受け取る 1日がデフォルト
	}
	
	//コンストラクタ すべてを初期化
	public Date(int year,int month,int day) {
		
		this.year = year;		//西暦を引数として受け取る
		this.month = month;		//月を引数として受け取る
		this.day = day;			//日を引数として受け取る
	}
	
	//コピーコンストラクタ
	public Date(Date copy) {
		
		// コピー元と同じデータメンバでオブジェクトを生成
		this(copy.year,copy.month,copy.day);
	}
	
	//メソッド 西暦を返却
	public int get_year() {
		
		return year;
	}
	
	//メソッド 月を返却
	public int get_month() {
		
		return month;
	}
	
	//メソッド 日を返却
	public int get_day() {
		
		return day;
	}
	
	//メソッド 西暦を設定
	public void set_year(int year) {
		
		this.year = year;
	}
	
	//メソッド 月を設定
	public void set_month(int month) {
		
		this.month = month;
	}
	
	//メソッド 日を設定
	public void set_day(int day) {
		
		this.day = day;
	}
	
	//メソッド 曜日をツェラーの公式で求める
	public int day_of_weak() {
		
		int weak_set_year = year;				//月によっては、
		int weak_set_month = month;			//演算を行うため、変数に西暦、月を補完します
		
		//1月 2月は 例外とします
		if(weak_set_month == 1 || weak_set_month == 2) {
			
			weak_set_year--;					//去年に戻し
			weak_set_month += 12;				//その分、月に西暦分反映させます
		}
		// ツェラーの公式による返却値 0 ～ 6 の値が月に相当する
		return (weak_set_year + (weak_set_year / 4) - (weak_set_year / 100) + (weak_set_year / 400) +
				((13 * weak_set_month + 8) / 5) + day) % 7;
	}
	
	//メソッド 日付が等しいかの判別
	public boolean judgment(Date tmp) {
		
		//西暦 月 日 すべて比較して すべて同じ場合 true を返却する
		return (this.year == tmp.year) && (this.month == tmp.day) && (this.day == tmp.day);
	}
	
	//メソッド 日付が先か後かを判別する
	//メソッド 開始日と終了日が適切かどうか判別
	boolean judgment_date(Date tmp) {
		
		boolean answer = false;						//デフォルトは 適切で無い
		
		//西暦が 先を行っていれば 適切
		if(this.year <= tmp.year) {
			
			answer = true;
		}
		
		//西暦が同じで先の月ならば 適切
		if(this.year == tmp.year && this.month < tmp.month) {
			
			answer = true;
		}
		
		//西暦 月が等しく 先の日にちならば 期間として適切
		if(this.year == tmp.year && this.month == tmp.month && this.day > tmp.day) {
			
			answer = true;
		}
		return answer;
	}
	
	//メソッド 曜日を 文字列で表現する ツェラーの公式で得た値を 曜日表現する
	public String toString() {
		
		String[] set_weak = {"日","月","火","水","木","金","土"};
		
		//Stringクラスで提供されている文字列表現用のメソッドを使い文字列表現を返却
		return String.format("%04d年%02d月%02d日(%s))",year,month,day,set_weak[day_of_weak()]);
	}
}
