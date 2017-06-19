/* 演習7-24 素となる配列から指定した要素を削除した配列を生成するメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_24;

import java.util.Random;
import java.util.Scanner;

public class e_07_24 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();							//乱数の種を生成
		Scanner set_value = new Scanner(System.in);					//数値を入力する領域を確保
		
		//メソッドに使う配列の要素を決定
		System.out.print("要素数 : ");
		int len = set_value.nextInt();									//キーボードから入力して要素数を決定
		
		int[] array_sum_test = new int[len];							//合計を求めるメソッド用の配列を定義

		//メソッドに使う配列の中身を表示
		System.out.println("配列を表示");
		
		//配列の全要素に値を代入する
		for(int i=0; i < len ; i++) {
			
			array_sum_test[i] = set_rand_value.nextInt(10);				//0 ～ 9 の乱数で埋め尽くす;
		}
		
		//配列の先頭を表示
		System.out.print("配列{ " + array_sum_test[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < len - 1 ; i++) {
		
			System.out.print(array_sum_test[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.println(array_sum_test[len - 1] + " }");
		
		//メソッドに使う配列の要素を決定
		System.out.print("削除する要素 : ");
		int delete = set_value.nextInt();								//キーボードから入力して削除する数を決定
		
		System.out.println( "格納した配列を表示");
		
		//メソッドを呼び出し 添え字を格納し多配列を生成
		int[] mesod_array = array_delete(array_sum_test,delete);
		
		//配列の先頭を表示
		System.out.print("配列{ " + mesod_array[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < mesod_array.length - 1 ; i++) {
		
			System.out.print(mesod_array[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.println(mesod_array[mesod_array.length - 1] + " }");
		
		//数値を入力する為に確保していた領域を解放
		set_value.close();
	}
	
	//メソッド 素となる配列から指定した要素を探し、添え字で配列を作成する
	//引数 素となる配列
	//返却値 添え字を格納した配列を生成
	static int[] array_delete(int[] array,int delete){
		
		int count = 0;												//削除する数を除いた要素数を数える変数
		
		//素となる配列の要素をすべてコピー
		for(int i=0; i < array.length; i++) {
			
			//指定した要素と異なる要素ならば
			if(delete != array[i]) {
				count++;											//配列を生成するためにカウント
			}
		}
		
		int[] return_array = new int[count];						//数えた分で配列の領域を確保

		//再度配列を走査し、今度は配列に値を格納していく
		for(int i=0,j=0; i < array.length; i++) {
			
			//指定した要素と異なる要素が配列内にあるならば
			if(delete != array[i]) {
				
				return_array[j++] = array[i];						//素となる配列を操作し指定した数以外を格納
			}
		}
		return return_array;
	}

}
