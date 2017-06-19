/* 演習7-15 配列の全要素の合計を返却するメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_15;

public class e_07_15 {

	public static void main(String[] args) {
		
		int[] array_sum_test = new int[10];				//合計を求めるメソッド用の配列を定義

		//メソッドに使う配列の中身を表示
		System.out.println("合計を求める配列を表示");
		
		//配列の全要素に値を代入する
		for(int i=1; i <= 10; i++) {
			
			array_sum_test[i - 1] = i;						//配列の中身は1から10までの整数
			//配列の中身を1つ表示
			System.out.println("配列[" + (i - 1) + "] = " + array_sum_test[i - 1]);
		}
		System.out.println();
		
		//メソッドに使う配列の中身を表示
		System.out.print("合計値 : " + sumOf(array_sum_test));
	}
	
	//メソッド 配列の中身をすべて加算する
	//引数 合計を出したい配列
	//返却値 配列の中身の合計値
	static int sumOf(int[] array){
		
		int sum_array = 0;								//返却する変数を 0 で初期化して加算していく
		
		//メンバ関数により配列の要素数を出し、その分加算する
		for(int i= 0; i < array.length; i++) {
			
			sum_array += array[i];							//合計値に加算していく
		}
		return sum_array;
	}
}
