/* 演習4-12 前問の逆でカウントアップするプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_12;

public class e_04_12 {

	public static void main(String[] args) {
		
		//0までカウントアップして数値を表示します
		System.out.println("カウントアップします");
		
		int count_down = 10;				//確認用なので 10からカウントアップさせていきます
		
		//カウントアップ用に変数を設け、表示していきます
		for(int i=0; i <= count_down; i++) {
			
			//カウントアップしながら値を表示していき 最大値 でループ処理が終了
			System.out.println(i);
		}
	}
}
