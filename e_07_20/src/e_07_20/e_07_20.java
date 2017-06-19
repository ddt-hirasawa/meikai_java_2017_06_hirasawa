/* 演習7-20 配列の指定する要素に指定した数を代入するメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_20;

import java.util.Scanner;

public class e_07_20 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);					//数値を入力する領域を確保
		
		int[] array_sum_test = new int[20];							//合計を求めるメソッド用の配列を定義

		//メソッドに使う配列の中身を表示
		System.out.println("配列を表示");
		
		//配列の全要素に値を代入する
		for(int i=0; i < 20 ; i++) {
			
			array_sum_test[i] = i;
		}
		
		//配列の先頭を表示
		System.out.print("配列{ " + array_sum_test[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < 19 ; i++) {
		
			System.out.print(array_sum_test[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.print(array_sum_test[19] + " }");
		
		System.out.println();
		
		//メソッドに使う探す値を表示
		System.out.print("更新する要素] : ");
		int search = set_value.nextInt();								//キーボードから入力して探す値を決定
		//メソッドに使う個数を表示
		System.out.print("更新する値] : ");
		int set = set_value.nextInt();									//キーボードから入力して探す値を決定
		
		Array_ins(array_sum_test,search,set);							//メソッドの呼び出し
		
		//配列の先頭を表示
		System.out.print("配列{ " + array_sum_test[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < 19 ; i++) {
		
			System.out.print(array_sum_test[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.print(array_sum_test[19] + " }");
		
		//数値を入力する為に確保していた領域を解放
		set_value.close();
	}
	
	//メソッド 配列から指定した要素を指定した数値に更新する
	//引数 探す配列
	//返却値 更新後の配列
	static void Array_ins(int[] array,int search,int set){
		
		//負の値、配列の要素数以上の場合、処理を行わない
		if(search < 0 || search <= array.length) {
		
			//メンバ関数により配列の要素数を出し、1つ1つ探していく
			for(int i=array.length - 1; search < i; i--) {

				array[i] = array[i - 1];								//更新するため現在の要素は前の要素に替わる

			}
			array[search] = set;										//値を更新して処理は終了
		}
	}
}
