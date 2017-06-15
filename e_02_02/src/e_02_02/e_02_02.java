/*演習2-2 3つの値から合計と平均を求めるプログラムの作成
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */
package e_02_02;

//演習2-2の課題を行っていきます
public class e_02_02 {

	public static void main(String[] args) {

		int Integer_x 	= 10;		//3値の一つとして整数値を提供
		int Integer_y		= 1;		//3値の一つとして整数値を提供
		double double_x	= 0.55;		//3値の一つとして実数値を提供
		
		//合計値の表示を行います。
		System.out.println("合計は" +(Integer_x + Integer_y + double_x)+ "です");
		
		//平均値の表示を行います。
		System.out.println("平均は" + (Integer_x + Integer_y + double_x) / 3 + "です");
	}
}
