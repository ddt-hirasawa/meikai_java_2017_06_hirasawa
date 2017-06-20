/* 演習11-1 List10-12のクラス Date_Idをパッケージ class_idに所属させるように変更せよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_11_01;

//    パッケージ.クラス名  でほかのパッケージの型をインポートする宣言
import class_id.Date_Id; 

public class e_11_01 {

	public static void main(String[] args) {

		Date_Id test1 = new Date_Id();				//別のパッケージにあるクラスの型を使用してオブジェクトを初期化
		
		//静的初期化子により設定されている識別番号を表示させる
		System.out.println("識別番号 : " + test1.get_number());
		
		Date_Id test2 = new Date_Id();				//別のパッケージにあるクラスの型を使用してオブジェクトを初期化
		
		//静的初期化子により初期化されていることを確認する -> 連番になっていることを確認する
		System.out.println("識別番号 : " + test2.get_number());
	}
}
