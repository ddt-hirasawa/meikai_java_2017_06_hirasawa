/* 演習2-5 2値を読み込んで平均と合計を表示せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */

package e_02_05;

import java.util.Scanner;

public class e_02_05 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);		//2値を読み込むために領域を確保。使いまわしOK
		
		//1つ目の値を入力するように促す
		System.out.print("1つ目の値 : ");
		
		double double_tmp1 = set_value.nextDouble();		//実数値なのでdouble型の変数を用意し確保した領域から値を代入する
		
		//2つ目の値を入力するように促す
		System.out.print("2つ目の値 : ");
		
		double double_tmp2 = set_value.nextDouble();		//実数値なのでdouble型の変数を用意し確保した領域から値を代入する
		
		//変数の値から合計を表示する 実数なので数値なら入力に制限はない
		System.out.println("2値の合計は " + (double_tmp1 + double_tmp2) + "です");
		
		//2値の平均を表示する 実数なので数値なら入力に制限はない
		System.out.println("2値の平均は " + (double_tmp1 + double_tmp2) / 2 + "です");
		
		//確保した領域を解放する
		set_value.close();
	}
}
