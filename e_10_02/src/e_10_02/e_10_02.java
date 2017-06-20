/* 演習10-2 前問を拡張して、メソッドによりId番号を増加する数を変更させよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_10_02;

public class e_10_02 {

	public static void main(String[] args) {
		
		Id_class test_Individually = null ;		//識別番号を表示するためのオブジェクトを定義
		
		//全体の半分のオブジェクトを生成するためにループします
		for(int i=0; i < 10 ; i++) {
			
			test_Individually = new Id_class();		//識別番号オブジェクトを生成 1ずつ識別番号が加算されていく
			
			//識別番号を表示 加算値は 1 
			System.out.println("識別番号 : " +  test_Individually.get_id_number());
		}
		
		//識別番号に加算する値を変更
		test_Individually.set_add_number(5);
		
		//全体の半分のオブジェクトを生成するためにループします
		for(int i=0; i < 10 ; i++) {
			
			test_Individually = new Id_class();		//識別番号オブジェクトを生成 指定した値分識別番号が加算されていく
			
			//識別番号を表示 加算値は セッタで指示した値
			System.out.println("識別番号 : " +  test_Individually.get_id_number());
		}
	}
}
