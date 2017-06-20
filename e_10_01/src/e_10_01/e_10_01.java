/* 演習10-1 List10-3 の連番クラスに最後に与えた識別番号を返却するメソッドを追加せよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_10_01;

public class e_10_01 {

	public static void main(String[] args) {
		
		/*    人間クラスにIDクラスを含ませています  */
		Human Yamada = new Human("山田",180,70);
		Human Tanaka = new Human("田中",190,90);
		Human Kawagoe = new Human("川越",170,50);
		
		/*    個人情報をすべて表示させます          */
		/* 個人情報の表示は オブジェクトの生成の順番とは異なり
		 * 初期化した順に識別番号が割り振られる
		 */
		Kawagoe.information();
		Yamada.information();
		Tanaka.information();
		
		//演習課題 最後に与えら識別番号を表示する
		System.out.println("最後に与えた識別番号 : " +  Id_class.ged_MaxId());
	}
}
