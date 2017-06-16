/* 演習5-1 10進数を読み込んで、8進数 16進数で表示するプログラムの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_05_01;

import java.util.Scanner;

public class e_05_01 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		
		//10進数を入力してその値を8進数 16進数でそれぞれ表示させます
		System.out.print("正の整数を入力 : ");
		
		int decimal_number = set_value.nextInt();			// 10進数を入力させ、変数に補完する
		
		//10進数を入力してその値を8進数 16進数でそれぞれ表示させます
		System.out.printf("10進数 : " + "%3d",decimal_number);
		
		// 8進数は o を付けることで表示できる 最低3ケタで表示
		System.out.printf("\n 8進数 : " + "%3o",decimal_number);
		
		// 16進数は x を付けることで表示できる 最低3ケタで表示
		System.out.printf("\n16進数 : " + "%3x",decimal_number);
		
		// 数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
