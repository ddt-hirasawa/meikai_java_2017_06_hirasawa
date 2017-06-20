/* 演習10-1 List10-3 の連番クラスに最後に与えた識別番号を返却するメソッドを追加せよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_10_01;
//連番クラス
public class Id_class {

	static int counter = 0;				//識別番号を数えるカウンター
	private int id_number;					//識別番号
	
	//コンストラクタ
	Id_class() {
		
		id_number = ++counter;				//重複しないように一度番号を与えたならば次の値に移る
	}
	
	//メソッド 識別番号を返却する
	int get_id_number() {
		
		return id_number;
	}
	
	//演習課題
	//メソッド 最後に与えた識別番号を返却する
	static int ged_MaxId() {
		
		return counter;
	}
}
