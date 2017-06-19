/* 演習7-25 素となる配列の指定した要素から指定する個数分削除した配列を生成するメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_25;

import java.util.Scanner;

public class e_07_25 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in);					//数値を入力する領域を確保
		
		//メソッドに使う配列の要素を決定
		System.out.print("要素数 : ");
		int len = set_value.nextInt();									//キーボードから入力して要素数を決定
		
		int[] array_test = new int[len];							//合計を求めるメソッド用の配列を定義

		//メソッドに使う配列の中身を表示
		System.out.println("配列を表示");
		
		//配列の全要素に値を代入する
		for(int i=0; i < len ; i++) {
			
			array_test[i] = i;										//配列の添え字を格納する
		}
		
		//配列の先頭を表示
		System.out.print("配列{ " + array_test[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < len - 1 ; i++) {
		
			System.out.print(array_test[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.println(array_test[len - 1] + " }");
		
		//メソッドに使う配列の要素を決定
		System.out.print("削除する要素 : ");
		int remove = set_value.nextInt();								//キーボードから入力して削除し始める要素を決定
		//メソッドに使う個数を決定
		System.out.print("個数 : ");
		int num = set_value.nextInt();									//キーボードから入力して削除し始める個数を決定
		
		System.out.println( "格納した配列を表示");
		
		//メソッドを呼び出し 添え字を格納し多配列を生成
		int[] mesod_array = array_remove(array_test,remove,num);
		
		if(mesod_array[0] != -9999) {
		
			//配列の先頭を表示
			System.out.print("配列{ " + mesod_array[0] + " ,");
		
			//配列の先頭と末尾以外を表示する
			for(int i=1; i < mesod_array.length - 1 ; i++) {
		
				System.out.print(mesod_array[i] + " ,");
			}
		
			//配列の末尾を表示
			System.out.println(mesod_array[mesod_array.length - 1] + " }");
		
		} else {
			
			//引数を見直して素となる配列の要素数を超えないようにする必要がある
			System.out.println("コピー失敗");
		}
		
		//数値を入力する為に確保していた領域を解放
		set_value.close();
	}
	
	//メソッド 素となる配列から指定した要素を探し、添え字で配列を作成する
	//引数 素となる配列
	//返却値 添え字を格納した配列を生成
	static int[] array_remove(int[] array,int remove,int num){
		
		int[] return_array;												//返却する変数を定義
		
		//配列の外に出る値をはじく為にif文を使用
		if(num < array.length - remove) {
			
			return_array = new int[array.length - num ];					//削除する個数を引いた分領域を確保する
			
			//削除するひとつ前までコピーする
			for(int i=0; i< remove; i++) {
				
				return_array[i] = array[i];									//削除する手前までのコピー
			}
			
			//削除する要素の数分後ろからコピーする
			for(int i=remove + num; i < array.length; i++) {
				
				return_array[i - num] = array[i];							//終端までのコピー
				
			} 
		} else {
				
				return_array = new int[1];									//コピーできません
				return_array[0] = -9999;									//コピーできなかった照明

		}
		
		return return_array;
	}
}
