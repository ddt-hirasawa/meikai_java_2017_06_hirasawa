/* 演習7-31 様々な型で絶対値を返却するメソッド群の作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_31;

import java.util.Scanner;

public class e_07_31 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		int int_tmp = -1;											//メソッドに使う変数をまとめて定義
		long long_tmp = -1;										//
		float float_tmp = -1;										//すべて変数の型が違うため、同じメソッドが呼び出されることは
		double double_tmp = -0.01;								//ない
		
		//絶対値にする前の値をすべて表示
		System.out.println("メソッド呼び出し前");
		System.out.println("int型    : " + int_tmp);
		System.out.println("long型   : " + long_tmp);
		System.out.println("float型  : " + float_tmp);
		System.out.println("double型 : " + double_tmp);
		
		//メソッドを呼び出し 絶対値を表示する
		//メソッド名は同じだが別々のメソッドが呼ばれる
		System.out.println("メソッド呼び出し後");
		System.out.println("int型    : " + absolute(int_tmp));
		System.out.println("long型   : " + absolute(long_tmp));
		System.out.println("float型  : " + absolute(float_tmp));
		System.out.println("double型 : " + absolute(double_tmp));
		
		//確保した領域を解放
		set_value.close();
	}
	
	//メソッド int型の変数の絶対値を返却する
	//引数 int型変数1つ
	//返却値 変数の絶対値
	static int absolute(int tmp) {
		
		return tmp < 0 ? -tmp : tmp;							//条件演算子で絶対値を返却する
	}
	
	//メソッド long型の変数の絶対値を返却する
	//引数 long型変数1つ
	//返却値 変数の絶対値
	static long absolute(long tmp) {
		
		return tmp < 0 ? -tmp : tmp;							//条件演算子で絶対値を返却する
	}
	
	//メソッド float型の変数の絶対値を返却する
	//引数 float型変数1つ
	//返却値 変数の絶対値
	static float absolute(float tmp) {
		
		return tmp < 0 ? -tmp : tmp;							//条件演算子で絶対値を返却する
	}
	
	//メソッド double型の変数の絶対値を返却する
	//引数 double型変数1つ
	//返却値 変数の絶対値
	static double absolute(double tmp) {
		
		return tmp < 0 ? -tmp : tmp;							//条件演算子で絶対値を返却する
	}
}
