/* 演習9-1 作成した人間クラスで配列を生成せよ
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_09_01;

public class e_09_01 {

	public static void main(String[] args) {
		
		// パターン 1 配列生成時に要素をすべて初期化
		Human[] a_lot_of1 = {
				new Human("山田太郎",180,89),
				new Human("川上康太",1750,69),
				new Human("小林修一",160,60)
		};
		
		System.out.println("パターン1 : 生成時にすべて初期化");
		//配列の要素数分 個損情報の表示を行う
		for(int i=0; i < a_lot_of1.length; i++) {
			
			a_lot_of1[i].open_date();
			System.out.println();
		}
		
		// パターン 2 配列生成後に要素をすべて初期化
		Human[] a_lot_of2 = new Human[3];
		
		a_lot_of2[0] = new Human("山田太郎",180,89);
		a_lot_of2[1] = new Human("川上康太",1750,69);
		a_lot_of2[2] = new Human("小林修一",160,60);
		
		System.out.println("パターン2 : 生成後にすべて初期化");
		//配列の要素数分 個損情報の表示を行う
		for(int i=0; i < a_lot_of2.length; i++) {
			
			a_lot_of2[i].open_date();
			System.out.println();
		}
		
		// パターン 3 生成したオブジェクトの要素を変更する
		a_lot_of2[0].set_name("平澤敬介");
		a_lot_of2[0].set_weight(65);
		a_lot_of2[0].set_height(173.5);
		
		System.out.println("パターン3 : 生成後のメンバを変更");
		//配列の要素数分 個損情報の表示を行う
		for(int i=0; i < a_lot_of2.length; i++) {
			
			a_lot_of2[i].open_date();
			System.out.println();
		}
	}
}
