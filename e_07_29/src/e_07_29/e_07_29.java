/* 演習7-29 引数として与えた配列とまったく同じ配列を生成するメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_29;

import java.util.Random;
import java.util.Scanner;

public class e_07_29 {

	public static void main(String[] args) {

		Random set_rand_value = new Random();						//乱数の種を生成
		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		//メソッドに使う配列の要素数を決定
		System.out.print("行数 : ");
		int line = set_value.nextInt();							//キーボードから入力して要素数を決定
		//メソッドに使う配列の要素数を決定
		System.out.print("列数 : ");
		int colu = set_value.nextInt();							//キーボードから入力して要素数を決定
		int[][] array_origin = new int[line][colu];				//入力した値で2次元配列を生成
		
		for(int i=0; i < array_origin.length; i++) {
			
			for(int j=0; j < array_origin[i].length; j++) {
				
				array_origin[i][j] = set_rand_value.nextInt(10);	//0～9の乱数を発生させ 配列の要素すべてを埋め尽くす
			}
		}
		
		int[][] array_copy = array_clone(array_origin);			//メソッドの呼び出し 演習課題
		
		System.out.println("行列 コピー元");						//コピーする配列を表示する
		print_matrix(array_origin);								//要素数はコピーする配列と等しい
		
		System.out.println("行列 コピー後");						//コピーした配列を表示する
		print_matrix(array_copy);									//異なる場合、そもそも演算できない
		
		//確保した領域を解放
		set_value.close();
	}
	
	//メソッド 引数として与えた配列のコピーを作る
	//引数 コピー元の配列
	//返却値 コピーした配列
	static int[][] array_clone(int[][] array) {
		
		//コピーする配列と同じ要素数で配列の領域を確保
		int[][] result_array = new int[array.length][array[0].length];	
		
		//生成した配列の行数分ループして加算処理を行う
		for(int i=0; i < result_array.length; i++) {
			//生成した配列の列数分ループして加算処理を行う
			for(int j=0; j < result_array[i].length; j++) {
				
				result_array[i][j] = array[i][j];							//生成した配列にコピー元の配列の要素を代入する
			}
		}
		
		return result_array;
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
