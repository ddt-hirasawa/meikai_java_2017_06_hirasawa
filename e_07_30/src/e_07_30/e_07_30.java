/* 演習7-30 最小値を返却するメソッド群の作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_30;

import java.util.Random;
import java.util.Scanner;

public class e_07_30 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();						//乱数の種を生成
		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		int[] array_min = new int[10];							//要素数 10 の配列を定義し乱数で埋め尽くす
		
		for(int i=0; i < array_min.length; i++) {
				
			array_min[i] = set_rand_value.nextInt(100);				//0～99の乱数を発生させ 配列の要素すべてを埋め尽くす
		}
		//配列の中身をすべて表示させる
		print_array(array_min);
		
		//メソッド群の使用 メソッド名は同じだが すべて別のメソッドが呼び出される
		System.out.println("配列[0] と 配列[1] の最小値           : " + min(array_min[0],array_min[1]));
		System.out.println("配列[0] と 配列[1] と配列[2] の最小値 : " + min(array_min[0],array_min[1],array_min[2]));
		System.out.println("配列の中での の最小値                 : " + min(array_min));
		
		//確保した領域を解放
		set_value.close();
	}
	
	//メソッド 2値の最小値を返却するメソッド
	//引数 整数2つ
	//返却値 2値の中での最小値
	static int min(int tmp1,int tmp2) {
		
		return tmp1 < tmp2 ? tmp1 : tmp2;							//条件演算子で小さい値を返却する
	}
	
	//メソッド 3値の最小値を返却するメソッド
	//引数 整数3つ
	//返却値 3値の中での最小値
	static int min(int tmp1,int tmp2,int tmp3) {
		
		int min = tmp1;											//最小値を最初に与えられた値で初期化
		
		//次に与えられた値の方が小さい場合
		if(tmp2 < min) {
			
			min = tmp2;												//最小値を更新
		}
		//最後に与えられた値の方が小さい場合
		if(tmp3 < min) {
			
			min = tmp3;												//最小値を更新
		}
		
		return min;
	}
	
	//メソッド 配列の最小値を返却するメソッド
	//引数 配列
	//返却値 配列の中での最小値
	static int min(int[] tmp) {
		
		int min = tmp[0];											//最小値を配列の先頭の値で初期化
		
		//配列の全要素を見比べる
		for(int i=0; i < tmp.length; i++) {
			
			//要素の中で最小値に設定した値よりも小さい値があった場合
			if(tmp[i] < min) {
				
				min = tmp[i];										//最小値を更新する
			}
		}	
		return min;
	}
	
	//メソッド 配列の中身をすべて表示させる
	//引数 配列
	//返却値 無し
	static void print_array(int[] array) {
		
		//配列の先頭を表示
		System.out.print("配列{ " + array[0] + " ,");
		
		//配列の先頭と末尾以外を表示する
		for(int i=1; i < array.length - 1 ; i++) {
		
			System.out.print(array[i] + " ,");
		}
		
		//配列の末尾を表示
		System.out.println(array[array.length - 1] + " }");
	}
}
