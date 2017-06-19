/* 演習7-27 List7-20 を拡張して３つの配列の要素数により処理を行うか行わないか判別させよ
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_27;

import java.util.Scanner;

public class e_07_27 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		int[][] array_sum1 = { {1,2,3} , {4,5,6} };				//加算用の配列 1
		int[][] array_sum2 = { {7,8,9} , {1,2,3} };				//加算用の配列 2
		
		//メソッドに使う配列の要素数を決定
		System.out.print("行数 : ");
		int line = set_value.nextInt();							//キーボードから入力して要素数を決定
		//メソッドに使う配列の要素数を決定
		System.out.print("列数 : ");
		int colu = set_value.nextInt();							//キーボードから入力して要素数を決定
		int[][] result = new int[line][colu];						//入力した値で2次元配列を生成

		if( add_matrix(array_sum1,array_sum2,result) ) {
			
			System.out.println("行列1目");							//メソッドの呼び出し部分
			print_matrix(array_sum1);								//
			System.out.println("行列2目");							//加算する配列 1 2 加算後の配列 3 を縦に表示する
			print_matrix(array_sum2);								//
			System.out.println("行列3目");							//当然 要素数が一致する場合のみ
			print_matrix(result);									//
			
		} else {
			
			//要素数が一致しなければそもそも演算できない
			System.out.print("行列の要素数が異なります");
		}
		
		//確保した領域を解放
		set_value.close();
	}
	
	//メソッド 行列同士を加算する
	//引数 行列 2 つ
	//返却値 要素数により実行するか実行しないか
	static boolean add_matrix(int[][] array1,int[][] array2,int[][] result) {
		
		boolean answer = true;								//返却値 デフォルトは実行できる
		
		//演習課題 すべての要素数を比較して 行 列 の項目でそれぞれ等しい場合のみ加算を行う
		if(array1.length == array2.length&& array2.length== result.length &&
				array1[0].length == array2[0].length && array2[0].length == result[0].length) {
			
			//行分走査して加算を行う
			for(int i=0; i < array1.length; i++) {
				
				//列分走査して加算を行う
				for(int j=0; j < array1[i].length; j++) {
					
					result[i][j] = array1[i][j] + array2[i][j];	//加算結果用の配列に加算値を代入していく
				}
			}
		//一か所でも要素が異なっていれば演算はできない
		} else {
			
			answer = false;										//実行できないことを知らせる
		}
		
		return answer;
	}
	
	//メソッド 配列の中身をすべて表示させる
	//引数 配列
	//返却値 無し
	static void print_matrix(int[][] matrix) {
		
		//行を操作するループ
		for(int i=0; i < matrix.length; i++) {
			
			//列を操作するループ
			for(int j=0; j < matrix[i].length; j++) {
				
				//行列の要素をスペースを空けて表示
				System.out.print(matrix[i][j] + " ");
			}
			//列をすべて表示した場合、、改行する
			System.out.println();
		}
	}
}
