/* 演習3-1 絶対値を求めて表示するプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_01;

import java.util.Scanner;

public class e_03_01 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);			//数値を入力する領域を確保する
		
		//絶対値を求めるので正負どちらでも入力OK
		System.out.print("正負に関わらず整数値を入力 : ");
		int absolute_integer = set_value.nextInt();			//入力された値を一度補完し 負の値なら演算を行う
		
		//仮に負の値ならば,if文内の式が実行される
		if(0 > absolute_integer) {
			
			absolute_integer = -absolute_integer;				//正負を反転する
		}
		//どの場合でも整数であれば絶対値を表示することになる
		System.out.println("絶対値 : " + absolute_integer);
		
		//数値を扱っていた領域を解放する
		set_value.close();
	}
}
