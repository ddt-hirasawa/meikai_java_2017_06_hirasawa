/* 演習14-3 クラス DVD_Player を利用するプログラムの作成
 * 
 * 作成日 2017年6月21日
 *
 * 作成者 平澤敬介
 */

package e_14_03;

//インターフェース プレイヤー
interface Player {
	
	void play();							//再生
	void stop();							//ストップ
	void slow();							//スロー再生
}

//インターフェース スロー再生を追加
interface slow_Player {

	void slow();							//スロー再生
}

//DVD プレイヤークラス
class DVD_Player implements Player,slow_Player {

	//メソッド 再生を行う
	public void play() {

		System.out.println("DVDの再生を行います");
	}

	//メソッド 停止を行う
	public void stop() {

		System.out.println("停止します");
	}

	//メソッド スロー再生を行う
	public void slow() {

		System.out.println("スロー再生します");
	}
}