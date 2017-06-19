/* 演習7-21 2つの異なる要素の配列を入れ替えるメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_21;

import java.util.Scanner;

public class e_07_21 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);					//数値を入力する領域を確保
		
		int[] array_test1 = new int[20];								//入れ替えるメソッド用の配列を定義
		
		System.out.print("配列の要素を入力 : ");
		int len = set_value.nextInt();									//新たな配列の要素はキーボードから入力して決定
		int[] array_test2 = new int[len];							//入れ替えるメソッド用の配列を定義
		
		//メソッドに使う配列の中身を表示
		System.out.println("配列を表示");
		
		//配列の全要素に値を代入する
		for(int i=0; i < 20 ; i++) {
			
			array_test1[i] = i;											//配列の番号を前から代入
		}
		
		//配列の全要素に値を代入する
		for(int i=0; i < array_test2.length ; i++) {
			
			array_test2[i] = array_test2.length - i;					//配列の番号を後ろから代入
		}
		
		//配列の先頭を表示
		System.out.print("配列{ " + array_test1[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < 19 ; i++) {
		
			System.out.print(array_test1[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.print(array_test1[19] + " }");
		
		System.out.println();
		
		
		//配列の先頭を表示
		System.out.print("配列{ " + array_test2[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < array_test2.length - 1; i++) {
		
			System.out.print(array_test2[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.println(array_test2[array_test2.length - 1] + " }");
		
		//メソッドの呼び出し
		swap_array(array_test1,array_test2);
		
		//宣言 メソッドによる処理終了
		System.out.println("入れ替え後");
		
		//配列の先頭を表示
		System.out.print("配列{ " + array_test1[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < 19 ; i++) {
		
			System.out.print(array_test1[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.print(array_test1[19] + " }");
		
		System.out.println();
		
		//配列の先頭を表示
		System.out.print("配列{ " + array_test2[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < array_test2.length - 1; i++) {
		
			System.out.print(array_test2[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.print(array_test2[array_test2.length - 1] + " }");
		
		//数値を入力する為に確保していた領域を解放
		set_value.close();
	}
	
	//メソッド 配列の中身を入れ替える
	//引数 配列2つ
	//返却値 無し
	static void swap_array(int[] swap_array1,int[] swap_array2) {
		
		//要素数の少ないほうを処理に採用
		int len = swap_array1.length <= swap_array2.length ? swap_array1.length : swap_array2.length;
		
		//少ない要素数分入れ替えを行う
		for(int i=0; i < len; i++) {
			
			int tmp = swap_array1[i];							//要素の仮置き場
			swap_array1[i] = swap_array2[i];					//配列1の値を配列2と入れ替える
			swap_array2[i] = tmp;								//変更前の配列1の値を配列2に代入して終了
		}
	}
}
