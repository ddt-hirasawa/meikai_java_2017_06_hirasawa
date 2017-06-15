/* 演習3-3 List3-5 のelse -> else if(n == 0) に変更した場合の動作確認
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_03_03;

import java.util.Scanner;

public class e_03_03 {

	//入力された値を判別して 正負 0 の表示を行うプログラム
	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);	//数値を入力するための領域を確保する
		
		//整数であればどの値でも入力するには構わない
		System.out.print("整数を入力 : ");
		int answer = set_value.nextInt();				//キーボードから入力された値を変数に保管しておく
		
		//0より大きい場合、正の値の証明になる
		if(0 < answer) {
			
			//条件を満たしたから、正の値だと確認できました
			System.out.println("正の値です");
		
		//初めのif文の条件を満たさなければ次に 0未満か判断される
		} else if(answer < 0) {
			
			//条件を満たしたから、負の値だと確認できました
			System.out.println("負の値です");
		
		//文字通り 0だった場合
		} else if(0 == answer) {
			
			//条件を満たしたから、0だと確認できました
			System.out.println("0です");
		}
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
/* 前の if と else if を抜けてきたということは正負の値では無いということになります。
 * なので、0以外にあり得ないことになります。else も else if(answer == 0) もほぼ同じ働きをします
 * 
 */
