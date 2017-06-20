/* 演習10-2 前問を拡張して、メソッドによりId番号を増加する数を変更させよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_10_02;

public class Id_class {

	static int counter = 0;				//識別番号を数えるカウンター
	static int add_number = 1;			//識別番号に加算する変数 デフォルトは 1
	private int id_number;					//識別番号
	
	//コンストラクタ
	Id_class() {
		
		counter += add_number;			//演習内容により変更 加算する値を 1 から 変数に変更
		id_number = counter;				//重複しないように一度番号を与えたならば次の値に移る
	}
	
	//メソッド 識別番号を返却する
	int get_id_number() {
		
		return id_number;
	}
	
	//メソッド 加算する識別番号のレンジを設定
	void set_add_number(int number) {
		
		add_number = number;
	}
	
	//演習課題
	//メソッド 最後に与えた識別番号を返却する
	static int ged_MaxId() {
		
		return counter;
	}
}
