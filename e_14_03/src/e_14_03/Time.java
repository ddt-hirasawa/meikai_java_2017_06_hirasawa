/* 演習14-3 クラス DVD_Player を利用するプログラムの作成
 * 
 * 作成日 2017年6月21日
 *
 * 作成者 平澤敬介
 */

package e_14_03;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

//時刻クラスに DVDプレイヤークラスを継承
public class Time extends DVD_Player{

	private int hour;							//時間表現の時を扱う変数
	private int min;							//時間表現の分を扱う変数
	private int sec;							//時間表現の秒を扱う変数
	
	//コンストラクタ 現在時刻を得る
	Time() {
		
		GregorianCalendar now = new GregorianCalendar();
		
		this.hour = now.get(HOUR);				//時間表現の時をメンバとして保管
		this.min = now.get(MINUTE);			//時間表現の分をメンバとして保管
		this.sec = now.get(SECOND);			//時間表現の秒をメンバとして保管
	}
	
	//コンストラクタ指定した時刻を得る
	Time(int hour,int min,int sec) {
		
		this.hour = hour;						//時間表現の時をメンバとして保管
		this.min = min;							//時間表現の分をメンバとして保管
		this.sec = sec;							//時間表現の秒をメンバとして保管
	}
	
	// メソッド 時を返却
	public int get_hour() {

		return hour;
	}

	// メソッド 分を返却
	public int get_min() {

		return min;
	}

	// メソッド 秒を返却
	public int get_sec() {

		return sec;
	}
	
	// メソッド 時を加算
	public void plus_hour(int hour) {

		this.hour += hour;
		this.set_correct();
	}

	// メソッド 分を加算
	public void plus_min(int min) {

		this.min += min;
		this.set_correct();
	}

	// メソッド 秒を加算
	public void plus_sec(int sec) {

		this.sec += sec;
		this.set_correct();
	}
	
	// メソッド 時刻を文字列で表現する
	public String toString() {

		// Stringクラスで提供されている文字列表現用のメソッドを使い文字列表現を返却
		return String.format("%02d時%02d分%02d秒", hour, min, sec);
	}
	
	//メソッド 時刻を加算したとき値を調整する
	void set_correct() {
		
		//60秒を超えたとき
		if(60 <= this.sec) {
			
			do {
				
				this.sec -= 60;					//60秒引くことで正常な値にする
				min++;							//その分、1分加算する
				
			//60秒未満になるように数値を調整
			} while(60 <= this.sec);
		}
		
		//60分を超えたとき
		if(60 <= this.min) {
			
			do {
				
				this.min -= 60;					//60分引くことで正常な値にする
				hour++;							//その分、1時間加算する
				
			//60分未満になるように数値を調整
			} while(60 <= this.min);
		}
		
		//24時を超えたとき
		if(24 <= this.hour) {
			
			do {
				
				this.hour -= 24;				//24時間引くことで正常な値にする
												//日の項目が無いのでここで終了
				
			//24時未満になるように数値を調整
			} while(24 <= this.hour);
		}
	}
	
	//メソッド 指定した時刻 tmp を過ぎているかの判定
	boolean judgment(Time tmp) {
		
		boolean answer = false;				//デフォルトは過ぎている
		
		//指定した時がまだ先ならば OK
		if(tmp.hour < this.hour) {
			
			answer = true;						//更新 過ぎていない
			
		//指定した時が同じ場合 分を比べます
		} else if(tmp.hour == this.hour ) {
			
			// 分がまだ先ならば OK
			if(tmp.min < this.min) {
				
				answer = true;					//更新 過ぎていない
				
			//指定した分が同じ場合 秒を比べます
			} else if(tmp.min == this.min) {
				
				// 秒がまだ先ならば OK
				if(tmp.sec < this.sec) {
					
					answer = true;				//更新 過ぎていない
				}
			}
		}
		
		return answer;
	}
}
