/* 演習9-2 日付クラスを利用するプログラムの作成
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_09_02;

public class e_09_02 {

	public static void main(String[] args) {
		
		Date class_test1 = new Date();				//デフォルトコンストラクタ
		Date class_test2 = new Date(2017);			//コンストラクタ1
		Date class_test3 = new Date(2017,12);			//コンストラクタ2
		Date class_test4 = new Date(2017,12,31);		//コンストラクタ3
		Date class_copy1 = new Date(class_test1);		//コピーコンストラクタ テスト1の値でコピーオブジェクトを生成
	
		//コンストラクタをテストします
		System.out.println("コンストラクタ テスト");
		System.out.println(class_test1 + " デフォルトコンストラクタ    テスト");
		System.out.println(class_test2 + " コンストラクタ1 		 	テスト");
		System.out.println(class_test3 + " コンストラクタ2 		 	テスト");
		System.out.println(class_test4 + " コンストラクタ3 		 	テスト");
		System.out.println(class_copy1 + " コピーコンストラクタ 	    テスト");
		
		System.out.println("デフォルトコンストラクタ のオブジェクト と コンストラクタ1 のオブジェクトは");
		//判別メソッドのテスト オブジェクト1 2の比較 異なる
		if(class_test1.judgment(class_test2)) {
			
			System.out.println("等しいです");
			
		} else {
			
			System.out.println("異なります");
		}
		
		System.out.println("デフォルトコンストラクタ のオブジェクト と コピーコンストラクタ のオブジェクトは");
		//判別メソッドのテスト オブジェクト1 cop1の比較 等しい
		if(class_test1.judgment(class_copy1)) {
			
			System.out.println("等しいです");
			
		} else {
			
			System.out.println("異なります");
		}
	}
}
