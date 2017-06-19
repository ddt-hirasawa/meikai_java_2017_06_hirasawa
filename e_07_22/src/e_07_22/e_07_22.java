/* 演習7-22 素となる配列と全く同じ配列を生成するメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_22;

import java.util.Scanner;

public class e_07_22 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);					//数値を入力する領域を確保
		
		//メソッドに使う配列の要素を決定
		System.out.print("要素数 : ");
		int len = set_value.nextInt();									//キーボードから入力して要素数を決定
		
		int[] array_sum_test = new int[len];							//合計を求めるメソッド用の配列を定義

		//メソッドに使う配列の中身を表示
		System.out.println("配列を表示");
		
		//配列の全要素に値を代入する
		for(int i=0; i < len ; i++) {
			
			array_sum_test[i] = i;
		}
		
		//配列の先頭を表示
		System.out.print("配列{ " + array_sum_test[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < len - 1 ; i++) {
		
			System.out.print(array_sum_test[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.println(array_sum_test[len - 1] + " }");
		
		System.out.println( "コピーした配列を表示");
		
		//メソッドを呼び出し コピー配列を生成
		int[] copy_array = Array_clone(array_sum_test);
		
		//配列の先頭を表示
		System.out.print("配列{ " + copy_array[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < copy_array.length - 1 ; i++) {
		
			System.out.print(copy_array[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.println(copy_array[copy_array.length - 1] + " }");
		
		//数値を入力する為に確保していた領域を解放
		set_value.close();
	}
	
	//メソッド 素となる配列から全く同じ配列を生成する
	//引数 素となる配列
	//返却値 同じ配列を生成
	static int[] Array_clone(int[] array){
		
		int[] return_array = new int[array.length];				//提供された配列の要素数で配列の領域を確保
		
		//素となる配列の要素をすべてコピー
		for(int i=0; i < array.length; i++) {
			
			return_array[i] = array[i];								//配列をすべてコピー
		}
		return return_array;
	}
}
