/* 演習12-2 定期預金付銀行クラスの変数の、普通預金と定期預金残高の合計を比較した結果を返却するメソッドの作成
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_12_02;
// 派生クラス 銀行クラス -> 定期付き銀行クラス
class Time_Account extends Account{

	private long time_balance;					//預金残高
	
	//派生クラスのコンストラクタ
	Time_Account(String name, String number, long balance,long time_balance) {
		
		//基底クラスのコンストラクタ
		super(name, number, balance);
		this.time_balance = time_balance;		///預金残高を初期化 基底クラスの差分
	}
	
	//メソッド 定期預金残高を調べる
	long get_time_balance() {
		
		return time_balance;
	}
	
	//メソッド 定期預金を解約する すべて普通預金に移動する
	void cancellation() {
		
		plus_balance(time_balance);				//預金をすべて普通預金に移動
		time_balance = 0;						//定期預金を空にする
	}
}
