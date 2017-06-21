/* 演習14-3 クラス DVD_Player を利用するプログラムの作成
 * 
 * 作成日 2017年6月21日
 *
 * 作成者 平澤敬介
 */

package e_14_03;

import java.util.Scanner;

public class e_14_03 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		Time now = new Time();										//現在時刻を補完
		
		//DVD プレイヤークラスをテストします
		System.out.println("DVDを再生します");
		System.out.println("再生時間はどのくらいですか?");
		
		//時の項目を決定 通常 2時間くらい
		System.out.print("時 : ");
		int hour = set_value.nextInt();
		
		//分の項目を決定 通常 2時間くらい
		System.out.print("分 : ");
		int min = set_value.nextInt();
		
		//秒の項目を決定 誤差
		System.out.print("秒 : ");
		int sec = set_value.nextInt();
		
		Time end_time = new Time(now.get_hour() + hour,
				now.get_min() + min, now.get_sec() + sec);			//終了時刻でオブジェクトを生成
		
		System.out.println("現在時刻 : " + now.toString());
		System.out.println("終了時刻 : " + end_time.toString());
		
		now.play();													//DVD 再生開始
		
		//DVD再生中
		for(;;) {
			
			System.out.println("どのくらい見ていますか?");
			System.out.print("時 : ");
			int passage_hour = set_value.nextInt();				//経過時間を設定
			
			System.out.print("分 : ");
			int passage_min = set_value.nextInt();				//経過時間を設定
			
			System.out.print("秒 : ");
			int passage_sec = set_value.nextInt();				//経過時間を設定
			Time passage = 
				new Time(passage_hour + now.get_hour(),
						passage_min + now.get_min(),
						passage_sec + now.get_sec());				//経過時刻でオブジェクトを生成
			
			// 終了時刻を超えているかを判定します
			// 時刻クラスでは日を跨ぐと判定しなくなるため
			//現在時刻未満になった場合も検出して対処します
			if(!passage.judgment(end_time) && !now.judgment(passage)) {
				
				System.out.println("まだ途中です");					//再生中です
				
				//再生した時間を反映させる
				now.plus_hour(passage_hour);
				now.plus_min(passage_min);
				now.plus_sec(passage_sec);
				
				//そのうえで現在時刻を表示
				System.out.println("現在時刻 : " + now.toString());
				
				//スロー再生のテスト 実際には スローにならない
				System.out.print("スロー再生しますか? 0  でスロー再生");
				int slow = set_value.nextInt();
				
				//スロー再生するために分岐
				if(slow == 0) {
					
					//リモコンのスロー再生ボタンを押す
					now.slow();
				}
				
			} else {
				
				//DVDの再生を終わります
				System.out.println("見終わりました");				
				
				break;
			}
		}
		
		//確保した領域を解放
		set_value.close();
	}
}
