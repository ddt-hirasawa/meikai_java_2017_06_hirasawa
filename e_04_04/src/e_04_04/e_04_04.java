/* 演習4-4 List4-4のプログラムから while文を抜けた先で変数の値が -1 になることを確認せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_04_04;

public class e_04_04 {

	public static void main(String[] args) {
		
		//0までカウントダウンして数値を表示します
		System.out.println("カウントダウンします");
		
		int count_down = 10;				//確認用なので 10からカウントダウンさせていきます
		
		do{
			//表示した後にデクリメントさせる構造で
			System.out.println(count_down-- + " ");
		
		//終了条件が処理の下にあるため、ループを抜けるときにデクリメントされた値になる
		}while(count_down >= 0);
		
		//確認用 変数の値が -1 になっていることを確認する
		System.out.println("whileループ終了後" + count_down);
	}
}
