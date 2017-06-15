/* 演習4-11 List4-4を書き換えfor文で表現せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_11;

public class e_04_11 {

	public static void main(String[] args) {

		//0までカウントダウンして数値を表示します
		System.out.println("カウントダウンします");
		
		int count_down = 10;				//確認用なので 10からカウントダウンさせていきます
		
		//for文で記述しなおします
		for(;count_down >= 0; count_down--) {
			
			//カウントダウンしながら値を表示していき 0 でループ処理が終了
			System.out.println(count_down);
		}
	}
}
