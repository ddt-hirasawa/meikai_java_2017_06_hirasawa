/* 演習7-26 配列の指定した部分に指定する要素を割り込ませた配列を生成するメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_26;

import java.util.Scanner;

public class e_07_26 {

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
		System.out.print("挿入する要素 : ");
		int insert = set_value.nextInt();								//キーボードから入力して指定する要素を決定
		//メソッドに使う値を決定
		System.out.print("割り込ませる値 : ");
		int num = set_value.nextInt();									//キーボードから入力して挿入する値を決定
		
		System.out.println( "格納した配列を表示");
		
		//メソッドを呼び出し 添え字を格納し多配列を生成
		int[] mesod_array = array_insert(array_test,insert,num);
		
		
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
	
	//メソッド 素となる配列から指定した要素を割り込ませる
	//引数 素となる配列
	//返却値 指定した要素を格納した配列を生成
	static int[] array_insert(int[] array,int insert,int num){
		
		int[] return_array = new int[array.length + 1];				//素の配列より1つ分領域を多く確保する
		
		//先頭から挿入する一つ前までコピーを行う
		for(int i=0; i < insert; i++) {
			
			return_array[i] = array[i];									//返却する配列をそのままコピー
		}
		
		return_array[insert] = num;										//演習課題 指定した番号に値を挿入
		
		//挿入した部分から末尾までコピーを行う
		for(int i=insert + 1; i <= array.length; i++) {
			
			return_array[i] = array[i - 1];								//返却する配列をそのままコピー
		}
		
		return return_array;
	}
}
