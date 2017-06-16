/* 演習4-24 正の整数値を読み込み素数であるかを判断するプログラムの作成
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_04_24;

import java.util.Scanner;

public class e_04_24 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); // 数値を入力するための領域を確保
		int prime_number;							  // 素数かもしれない値を補完する変数
		int judg = 0;								  // 素数かを判別する変数 0 -> 素数, 1以上 -> 素数ではない
		
		
		do {
		//正の整数をを入力するように促す
		System.out.print("素数が判断する数値の入力(正の整数) : ");
		
			prime_number= set_value.nextInt(); 	  	  // キーボードから入力された値を補完する
		
		//2以上の時のみループから脱却
		} while(prime_number <= 1);
		
		//入力された値が素数か判断するため除算を行うループ処理を実行します
		for(int i=2; i <= prime_number / 2; i++) {
			
			//素数であれば余りが出ないはずなので除算を行います
			if(prime_number % i == 0) {
				
				judg++;								 // 素数ではない証明のため、0ではない値にします
				
				//素数ではないことを告げます
				System.out.print("素数ではありません ");
				
				break;								 // 素数ではないと判断できたのでこれ以上処理は行いません
			}
		}
		
		//ループ後の判別変数の値で素数かを判断します
		if(judg == 0) {
			
			//素数であることを告げます
			System.out.print("素数です ");
		}
		
		//確保していた領域を解放する
		set_value.close();
	}
}
