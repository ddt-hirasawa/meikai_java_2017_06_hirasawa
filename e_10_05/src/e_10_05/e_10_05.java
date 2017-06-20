/* 演習10-5 銀行クラスを拡張してインスタンスが生成される度にメッセージを表示せよ 
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_10_05;

public class e_10_05 {

	public static void main(String[] args) {

		// new で生成した段階で初期化子で設定されているメッセージが表示される
		Account Hirasawa = new Account("平澤","012345",10000);
		
		//口座情報を表示
		Hirasawa.information();
		
		// 2回目以降も表示されるかの確認
		Account Keisuke = new Account("敬介","67890",20000);
		
		//口座情報を表示
		Keisuke.information();
	}
}
