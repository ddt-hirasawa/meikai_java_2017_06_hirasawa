/* 演習2-10 名前の姓名を別々に入力し挨拶を行うプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_02_10;

import java.util.Scanner;

public class e_02_10 {

	public static void main(String[] args) {
		
		Scanner set_name = new Scanner(System.in);			//名前を入力する領域を確保する
		
		//名前の姓の部分のみの入力を促す
		System.out.print("姓 : ");
		String split_name1 = set_name.next();					//名前の姓を変数に保管する
		
		//名前の名の部分のみの入力を促す
		System.out.print("名 : ");
		String split_name2 = set_name.next();					//名前の名を変数に保管する
		
		//名前と苗字を分割して入力し表示するときにつなげて表示する
		System.out.println("こんにちは " + split_name1 + " " + split_name2 + "さん。" );

		//名前を入力するために確保していた領域を解放する
		set_name.close();
	}
}
