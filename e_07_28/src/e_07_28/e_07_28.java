/* 演習7-28 行列を足した2次元配列を返却するメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_28;

import java.util.Random;
import java.util.Scanner;

public class e_07_28 {

	public static void main(String[] args) {

		Random set_rand_value = new Random();						//乱数の種を生成
		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		//メソッドに使う配列の要素数を決定
		System.out.print("行数 : ");
		int line = set_value.nextInt();							//キーボードから入力して要素数を決定
		//メソッドに使う配列の要素数を決定
		System.out.print("列数 : ");
		int colu = set_value.nextInt();							//キーボードから入力して要素数を決定
		int[][] array_sum1 = new int[line][colu];				//入力した値で2次元配列を生成
		int[][] array_sum2 = new int[line][colu];				//入力した値で2次元配列を生成
		
		for(int i=0; i < array_sum1.length; i++) {
			
			for(int j=0; j < array_sum1[i].length; j++) {
				
				array_sum1[i][j] = set_rand_value.nextInt(10);		//0～9の乱数を発生させ 配列の要素すべてを
				array_sum2[i][j] = set_rand_value.nextInt(10);		//埋め尽くす
			}
		}
		
		int[][] result = add_matrix(array_sum1, array_sum2);		//メソッドの呼び出し 演習課題
		
		System.out.println("行列1目");								//メソッドの呼び出し部分
		print_matrix(array_sum1);									//
		System.out.println("行列2目");								//加算する配列 1 2 を縦に表示する
		print_matrix(array_sum2);									//
		System.out.println("結果");									//メソッドにより生成された配列の中身を
		print_matrix(result);										//すべて表示させる
		
		//確保した領域を解放
		set_value.close();
	}
	
	//メソッド 行列同士を加算する
	//引数 行列 2 つ
	//返却値 加算結果の2次元配列
	static int[][] add_matrix(int[][] array1,int[][] array2) {
		
		//加算する配列と同じ要素数で配列の領域を確保
		int[][] result_array = new int[array1.length][array1[0].length];	
		
		//生成した配列の行数分ループして加算処理を行う
		for(int i=0; i < result_array.length; i++) {
			//生成した配列の列数分ループして加算処理を行う
			for(int j=0; j < result_array[i].length; j++) {
				
				result_array[i][j] = array1[i][j] + array2[i][j];	//生成した配列に引数として与えられた配列を加算する
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
