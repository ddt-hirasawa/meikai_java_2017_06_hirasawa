/* 演習15-2 文字列を読み込んで、文字コードを表示するプログラムの作成
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_15_02;

public class e_15_02 {

	public static void main(String[] args){

		String test = "12345678?";						//適当な文字を与え判定する
		byte[] char_cord = test.getBytes();			//文字コードを見るために、byte型の配列に置き換える
		
		//文字数分 -> 置き換えた配列の要素数分表示する
		for(int i=0; i < char_cord.length;i++) {
			
			//文字コードを表示する
			System.out.print("文字" + (i + 1) + "つ目 : ");
			//表でわかりやすいように16進数表記する
			System.out.printf("%x\n", + char_cord[i]);
		}
	}
}
